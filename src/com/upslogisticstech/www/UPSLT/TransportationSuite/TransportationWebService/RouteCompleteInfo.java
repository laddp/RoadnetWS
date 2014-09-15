/**
 * RouteCompleteInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class RouteCompleteInfo  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteEventInfo  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity;

    private java.util.Calendar actualComplete;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType timeDataQuality;

    private java.lang.Boolean isPartialDistance;

    private double actualDistance;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType distanceDataQuality;

    private java.lang.String postDelayType;

    private int postDelayMinutes;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions;

    public RouteCompleteInfo() {
    }

    public RouteCompleteInfo(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteEventSource source,
           int messageId,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity,
           java.util.Calendar actualComplete,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType timeDataQuality,
           java.lang.Boolean isPartialDistance,
           double actualDistance,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType distanceDataQuality,
           java.lang.String postDelayType,
           int postDelayMinutes,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) {
        super(
            source,
            messageId);
        this.routeIdentity = routeIdentity;
        this.actualComplete = actualComplete;
        this.timeDataQuality = timeDataQuality;
        this.isPartialDistance = isPartialDistance;
        this.actualDistance = actualDistance;
        this.distanceDataQuality = distanceDataQuality;
        this.postDelayType = postDelayType;
        this.postDelayMinutes = postDelayMinutes;
        this.timeZoneOptions = timeZoneOptions;
    }


    /**
     * Gets the routeIdentity value for this RouteCompleteInfo.
     * 
     * @return routeIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity getRouteIdentity() {
        return routeIdentity;
    }


    /**
     * Sets the routeIdentity value for this RouteCompleteInfo.
     * 
     * @param routeIdentity
     */
    public void setRouteIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity) {
        this.routeIdentity = routeIdentity;
    }


    /**
     * Gets the actualComplete value for this RouteCompleteInfo.
     * 
     * @return actualComplete
     */
    public java.util.Calendar getActualComplete() {
        return actualComplete;
    }


    /**
     * Sets the actualComplete value for this RouteCompleteInfo.
     * 
     * @param actualComplete
     */
    public void setActualComplete(java.util.Calendar actualComplete) {
        this.actualComplete = actualComplete;
    }


    /**
     * Gets the timeDataQuality value for this RouteCompleteInfo.
     * 
     * @return timeDataQuality
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType getTimeDataQuality() {
        return timeDataQuality;
    }


    /**
     * Sets the timeDataQuality value for this RouteCompleteInfo.
     * 
     * @param timeDataQuality
     */
    public void setTimeDataQuality(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType timeDataQuality) {
        this.timeDataQuality = timeDataQuality;
    }


    /**
     * Gets the isPartialDistance value for this RouteCompleteInfo.
     * 
     * @return isPartialDistance
     */
    public java.lang.Boolean getIsPartialDistance() {
        return isPartialDistance;
    }


    /**
     * Sets the isPartialDistance value for this RouteCompleteInfo.
     * 
     * @param isPartialDistance
     */
    public void setIsPartialDistance(java.lang.Boolean isPartialDistance) {
        this.isPartialDistance = isPartialDistance;
    }


    /**
     * Gets the actualDistance value for this RouteCompleteInfo.
     * 
     * @return actualDistance
     */
    public double getActualDistance() {
        return actualDistance;
    }


    /**
     * Sets the actualDistance value for this RouteCompleteInfo.
     * 
     * @param actualDistance
     */
    public void setActualDistance(double actualDistance) {
        this.actualDistance = actualDistance;
    }


    /**
     * Gets the distanceDataQuality value for this RouteCompleteInfo.
     * 
     * @return distanceDataQuality
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType getDistanceDataQuality() {
        return distanceDataQuality;
    }


    /**
     * Sets the distanceDataQuality value for this RouteCompleteInfo.
     * 
     * @param distanceDataQuality
     */
    public void setDistanceDataQuality(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataQualityType distanceDataQuality) {
        this.distanceDataQuality = distanceDataQuality;
    }


    /**
     * Gets the postDelayType value for this RouteCompleteInfo.
     * 
     * @return postDelayType
     */
    public java.lang.String getPostDelayType() {
        return postDelayType;
    }


    /**
     * Sets the postDelayType value for this RouteCompleteInfo.
     * 
     * @param postDelayType
     */
    public void setPostDelayType(java.lang.String postDelayType) {
        this.postDelayType = postDelayType;
    }


    /**
     * Gets the postDelayMinutes value for this RouteCompleteInfo.
     * 
     * @return postDelayMinutes
     */
    public int getPostDelayMinutes() {
        return postDelayMinutes;
    }


    /**
     * Sets the postDelayMinutes value for this RouteCompleteInfo.
     * 
     * @param postDelayMinutes
     */
    public void setPostDelayMinutes(int postDelayMinutes) {
        this.postDelayMinutes = postDelayMinutes;
    }


    /**
     * Gets the timeZoneOptions value for this RouteCompleteInfo.
     * 
     * @return timeZoneOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions getTimeZoneOptions() {
        return timeZoneOptions;
    }


    /**
     * Sets the timeZoneOptions value for this RouteCompleteInfo.
     * 
     * @param timeZoneOptions
     */
    public void setTimeZoneOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) {
        this.timeZoneOptions = timeZoneOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteCompleteInfo)) return false;
        RouteCompleteInfo other = (RouteCompleteInfo) obj;
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
            ((this.actualComplete==null && other.getActualComplete()==null) || 
             (this.actualComplete!=null &&
              this.actualComplete.equals(other.getActualComplete()))) &&
            ((this.timeDataQuality==null && other.getTimeDataQuality()==null) || 
             (this.timeDataQuality!=null &&
              this.timeDataQuality.equals(other.getTimeDataQuality()))) &&
            ((this.isPartialDistance==null && other.getIsPartialDistance()==null) || 
             (this.isPartialDistance!=null &&
              this.isPartialDistance.equals(other.getIsPartialDistance()))) &&
            this.actualDistance == other.getActualDistance() &&
            ((this.distanceDataQuality==null && other.getDistanceDataQuality()==null) || 
             (this.distanceDataQuality!=null &&
              this.distanceDataQuality.equals(other.getDistanceDataQuality()))) &&
            ((this.postDelayType==null && other.getPostDelayType()==null) || 
             (this.postDelayType!=null &&
              this.postDelayType.equals(other.getPostDelayType()))) &&
            this.postDelayMinutes == other.getPostDelayMinutes() &&
            ((this.timeZoneOptions==null && other.getTimeZoneOptions()==null) || 
             (this.timeZoneOptions!=null &&
              this.timeZoneOptions.equals(other.getTimeZoneOptions())));
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
        if (getActualComplete() != null) {
            _hashCode += getActualComplete().hashCode();
        }
        if (getTimeDataQuality() != null) {
            _hashCode += getTimeDataQuality().hashCode();
        }
        if (getIsPartialDistance() != null) {
            _hashCode += getIsPartialDistance().hashCode();
        }
        _hashCode += new Double(getActualDistance()).hashCode();
        if (getDistanceDataQuality() != null) {
            _hashCode += getDistanceDataQuality().hashCode();
        }
        if (getPostDelayType() != null) {
            _hashCode += getPostDelayType().hashCode();
        }
        _hashCode += getPostDelayMinutes();
        if (getTimeZoneOptions() != null) {
            _hashCode += getTimeZoneOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteCompleteInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteCompleteInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDataQuality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeDataQuality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DataQualityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPartialDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "isPartialDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanceDataQuality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "distanceDataQuality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DataQualityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postDelayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "postDelayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postDelayMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "postDelayMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeZoneOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TimeZoneOptions"));
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
