/**
 * GpsGapExceptionNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class GpsGapExceptionNotification  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity;

    private java.util.Calendar timeStamp;

    private org.apache.axis.types.Time gapTime;

    private double gapDistance;

    public GpsGapExceptionNotification() {
    }

    public GpsGapExceptionNotification(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationType notificationType,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationIdentity notificationIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationLockIdentity lockIdentity,
           java.util.Calendar lockDate,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity,
           java.util.Calendar timeStamp,
           org.apache.axis.types.Time gapTime,
           double gapDistance) {
        super(
            notificationType,
            notificationIdentity,
            recipientIdentity,
            lockIdentity,
            lockDate);
        this.routeIdentity = routeIdentity;
        this.timeStamp = timeStamp;
        this.gapTime = gapTime;
        this.gapDistance = gapDistance;
    }


    /**
     * Gets the routeIdentity value for this GpsGapExceptionNotification.
     * 
     * @return routeIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity getRouteIdentity() {
        return routeIdentity;
    }


    /**
     * Sets the routeIdentity value for this GpsGapExceptionNotification.
     * 
     * @param routeIdentity
     */
    public void setRouteIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity) {
        this.routeIdentity = routeIdentity;
    }


    /**
     * Gets the timeStamp value for this GpsGapExceptionNotification.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this GpsGapExceptionNotification.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the gapTime value for this GpsGapExceptionNotification.
     * 
     * @return gapTime
     */
    public org.apache.axis.types.Time getGapTime() {
        return gapTime;
    }


    /**
     * Sets the gapTime value for this GpsGapExceptionNotification.
     * 
     * @param gapTime
     */
    public void setGapTime(org.apache.axis.types.Time gapTime) {
        this.gapTime = gapTime;
    }


    /**
     * Gets the gapDistance value for this GpsGapExceptionNotification.
     * 
     * @return gapDistance
     */
    public double getGapDistance() {
        return gapDistance;
    }


    /**
     * Sets the gapDistance value for this GpsGapExceptionNotification.
     * 
     * @param gapDistance
     */
    public void setGapDistance(double gapDistance) {
        this.gapDistance = gapDistance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GpsGapExceptionNotification)) return false;
        GpsGapExceptionNotification other = (GpsGapExceptionNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.routeIdentity==null && other.getRouteIdentity()==null) || 
             (this.routeIdentity!=null &&
              this.routeIdentity.equals(other.getRouteIdentity()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.gapTime==null && other.getGapTime()==null) || 
             (this.gapTime!=null &&
              this.gapTime.equals(other.getGapTime()))) &&
            this.gapDistance == other.getGapDistance();
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
        if (getRouteIdentity() != null) {
            _hashCode += getRouteIdentity().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getGapTime() != null) {
            _hashCode += getGapTime().hashCode();
        }
        _hashCode += new Double(getGapDistance()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GpsGapExceptionNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "GpsGapExceptionNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteIdentity"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gapTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "gapTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gapDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "gapDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
