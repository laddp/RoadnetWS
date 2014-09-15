/**
 * 
 */
package com.bottinifuel.UPS;

import java.rmi.RemoteException;

import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GeocodeResult;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SaveLocationsExOptions;
import com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType;

/**
 * @author laddp
 *
 */
public class WSUtilities {

	public static void MoveLocation(TransportationWebService_PortType port,
			LocationIdentity from,
			LocationIdentity to) throws Exception
	{
		// Error check - from & to must be different
		if (from.getLocationID()  .equals(to.getLocationID()) &&
			from.getLocationType().equals(to.getLocationType()) &&
			from.getRegionID()    .equals(to.getRegionID()))
			throw new Exception("from and to must be different");

		// Get from location info
        LocationRetrieveOptions retrOpt = new LocationRetrieveOptions(true, true, true, true);
        Location location = port.retrieveLocationByIdentityEx(from, retrOpt);
        if (location == null)
        	throw new Exception("From location not found");
        
        // Prepare save & clear lat/lon first if not manual geocoded
        Location [] locations = new Location[1];
        locations[0] = location;

        location.setLocationIdentity(to);
        GeocodeResult gr = location.getLocquality();
        if (gr != GeocodeResult.grManual &&
        	gr != GeocodeResult.grGPS)
        {
        	location.setLatitude (0);
        	location.setLongitude(0);
        }

        // Do the save
        SaveLocationsExOptions saveOpt = new SaveLocationsExOptions(false, false, true, true);
        Location [] locRc = port.saveLocationsEx(locations, saveOpt);

        if (locRc != null)
        {
        	throw new Exception("Error saving to new location: " + locRc[0].getRejectCode().toString());
        }

        // Delete the original
        location.setLocationIdentity(from);
        locRc = port.deleteLocations(locations);

        if (locRc != null)
        {
        	throw new Exception("Error deleting old location: " + locRc[0].getRejectCode().toString());
        }
	}
}
