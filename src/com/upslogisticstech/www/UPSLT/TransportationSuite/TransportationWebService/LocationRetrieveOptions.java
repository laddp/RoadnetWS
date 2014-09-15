/**
 * LocationRetrieveOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class LocationRetrieveOptions  implements java.io.Serializable {
    private boolean retrieveConsigneeHistory;

    private boolean retrieveTimeWindowOverrides;

    private boolean retrieveServiceTimeOverrides;

    private boolean retrieveLocationPreferences;

    public LocationRetrieveOptions() {
    }

    public LocationRetrieveOptions(
           boolean retrieveConsigneeHistory,
           boolean retrieveTimeWindowOverrides,
           boolean retrieveServiceTimeOverrides,
           boolean retrieveLocationPreferences) {
           this.retrieveConsigneeHistory = retrieveConsigneeHistory;
           this.retrieveTimeWindowOverrides = retrieveTimeWindowOverrides;
           this.retrieveServiceTimeOverrides = retrieveServiceTimeOverrides;
           this.retrieveLocationPreferences = retrieveLocationPreferences;
    }


    /**
     * Gets the retrieveConsigneeHistory value for this LocationRetrieveOptions.
     * 
     * @return retrieveConsigneeHistory
     */
    public boolean isRetrieveConsigneeHistory() {
        return retrieveConsigneeHistory;
    }


    /**
     * Sets the retrieveConsigneeHistory value for this LocationRetrieveOptions.
     * 
     * @param retrieveConsigneeHistory
     */
    public void setRetrieveConsigneeHistory(boolean retrieveConsigneeHistory) {
        this.retrieveConsigneeHistory = retrieveConsigneeHistory;
    }


    /**
     * Gets the retrieveTimeWindowOverrides value for this LocationRetrieveOptions.
     * 
     * @return retrieveTimeWindowOverrides
     */
    public boolean isRetrieveTimeWindowOverrides() {
        return retrieveTimeWindowOverrides;
    }


    /**
     * Sets the retrieveTimeWindowOverrides value for this LocationRetrieveOptions.
     * 
     * @param retrieveTimeWindowOverrides
     */
    public void setRetrieveTimeWindowOverrides(boolean retrieveTimeWindowOverrides) {
        this.retrieveTimeWindowOverrides = retrieveTimeWindowOverrides;
    }


    /**
     * Gets the retrieveServiceTimeOverrides value for this LocationRetrieveOptions.
     * 
     * @return retrieveServiceTimeOverrides
     */
    public boolean isRetrieveServiceTimeOverrides() {
        return retrieveServiceTimeOverrides;
    }


    /**
     * Sets the retrieveServiceTimeOverrides value for this LocationRetrieveOptions.
     * 
     * @param retrieveServiceTimeOverrides
     */
    public void setRetrieveServiceTimeOverrides(boolean retrieveServiceTimeOverrides) {
        this.retrieveServiceTimeOverrides = retrieveServiceTimeOverrides;
    }


    /**
     * Gets the retrieveLocationPreferences value for this LocationRetrieveOptions.
     * 
     * @return retrieveLocationPreferences
     */
    public boolean isRetrieveLocationPreferences() {
        return retrieveLocationPreferences;
    }


    /**
     * Sets the retrieveLocationPreferences value for this LocationRetrieveOptions.
     * 
     * @param retrieveLocationPreferences
     */
    public void setRetrieveLocationPreferences(boolean retrieveLocationPreferences) {
        this.retrieveLocationPreferences = retrieveLocationPreferences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationRetrieveOptions)) return false;
        LocationRetrieveOptions other = (LocationRetrieveOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.retrieveConsigneeHistory == other.isRetrieveConsigneeHistory() &&
            this.retrieveTimeWindowOverrides == other.isRetrieveTimeWindowOverrides() &&
            this.retrieveServiceTimeOverrides == other.isRetrieveServiceTimeOverrides() &&
            this.retrieveLocationPreferences == other.isRetrieveLocationPreferences();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isRetrieveConsigneeHistory() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRetrieveTimeWindowOverrides() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRetrieveServiceTimeOverrides() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRetrieveLocationPreferences() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationRetrieveOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "LocationRetrieveOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveConsigneeHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "retrieveConsigneeHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveTimeWindowOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "retrieveTimeWindowOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveServiceTimeOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "retrieveServiceTimeOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveLocationPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "retrieveLocationPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
