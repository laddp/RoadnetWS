package com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService;

public class ReportsWebServiceProxy implements com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportsWebService_PortType {
  private String _endpoint = null;
  private com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportsWebService_PortType reportsWebService_PortType = null;
  
  public ReportsWebServiceProxy() {
    _initReportsWebServiceProxy();
  }
  
  public ReportsWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initReportsWebServiceProxy();
  }
  
  private void _initReportsWebServiceProxy() {
    try {
      reportsWebService_PortType = (new com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportsWebService_ServiceLocator()).getReportsWebService();
      if (reportsWebService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)reportsWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)reportsWebService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (reportsWebService_PortType != null)
      ((javax.xml.rpc.Stub)reportsWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportsWebService_PortType getReportsWebService_PortType() {
    if (reportsWebService_PortType == null)
      _initReportsWebServiceProxy();
    return reportsWebService_PortType;
  }
  
  public java.lang.Integer nop() throws java.rmi.RemoteException{
    if (reportsWebService_PortType == null)
      _initReportsWebServiceProxy();
    return reportsWebService_PortType.nop();
  }
  
  public java.lang.String retrieveVersionInformation() throws java.rmi.RemoteException{
    if (reportsWebService_PortType == null)
      _initReportsWebServiceProxy();
    return reportsWebService_PortType.retrieveVersionInformation();
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report retrieveRICReportByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions retrieveOptions) throws java.rmi.RemoteException{
    if (reportsWebService_PortType == null)
      _initReportsWebServiceProxy();
    return reportsWebService_PortType.retrieveRICReportByIdentity(identity, retrieveOptions);
  }
  
  public com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report[] retrieveRICReports(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions retrieveOptions) throws java.rmi.RemoteException{
    if (reportsWebService_PortType == null)
      _initReportsWebServiceProxy();
    return reportsWebService_PortType.retrieveRICReports(retrieveOptions);
  }
  
  public java.lang.String exportReportToFile(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report report, com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportExportOptions exportOptions) throws java.rmi.RemoteException{
    if (reportsWebService_PortType == null)
      _initReportsWebServiceProxy();
    return reportsWebService_PortType.exportReportToFile(report, exportOptions);
  }
  
  
}