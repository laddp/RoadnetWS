/**
 * ChangedOrderIdentity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class ChangedOrderIdentity  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderIdentity  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateType changeType;

    public ChangedOrderIdentity() {
    }

    public ChangedOrderIdentity(
           java.lang.String regionID,
           java.util.Date routeDate,
           java.lang.String routeID,
           int internalStopID,
           java.lang.String orderNumber,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateType changeType) {
        super(
            regionID,
            routeDate,
            routeID,
            internalStopID,
            orderNumber);
        this.changeType = changeType;
    }


    /**
     * Gets the changeType value for this ChangedOrderIdentity.
     * 
     * @return changeType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateType getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this ChangedOrderIdentity.
     * 
     * @param changeType
     */
    public void setChangeType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateType changeType) {
        this.changeType = changeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangedOrderIdentity)) return false;
        ChangedOrderIdentity other = (ChangedOrderIdentity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType())));
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
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangedOrderIdentity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ChangedOrderIdentity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "changeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UpdateType"));
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
