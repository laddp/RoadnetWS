/**
 * DriverCancelExceptionNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class DriverCancelExceptionNotification  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity;

    private java.util.Calendar timeStamp;

    private java.lang.String cancelCode;

    public DriverCancelExceptionNotification() {
    }

    public DriverCancelExceptionNotification(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationType notificationType,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationIdentity notificationIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationLockIdentity lockIdentity,
           java.util.Calendar lockDate,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity,
           java.util.Calendar timeStamp,
           java.lang.String cancelCode) {
        super(
            notificationType,
            notificationIdentity,
            recipientIdentity,
            lockIdentity,
            lockDate);
        this.stopIdentity = stopIdentity;
        this.timeStamp = timeStamp;
        this.cancelCode = cancelCode;
    }


    /**
     * Gets the stopIdentity value for this DriverCancelExceptionNotification.
     * 
     * @return stopIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity getStopIdentity() {
        return stopIdentity;
    }


    /**
     * Sets the stopIdentity value for this DriverCancelExceptionNotification.
     * 
     * @param stopIdentity
     */
    public void setStopIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity) {
        this.stopIdentity = stopIdentity;
    }


    /**
     * Gets the timeStamp value for this DriverCancelExceptionNotification.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this DriverCancelExceptionNotification.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the cancelCode value for this DriverCancelExceptionNotification.
     * 
     * @return cancelCode
     */
    public java.lang.String getCancelCode() {
        return cancelCode;
    }


    /**
     * Sets the cancelCode value for this DriverCancelExceptionNotification.
     * 
     * @param cancelCode
     */
    public void setCancelCode(java.lang.String cancelCode) {
        this.cancelCode = cancelCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DriverCancelExceptionNotification)) return false;
        DriverCancelExceptionNotification other = (DriverCancelExceptionNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.stopIdentity==null && other.getStopIdentity()==null) || 
             (this.stopIdentity!=null &&
              this.stopIdentity.equals(other.getStopIdentity()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.cancelCode==null && other.getCancelCode()==null) || 
             (this.cancelCode!=null &&
              this.cancelCode.equals(other.getCancelCode())));
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
        if (getStopIdentity() != null) {
            _hashCode += getStopIdentity().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getCancelCode() != null) {
            _hashCode += getCancelCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DriverCancelExceptionNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DriverCancelExceptionNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopIdentity"));
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
        elemField.setFieldName("cancelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "cancelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
