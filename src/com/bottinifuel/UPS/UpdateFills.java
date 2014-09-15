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

import com.bottinifuel.Energy.Info.DeliveryLoc;
import com.bottinifuel.Energy.Info.InfoFactory;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Address;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SaveLocationsExOptions;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_ServiceLocator;

public class UpdateFills
{
    public UpdateFills()
    {
        long startTime = System.currentTimeMillis();
        try 
        {
            TransportationWebService_ServiceLocator locator =
                new TransportationWebService_ServiceLocator();
            TransportationWebService_PortType port =
                locator.getTransportationWebService(new URL("http://10.10.10.9:81/"));
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
            locID.setRegionID("TEST");
            
            int updateCount = 0;
            Location [] locations = new Location[1];
            Location updateLocation = new Location();
            locations[0] = updateLocation;
            
            SaveLocationsExOptions options =
                new SaveLocationsExOptions(true, // disable geocoding 
                                           false, false, false);
            
            for (Integer tank_seq : tanks)
            {
                DeliveryLoc tank = new DeliveryLoc(inf, tank_seq);
                locID.setLocationID(Integer.toString(inf.InternalToFullAccount(tank.ShortAcct)));
                locID.setLocationType(Integer.toString(tank.TankNum));
                Location location = port.retrieveLocationByIdentity(locID);
                
                if (location == null)
                    continue;

                Address addr = location.getAddress();

                if (addr.getLine2().toUpperCase().
                            compareTo("<>" + tank.FillLoc.toUpperCase() + "<>") != 0)
                {
                    updateCount++;
                    addr.setLine2("<>" + tank.FillLoc.toUpperCase() + "<>");
                    updateLocation.setLocationIdentity(locID);
                    updateLocation.setAddress(addr);
                    updateLocation.setTimeZone(location.getTimeZone());
                    port.saveLocationsEx(locations, options);
                }
            }
            
            System.out.println("Updated " + updateCount + " locations");
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
        UpdateFills t = new UpdateFills();
    }
}
