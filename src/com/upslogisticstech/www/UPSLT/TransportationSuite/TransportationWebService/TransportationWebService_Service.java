/**
 * TransportationWebService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public interface TransportationWebService_Service extends javax.xml.rpc.Service {

/**
 * UPS Logistics Technologies Transportation Web Service
 */
    public java.lang.String getTransportationWebServiceAddress();

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType getTransportationWebService() throws javax.xml.rpc.ServiceException;

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TransportationWebService_PortType getTransportationWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
