/**
 * TelematicsCachePositionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class TelematicsCachePositionInfo  implements java.io.Serializable {
    private int latitude;

    private int longitude;

    private java.util.Calendar positionTime;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions;

    private java.lang.String deviceID;

    private int internalRouteID;

    private int provider;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnitSpeed unitOfSpeed;

    private double speed;

    public TelematicsCachePositionInfo() {
    }

    public TelematicsCachePositionInfo(
           int latitude,
           int longitude,
           java.util.Calendar positionTime,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions,
           java.lang.String deviceID,
           int internalRouteID,
           int provider,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnitSpeed unitOfSpeed,
           double speed) {
           this.latitude = latitude;
           this.longitude = longitude;
           this.positionTime = positionTime;
           this.timeZoneOptions = timeZoneOptions;
           this.deviceID = deviceID;
           this.internalRouteID = internalRouteID;
           this.provider = provider;
           this.unitOfSpeed = unitOfSpeed;
           this.speed = speed;
    }


    /**
     * Gets the latitude value for this TelematicsCachePositionInfo.
     * 
     * @return latitude
     */
    public int getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this TelematicsCachePositionInfo.
     * 
     * @param latitude
     */
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this TelematicsCachePositionInfo.
     * 
     * @return longitude
     */
    public int getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this TelematicsCachePositionInfo.
     * 
     * @param longitude
     */
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the positionTime value for this TelematicsCachePositionInfo.
     * 
     * @return positionTime
     */
    public java.util.Calendar getPositionTime() {
        return positionTime;
    }


    /**
     * Sets the positionTime value for this TelematicsCachePositionInfo.
     * 
     * @param positionTime
     */
    public void setPositionTime(java.util.Calendar positionTime) {
        this.positionTime = positionTime;
    }


    /**
     * Gets the timeZoneOptions value for this TelematicsCachePositionInfo.
     * 
     * @return timeZoneOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions getTimeZoneOptions() {
        return timeZoneOptions;
    }


    /**
     * Sets the timeZoneOptions value for this TelematicsCachePositionInfo.
     * 
     * @param timeZoneOptions
     */
    public void setTimeZoneOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) {
        this.timeZoneOptions = timeZoneOptions;
    }


    /**
     * Gets the deviceID value for this TelematicsCachePositionInfo.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this TelematicsCachePositionInfo.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the internalRouteID value for this TelematicsCachePositionInfo.
     * 
     * @return internalRouteID
     */
    public int getInternalRouteID() {
        return internalRouteID;
    }


    /**
     * Sets the internalRouteID value for this TelematicsCachePositionInfo.
     * 
     * @param internalRouteID
     */
    public void setInternalRouteID(int internalRouteID) {
        this.internalRouteID = internalRouteID;
    }


    /**
     * Gets the provider value for this TelematicsCachePositionInfo.
     * 
     * @return provider
     */
    public int getProvider() {
        return provider;
    }


    /**
     * Sets the provider value for this TelematicsCachePositionInfo.
     * 
     * @param provider
     */
    public void setProvider(int provider) {
        this.provider = provider;
    }


    /**
     * Gets the unitOfSpeed value for this TelematicsCachePositionInfo.
     * 
     * @return unitOfSpeed
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnitSpeed getUnitOfSpeed() {
        return unitOfSpeed;
    }


    /**
     * Sets the unitOfSpeed value for this TelematicsCachePositionInfo.
     * 
     * @param unitOfSpeed
     */
    public void setUnitOfSpeed(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnitSpeed unitOfSpeed) {
        this.unitOfSpeed = unitOfSpeed;
    }


    /**
     * Gets the speed value for this TelematicsCachePositionInfo.
     * 
     * @return speed
     */
    public double getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this TelematicsCachePositionInfo.
     * 
     * @param speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelematicsCachePositionInfo)) return false;
        TelematicsCachePositionInfo other = (TelematicsCachePositionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            ((this.positionTime==null && other.getPositionTime()==null) || 
             (this.positionTime!=null &&
              this.positionTime.equals(other.getPositionTime()))) &&
            ((this.timeZoneOptions==null && other.getTimeZoneOptions()==null) || 
             (this.timeZoneOptions!=null &&
              this.timeZoneOptions.equals(other.getTimeZoneOptions()))) &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            this.internalRouteID == other.getInternalRouteID() &&
            this.provider == other.getProvider() &&
            ((this.unitOfSpeed==null && other.getUnitOfSpeed()==null) || 
             (this.unitOfSpeed!=null &&
              this.unitOfSpeed.equals(other.getUnitOfSpeed()))) &&
            this.speed == other.getSpeed();
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
        _hashCode += getLatitude();
        _hashCode += getLongitude();
        if (getPositionTime() != null) {
            _hashCode += getPositionTime().hashCode();
        }
        if (getTimeZoneOptions() != null) {
            _hashCode += getTimeZoneOptions().hashCode();
        }
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        _hashCode += getInternalRouteID();
        _hashCode += getProvider();
        if (getUnitOfSpeed() != null) {
            _hashCode += getUnitOfSpeed().hashCode();
        }
        _hashCode += new Double(getSpeed()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelematicsCachePositionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TelematicsCachePositionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "positionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeZoneOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TimeZoneOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "deviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalRouteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "internalRouteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "provider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "unitOfSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UnitSpeed"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
