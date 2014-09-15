/**
 * TimeWindowOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class TimeWindowOverride  implements java.io.Serializable {
    private java.lang.String scenario;

    private java.lang.String deliveryDays;

    private org.apache.axis.types.Time openTime;

    private org.apache.axis.types.Time closeTime;

    private org.apache.axis.types.Time timeWindow1StartTime;

    private org.apache.axis.types.Time timeWindow1StopTime;

    private org.apache.axis.types.Time timeWindow2StartTime;

    private org.apache.axis.types.Time timeWindow2StopTime;

    public TimeWindowOverride() {
    }

    public TimeWindowOverride(
           java.lang.String scenario,
           java.lang.String deliveryDays,
           org.apache.axis.types.Time openTime,
           org.apache.axis.types.Time closeTime,
           org.apache.axis.types.Time timeWindow1StartTime,
           org.apache.axis.types.Time timeWindow1StopTime,
           org.apache.axis.types.Time timeWindow2StartTime,
           org.apache.axis.types.Time timeWindow2StopTime) {
           this.scenario = scenario;
           this.deliveryDays = deliveryDays;
           this.openTime = openTime;
           this.closeTime = closeTime;
           this.timeWindow1StartTime = timeWindow1StartTime;
           this.timeWindow1StopTime = timeWindow1StopTime;
           this.timeWindow2StartTime = timeWindow2StartTime;
           this.timeWindow2StopTime = timeWindow2StopTime;
    }


    /**
     * Gets the scenario value for this TimeWindowOverride.
     * 
     * @return scenario
     */
    public java.lang.String getScenario() {
        return scenario;
    }


    /**
     * Sets the scenario value for this TimeWindowOverride.
     * 
     * @param scenario
     */
    public void setScenario(java.lang.String scenario) {
        this.scenario = scenario;
    }


    /**
     * Gets the deliveryDays value for this TimeWindowOverride.
     * 
     * @return deliveryDays
     */
    public java.lang.String getDeliveryDays() {
        return deliveryDays;
    }


    /**
     * Sets the deliveryDays value for this TimeWindowOverride.
     * 
     * @param deliveryDays
     */
    public void setDeliveryDays(java.lang.String deliveryDays) {
        this.deliveryDays = deliveryDays;
    }


    /**
     * Gets the openTime value for this TimeWindowOverride.
     * 
     * @return openTime
     */
    public org.apache.axis.types.Time getOpenTime() {
        return openTime;
    }


    /**
     * Sets the openTime value for this TimeWindowOverride.
     * 
     * @param openTime
     */
    public void setOpenTime(org.apache.axis.types.Time openTime) {
        this.openTime = openTime;
    }


    /**
     * Gets the closeTime value for this TimeWindowOverride.
     * 
     * @return closeTime
     */
    public org.apache.axis.types.Time getCloseTime() {
        return closeTime;
    }


    /**
     * Sets the closeTime value for this TimeWindowOverride.
     * 
     * @param closeTime
     */
    public void setCloseTime(org.apache.axis.types.Time closeTime) {
        this.closeTime = closeTime;
    }


    /**
     * Gets the timeWindow1StartTime value for this TimeWindowOverride.
     * 
     * @return timeWindow1StartTime
     */
    public org.apache.axis.types.Time getTimeWindow1StartTime() {
        return timeWindow1StartTime;
    }


    /**
     * Sets the timeWindow1StartTime value for this TimeWindowOverride.
     * 
     * @param timeWindow1StartTime
     */
    public void setTimeWindow1StartTime(org.apache.axis.types.Time timeWindow1StartTime) {
        this.timeWindow1StartTime = timeWindow1StartTime;
    }


    /**
     * Gets the timeWindow1StopTime value for this TimeWindowOverride.
     * 
     * @return timeWindow1StopTime
     */
    public org.apache.axis.types.Time getTimeWindow1StopTime() {
        return timeWindow1StopTime;
    }


    /**
     * Sets the timeWindow1StopTime value for this TimeWindowOverride.
     * 
     * @param timeWindow1StopTime
     */
    public void setTimeWindow1StopTime(org.apache.axis.types.Time timeWindow1StopTime) {
        this.timeWindow1StopTime = timeWindow1StopTime;
    }


    /**
     * Gets the timeWindow2StartTime value for this TimeWindowOverride.
     * 
     * @return timeWindow2StartTime
     */
    public org.apache.axis.types.Time getTimeWindow2StartTime() {
        return timeWindow2StartTime;
    }


    /**
     * Sets the timeWindow2StartTime value for this TimeWindowOverride.
     * 
     * @param timeWindow2StartTime
     */
    public void setTimeWindow2StartTime(org.apache.axis.types.Time timeWindow2StartTime) {
        this.timeWindow2StartTime = timeWindow2StartTime;
    }


    /**
     * Gets the timeWindow2StopTime value for this TimeWindowOverride.
     * 
     * @return timeWindow2StopTime
     */
    public org.apache.axis.types.Time getTimeWindow2StopTime() {
        return timeWindow2StopTime;
    }


    /**
     * Sets the timeWindow2StopTime value for this TimeWindowOverride.
     * 
     * @param timeWindow2StopTime
     */
    public void setTimeWindow2StopTime(org.apache.axis.types.Time timeWindow2StopTime) {
        this.timeWindow2StopTime = timeWindow2StopTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeWindowOverride)) return false;
        TimeWindowOverride other = (TimeWindowOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scenario==null && other.getScenario()==null) || 
             (this.scenario!=null &&
              this.scenario.equals(other.getScenario()))) &&
            ((this.deliveryDays==null && other.getDeliveryDays()==null) || 
             (this.deliveryDays!=null &&
              this.deliveryDays.equals(other.getDeliveryDays()))) &&
            ((this.openTime==null && other.getOpenTime()==null) || 
             (this.openTime!=null &&
              this.openTime.equals(other.getOpenTime()))) &&
            ((this.closeTime==null && other.getCloseTime()==null) || 
             (this.closeTime!=null &&
              this.closeTime.equals(other.getCloseTime()))) &&
            ((this.timeWindow1StartTime==null && other.getTimeWindow1StartTime()==null) || 
             (this.timeWindow1StartTime!=null &&
              this.timeWindow1StartTime.equals(other.getTimeWindow1StartTime()))) &&
            ((this.timeWindow1StopTime==null && other.getTimeWindow1StopTime()==null) || 
             (this.timeWindow1StopTime!=null &&
              this.timeWindow1StopTime.equals(other.getTimeWindow1StopTime()))) &&
            ((this.timeWindow2StartTime==null && other.getTimeWindow2StartTime()==null) || 
             (this.timeWindow2StartTime!=null &&
              this.timeWindow2StartTime.equals(other.getTimeWindow2StartTime()))) &&
            ((this.timeWindow2StopTime==null && other.getTimeWindow2StopTime()==null) || 
             (this.timeWindow2StopTime!=null &&
              this.timeWindow2StopTime.equals(other.getTimeWindow2StopTime())));
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
        if (getScenario() != null) {
            _hashCode += getScenario().hashCode();
        }
        if (getDeliveryDays() != null) {
            _hashCode += getDeliveryDays().hashCode();
        }
        if (getOpenTime() != null) {
            _hashCode += getOpenTime().hashCode();
        }
        if (getCloseTime() != null) {
            _hashCode += getCloseTime().hashCode();
        }
        if (getTimeWindow1StartTime() != null) {
            _hashCode += getTimeWindow1StartTime().hashCode();
        }
        if (getTimeWindow1StopTime() != null) {
            _hashCode += getTimeWindow1StopTime().hashCode();
        }
        if (getTimeWindow2StartTime() != null) {
            _hashCode += getTimeWindow2StartTime().hashCode();
        }
        if (getTimeWindow2StopTime() != null) {
            _hashCode += getTimeWindow2StopTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeWindowOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TimeWindowOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "scenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "deliveryDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "openTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "closeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeWindow1StartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeWindow1StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeWindow1StopTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeWindow1StopTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeWindow2StartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeWindow2StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeWindow2StopTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeWindow2StopTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
