/**
 * StopSequenceNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class StopSequenceNotification  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity[] newStopSequence;

    public StopSequenceNotification() {
    }

    public StopSequenceNotification(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationType notificationType,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationIdentity notificationIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationLockIdentity lockIdentity,
           java.util.Calendar lockDate,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity[] newStopSequence) {
        super(
            notificationType,
            notificationIdentity,
            recipientIdentity,
            lockIdentity,
            lockDate);
        this.source = source;
        this.newStopSequence = newStopSequence;
    }


    /**
     * Gets the source value for this StopSequenceNotification.
     * 
     * @return source
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this StopSequenceNotification.
     * 
     * @param source
     */
    public void setSource(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source) {
        this.source = source;
    }


    /**
     * Gets the newStopSequence value for this StopSequenceNotification.
     * 
     * @return newStopSequence
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity[] getNewStopSequence() {
        return newStopSequence;
    }


    /**
     * Sets the newStopSequence value for this StopSequenceNotification.
     * 
     * @param newStopSequence
     */
    public void setNewStopSequence(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity[] newStopSequence) {
        this.newStopSequence = newStopSequence;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity getNewStopSequence(int i) {
        return this.newStopSequence[i];
    }

    public void setNewStopSequence(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity _value) {
        this.newStopSequence[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StopSequenceNotification)) return false;
        StopSequenceNotification other = (StopSequenceNotification) obj;
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
            ((this.newStopSequence==null && other.getNewStopSequence()==null) || 
             (this.newStopSequence!=null &&
              java.util.Arrays.equals(this.newStopSequence, other.getNewStopSequence())));
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
        if (getNewStopSequence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewStopSequence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewStopSequence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StopSequenceNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopSequenceNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "NotificationSource"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newStopSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "newStopSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
