/**
 * TelematicsCachePositionCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class TelematicsCachePositionCriteria  implements java.io.Serializable {
    private java.lang.String deviceID;

    private java.lang.Integer internalRouteID;

    private java.lang.Integer providerType;

    private java.util.Calendar startPositionTime;

    private java.util.Calendar endPositionTime;

    public TelematicsCachePositionCriteria() {
    }

    public TelematicsCachePositionCriteria(
           java.lang.String deviceID,
           java.lang.Integer internalRouteID,
           java.lang.Integer providerType,
           java.util.Calendar startPositionTime,
           java.util.Calendar endPositionTime) {
           this.deviceID = deviceID;
           this.internalRouteID = internalRouteID;
           this.providerType = providerType;
           this.startPositionTime = startPositionTime;
           this.endPositionTime = endPositionTime;
    }


    /**
     * Gets the deviceID value for this TelematicsCachePositionCriteria.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this TelematicsCachePositionCriteria.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the internalRouteID value for this TelematicsCachePositionCriteria.
     * 
     * @return internalRouteID
     */
    public java.lang.Integer getInternalRouteID() {
        return internalRouteID;
    }


    /**
     * Sets the internalRouteID value for this TelematicsCachePositionCriteria.
     * 
     * @param internalRouteID
     */
    public void setInternalRouteID(java.lang.Integer internalRouteID) {
        this.internalRouteID = internalRouteID;
    }


    /**
     * Gets the providerType value for this TelematicsCachePositionCriteria.
     * 
     * @return providerType
     */
    public java.lang.Integer getProviderType() {
        return providerType;
    }


    /**
     * Sets the providerType value for this TelematicsCachePositionCriteria.
     * 
     * @param providerType
     */
    public void setProviderType(java.lang.Integer providerType) {
        this.providerType = providerType;
    }


    /**
     * Gets the startPositionTime value for this TelematicsCachePositionCriteria.
     * 
     * @return startPositionTime
     */
    public java.util.Calendar getStartPositionTime() {
        return startPositionTime;
    }


    /**
     * Sets the startPositionTime value for this TelematicsCachePositionCriteria.
     * 
     * @param startPositionTime
     */
    public void setStartPositionTime(java.util.Calendar startPositionTime) {
        this.startPositionTime = startPositionTime;
    }


    /**
     * Gets the endPositionTime value for this TelematicsCachePositionCriteria.
     * 
     * @return endPositionTime
     */
    public java.util.Calendar getEndPositionTime() {
        return endPositionTime;
    }


    /**
     * Sets the endPositionTime value for this TelematicsCachePositionCriteria.
     * 
     * @param endPositionTime
     */
    public void setEndPositionTime(java.util.Calendar endPositionTime) {
        this.endPositionTime = endPositionTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelematicsCachePositionCriteria)) return false;
        TelematicsCachePositionCriteria other = (TelematicsCachePositionCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.internalRouteID==null && other.getInternalRouteID()==null) || 
             (this.internalRouteID!=null &&
              this.internalRouteID.equals(other.getInternalRouteID()))) &&
            ((this.providerType==null && other.getProviderType()==null) || 
             (this.providerType!=null &&
              this.providerType.equals(other.getProviderType()))) &&
            ((this.startPositionTime==null && other.getStartPositionTime()==null) || 
             (this.startPositionTime!=null &&
              this.startPositionTime.equals(other.getStartPositionTime()))) &&
            ((this.endPositionTime==null && other.getEndPositionTime()==null) || 
             (this.endPositionTime!=null &&
              this.endPositionTime.equals(other.getEndPositionTime())));
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
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getInternalRouteID() != null) {
            _hashCode += getInternalRouteID().hashCode();
        }
        if (getProviderType() != null) {
            _hashCode += getProviderType().hashCode();
        }
        if (getStartPositionTime() != null) {
            _hashCode += getStartPositionTime().hashCode();
        }
        if (getEndPositionTime() != null) {
            _hashCode += getEndPositionTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelematicsCachePositionCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TelematicsCachePositionCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "deviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalRouteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "internalRouteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "providerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startPositionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "startPositionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPositionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "endPositionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
