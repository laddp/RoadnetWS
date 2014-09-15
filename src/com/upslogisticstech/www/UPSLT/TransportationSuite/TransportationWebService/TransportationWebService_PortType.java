/**
 * TransportationWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public interface TransportationWebService_PortType extends java.rmi.Remote {

    /**
     * Service definition of function ns1__Nop
     */
    public java.lang.Integer nop() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__VersionInformation
     */
    public java.lang.String versionInformation() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__AuthenticateUser
     */
    public int authenticateUser(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__ChangeUserPassword
     */
    public void changeUserPassword(java.lang.String userID, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__AddRICUser
     */
    public void addRICUser(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.User user) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrievePermissionsForUser
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserPermissions retrievePermissionsForUser(java.lang.String userID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DescribeAuthenticaitonPolicy
     */
    public java.lang.String describeAuthenticaitonPolicy(java.lang.String localeId) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUserByUserID
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.User retrieveUserByUserID(java.lang.String userID) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__AllowAdditionOfRICUsers
     */
    public boolean allowAdditionOfRICUsers() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRegionByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region retrieveRegionByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRegionsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region[] retrieveRegionsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveRegion
     */
    public void saveRegion(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region region) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRegionOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionOptions retrieveRegionOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveAutoArriveDepartOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.AutoArriveDepartOptions retrieveAutoArriveDepartOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveGPSProviderOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GPSProviderOptions retrieveGPSProviderOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveTelematicsOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsOptions retrieveTelematicsOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRICRegionsByUser
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RICRegionsWithPurchaseInfo retrieveRICRegionsByUser(java.lang.String userId) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRouteByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Route retrieveRouteByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Route[] retrieveRoutesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRouteForDevice
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Route retrieveRouteForDevice(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.WirelessDeviceIdentity wirelessDeviceIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveRoute
     */
    public void saveRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Route route, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopPlacementOptions placementOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__AssignEquipment
     */
    public void assignEquipment(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentIdentity[] equipment) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveAssignedEquipment
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentIdentity[] retrieveAssignedEquipment(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__AssignDrivers
     */
    public void assignDrivers(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EmployeeIdentity[] drivers) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveAssignedDrivers
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EmployeeIdentity[] retrieveAssignedDrivers(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RemoveRoute
     */
    public void removeRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SendTextMessageToDriver
     */
    public void sendTextMessageToDriver(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, java.lang.String message, java.lang.String fromUserID) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveStopByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop retrieveStopByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveStopsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop[] retrieveStopsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveStop
     */
    public void saveStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop stop, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopPlacementOptions placementOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveStopSignature
     */
    public byte[] retrieveStopSignature(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType imageType) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveStopSignature
     */
    public void saveStopSignature(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity, byte[] signatureData) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUnassignsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop[] retrieveUnassignsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveUnassigned
     */
    public void saveUnassigned(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Stop stop, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SuggestRoute
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PlacementCost[] suggestRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stop, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SuggestRouteOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__PlaceUnassigned
     */
    public void placeUnassigned(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stop, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopPlacementOptions placementPosition, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OptionalDateTime adjustedRouteStartTime, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteUnassigned
     */
    public void deleteUnassigned(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stop) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UnassignStop
     */
    public void unassignStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stop) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveLocations
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] saveLocations(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] locations) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveLocationsEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] saveLocationsEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] locations, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SaveLocationsExOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteLocations
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] deleteLocations(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] locations) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveLocationByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location retrieveLocationByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveLocationByIdentityEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location retrieveLocationByIdentityEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveLocationsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] retrieveLocationsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveLocationsByCriteriaEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] retrieveLocationsByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveEquipmentTypeByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentType[] retrieveEquipmentTypeByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentTypeCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveEquipmentTypeByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentType retrieveEquipmentTypeByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentTypeIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveEquipmentByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Equipment retrieveEquipmentByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveEquipmentByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Equipment[] retrieveEquipmentByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EquipmentCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveEquipment
     */
    public void saveEquipment(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Equipment equipment, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveEmployeeByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Employee retrieveEmployeeByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EmployeeIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveEmployeesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Employee[] retrieveEmployeesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.EmployeeCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveEmployee
     */
    public void saveEmployee(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Employee employee) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveDutyPeriodByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriod retrieveDutyPeriodByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriodIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriodRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveDutyPeriodsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriod[] retrieveDutyPeriodsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriodCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DutyPeriodRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveProductsPurchased
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ProductsPurchased retrieveProductsPurchased(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRouteSurveyResults
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] retrieveRouteSurveyResults(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveStopSurveyResults
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] retrieveStopSurveyResults(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveRouteSurveyResults
     */
    public void saveRouteSurveyResults(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] surveyResults) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveStopSurveyResults
     */
    public void saveStopSurveyResults(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] surveyResults) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveSurveys
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Survey[] retrieveSurveys(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveSurveyDetails
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyDetails[] retrieveSurveyDetails(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRouteSurveyQuestions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyQuestionsResult retrieveRouteSurveyQuestions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveStopSurveyQuestions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyQuestionsResult retrieveStopSurveyQuestions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrievePositionHistoryByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PositionHistory[] retrievePositionHistoryByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PositionHistoryCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrievePositionHistoryBlocksByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PositionHistory[] retrievePositionHistoryBlocksByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.PositionHistoryCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveReportByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Report retrieveReportByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReportIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveReportsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Report[] retrieveReportsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReportCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveReport
     */
    public void saveReport(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Report report) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteReport
     */
    public void deleteReport(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReportIdentity identity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRouteNotesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNote[] retrieveRouteNotesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNoteCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRouteNotesByCriteriaEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNote[] retrieveRouteNotesByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNoteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NoteRetrievalOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveStopNotesByCriteriaEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopNote[] retrieveStopNotesByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopNoteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NoteRetrievalOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveOrderNotesByCriteriaEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderNote[] retrieveOrderNotesByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderNoteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NoteRetrievalOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveLineItemNotesByCriteriaEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LineItemNote[] retrieveLineItemNotesByCriteriaEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LineItemNoteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NoteRetrievalOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveCannedTextMessagesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CannedTextMessage[] retrieveCannedTextMessagesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CannedTextMessageCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRouteDailyStatsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteDailyStats[] retrieveRouteDailyStatsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteDailyStatsCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteDailyStatsRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__ConvertTimestamp
     */
    public java.util.Calendar convertTimestamp(java.util.Calendar sourceTimestamp, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions sourceOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions destinationOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__ConvertTimestamps
     */
    public java.util.Calendar[] convertTimestamps(java.util.Calendar[] sourceTimestamps, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions sourceOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions destinationOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__ReturnFault
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Fault returnFault(int requestedFaultCode) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__CalculateTimeDist
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeDistResult calculateTimeDist(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity, int fromLatitude, int fromLongitude, int toLatitude, int toLongitude) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveRegionConfig
     */
    public void saveRegionConfig(java.lang.String applicationID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity, java.lang.String configGroupID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] items) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRegionConfig
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] retrieveRegionConfig(java.lang.String applicationID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RegionIdentity regionIdentity, java.lang.String configGroupID) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveUserConfig
     */
    public void saveUserConfig(java.lang.String applicationID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserIdentity userIdentity, java.lang.String configGroupID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] items) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUserConfig
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] retrieveUserConfig(java.lang.String applicationID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserIdentity userIdentity, java.lang.String configGroupID) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveGlobalConfig
     */
    public void saveGlobalConfig(java.lang.String applicationID, java.lang.String configGroupID, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] items) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveGlobalConfig
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ConfigurationItem[] retrieveGlobalConfig(java.lang.String applicationID, java.lang.String configGroupID) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUserDefinedTableByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTable retrieveUserDefinedTableByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUserDefinedTablesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTable[] retrieveUserDefinedTablesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableCriteria tableCriteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveUserDefinedTable
     */
    public void saveUserDefinedTable(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTable table) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteUserDefinedTable
     */
    public void deleteUserDefinedTable(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableId) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUserDefinedColumnByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn retrieveUserDefinedColumnByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumnIdentity columnIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUserDefinedColumnsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn[] retrieveUserDefinedColumnsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumnCriteria columnCriteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUserDefinedDataByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedData retrieveUserDefinedDataByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataIdentity dataIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tmzOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUserDefinedDataByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedData[] retrieveUserDefinedDataByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataCriteria dataCriteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tmzOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveUserDefinedData
     */
    public void saveUserDefinedData(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedData[] input, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tmzOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteUserDefinedData
     */
    public void deleteUserDefinedData(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity tableIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataIdentity[] input) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveQuantityReasonCodesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuantityReasonCode[] retrieveQuantityReasonCodesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuantityReasonCodeCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveStopCancelCodesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelCode[] retrieveStopCancelCodesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelCodeCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveUndeliverableStopCodesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UndeliverableStopCode[] retrieveUndeliverableStopCodesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UndeliverableStopCodeCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingSessionsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSession[] retrieveRoutingSessionsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingSessionByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSession retrieveRoutingSessionByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingRoutesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRoute[] retrieveRoutingRoutesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingRouteByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRoute retrieveRoutingRouteByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingStopByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStop retrieveRoutingStopByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStopIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingUnassignsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStop[] retrieveRoutingUnassignsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStopCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingLocationsWithOrders
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] retrieveRoutingLocationsWithOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity sessionIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingLocationsWithOrdersEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Location[] retrieveRoutingLocationsWithOrdersEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity sessionIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingOrderByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrder retrieveRoutingOrderByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingSourcedOrdersByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrder[] retrieveRoutingSourcedOrdersByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSourcedOrderCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveDefaultRoutingSessionProperties
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionProperties retrieveDefaultRoutingSessionProperties(java.lang.String regionId, java.util.Date sessionDate) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__CreateRoutingSession
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity createRoutingSession(java.lang.String regionId, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionProperties sessionProperties) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteRoutingSession
     */
    public void deleteRoutingSession(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity sessionIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveRoutingImportOrders
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] saveRoutingImportOrders(java.lang.String regionId, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] orders, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveRoutingImportOrdersEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] saveRoutingImportOrdersEx(java.lang.String regionId, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] orders, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SaveRoutingImportOrdersExOptions importOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingImportOrderByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder retrieveRoutingImportOrderByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrderIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingImportOrdersByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrder[] retrieveRoutingImportOrdersByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingImportOrderCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingStopsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStop[] retrieveRoutingStopsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingStopCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteInfoRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRoutingRouteDailyStatsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteDailyStats[] retrieveRoutingRouteDailyStatsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteDailyStatsCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteDailyStatsRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__BuildRoutingRouteNetMatrix
     */
    public void buildRoutingRouteNetMatrix(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity sessionIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__BuildRoutingDriverDirections
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionData buildRoutingDriverDirections(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteIdentity routeIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerAnalyzeOrder
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWindow[] schedulerAnalyzeOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder order, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerAnalyzeOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerReserveOrder
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReserveResult schedulerReserveOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder deliveryAreaOrder, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWindow deliveryWindow, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerReserveOrderOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerConfirmOrder
     */
    public void schedulerConfirmOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String orderNumberXML) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerCancelOrder
     */
    public void schedulerCancelOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String orderNumberXML) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerPurge
     */
    public void schedulerPurge(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, boolean reloadXML) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerRemoveFromServer
     */
    public void schedulerRemoveFromServer(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerIsExcludingCutoffRoutes
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.IsExcludingCutoffRoutesResult schedulerIsExcludingCutoffRoutes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerExcludeCutoffRoutes
     */
    public void schedulerExcludeCutoffRoutes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, boolean excludeXML) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerOptimizeOrders
     */
    public void schedulerOptimizeOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerOptimizeOrdersEx
     */
    public void schedulerOptimizeOrdersEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerOptimizeOrdersExOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerBalanceRoutes
     */
    public void schedulerBalanceRoutes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerBalanceRoutesOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerExtendOrderReservation
     */
    public void schedulerExtendOrderReservation(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String orderNumberXML, int extendMinutes) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerBulkReserveOrders
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder[] schedulerBulkReserveOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder[] orders, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerBulkReserveOrdersOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerSendRoutesToRoadnet
     */
    public void schedulerSendRoutesToRoadnet(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerSendRoutesToRoadnetEx
     */
    public void schedulerSendRoutesToRoadnetEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String sessionDescription) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerMovableOrders
     */
    public void schedulerMovableOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, java.lang.String[] criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerMovableOrdersOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerRetrieveFeederRoutes
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerFeederRoute[] schedulerRetrieveFeederRoutes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerRetrieveFeederRoutesOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerUpdateOrder
     */
    public boolean schedulerUpdateOrder(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerUpdateOrderOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerReloadWaveInstances
     */
    public boolean schedulerReloadWaveInstances(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerReloadWaveInstancesOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerSaveDeliveryWaveInstance
     */
    public java.lang.String[] schedulerSaveDeliveryWaveInstance(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWaveInstanceIdentity waveIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWaveAttributes attributes, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerSaveDeliveryWaveInstanceOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerRetrieveDeliveryWaveInstancesByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWaveInstance[] schedulerRetrieveDeliveryWaveInstancesByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWaveInstanceCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerRetrieveDeliveryWaveInstanceOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerSaveDeliveryWindow
     */
    public boolean schedulerSaveDeliveryWindow(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerSaveDeliveryWindowOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerDeleteDeliveryWindow
     */
    public void schedulerDeleteDeliveryWindow(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryWindow window, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeleteDeliveryWindowOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerRetrieveOrderByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder schedulerRetrieveOrderByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerRetrieveOrdersByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrder[] schedulerRetrieveOrdersByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryAreaOrderRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SchedulerCalculateDeliveryWindowMetrics
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowMetrics[] schedulerCalculateDeliveryWindowMetrics(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerIdentity schedulerIdentity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowMetricsOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveNotificationsByRecipientIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification[] retrieveNotificationsByRecipientIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveNotificationsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification[] retrieveNotificationsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationCriteria criteria, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions tzOptions, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationRetrieveOptions options) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteNotifications
     */
    public void deleteNotifications(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationIdentity[] identities) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UnlockNotifications
     */
    public void unlockNotifications(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnlockNotificationsCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UpdateDeliveryDetails
     */
    public void updateDeliveryDetails(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DeliveryDetailInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__StartRoute
     */
    public void startRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteStartInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DepartOrigin
     */
    public void departOrigin(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OriginDepartInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__ArriveDestination
     */
    public void arriveDestination(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DestinationArriveInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__CompleteRoute
     */
    public void completeRoute(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteCompleteInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__ArriveStop
     */
    public void arriveStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopArriveInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DepartStop
     */
    public void departStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopDepartInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__BulkArriveDepartStop
     */
    public void bulkArriveDepartStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.BulkArriveDepartInfo[] arriveDepartInfos) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SequenceStop
     */
    public void sequenceStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopSequenceInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__MassStopSequence
     */
    public void massStopSequence(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.MassStopSequenceInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__CancelStop
     */
    public void cancelStop(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UpdateRoutePosition
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdatePositionReturnCode updateRoutePosition(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutePositionInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UpdateRoutePositionEx
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdatePositionReturnCode[] updateRoutePositionEx(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutePositionInfo[] infos) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UpdateRoutePositionETAs
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdatePositionReturnCode[] updateRoutePositionETAs(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeId, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutePositionInfo[] infos) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UpdateRouteETAs
     */
    public void updateRouteETAs(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateRouteETAsInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__TextMessage
     */
    public void textMessage(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TextMessageInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UpdateStopSignature
     */
    public void updateStopSignature(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopSignatureInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SurveyResponse
     */
    public void surveyResponse(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResponseInfo info) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__BuildDispatchDriverDirections
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionData buildDispatchDriverDirections(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__SaveSapShipments
     */
    public boolean saveSapShipments(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity rsid, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipment[] sapShipments) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteSapShipmentsBySessionIdentity
     */
    public boolean deleteSapShipmentsBySessionIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity rsid) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__DeleteSapShipment
     */
    public boolean deleteSapShipment(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipmentIdentity ssid) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveSapShipmentsBySessionIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipment[] retrieveSapShipmentsBySessionIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity rsid) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__UpdateTelematicsCachePositions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdatePositionReturnCode[] updateTelematicsCachePositions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsCachePositionInfo[] positions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveTelematicsCachePositionsByCriteria
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsCachePositionInfo[] retrieveTelematicsCachePositionsByCriteria(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsCachePositionCriteria criteria) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__CleanupTelematicsCachePositions
     */
    public void cleanupTelematicsCachePositions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TelematicsCachePositionCriteria criteria) throws java.rmi.RemoteException;
}
