/**
 * StopArriveNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class StopArriveNotification  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity;

    private java.util.Calendar actualArrival;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType arrivalTimeDataQuality;

    public StopArriveNotification() {
    }

    public StopArriveNotification(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationType notificationType,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationIdentity notificationIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationLockIdentity lockIdentity,
           java.util.Calendar lockDate,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity,
           java.util.Calendar actualArrival,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType arrivalTimeDataQuality) {
        super(
            notificationType,
            notificationIdentity,
            recipientIdentity,
            lockIdentity,
            lockDate);
        this.source = source;
        this.stopIdentity = stopIdentity;
        this.actualArrival = actualArrival;
        this.arrivalTimeDataQuality = arrivalTimeDataQuality;
    }


    /**
     * Gets the source value for this StopArriveNotification.
     * 
     * @return source
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this StopArriveNotification.
     * 
     * @param source
     */
    public void setSource(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source) {
        this.source = source;
    }


    /**
     * Gets the stopIdentity value for this StopArriveNotification.
     * 
     * @return stopIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity getStopIdentity() {
        return stopIdentity;
    }


    /**
     * Sets the stopIdentity value for this StopArriveNotification.
     * 
     * @param stopIdentity
     */
    public void setStopIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity) {
        this.stopIdentity = stopIdentity;
    }


    /**
     * Gets the actualArrival value for this StopArriveNotification.
     * 
     * @return actualArrival
     */
    public java.util.Calendar getActualArrival() {
        return actualArrival;
    }


    /**
     * Sets the actualArrival value for this StopArriveNotification.
     * 
     * @param actualArrival
     */
    public void setActualArrival(java.util.Calendar actualArrival) {
        this.actualArrival = actualArrival;
    }


    /**
     * Gets the arrivalTimeDataQuality value for this StopArriveNotification.
     * 
     * @return arrivalTimeDataQuality
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType getArrivalTimeDataQuality() {
        return arrivalTimeDataQuality;
    }


    /**
     * Sets the arrivalTimeDataQuality value for this StopArriveNotification.
     * 
     * @param arrivalTimeDataQuality
     */
    public void setArrivalTimeDataQuality(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType arrivalTimeDataQuality) {
        this.arrivalTimeDataQuality = arrivalTimeDataQuality;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StopArriveNotification)) return false;
        StopArriveNotification other = (StopArriveNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.stopIdentity==null && other.getStopIdentity()==null) || 
             (this.stopIdentity!=null &&
              this.stopIdentity.equals(other.getStopIdentity()))) &&
            ((this.actualArrival==null && other.getActualArrival()==null) || 
             (this.actualArrival!=null &&
              this.actualArrival.equals(other.getActualArrival()))) &&
            ((this.arrivalTimeDataQuality==null && other.getArrivalTimeDataQuality()==null) || 
             (this.arrivalTimeDataQuality!=null &&
              this.arrivalTimeDataQuality.equals(other.getArrivalTimeDataQuality())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStopIdentity() != null) {
            _hashCode += getStopIdentity().hashCode();
        }
        if (getActualArrival() != null) {
            _hashCode += getActualArrival().hashCode();
        }
        if (getArrivalTimeDataQuality() != null) {
            _hashCode += getArrivalTimeDataQuality().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StopArriveNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopArriveNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "NotificationSource"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopIdentity"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualArrival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualArrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTimeDataQuality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "arrivalTimeDataQuality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DataQualityType"));
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
