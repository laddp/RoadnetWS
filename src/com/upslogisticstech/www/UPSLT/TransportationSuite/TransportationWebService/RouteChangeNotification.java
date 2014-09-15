/**
 * RouteChangeNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class RouteChangeNotification  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Notification  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity;

    private java.util.Calendar timeStamp;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateType changeType;

    private boolean routeHeaderChanged;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedStopIdentity[] stops;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedDriverAlertIdentity[] driverAlerts;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderIdentity[] orders;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderFinancialDetailIdentity[] orderFinancialDetails;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderContainerIdentity[] orderContainers;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedLineItemIdentity[] lineItems;

    public RouteChangeNotification() {
    }

    public RouteChangeNotification(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationType notificationType,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationIdentity notificationIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RecipientIdentity recipientIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationLockIdentity lockIdentity,
           java.util.Calendar lockDate,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity,
           java.util.Calendar timeStamp,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateType changeType,
           boolean routeHeaderChanged,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedStopIdentity[] stops,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedDriverAlertIdentity[] driverAlerts,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderIdentity[] orders,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderFinancialDetailIdentity[] orderFinancialDetails,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderContainerIdentity[] orderContainers,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedLineItemIdentity[] lineItems) {
        super(
            notificationType,
            notificationIdentity,
            recipientIdentity,
            lockIdentity,
            lockDate);
        this.source = source;
        this.routeIdentity = routeIdentity;
        this.timeStamp = timeStamp;
        this.changeType = changeType;
        this.routeHeaderChanged = routeHeaderChanged;
        this.stops = stops;
        this.driverAlerts = driverAlerts;
        this.orders = orders;
        this.orderFinancialDetails = orderFinancialDetails;
        this.orderContainers = orderContainers;
        this.lineItems = lineItems;
    }


    /**
     * Gets the source value for this RouteChangeNotification.
     * 
     * @return source
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this RouteChangeNotification.
     * 
     * @param source
     */
    public void setSource(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.NotificationSource source) {
        this.source = source;
    }


    /**
     * Gets the routeIdentity value for this RouteChangeNotification.
     * 
     * @return routeIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity getRouteIdentity() {
        return routeIdentity;
    }


    /**
     * Sets the routeIdentity value for this RouteChangeNotification.
     * 
     * @param routeIdentity
     */
    public void setRouteIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity) {
        this.routeIdentity = routeIdentity;
    }


    /**
     * Gets the timeStamp value for this RouteChangeNotification.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this RouteChangeNotification.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the changeType value for this RouteChangeNotification.
     * 
     * @return changeType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateType getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this RouteChangeNotification.
     * 
     * @param changeType
     */
    public void setChangeType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UpdateType changeType) {
        this.changeType = changeType;
    }


    /**
     * Gets the routeHeaderChanged value for this RouteChangeNotification.
     * 
     * @return routeHeaderChanged
     */
    public boolean isRouteHeaderChanged() {
        return routeHeaderChanged;
    }


    /**
     * Sets the routeHeaderChanged value for this RouteChangeNotification.
     * 
     * @param routeHeaderChanged
     */
    public void setRouteHeaderChanged(boolean routeHeaderChanged) {
        this.routeHeaderChanged = routeHeaderChanged;
    }


    /**
     * Gets the stops value for this RouteChangeNotification.
     * 
     * @return stops
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedStopIdentity[] getStops() {
        return stops;
    }


    /**
     * Sets the stops value for this RouteChangeNotification.
     * 
     * @param stops
     */
    public void setStops(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedStopIdentity[] stops) {
        this.stops = stops;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedStopIdentity getStops(int i) {
        return this.stops[i];
    }

    public void setStops(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedStopIdentity _value) {
        this.stops[i] = _value;
    }


    /**
     * Gets the driverAlerts value for this RouteChangeNotification.
     * 
     * @return driverAlerts
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedDriverAlertIdentity[] getDriverAlerts() {
        return driverAlerts;
    }


    /**
     * Sets the driverAlerts value for this RouteChangeNotification.
     * 
     * @param driverAlerts
     */
    public void setDriverAlerts(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedDriverAlertIdentity[] driverAlerts) {
        this.driverAlerts = driverAlerts;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedDriverAlertIdentity getDriverAlerts(int i) {
        return this.driverAlerts[i];
    }

    public void setDriverAlerts(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedDriverAlertIdentity _value) {
        this.driverAlerts[i] = _value;
    }


    /**
     * Gets the orders value for this RouteChangeNotification.
     * 
     * @return orders
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderIdentity[] getOrders() {
        return orders;
    }


    /**
     * Sets the orders value for this RouteChangeNotification.
     * 
     * @param orders
     */
    public void setOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderIdentity[] orders) {
        this.orders = orders;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderIdentity getOrders(int i) {
        return this.orders[i];
    }

    public void setOrders(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderIdentity _value) {
        this.orders[i] = _value;
    }


    /**
     * Gets the orderFinancialDetails value for this RouteChangeNotification.
     * 
     * @return orderFinancialDetails
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderFinancialDetailIdentity[] getOrderFinancialDetails() {
        return orderFinancialDetails;
    }


    /**
     * Sets the orderFinancialDetails value for this RouteChangeNotification.
     * 
     * @param orderFinancialDetails
     */
    public void setOrderFinancialDetails(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderFinancialDetailIdentity[] orderFinancialDetails) {
        this.orderFinancialDetails = orderFinancialDetails;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderFinancialDetailIdentity getOrderFinancialDetails(int i) {
        return this.orderFinancialDetails[i];
    }

    public void setOrderFinancialDetails(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderFinancialDetailIdentity _value) {
        this.orderFinancialDetails[i] = _value;
    }


    /**
     * Gets the orderContainers value for this RouteChangeNotification.
     * 
     * @return orderContainers
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderContainerIdentity[] getOrderContainers() {
        return orderContainers;
    }


    /**
     * Sets the orderContainers value for this RouteChangeNotification.
     * 
     * @param orderContainers
     */
    public void setOrderContainers(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderContainerIdentity[] orderContainers) {
        this.orderContainers = orderContainers;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderContainerIdentity getOrderContainers(int i) {
        return this.orderContainers[i];
    }

    public void setOrderContainers(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedOrderContainerIdentity _value) {
        this.orderContainers[i] = _value;
    }


    /**
     * Gets the lineItems value for this RouteChangeNotification.
     * 
     * @return lineItems
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedLineItemIdentity[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this RouteChangeNotification.
     * 
     * @param lineItems
     */
    public void setLineItems(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedLineItemIdentity[] lineItems) {
        this.lineItems = lineItems;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedLineItemIdentity getLineItems(int i) {
        return this.lineItems[i];
    }

    public void setLineItems(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ChangedLineItemIdentity _value) {
        this.lineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteChangeNotification)) return false;
        RouteChangeNotification other = (RouteChangeNotification) obj;
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
            ((this.routeIdentity==null && other.getRouteIdentity()==null) || 
             (this.routeIdentity!=null &&
              this.routeIdentity.equals(other.getRouteIdentity()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType()))) &&
            this.routeHeaderChanged == other.isRouteHeaderChanged() &&
            ((this.stops==null && other.getStops()==null) || 
             (this.stops!=null &&
              java.util.Arrays.equals(this.stops, other.getStops()))) &&
            ((this.driverAlerts==null && other.getDriverAlerts()==null) || 
             (this.driverAlerts!=null &&
              java.util.Arrays.equals(this.driverAlerts, other.getDriverAlerts()))) &&
            ((this.orders==null && other.getOrders()==null) || 
             (this.orders!=null &&
              java.util.Arrays.equals(this.orders, other.getOrders()))) &&
            ((this.orderFinancialDetails==null && other.getOrderFinancialDetails()==null) || 
             (this.orderFinancialDetails!=null &&
              java.util.Arrays.equals(this.orderFinancialDetails, other.getOrderFinancialDetails()))) &&
            ((this.orderContainers==null && other.getOrderContainers()==null) || 
             (this.orderContainers!=null &&
              java.util.Arrays.equals(this.orderContainers, other.getOrderContainers()))) &&
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems())));
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
        if (getRouteIdentity() != null) {
            _hashCode += getRouteIdentity().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        _hashCode += (isRouteHeaderChanged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStops() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStops());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStops(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDriverAlerts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDriverAlerts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDriverAlerts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderFinancialDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderFinancialDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderFinancialDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderContainers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderContainers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderContainers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItems(), i);
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
        new org.apache.axis.description.TypeDesc(RouteChangeNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteChangeNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "NotificationSource"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("changeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "changeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UpdateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeHeaderChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeHeaderChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ChangedStopIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverAlerts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "driverAlerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ChangedDriverAlertIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ChangedOrderIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderFinancialDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orderFinancialDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ChangedOrderFinancialDetailIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderContainers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orderContainers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ChangedOrderContainerIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "lineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ChangedLineItemIdentity"));
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
