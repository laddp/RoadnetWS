/*
 * Created on Dec 9, 2010 by pladd
 *
 */
package com.bottinifuel.UPS;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GeocodeResult;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationCriteria;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionCriteria;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SaveLocationsExOptions;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_ServiceLocator;

public class Test
{
    public Test() throws Exception
    {
        try 
        {
            TransportationWebService_ServiceLocator locator =
                new TransportationWebService_ServiceLocator();
            TransportationWebService_PortType port =
                locator.getTransportationWebService(new URL("http://ups-ric:81/"));
//            String version = port.versionInformation();
            
//            RegionCriteria regionCriteria = new RegionCriteria("*");
//            Region [] regions = port.retrieveRegionsByCriteria(regionCriteria);
//            
//            RegionIdentity oilRegion = null;
//            for (Region r : regions)
//            {
//                System.out.println(r.getRegionIdentity().getRegionID() + ": " + r.getName());
//                if (r.getRegionIdentity().getRegionID().equals("OIL"))
//                    oilRegion = r.getRegionIdentity();
//            }

            LocationIdentity test = new LocationIdentity("TEST", "1", "72124");
            LocationIdentity oil   = new LocationIdentity("OIL",  "1", "881822");
            
//            WSUtilities.MoveLocation(port, test, oil);
//            WSUtilities.MoveLocation(port, oil, test);
            
            boolean done = false;
            
            LocationRetrieveOptions retrOpt = new LocationRetrieveOptions(true, true, true, true);
            while (!done)
            {
            	Location location = port.retrieveLocationByIdentityEx(test, retrOpt);
            	System.out.println("Location: " + location.getLocationIdentity().getRegionID() + '/' +
            									  location.getLocationIdentity().getLocationID() + '/' +
            									  location.getLocationIdentity().getLocationType() +
            					   " Qual: " + location.getLocquality() +
            					   " Conf: " + location.getLocConfidence() +
            					   " Lat: " + location.getLatitude() + 
            					   " Lon: " + location.getLongitude());
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
    }
    
    public static void main(String [] args)
    {
        try {
        	new Test();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
