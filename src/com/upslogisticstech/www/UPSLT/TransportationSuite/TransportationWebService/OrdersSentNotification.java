/**
 * OrdersSentNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class OrdersSentNotification  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteIdentity routingRouteIdentity;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity[] newlySentOrderIdentities;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity[] previouslySentOrderIdentities;

    public OrdersSentNotification() {
    }

    public OrdersSentNotification(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationType notificationType,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationIdentity notificationIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationLockIdentity lockIdentity,
           java.util.Calendar lockDate,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteIdentity routingRouteIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity[] newlySentOrderIdentities,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity[] previouslySentOrderIdentities) {
        super(
            notificationType,
            notificationIdentity,
            recipientIdentity,
            lockIdentity,
            lockDate);
        this.routingRouteIdentity = routingRouteIdentity;
        this.newlySentOrderIdentities = newlySentOrderIdentities;
        this.previouslySentOrderIdentities = previouslySentOrderIdentities;
    }


    /**
     * Gets the routingRouteIdentity value for this OrdersSentNotification.
     * 
     * @return routingRouteIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteIdentity getRoutingRouteIdentity() {
        return routingRouteIdentity;
    }


    /**
     * Sets the routingRouteIdentity value for this OrdersSentNotification.
     * 
     * @param routingRouteIdentity
     */
    public void setRoutingRouteIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingRouteIdentity routingRouteIdentity) {
        this.routingRouteIdentity = routingRouteIdentity;
    }


    /**
     * Gets the newlySentOrderIdentities value for this OrdersSentNotification.
     * 
     * @return newlySentOrderIdentities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity[] getNewlySentOrderIdentities() {
        return newlySentOrderIdentities;
    }


    /**
     * Sets the newlySentOrderIdentities value for this OrdersSentNotification.
     * 
     * @param newlySentOrderIdentities
     */
    public void setNewlySentOrderIdentities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity[] newlySentOrderIdentities) {
        this.newlySentOrderIdentities = newlySentOrderIdentities;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity getNewlySentOrderIdentities(int i) {
        return this.newlySentOrderIdentities[i];
    }

    public void setNewlySentOrderIdentities(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity _value) {
        this.newlySentOrderIdentities[i] = _value;
    }


    /**
     * Gets the previouslySentOrderIdentities value for this OrdersSentNotification.
     * 
     * @return previouslySentOrderIdentities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity[] getPreviouslySentOrderIdentities() {
        return previouslySentOrderIdentities;
    }


    /**
     * Sets the previouslySentOrderIdentities value for this OrdersSentNotification.
     * 
     * @param previouslySentOrderIdentities
     */
    public void setPreviouslySentOrderIdentities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity[] previouslySentOrderIdentities) {
        this.previouslySentOrderIdentities = previouslySentOrderIdentities;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity getPreviouslySentOrderIdentities(int i) {
        return this.previouslySentOrderIdentities[i];
    }

    public void setPreviouslySentOrderIdentities(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RoutingOrderIdentity _value) {
        this.previouslySentOrderIdentities[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrdersSentNotification)) return false;
        OrdersSentNotification other = (OrdersSentNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.routingRouteIdentity==null && other.getRoutingRouteIdentity()==null) || 
             (this.routingRouteIdentity!=null &&
              this.routingRouteIdentity.equals(other.getRoutingRouteIdentity()))) &&
            ((this.newlySentOrderIdentities==null && other.getNewlySentOrderIdentities()==null) || 
             (this.newlySentOrderIdentities!=null &&
              java.util.Arrays.equals(this.newlySentOrderIdentities, other.getNewlySentOrderIdentities()))) &&
            ((this.previouslySentOrderIdentities==null && other.getPreviouslySentOrderIdentities()==null) || 
             (this.previouslySentOrderIdentities!=null &&
              java.util.Arrays.equals(this.previouslySentOrderIdentities, other.getPreviouslySentOrderIdentities())));
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
        if (getRoutingRouteIdentity() != null) {
            _hashCode += getRoutingRouteIdentity().hashCode();
        }
        if (getNewlySentOrderIdentities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewlySentOrderIdentities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewlySentOrderIdentities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreviouslySentOrderIdentities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreviouslySentOrderIdentities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreviouslySentOrderIdentities(), i);
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
        new org.apache.axis.description.TypeDesc(OrdersSentNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "OrdersSentNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingRouteIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routingRouteIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RoutingRouteIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newlySentOrderIdentities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "newlySentOrderIdentities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RoutingOrderIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previouslySentOrderIdentities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "previouslySentOrderIdentities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RoutingOrderIdentity"));
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
