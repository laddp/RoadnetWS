/**
 * UserDefinedRouteDataCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class UserDefinedRouteDataCriteria  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataCriteria  implements java.io.Serializable {
    private java.lang.String regionId;

    private java.lang.String routeId;

    private java.util.Date routeDateStart;

    private java.util.Date routeDateEnd;

    public UserDefinedRouteDataCriteria() {
    }

    public UserDefinedRouteDataCriteria(
           java.lang.String userDefinedId,
           java.lang.String regionId,
           java.lang.String routeId,
           java.util.Date routeDateStart,
           java.util.Date routeDateEnd) {
        super(
            userDefinedId);
        this.regionId = regionId;
        this.routeId = routeId;
        this.routeDateStart = routeDateStart;
        this.routeDateEnd = routeDateEnd;
    }


    /**
     * Gets the regionId value for this UserDefinedRouteDataCriteria.
     * 
     * @return regionId
     */
    public java.lang.String getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this UserDefinedRouteDataCriteria.
     * 
     * @param regionId
     */
    public void setRegionId(java.lang.String regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the routeId value for this UserDefinedRouteDataCriteria.
     * 
     * @return routeId
     */
    public java.lang.String getRouteId() {
        return routeId;
    }


    /**
     * Sets the routeId value for this UserDefinedRouteDataCriteria.
     * 
     * @param routeId
     */
    public void setRouteId(java.lang.String routeId) {
        this.routeId = routeId;
    }


    /**
     * Gets the routeDateStart value for this UserDefinedRouteDataCriteria.
     * 
     * @return routeDateStart
     */
    public java.util.Date getRouteDateStart() {
        return routeDateStart;
    }


    /**
     * Sets the routeDateStart value for this UserDefinedRouteDataCriteria.
     * 
     * @param routeDateStart
     */
    public void setRouteDateStart(java.util.Date routeDateStart) {
        this.routeDateStart = routeDateStart;
    }


    /**
     * Gets the routeDateEnd value for this UserDefinedRouteDataCriteria.
     * 
     * @return routeDateEnd
     */
    public java.util.Date getRouteDateEnd() {
        return routeDateEnd;
    }


    /**
     * Sets the routeDateEnd value for this UserDefinedRouteDataCriteria.
     * 
     * @param routeDateEnd
     */
    public void setRouteDateEnd(java.util.Date routeDateEnd) {
        this.routeDateEnd = routeDateEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedRouteDataCriteria)) return false;
        UserDefinedRouteDataCriteria other = (UserDefinedRouteDataCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.regionId==null && other.getRegionId()==null) || 
             (this.regionId!=null &&
              this.regionId.equals(other.getRegionId()))) &&
            ((this.routeId==null && other.getRouteId()==null) || 
             (this.routeId!=null &&
              this.routeId.equals(other.getRouteId()))) &&
            ((this.routeDateStart==null && other.getRouteDateStart()==null) || 
             (this.routeDateStart!=null &&
              this.routeDateStart.equals(other.getRouteDateStart()))) &&
            ((this.routeDateEnd==null && other.getRouteDateEnd()==null) || 
             (this.routeDateEnd!=null &&
              this.routeDateEnd.equals(other.getRouteDateEnd())));
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
        if (getRegionId() != null) {
            _hashCode += getRegionId().hashCode();
        }
        if (getRouteId() != null) {
            _hashCode += getRouteId().hashCode();
        }
        if (getRouteDateStart() != null) {
            _hashCode += getRouteDateStart().hashCode();
        }
        if (getRouteDateEnd() != null) {
            _hashCode += getRouteDateEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedRouteDataCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedRouteDataCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "regionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeDateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeDateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeDateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeDateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
