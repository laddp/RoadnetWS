/**
 * ReportsWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService;

public interface ReportsWebService_PortType extends java.rmi.Remote {

    /**
     * Service definition of function ns1__Nop
     */
    public java.lang.Integer nop() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveVersionInformation
     */
    public java.lang.String retrieveVersionInformation() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRICReportByIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report retrieveRICReportByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions retrieveOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__RetrieveRICReports
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report[] retrieveRICReports(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions retrieveOptions) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns1__ExportReportToFile
     */
    public java.lang.String exportReportToFile(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report report, com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportExportOptions exportOptions) throws java.rmi.RemoteException;
}
