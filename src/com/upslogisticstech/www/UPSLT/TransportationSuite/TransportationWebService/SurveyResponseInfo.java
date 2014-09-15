/**
 * SurveyResponseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SurveyResponseInfo  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteEventInfo  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity;

    private int internalStopId;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] responses;

    public SurveyResponseInfo() {
    }

    public SurveyResponseInfo(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteEventSource source,
           int messageId,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity,
           int internalStopId,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] responses) {
        super(
            source,
            messageId);
        this.routeIdentity = routeIdentity;
        this.internalStopId = internalStopId;
        this.performedAt = performedAt;
        this.responses = responses;
    }


    /**
     * Gets the routeIdentity value for this SurveyResponseInfo.
     * 
     * @return routeIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity getRouteIdentity() {
        return routeIdentity;
    }


    /**
     * Sets the routeIdentity value for this SurveyResponseInfo.
     * 
     * @param routeIdentity
     */
    public void setRouteIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity) {
        this.routeIdentity = routeIdentity;
    }


    /**
     * Gets the internalStopId value for this SurveyResponseInfo.
     * 
     * @return internalStopId
     */
    public int getInternalStopId() {
        return internalStopId;
    }


    /**
     * Sets the internalStopId value for this SurveyResponseInfo.
     * 
     * @param internalStopId
     */
    public void setInternalStopId(int internalStopId) {
        this.internalStopId = internalStopId;
    }


    /**
     * Gets the performedAt value for this SurveyResponseInfo.
     * 
     * @return performedAt
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt getPerformedAt() {
        return performedAt;
    }


    /**
     * Sets the performedAt value for this SurveyResponseInfo.
     * 
     * @param performedAt
     */
    public void setPerformedAt(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyPerformedAt performedAt) {
        this.performedAt = performedAt;
    }


    /**
     * Gets the responses value for this SurveyResponseInfo.
     * 
     * @return responses
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] getResponses() {
        return responses;
    }


    /**
     * Sets the responses value for this SurveyResponseInfo.
     * 
     * @param responses
     */
    public void setResponses(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult[] responses) {
        this.responses = responses;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult getResponses(int i) {
        return this.responses[i];
    }

    public void setResponses(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyResult _value) {
        this.responses[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurveyResponseInfo)) return false;
        SurveyResponseInfo other = (SurveyResponseInfo) obj;
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
            this.internalStopId == other.getInternalStopId() &&
            ((this.performedAt==null && other.getPerformedAt()==null) || 
             (this.performedAt!=null &&
              this.performedAt.equals(other.getPerformedAt()))) &&
            ((this.responses==null && other.getResponses()==null) || 
             (this.responses!=null &&
              java.util.Arrays.equals(this.responses, other.getResponses())));
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
        _hashCode += getInternalStopId();
        if (getPerformedAt() != null) {
            _hashCode += getPerformedAt().hashCode();
        }
        if (getResponses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponses(), i);
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
        new org.apache.axis.description.TypeDesc(SurveyResponseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SurveyResponseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalStopId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "internalStopId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "performedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SurveyPerformedAt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "responses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SurveyResult"));
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
