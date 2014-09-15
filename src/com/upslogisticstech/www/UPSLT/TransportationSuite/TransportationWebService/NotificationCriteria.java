/**
 * NotificationCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class NotificationCriteria  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity;

    private java.lang.Integer internalRouteID;

    public NotificationCriteria() {
    }

    public NotificationCriteria(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity,
           java.lang.Integer internalRouteID) {
           this.recipientIdentity = recipientIdentity;
           this.internalRouteID = internalRouteID;
    }


    /**
     * Gets the recipientIdentity value for this NotificationCriteria.
     * 
     * @return recipientIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity getRecipientIdentity() {
        return recipientIdentity;
    }


    /**
     * Sets the recipientIdentity value for this NotificationCriteria.
     * 
     * @param recipientIdentity
     */
    public void setRecipientIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity) {
        this.recipientIdentity = recipientIdentity;
    }


    /**
     * Gets the internalRouteID value for this NotificationCriteria.
     * 
     * @return internalRouteID
     */
    public java.lang.Integer getInternalRouteID() {
        return internalRouteID;
    }


    /**
     * Sets the internalRouteID value for this NotificationCriteria.
     * 
     * @param internalRouteID
     */
    public void setInternalRouteID(java.lang.Integer internalRouteID) {
        this.internalRouteID = internalRouteID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationCriteria)) return false;
        NotificationCriteria other = (NotificationCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipientIdentity==null && other.getRecipientIdentity()==null) || 
             (this.recipientIdentity!=null &&
              this.recipientIdentity.equals(other.getRecipientIdentity()))) &&
            ((this.internalRouteID==null && other.getInternalRouteID()==null) || 
             (this.internalRouteID!=null &&
              this.internalRouteID.equals(other.getInternalRouteID())));
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
        if (getRecipientIdentity() != null) {
            _hashCode += getRecipientIdentity().hashCode();
        }
        if (getInternalRouteID() != null) {
            _hashCode += getInternalRouteID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "NotificationCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "recipientIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RecipientIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalRouteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "internalRouteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
