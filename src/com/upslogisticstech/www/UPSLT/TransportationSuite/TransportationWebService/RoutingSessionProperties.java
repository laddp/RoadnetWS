/**
 * RoutingSessionProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class RoutingSessionProperties  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String scenario;

    private java.util.Date sessionDate;

    private boolean combineOrders;

    private boolean applyRoadRestrictions;

    private boolean hoursOfServiceAware;

    private boolean applyCommercialVehicleRestrictions;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimePeriodBasedTravelSpeedsType timePeriodTravelSpeedsType;

    public RoutingSessionProperties() {
    }

    public RoutingSessionProperties(
           java.lang.String description,
           java.lang.String scenario,
           java.util.Date sessionDate,
           boolean combineOrders,
           boolean applyRoadRestrictions,
           boolean hoursOfServiceAware,
           boolean applyCommercialVehicleRestrictions,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimePeriodBasedTravelSpeedsType timePeriodTravelSpeedsType) {
           this.description = description;
           this.scenario = scenario;
           this.sessionDate = sessionDate;
           this.combineOrders = combineOrders;
           this.applyRoadRestrictions = applyRoadRestrictions;
           this.hoursOfServiceAware = hoursOfServiceAware;
           this.applyCommercialVehicleRestrictions = applyCommercialVehicleRestrictions;
           this.timePeriodTravelSpeedsType = timePeriodTravelSpeedsType;
    }


    /**
     * Gets the description value for this RoutingSessionProperties.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RoutingSessionProperties.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the scenario value for this RoutingSessionProperties.
     * 
     * @return scenario
     */
    public java.lang.String getScenario() {
        return scenario;
    }


    /**
     * Sets the scenario value for this RoutingSessionProperties.
     * 
     * @param scenario
     */
    public void setScenario(java.lang.String scenario) {
        this.scenario = scenario;
    }


    /**
     * Gets the sessionDate value for this RoutingSessionProperties.
     * 
     * @return sessionDate
     */
    public java.util.Date getSessionDate() {
        return sessionDate;
    }


    /**
     * Sets the sessionDate value for this RoutingSessionProperties.
     * 
     * @param sessionDate
     */
    public void setSessionDate(java.util.Date sessionDate) {
        this.sessionDate = sessionDate;
    }


    /**
     * Gets the combineOrders value for this RoutingSessionProperties.
     * 
     * @return combineOrders
     */
    public boolean isCombineOrders() {
        return combineOrders;
    }


    /**
     * Sets the combineOrders value for this RoutingSessionProperties.
     * 
     * @param combineOrders
     */
    public void setCombineOrders(boolean combineOrders) {
        this.combineOrders = combineOrders;
    }


    /**
     * Gets the applyRoadRestrictions value for this RoutingSessionProperties.
     * 
     * @return applyRoadRestrictions
     */
    public boolean isApplyRoadRestrictions() {
        return applyRoadRestrictions;
    }


    /**
     * Sets the applyRoadRestrictions value for this RoutingSessionProperties.
     * 
     * @param applyRoadRestrictions
     */
    public void setApplyRoadRestrictions(boolean applyRoadRestrictions) {
        this.applyRoadRestrictions = applyRoadRestrictions;
    }


    /**
     * Gets the hoursOfServiceAware value for this RoutingSessionProperties.
     * 
     * @return hoursOfServiceAware
     */
    public boolean isHoursOfServiceAware() {
        return hoursOfServiceAware;
    }


    /**
     * Sets the hoursOfServiceAware value for this RoutingSessionProperties.
     * 
     * @param hoursOfServiceAware
     */
    public void setHoursOfServiceAware(boolean hoursOfServiceAware) {
        this.hoursOfServiceAware = hoursOfServiceAware;
    }


    /**
     * Gets the applyCommercialVehicleRestrictions value for this RoutingSessionProperties.
     * 
     * @return applyCommercialVehicleRestrictions
     */
    public boolean isApplyCommercialVehicleRestrictions() {
        return applyCommercialVehicleRestrictions;
    }


    /**
     * Sets the applyCommercialVehicleRestrictions value for this RoutingSessionProperties.
     * 
     * @param applyCommercialVehicleRestrictions
     */
    public void setApplyCommercialVehicleRestrictions(boolean applyCommercialVehicleRestrictions) {
        this.applyCommercialVehicleRestrictions = applyCommercialVehicleRestrictions;
    }


    /**
     * Gets the timePeriodTravelSpeedsType value for this RoutingSessionProperties.
     * 
     * @return timePeriodTravelSpeedsType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimePeriodBasedTravelSpeedsType getTimePeriodTravelSpeedsType() {
        return timePeriodTravelSpeedsType;
    }


    /**
     * Sets the timePeriodTravelSpeedsType value for this RoutingSessionProperties.
     * 
     * @param timePeriodTravelSpeedsType
     */
    public void setTimePeriodTravelSpeedsType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimePeriodBasedTravelSpeedsType timePeriodTravelSpeedsType) {
        this.timePeriodTravelSpeedsType = timePeriodTravelSpeedsType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingSessionProperties)) return false;
        RoutingSessionProperties other = (RoutingSessionProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.scenario==null && other.getScenario()==null) || 
             (this.scenario!=null &&
              this.scenario.equals(other.getScenario()))) &&
            ((this.sessionDate==null && other.getSessionDate()==null) || 
             (this.sessionDate!=null &&
              this.sessionDate.equals(other.getSessionDate()))) &&
            this.combineOrders == other.isCombineOrders() &&
            this.applyRoadRestrictions == other.isApplyRoadRestrictions() &&
            this.hoursOfServiceAware == other.isHoursOfServiceAware() &&
            this.applyCommercialVehicleRestrictions == other.isApplyCommercialVehicleRestrictions() &&
            ((this.timePeriodTravelSpeedsType==null && other.getTimePeriodTravelSpeedsType()==null) || 
             (this.timePeriodTravelSpeedsType!=null &&
              this.timePeriodTravelSpeedsType.equals(other.getTimePeriodTravelSpeedsType())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getScenario() != null) {
            _hashCode += getScenario().hashCode();
        }
        if (getSessionDate() != null) {
            _hashCode += getSessionDate().hashCode();
        }
        _hashCode += (isCombineOrders() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApplyRoadRestrictions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHoursOfServiceAware() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApplyCommercialVehicleRestrictions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimePeriodTravelSpeedsType() != null) {
            _hashCode += getTimePeriodTravelSpeedsType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingSessionProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RoutingSessionProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "scenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "sessionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combineOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "combineOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyRoadRestrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "applyRoadRestrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursOfServiceAware");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "hoursOfServiceAware"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyCommercialVehicleRestrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "applyCommercialVehicleRestrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriodTravelSpeedsType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timePeriodTravelSpeedsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TimePeriodBasedTravelSpeedsType"));
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
