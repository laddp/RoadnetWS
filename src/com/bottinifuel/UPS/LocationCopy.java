/*
 * Created on Dec 28, 2010 by pladd
 *
 */
package com.bottinifuel.UPS;

import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GeocodeResult;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationCriteria;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_ServiceLocator;

/**
 * @author pladd
 *
 */
public class LocationCopy
{
    /**
     * 
     */
    public LocationCopy()
    {
        try 
        {
            TransportationWebService_ServiceLocator locator =
                new TransportationWebService_ServiceLocator();
            TransportationWebService_PortType port =
                locator.getTransportationWebService(new URL("http://ups-ric:81/"));

            String sourceRegion = "OIL";
            String destRegion   = "TEST";

            LocationRetrieveOptions options = new LocationRetrieveOptions(true,true,true,true);
            
            for (int i = 10; i <= 99; i++)
            {
                LocationCriteria locSearch = new LocationCriteria(sourceRegion, "*", i + "*", "*", 0);
                long startTime = System.currentTimeMillis();
                Location [] locations = port.retrieveLocationsByCriteriaEx(locSearch, options);
                long endTime   = System.currentTimeMillis();

                System.out.println("Set " + i + ": Retrieved " + locations.length + " locations in " + (endTime - startTime) + " ms");
                Location [] copiedLocations = new Location[locations.length];
                int insertPos = 0;
                
                for (Location oldLoc : locations)
                {
                    if (oldLoc.getZoneID().endsWith("_PRO") ||
                        oldLoc.getZoneID().endsWith("G&D"))
                    {
                        System.out.printf("Skipping invalid zone (%s) - Acct #%7s-%3s\n",
                                          oldLoc.getZoneID(),
                                          oldLoc.getLocationIdentity().getLocationID(),
                                          oldLoc.getLocationIdentity().getLocationType());
                        continue;
                    }
                    
                    LocationIdentity newID = new LocationIdentity();
                    newID.setRegionID(destRegion);
                    newID.setLocationID(oldLoc.getLocationIdentity().getLocationID());
                    newID.setLocationType(oldLoc.getLocationIdentity().getLocationType());

                    Location newLoc = new Location();
                    newLoc.setLocationIdentity(newID);

                    newLoc.setAcceptsMFRPalletType    (oldLoc.isAcceptsMFRPalletType());
                    newLoc.setAccountType             (oldLoc.getAccountType());
                    newLoc.setAddress                 (oldLoc.getAddress());
                    newLoc.setAlternateContact        (oldLoc.getAlternateContact());
                    newLoc.setBuildingDeliverySequence(oldLoc.getBuildingDeliverySequence());
                    newLoc.setBulkThreashold          (oldLoc.getBulkThreashold());
                    newLoc.setConsigneeHistory        (oldLoc.getConsigneeHistory());
                    newLoc.setContact                 (oldLoc.getContact());
                    newLoc.setDateAdded               (oldLoc.getDateAdded());
                    newLoc.setDeliveryDays            (oldLoc.getDeliveryDays());
                    newLoc.setDeliveryRadius          (oldLoc.getDeliveryRadius());
                    newLoc.setDescription             (oldLoc.getDescription());
                    newLoc.setFaxNumber               (oldLoc.getFaxNumber());
                    newLoc.setFixedFee                (oldLoc.getFixedFee());
                    newLoc.setMarkAsVoid              (oldLoc.getMarkAsVoid());
                    newLoc.setPhoneNumber             (oldLoc.getPhoneNumber());
                    newLoc.setPreferredPalletType     (oldLoc.getPreferredPalletType());
                    newLoc.setPreferredRouteID        (oldLoc.getPreferredRouteID());
                    newLoc.setPriority                (oldLoc.getPriority());
                    newLoc.setRejectCode              (oldLoc.getRejectCode());
                    newLoc.setServiceTimeOverrides    (oldLoc.getServiceTimeOverrides());
                    newLoc.setServiceTimeType         (oldLoc.getServiceTimeType());
                    newLoc.setStandardInstructions    (oldLoc.getStandardInstructions());
                    newLoc.setStoreNumber             (oldLoc.getStoreNumber());
                    newLoc.setTimeWindowFactor        (oldLoc.getTimeWindowFactor());
                    newLoc.setTimeWindowOverrides     (oldLoc.getTimeWindowOverrides());
                    newLoc.setTimeWindowType          (oldLoc.getTimeWindowType());
                    newLoc.setTimeZone                (oldLoc.getTimeZone());
                    newLoc.setUserDefinedField1       (oldLoc.getUserDefinedField1());
                    newLoc.setUserDefinedField2       (oldLoc.getUserDefinedField2());
                    newLoc.setUserDefinedField3       (oldLoc.getUserDefinedField3());
                    newLoc.setVariableFee             (oldLoc.getVariableFee());
                    newLoc.setZoneID                  (oldLoc.getZoneID());

                    
                    // Only set lat/lon if it was manually geocoded
                    // Otherwise, all copies will become manually geocoded
                    if (oldLoc.getLocquality() == GeocodeResult.grManual)
                    {
                        newLoc.setLocquality   (GeocodeResult.grManual);
                        newLoc.setLatitude     (oldLoc.getLatitude());
                        newLoc.setLongitude    (oldLoc.getLongitude());
                        newLoc.setLocConfidence(oldLoc.getLocConfidence());
                    }
                    copiedLocations[insertPos++] = newLoc;
                }
                startTime = System.currentTimeMillis();
                Location [] locRc = port.saveLocations(copiedLocations);
                endTime = System.currentTimeMillis();
                System.out.println("Set " + i + ": Saved " + locations.length + " locations in " + (endTime - startTime) + " ms");
                
                if (locRc.length != 0)
                {
                	System.out.println("Errors processing locations:\n");
                	for (Location locErr : locRc)
                	{
                		System.out.println("\t" + locErr.getLocationIdentity().getLocationID() + '-' + locErr.getLocationIdentity().getLocationType());
                	}
                }
            }
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
    }


    /**
     * @param args
     */
    public static void main(String[] args)
    {
        new LocationCopy();
    }

}
