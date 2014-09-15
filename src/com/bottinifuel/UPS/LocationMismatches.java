/*
 * Created on Dec 9, 2010 by pladd
 *
 */
package com.bottinifuel.UPS;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.xml.rpc.ServiceException;

import com.bottinifuel.Energy.Info.CustInfo;
import com.bottinifuel.Energy.Info.DeliveryLoc;
import com.bottinifuel.Energy.Info.InfoFactory;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Address;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_ServiceLocator;

public class LocationMismatches
{
    public LocationMismatches()
    {
        long startTime = System.currentTimeMillis();
        try 
        {
            TransportationWebService_ServiceLocator locator =
                new TransportationWebService_ServiceLocator();
            TransportationWebService_PortType port =
                locator.getTransportationWebService(new URL("http://ups-ric:81/"));
            String version = port.versionInformation();
            
            InfoFactory inf = new InfoFactory();
            Set<Integer> centers = new LinkedHashSet<Integer>();
            centers.add( 1); // Wappingers Distillates
            centers.add( 2); // PJ
            centers.add( 3); // Washingtonville
            centers.add( 4); // Red Hook Distillates 
            centers.add(11); // Washville Bigstops  
            centers.add(14); // Tannersville Distill 
            centers.add(16); // Cairo Distillates 
            centers.add(17); // Margaretville Distil 
            centers.add(18); // Saugerties Distill
            centers.add(20); // Kerhonkson Distill
            List<Integer> tanks = inf.DeliveryLocations(centers);

            LocationIdentity locID = new LocationIdentity();
            locID.setRegionID("OIL");
            int mismatchCount = 0;
            int missingZips = 0;
            int missingUPS = 0;
            int fillLocProblem = 0;
            for (Integer tank_seq : tanks)
            {
                DeliveryLoc tank = new DeliveryLoc(inf, tank_seq);
                if (tank.Status != DeliveryLoc.StatusEnum.ACTIVE)
                    continue;
                if (tank.StopCode == 5 || tank.StopCode == 10 || tank.StopCode == 11)
                    continue;
                CustInfo acct = new CustInfo(inf, tank.ShortAcct);
                locID.setLocationID(Integer.toString(inf.InternalToFullAccount(tank.ShortAcct)));
                locID.setLocationType(Integer.toString(tank.TankNum));
                Location location = port.retrieveLocationByIdentity(locID);
                
                if (location == null)
                {
//                    System.out.println("Acct: " + locID.getLocationID() + '-' + tank.TankNum + 
//                                       "\tNot in UPS");
                    missingUPS++;
                }
                else
                {
                    Address addr = location.getAddress();
                    
                    boolean mismatchName  = false;
                    boolean mismatchAddr  = false;
                    boolean mismatchFill  = false;
                    boolean mismatchCity  = false;
                    boolean mismatchState = false;
                    boolean mismatchZip   = false;
                    if (tank.Address.NameNoEmbeddedDoubleBlanks().toUpperCase().
                            compareTo(location.getDescription().toUpperCase().replaceAll("\\s+", " ")) != 0)
                    {
                        if ((acct.Division == 9 || acct.Division == 10 || acct.Division == 11)
                            && tank.Address.Name.length() == 0)
                            mismatchName = false;
                        else
                            mismatchName = true;
                    }
                    else if (tank.Address.Street1.toUpperCase().
                            compareTo(addr.getLine1().toUpperCase()) != 0)
                        mismatchAddr = true;
                    else if (addr.getLine2().toUpperCase().
                            compareTo("<>" + tank.FillLoc.toUpperCase() + "<>") != 0)
                    {
                        mismatchFill = true;
                        fillLocProblem++;
                    }
                    else if (tank.Address.City.toUpperCase().
                            compareTo(addr.getRegion1().toUpperCase()) != 0)
                        mismatchCity = true;
                    else if (tank.Address.State.toUpperCase().
                            compareTo(addr.getRegion3().toUpperCase()) != 0)
                        mismatchState = true;
                    
                    if (tank.Address.ZipRaw.length() > 0 &&
                            tank.Address.ZipRaw.
                            compareTo(addr.getPostalCode().replaceAll("-", "")) != 0)
                        mismatchZip = true;
                    else if (addr.getPostalCode().length() > 0 && tank.Address.ZipRaw.length() == 0)
                    {
//                        System.out.println("Acct: " + locID.getLocationID() + '-' + tank.TankNum +
//                                           "\tZip code not in E3");
                        missingZips++;
                    }

                    if (mismatchName  || mismatchAddr || mismatchFill || mismatchCity ||
                        mismatchState || mismatchZip)
                    {
                        mismatchCount++;
                        if (!mismatchFill)
                            System.out.println("Acct: " + locID.getLocationID() + '-' + tank.TankNum);
                        if (mismatchName)
                        {
                            System.out.println("\tName E3:  " + tank.Address.NameNoEmbeddedDoubleBlanks());
                            System.out.println("\tName UPS: " + location.getDescription());
                        }
                        if (mismatchAddr)
                        {
                            System.out.println("\tStreet1 E3:  " + tank.Address.Street1);
                            System.out.println("\tStreet1 UPS: " + addr.getLine1());
                        }
                        if (mismatchFill)
                        {
//                            System.out.println("\tE3:  <>" + tank.FillLoc.trim() + "<>");
//                            System.out.println("\tUPS: " + addr.getLine2());
                        }
                        if (mismatchCity)
                        {
                            System.out.println("\tCity E3:  " + tank.Address.City);
                            System.out.println("\tCity UPS: " + addr.getRegion1());
                        }
                        if (mismatchState)
                        {
                            System.out.println("\tState E3:  " + tank.Address.State);
                            System.out.println("\tState UPS: " + addr.getRegion3());
                        }
                        if (mismatchZip)
                        {
                            System.out.println("\tZip E3:  " + tank.Address.ZipRaw);
                            System.out.println("\tZip UPS: " + addr.getPostalCode());
                        }
                    }
//                    else
//                        System.out.println("Acct: " + locID.getLocationID() + '-' + tank.TankNum +
//                                           "\tData matches");
                }
            }
            System.out.println("Total checked: " + tanks.size() + 
                               "\nMissing in UPS: " + missingUPS +
                               "\nFill loc mismatch: " + fillLocProblem +
                               "\nMismatch count: " + mismatchCount +
                               "\nMissing zips: " + missingZips);
        }
        catch (ServiceException e)
        {
            System.out.println("Service exception:\n" + e);
        }
        catch (RemoteException e)
        {
            System.out.println("Remote exception:\n" + e);
        }
        catch (Exception e)
        {
            System.out.println("General exception:\n" + e);
        }
        
        long endTime = System.currentTimeMillis();
        long difference = endTime - startTime;
        int minutes = (int)(difference / (1000 * 60));
        long remainder = (difference % (1000 * 60));
        int seconds = (int)(remainder / 1000);
        remainder = (remainder % 1000);
        int millis = (int)remainder;
        System.out.println("Job took " + minutes + " min " + seconds + "." + millis + " seconds");
    }
    
    public static void main(String [] args)
    {
        new LocationMismatches();
    }
}
