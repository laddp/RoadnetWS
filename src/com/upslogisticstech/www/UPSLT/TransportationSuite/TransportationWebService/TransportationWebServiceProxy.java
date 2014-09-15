package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class TransportationWebServiceProxy implements com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType {
  private String _endpoint = null;
  private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType transportationWebService_PortType = null;
  
  public TransportationWebServiceProxy() {
    _initTransportationWebServiceProxy();
  }
  
  public TransportationWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTransportationWebServiceProxy();
  }
  
  private void _initTransportationWebServiceProxy() {
    try {
      transportationWebService_PortType = (new com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_ServiceLocator()).getTransportationWebService();
      if (transportationWebService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)transportationWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)transportationWebService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (transportationWebService_PortType != null)
      ((javax.xml.rpc.Stub)transportationWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType getTransportationWebService_PortType() {
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType;
  }
  
  public java.lang.Integer nop() throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.nop();
  }
  
  public java.lang.String versionInformation() throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.versionInformation();
  }
  
  public int authenticateUser(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.authenticateUser(userID, password);
  }
  
  public void changeUserPassword(java.lang.String userID, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.changeUserPassword(userID, oldPassword, newPassword);
  }
  
  public void addRICUser(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.User user) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.addRICUser(user);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserPermissions retrievePermissionsForUser(java.lang.String userID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrievePermissionsForUser(userID, regionIdentity);
  }
  
  public java.lang.String describeAuthenticaitonPolicy(java.lang.String localeId) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.describeAuthenticaitonPolicy(localeId);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.User retrieveUserByUserID(java.lang.String userID) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUserByUserID(userID);
  }
  
  public boolean allowAdditionOfRICUsers() throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.allowAdditionOfRICUsers();
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region retrieveRegionByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRegionByIdentity(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region[] retrieveRegionsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRegionsByCriteria(criteria);
  }
  
  public void saveRegion(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region region) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveRegion(region);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionOptions retrieveRegionOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRegionOptions(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.AutoArriveDepartOptions retrieveAutoArriveDepartOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveAutoArriveDepartOptions(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GPSProviderOptions retrieveGPSProviderOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveGPSProviderOptions(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsOptions retrieveTelematicsOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveTelematicsOptions(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RICRegionsWithPurchaseInfo retrieveRICRegionsByUser(java.lang.String userId) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRICRegionsByUser(userId);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Route retrieveRouteByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRouteByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Route[] retrieveRoutesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutesByCriteria(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Route retrieveRouteForDevice(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.WirelessDeviceIdentity wirelessDeviceIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRouteForDevice(identity, options, wirelessDeviceIdentity);
  }
  
  public void saveRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Route route, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopPlacementOptions placementOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveRoute(route, placementOptions, timeZoneOptions);
  }
  
  public void assignEquipment(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentIdentity[] equipment) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.assignEquipment(identity, equipment);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentIdentity[] retrieveAssignedEquipment(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveAssignedEquipment(identity);
  }
  
  public void assignDrivers(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EmployeeIdentity[] drivers) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.assignDrivers(identity, drivers);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EmployeeIdentity[] retrieveAssignedDrivers(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveAssignedDrivers(identity);
  }
  
  public void removeRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.removeRoute(identity);
  }
  
  public void sendTextMessageToDriver(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, java.lang.String message, java.lang.String fromUserID) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.sendTextMessageToDriver(identity, message, fromUserID);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop retrieveStopByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveStopByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop[] retrieveStopsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveStopsByCriteria(criteria, options);
  }
  
  public void saveStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop stop, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopPlacementOptions placementOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveStop(stop, placementOptions, options);
  }
  
  public byte[] retrieveStopSignature(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType imageType) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveStopSignature(identity, imageType);
  }
  
  public void saveStopSignature(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity, byte[] signatureData) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveStopSignature(identity, signatureData);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop[] retrieveUnassignsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUnassignsByCriteria(criteria, options);
  }
  
  public void saveUnassigned(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop stop, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveUnassigned(stop, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PlacementCost[] suggestRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stop, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SuggestRouteOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.suggestRoute(stop, options);
  }
  
  public void placeUnassigned(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stop, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopPlacementOptions placementPosition, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OptionalDateTime adjustedRouteStartTime, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.placeUnassigned(stop, routeIdentity, placementPosition, adjustedRouteStartTime, timeZoneOptions);
  }
  
  public void deleteUnassigned(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stop) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.deleteUnassigned(stop);
  }
  
  public void unassignStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stop) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.unassignStop(stop);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] saveLocations(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] locations) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.saveLocations(locations);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] saveLocationsEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] locations, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SaveLocationsExOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.saveLocationsEx(locations, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] deleteLocations(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] locations) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.deleteLocations(locations);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location retrieveLocationByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveLocationByIdentity(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location retrieveLocationByIdentityEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveLocationByIdentityEx(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] retrieveLocationsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveLocationsByCriteria(criteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] retrieveLocationsByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveLocationsByCriteriaEx(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentType[] retrieveEquipmentTypeByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentTypeCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveEquipmentTypeByCriteria(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentType retrieveEquipmentTypeByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentTypeIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveEquipmentTypeByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Equipment retrieveEquipmentByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveEquipmentByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Equipment[] retrieveEquipmentByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveEquipmentByCriteria(criteria, options);
  }
  
  public void saveEquipment(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Equipment equipment, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveEquipment(equipment, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Employee retrieveEmployeeByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EmployeeIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveEmployeeByIdentity(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Employee[] retrieveEmployeesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EmployeeCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveEmployeesByCriteria(criteria);
  }
  
  public void saveEmployee(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Employee employee) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveEmployee(employee);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriod retrieveDutyPeriodByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriodIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriodRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveDutyPeriodByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriod[] retrieveDutyPeriodsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriodCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriodRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveDutyPeriodsByCriteria(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ProductsPurchased retrieveProductsPurchased(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveProductsPurchased(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] retrieveRouteSurveyResults(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRouteSurveyResults(identity, performedAt);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] retrieveStopSurveyResults(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveStopSurveyResults(identity);
  }
  
  public void saveRouteSurveyResults(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] surveyResults) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveRouteSurveyResults(identity, performedAt, surveyResults);
  }
  
  public void saveStopSurveyResults(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] surveyResults) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveStopSurveyResults(identity, surveyResults);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Survey[] retrieveSurveys(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveSurveys(regionIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyDetails[] retrieveSurveyDetails(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveSurveyDetails(regionIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyQuestionsResult retrieveRouteSurveyQuestions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRouteSurveyQuestions(identity, performedAt);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyQuestionsResult retrieveStopSurveyQuestions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveStopSurveyQuestions(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PositionHistory[] retrievePositionHistoryByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PositionHistoryCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrievePositionHistoryByCriteria(criteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PositionHistory[] retrievePositionHistoryBlocksByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PositionHistoryCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrievePositionHistoryBlocksByCriteria(criteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Report retrieveReportByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReportIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveReportByIdentity(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Report[] retrieveReportsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReportCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveReportsByCriteria(criteria);
  }
  
  public void saveReport(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Report report) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveReport(report);
  }
  
  public void deleteReport(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReportIdentity identity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.deleteReport(identity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNote[] retrieveRouteNotesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNoteCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRouteNotesByCriteria(criteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNote[] retrieveRouteNotesByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNoteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NoteRetrievalOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRouteNotesByCriteriaEx(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopNote[] retrieveStopNotesByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopNoteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NoteRetrievalOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveStopNotesByCriteriaEx(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderNote[] retrieveOrderNotesByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderNoteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NoteRetrievalOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveOrderNotesByCriteriaEx(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LineItemNote[] retrieveLineItemNotesByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LineItemNoteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NoteRetrievalOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveLineItemNotesByCriteriaEx(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CannedTextMessage[] retrieveCannedTextMessagesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CannedTextMessageCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveCannedTextMessagesByCriteria(criteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteDailyStats[] retrieveRouteDailyStatsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteDailyStatsCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteDailyStatsRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRouteDailyStatsByCriteria(criteria, options);
  }
  
  public java.util.Calendar convertTimestamp(java.util.Calendar sourceTimestamp, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions sourceOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions destinationOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.convertTimestamp(sourceTimestamp, sourceOptions, destinationOptions);
  }
  
  public java.util.Calendar[] convertTimestamps(java.util.Calendar[] sourceTimestamps, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions sourceOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions destinationOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.convertTimestamps(sourceTimestamps, sourceOptions, destinationOptions);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Fault returnFault(int requestedFaultCode) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.returnFault(requestedFaultCode);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeDistResult calculateTimeDist(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity, int fromLatitude, int fromLongitude, int toLatitude, int toLongitude) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.calculateTimeDist(regionIdentity, fromLatitude, fromLongitude, toLatitude, toLongitude);
  }
  
  public void saveRegionConfig(java.lang.String applicationID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity, java.lang.String configGroupID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] items) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveRegionConfig(applicationID, regionIdentity, configGroupID, items);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] retrieveRegionConfig(java.lang.String applicationID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity, java.lang.String configGroupID) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRegionConfig(applicationID, regionIdentity, configGroupID);
  }
  
  public void saveUserConfig(java.lang.String applicationID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserIdentity userIdentity, java.lang.String configGroupID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] items) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveUserConfig(applicationID, userIdentity, configGroupID, items);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] retrieveUserConfig(java.lang.String applicationID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserIdentity userIdentity, java.lang.String configGroupID) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUserConfig(applicationID, userIdentity, configGroupID);
  }
  
  public void saveGlobalConfig(java.lang.String applicationID, java.lang.String configGroupID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] items) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveGlobalConfig(applicationID, configGroupID, items);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] retrieveGlobalConfig(java.lang.String applicationID, java.lang.String configGroupID) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveGlobalConfig(applicationID, configGroupID);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTable retrieveUserDefinedTableByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUserDefinedTableByIdentity(tableIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTable[] retrieveUserDefinedTablesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableCriteria tableCriteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUserDefinedTablesByCriteria(tableCriteria);
  }
  
  public void saveUserDefinedTable(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTable table) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveUserDefinedTable(table);
  }
  
  public void deleteUserDefinedTable(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableId) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.deleteUserDefinedTable(tableId);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn retrieveUserDefinedColumnByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumnIdentity columnIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUserDefinedColumnByIdentity(columnIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn[] retrieveUserDefinedColumnsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumnCriteria columnCriteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUserDefinedColumnsByCriteria(columnCriteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedData retrieveUserDefinedDataByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataIdentity dataIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tmzOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUserDefinedDataByIdentity(tableIdentity, dataIdentity, tmzOptions);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedData[] retrieveUserDefinedDataByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataCriteria dataCriteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tmzOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUserDefinedDataByCriteria(tableIdentity, dataCriteria, tmzOptions);
  }
  
  public void saveUserDefinedData(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedData[] input, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tmzOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.saveUserDefinedData(tableIdentity, input, tmzOptions);
  }
  
  public void deleteUserDefinedData(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataIdentity[] input) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.deleteUserDefinedData(tableIdentity, input);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuantityReasonCode[] retrieveQuantityReasonCodesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuantityReasonCodeCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveQuantityReasonCodesByCriteria(criteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelCode[] retrieveStopCancelCodesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelCodeCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveStopCancelCodesByCriteria(criteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UndeliverableStopCode[] retrieveUndeliverableStopCodesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UndeliverableStopCodeCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveUndeliverableStopCodesByCriteria(criteria);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSession[] retrieveRoutingSessionsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingSessionsByCriteria(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSession retrieveRoutingSessionByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingSessionByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRoute[] retrieveRoutingRoutesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingRoutesByCriteria(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRoute retrieveRoutingRouteByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingRouteByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStop retrieveRoutingStopByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStopIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingStopByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStop[] retrieveRoutingUnassignsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStopCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingUnassignsByCriteria(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] retrieveRoutingLocationsWithOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity sessionIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingLocationsWithOrders(sessionIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] retrieveRoutingLocationsWithOrdersEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity sessionIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingLocationsWithOrdersEx(sessionIdentity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrder retrieveRoutingOrderByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingOrderByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrder[] retrieveRoutingSourcedOrdersByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSourcedOrderCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingSourcedOrdersByCriteria(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionProperties retrieveDefaultRoutingSessionProperties(java.lang.String regionId, java.util.Date sessionDate) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveDefaultRoutingSessionProperties(regionId, sessionDate);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity createRoutingSession(java.lang.String regionId, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionProperties sessionProperties) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.createRoutingSession(regionId, sessionProperties);
  }
  
  public void deleteRoutingSession(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity sessionIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.deleteRoutingSession(sessionIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] saveRoutingImportOrders(java.lang.String regionId, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] orders, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.saveRoutingImportOrders(regionId, orders, tzOptions);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] saveRoutingImportOrdersEx(java.lang.String regionId, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] orders, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SaveRoutingImportOrdersExOptions importOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.saveRoutingImportOrdersEx(regionId, orders, tzOptions, importOptions);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder retrieveRoutingImportOrderByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrderIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingImportOrderByIdentity(identity, tzOptions);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] retrieveRoutingImportOrdersByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrderCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingImportOrdersByCriteria(criteria, tzOptions);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStop[] retrieveRoutingStopsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStopCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingStopsByCriteria(criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteDailyStats[] retrieveRoutingRouteDailyStatsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteDailyStatsCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteDailyStatsRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveRoutingRouteDailyStatsByCriteria(criteria, options);
  }
  
  public void buildRoutingRouteNetMatrix(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity sessionIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.buildRoutingRouteNetMatrix(sessionIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionData buildRoutingDriverDirections(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteIdentity routeIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.buildRoutingDriverDirections(routeIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWindow[] schedulerAnalyzeOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder order, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerAnalyzeOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerAnalyzeOrder(order, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReserveResult schedulerReserveOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder deliveryAreaOrder, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWindow deliveryWindow, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerReserveOrderOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerReserveOrder(schedulerIdentity, deliveryAreaOrder, deliveryWindow, options);
  }
  
  public void schedulerConfirmOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String orderNumberXML) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerConfirmOrder(schedulerIdentity, orderNumberXML);
  }
  
  public void schedulerCancelOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String orderNumberXML) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerCancelOrder(schedulerIdentity, orderNumberXML);
  }
  
  public void schedulerPurge(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, boolean reloadXML) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerPurge(schedulerIdentity, reloadXML);
  }
  
  public void schedulerRemoveFromServer(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerRemoveFromServer(schedulerIdentity);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.IsExcludingCutoffRoutesResult schedulerIsExcludingCutoffRoutes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerIsExcludingCutoffRoutes(schedulerIdentity);
  }
  
  public void schedulerExcludeCutoffRoutes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, boolean excludeXML) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerExcludeCutoffRoutes(schedulerIdentity, excludeXML);
  }
  
  public void schedulerOptimizeOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerOptimizeOrders(schedulerIdentity);
  }
  
  public void schedulerOptimizeOrdersEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerOptimizeOrdersExOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerOptimizeOrdersEx(schedulerIdentity, options);
  }
  
  public void schedulerBalanceRoutes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerBalanceRoutesOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerBalanceRoutes(schedulerIdentity, options);
  }
  
  public void schedulerExtendOrderReservation(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String orderNumberXML, int extendMinutes) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerExtendOrderReservation(schedulerIdentity, orderNumberXML, extendMinutes);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder[] schedulerBulkReserveOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder[] orders, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerBulkReserveOrdersOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerBulkReserveOrders(schedulerIdentity, orders, options);
  }
  
  public void schedulerSendRoutesToRoadnet(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerSendRoutesToRoadnet(schedulerIdentity);
  }
  
  public void schedulerSendRoutesToRoadnetEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String sessionDescription) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerSendRoutesToRoadnetEx(schedulerIdentity, sessionDescription);
  }
  
  public void schedulerMovableOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String[] criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerMovableOrdersOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerMovableOrders(schedulerIdentity, criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerFeederRoute[] schedulerRetrieveFeederRoutes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerRetrieveFeederRoutesOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerRetrieveFeederRoutes(schedulerIdentity, options);
  }
  
  public boolean schedulerUpdateOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerUpdateOrderOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerUpdateOrder(schedulerIdentity, identity, options);
  }
  
  public boolean schedulerReloadWaveInstances(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerReloadWaveInstancesOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerReloadWaveInstances(schedulerIdentity, options);
  }
  
  public java.lang.String[] schedulerSaveDeliveryWaveInstance(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWaveInstanceIdentity waveIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWaveAttributes attributes, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerSaveDeliveryWaveInstanceOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerSaveDeliveryWaveInstance(schedulerIdentity, waveIdentity, attributes, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWaveInstance[] schedulerRetrieveDeliveryWaveInstancesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWaveInstanceCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerRetrieveDeliveryWaveInstanceOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerRetrieveDeliveryWaveInstancesByCriteria(schedulerIdentity, criteria, options);
  }
  
  public boolean schedulerSaveDeliveryWindow(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerSaveDeliveryWindowOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerSaveDeliveryWindow(schedulerIdentity, options);
  }
  
  public void schedulerDeleteDeliveryWindow(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWindow window, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeleteDeliveryWindowOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.schedulerDeleteDeliveryWindow(schedulerIdentity, window, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder schedulerRetrieveOrderByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerRetrieveOrderByIdentity(identity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder[] schedulerRetrieveOrdersByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerRetrieveOrdersByCriteria(schedulerIdentity, criteria, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowMetrics[] schedulerCalculateDeliveryWindowMetrics(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowMetricsOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.schedulerCalculateDeliveryWindowMetrics(schedulerIdentity, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification[] retrieveNotificationsByRecipientIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveNotificationsByRecipientIdentity(identity, tzOptions, options);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification[] retrieveNotificationsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationRetrieveOptions options) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveNotificationsByCriteria(criteria, tzOptions, options);
  }
  
  public void deleteNotifications(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationIdentity[] identities) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.deleteNotifications(identities);
  }
  
  public void unlockNotifications(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnlockNotificationsCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.unlockNotifications(criteria);
  }
  
  public void updateDeliveryDetails(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryDetailInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.updateDeliveryDetails(info);
  }
  
  public void startRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteStartInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.startRoute(info);
  }
  
  public void departOrigin(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OriginDepartInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.departOrigin(info);
  }
  
  public void arriveDestination(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DestinationArriveInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.arriveDestination(info);
  }
  
  public void completeRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteCompleteInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.completeRoute(info);
  }
  
  public void arriveStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopArriveInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.arriveStop(info);
  }
  
  public void departStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopDepartInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.departStop(info);
  }
  
  public void bulkArriveDepartStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.BulkArriveDepartInfo[] arriveDepartInfos) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.bulkArriveDepartStop(arriveDepartInfos);
  }
  
  public void sequenceStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopSequenceInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.sequenceStop(info);
  }
  
  public void massStopSequence(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.MassStopSequenceInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.massStopSequence(info);
  }
  
  public void cancelStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.cancelStop(info);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdatePositionReturnCode updateRoutePosition(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutePositionInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.updateRoutePosition(info);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdatePositionReturnCode[] updateRoutePositionEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutePositionInfo[] infos) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.updateRoutePositionEx(infos);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdatePositionReturnCode[] updateRoutePositionETAs(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeId, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutePositionInfo[] infos) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.updateRoutePositionETAs(routeId, infos);
  }
  
  public void updateRouteETAs(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateRouteETAsInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.updateRouteETAs(info);
  }
  
  public void textMessage(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TextMessageInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.textMessage(info);
  }
  
  public void updateStopSignature(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopSignatureInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.updateStopSignature(info);
  }
  
  public void surveyResponse(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResponseInfo info) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.surveyResponse(info);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionData buildDispatchDriverDirections(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.buildDispatchDriverDirections(routeIdentity);
  }
  
  public boolean saveSapShipments(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity rsid, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipment[] sapShipments) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.saveSapShipments(rsid, sapShipments);
  }
  
  public boolean deleteSapShipmentsBySessionIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity rsid) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.deleteSapShipmentsBySessionIdentity(rsid);
  }
  
  public boolean deleteSapShipment(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipmentIdentity ssid) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.deleteSapShipment(ssid);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipment[] retrieveSapShipmentsBySessionIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity rsid) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveSapShipmentsBySessionIdentity(rsid);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdatePositionReturnCode[] updateTelematicsCachePositions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsCachePositionInfo[] positions) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.updateTelematicsCachePositions(positions);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsCachePositionInfo[] retrieveTelematicsCachePositionsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsCachePositionCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    return transportationWebService_PortType.retrieveTelematicsCachePositionsByCriteria(criteria);
  }
  
  public void cleanupTelematicsCachePositions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsCachePositionCriteria criteria) throws java.rmi.RemoteException{
    if (transportationWebService_PortType == null)
      _initTransportationWebServiceProxy();
    transportationWebService_PortType.cleanupTelematicsCachePositions(criteria);
  }
  
  
}