/**
 * SchedulerOrderMetrics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SchedulerOrderMetrics  implements java.io.Serializable {
    private int items;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities deliveryQuantities;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities pickupQuantities;

    private int serviceTime;

    private int travelTime;

    public SchedulerOrderMetrics() {
    }

    public SchedulerOrderMetrics(
           int items,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities deliveryQuantities,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities pickupQuantities,
           int serviceTime,
           int travelTime) {
           this.items = items;
           this.deliveryQuantities = deliveryQuantities;
           this.pickupQuantities = pickupQuantities;
           this.serviceTime = serviceTime;
           this.travelTime = travelTime;
    }


    /**
     * Gets the items value for this SchedulerOrderMetrics.
     * 
     * @return items
     */
    public int getItems() {
        return items;
    }


    /**
     * Sets the items value for this SchedulerOrderMetrics.
     * 
     * @param items
     */
    public void setItems(int items) {
        this.items = items;
    }


    /**
     * Gets the deliveryQuantities value for this SchedulerOrderMetrics.
     * 
     * @return deliveryQuantities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getDeliveryQuantities() {
        return deliveryQuantities;
    }


    /**
     * Sets the deliveryQuantities value for this SchedulerOrderMetrics.
     * 
     * @param deliveryQuantities
     */
    public void setDeliveryQuantities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities deliveryQuantities) {
        this.deliveryQuantities = deliveryQuantities;
    }


    /**
     * Gets the pickupQuantities value for this SchedulerOrderMetrics.
     * 
     * @return pickupQuantities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getPickupQuantities() {
        return pickupQuantities;
    }


    /**
     * Sets the pickupQuantities value for this SchedulerOrderMetrics.
     * 
     * @param pickupQuantities
     */
    public void setPickupQuantities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities pickupQuantities) {
        this.pickupQuantities = pickupQuantities;
    }


    /**
     * Gets the serviceTime value for this SchedulerOrderMetrics.
     * 
     * @return serviceTime
     */
    public int getServiceTime() {
        return serviceTime;
    }


    /**
     * Sets the serviceTime value for this SchedulerOrderMetrics.
     * 
     * @param serviceTime
     */
    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }


    /**
     * Gets the travelTime value for this SchedulerOrderMetrics.
     * 
     * @return travelTime
     */
    public int getTravelTime() {
        return travelTime;
    }


    /**
     * Sets the travelTime value for this SchedulerOrderMetrics.
     * 
     * @param travelTime
     */
    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchedulerOrderMetrics)) return false;
        SchedulerOrderMetrics other = (SchedulerOrderMetrics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.items == other.getItems() &&
            ((this.deliveryQuantities==null && other.getDeliveryQuantities()==null) || 
             (this.deliveryQuantities!=null &&
              this.deliveryQuantities.equals(other.getDeliveryQuantities()))) &&
            ((this.pickupQuantities==null && other.getPickupQuantities()==null) || 
             (this.pickupQuantities!=null &&
              this.pickupQuantities.equals(other.getPickupQuantities()))) &&
            this.serviceTime == other.getServiceTime() &&
            this.travelTime == other.getTravelTime();
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
        _hashCode += getItems();
        if (getDeliveryQuantities() != null) {
            _hashCode += getDeliveryQuantities().hashCode();
        }
        if (getPickupQuantities() != null) {
            _hashCode += getPickupQuantities().hashCode();
        }
        _hashCode += getServiceTime();
        _hashCode += getTravelTime();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SchedulerOrderMetrics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SchedulerOrderMetrics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "deliveryQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "pickupQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "serviceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "travelTime"));
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
