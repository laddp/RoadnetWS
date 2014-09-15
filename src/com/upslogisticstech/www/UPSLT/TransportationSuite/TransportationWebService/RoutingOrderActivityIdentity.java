/**
 * RoutingOrderActivityIdentity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class RoutingOrderActivityIdentity  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingSessionIdentity  implements java.io.Serializable {
    private int internalOrderActivityID;

    public RoutingOrderActivityIdentity() {
    }

    public RoutingOrderActivityIdentity(
           java.lang.String regionID,
           int internalSessionID,
           int internalOrderActivityID) {
        super(
            regionID,
            internalSessionID);
        this.internalOrderActivityID = internalOrderActivityID;
    }


    /**
     * Gets the internalOrderActivityID value for this RoutingOrderActivityIdentity.
     * 
     * @return internalOrderActivityID
     */
    public int getInternalOrderActivityID() {
        return internalOrderActivityID;
    }


    /**
     * Sets the internalOrderActivityID value for this RoutingOrderActivityIdentity.
     * 
     * @param internalOrderActivityID
     */
    public void setInternalOrderActivityID(int internalOrderActivityID) {
        this.internalOrderActivityID = internalOrderActivityID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingOrderActivityIdentity)) return false;
        RoutingOrderActivityIdentity other = (RoutingOrderActivityIdentity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.internalOrderActivityID == other.getInternalOrderActivityID();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getInternalOrderActivityID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingOrderActivityIdentity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RoutingOrderActivityIdentity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalOrderActivityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "internalOrderActivityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
