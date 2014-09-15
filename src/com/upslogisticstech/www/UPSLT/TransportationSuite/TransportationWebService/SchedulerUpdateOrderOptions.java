/**
 * SchedulerUpdateOrderOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SchedulerUpdateOrderOptions  implements java.io.Serializable {
    private java.lang.Integer newServiceTime;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities newQuantities;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities newPUQuantities;

    private java.lang.String newOrderNumber;

    private java.lang.String newReferenceNumber;

    public SchedulerUpdateOrderOptions() {
    }

    public SchedulerUpdateOrderOptions(
           java.lang.Integer newServiceTime,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities newQuantities,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities newPUQuantities,
           java.lang.String newOrderNumber,
           java.lang.String newReferenceNumber) {
           this.newServiceTime = newServiceTime;
           this.newQuantities = newQuantities;
           this.newPUQuantities = newPUQuantities;
           this.newOrderNumber = newOrderNumber;
           this.newReferenceNumber = newReferenceNumber;
    }


    /**
     * Gets the newServiceTime value for this SchedulerUpdateOrderOptions.
     * 
     * @return newServiceTime
     */
    public java.lang.Integer getNewServiceTime() {
        return newServiceTime;
    }


    /**
     * Sets the newServiceTime value for this SchedulerUpdateOrderOptions.
     * 
     * @param newServiceTime
     */
    public void setNewServiceTime(java.lang.Integer newServiceTime) {
        this.newServiceTime = newServiceTime;
    }


    /**
     * Gets the newQuantities value for this SchedulerUpdateOrderOptions.
     * 
     * @return newQuantities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getNewQuantities() {
        return newQuantities;
    }


    /**
     * Sets the newQuantities value for this SchedulerUpdateOrderOptions.
     * 
     * @param newQuantities
     */
    public void setNewQuantities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities newQuantities) {
        this.newQuantities = newQuantities;
    }


    /**
     * Gets the newPUQuantities value for this SchedulerUpdateOrderOptions.
     * 
     * @return newPUQuantities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getNewPUQuantities() {
        return newPUQuantities;
    }


    /**
     * Sets the newPUQuantities value for this SchedulerUpdateOrderOptions.
     * 
     * @param newPUQuantities
     */
    public void setNewPUQuantities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities newPUQuantities) {
        this.newPUQuantities = newPUQuantities;
    }


    /**
     * Gets the newOrderNumber value for this SchedulerUpdateOrderOptions.
     * 
     * @return newOrderNumber
     */
    public java.lang.String getNewOrderNumber() {
        return newOrderNumber;
    }


    /**
     * Sets the newOrderNumber value for this SchedulerUpdateOrderOptions.
     * 
     * @param newOrderNumber
     */
    public void setNewOrderNumber(java.lang.String newOrderNumber) {
        this.newOrderNumber = newOrderNumber;
    }


    /**
     * Gets the newReferenceNumber value for this SchedulerUpdateOrderOptions.
     * 
     * @return newReferenceNumber
     */
    public java.lang.String getNewReferenceNumber() {
        return newReferenceNumber;
    }


    /**
     * Sets the newReferenceNumber value for this SchedulerUpdateOrderOptions.
     * 
     * @param newReferenceNumber
     */
    public void setNewReferenceNumber(java.lang.String newReferenceNumber) {
        this.newReferenceNumber = newReferenceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchedulerUpdateOrderOptions)) return false;
        SchedulerUpdateOrderOptions other = (SchedulerUpdateOrderOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newServiceTime==null && other.getNewServiceTime()==null) || 
             (this.newServiceTime!=null &&
              this.newServiceTime.equals(other.getNewServiceTime()))) &&
            ((this.newQuantities==null && other.getNewQuantities()==null) || 
             (this.newQuantities!=null &&
              this.newQuantities.equals(other.getNewQuantities()))) &&
            ((this.newPUQuantities==null && other.getNewPUQuantities()==null) || 
             (this.newPUQuantities!=null &&
              this.newPUQuantities.equals(other.getNewPUQuantities()))) &&
            ((this.newOrderNumber==null && other.getNewOrderNumber()==null) || 
             (this.newOrderNumber!=null &&
              this.newOrderNumber.equals(other.getNewOrderNumber()))) &&
            ((this.newReferenceNumber==null && other.getNewReferenceNumber()==null) || 
             (this.newReferenceNumber!=null &&
              this.newReferenceNumber.equals(other.getNewReferenceNumber())));
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
        if (getNewServiceTime() != null) {
            _hashCode += getNewServiceTime().hashCode();
        }
        if (getNewQuantities() != null) {
            _hashCode += getNewQuantities().hashCode();
        }
        if (getNewPUQuantities() != null) {
            _hashCode += getNewPUQuantities().hashCode();
        }
        if (getNewOrderNumber() != null) {
            _hashCode += getNewOrderNumber().hashCode();
        }
        if (getNewReferenceNumber() != null) {
            _hashCode += getNewReferenceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SchedulerUpdateOrderOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SchedulerUpdateOrderOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newServiceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "newServiceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "newQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPUQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "newPUQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "newOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "newReferenceNumber"));
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
