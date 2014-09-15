/**
 * StopCancelCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class StopCancelCode  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelCodeIdentity stopCancelCodeIdentity;

    private java.lang.String description;

    public StopCancelCode() {
    }

    public StopCancelCode(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelCodeIdentity stopCancelCodeIdentity,
           java.lang.String description) {
           this.stopCancelCodeIdentity = stopCancelCodeIdentity;
           this.description = description;
    }


    /**
     * Gets the stopCancelCodeIdentity value for this StopCancelCode.
     * 
     * @return stopCancelCodeIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelCodeIdentity getStopCancelCodeIdentity() {
        return stopCancelCodeIdentity;
    }


    /**
     * Sets the stopCancelCodeIdentity value for this StopCancelCode.
     * 
     * @param stopCancelCodeIdentity
     */
    public void setStopCancelCodeIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopCancelCodeIdentity stopCancelCodeIdentity) {
        this.stopCancelCodeIdentity = stopCancelCodeIdentity;
    }


    /**
     * Gets the description value for this StopCancelCode.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this StopCancelCode.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StopCancelCode)) return false;
        StopCancelCode other = (StopCancelCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stopCancelCodeIdentity==null && other.getStopCancelCodeIdentity()==null) || 
             (this.stopCancelCodeIdentity!=null &&
              this.stopCancelCodeIdentity.equals(other.getStopCancelCodeIdentity()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getStopCancelCodeIdentity() != null) {
            _hashCode += getStopCancelCodeIdentity().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StopCancelCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopCancelCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopCancelCodeIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopCancelCodeIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopCancelCodeIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
