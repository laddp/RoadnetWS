/**
 * SchedulerDeliveryWindowMetricsOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SchedulerDeliveryWindowMetricsOptions  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowMetricsType type;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowBase[] deliveryWindows;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneValue timeZone;

    private int preRouteStemTimeAdjustmentSeconds;

    private int postRouteStemTimeAdjustmentSeconds;

    public SchedulerDeliveryWindowMetricsOptions() {
    }

    public SchedulerDeliveryWindowMetricsOptions(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowMetricsType type,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowBase[] deliveryWindows,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneValue timeZone,
           int preRouteStemTimeAdjustmentSeconds,
           int postRouteStemTimeAdjustmentSeconds) {
           this.type = type;
           this.deliveryWindows = deliveryWindows;
           this.timeZone = timeZone;
           this.preRouteStemTimeAdjustmentSeconds = preRouteStemTimeAdjustmentSeconds;
           this.postRouteStemTimeAdjustmentSeconds = postRouteStemTimeAdjustmentSeconds;
    }


    /**
     * Gets the type value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @return type
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowMetricsType getType() {
        return type;
    }


    /**
     * Sets the type value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @param type
     */
    public void setType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowMetricsType type) {
        this.type = type;
    }


    /**
     * Gets the deliveryWindows value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @return deliveryWindows
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowBase[] getDeliveryWindows() {
        return deliveryWindows;
    }


    /**
     * Sets the deliveryWindows value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @param deliveryWindows
     */
    public void setDeliveryWindows(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowBase[] deliveryWindows) {
        this.deliveryWindows = deliveryWindows;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowBase getDeliveryWindows(int i) {
        return this.deliveryWindows[i];
    }

    public void setDeliveryWindows(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SchedulerDeliveryWindowBase _value) {
        this.deliveryWindows[i] = _value;
    }


    /**
     * Gets the timeZone value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @return timeZone
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneValue getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @param timeZone
     */
    public void setTimeZone(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneValue timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the preRouteStemTimeAdjustmentSeconds value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @return preRouteStemTimeAdjustmentSeconds
     */
    public int getPreRouteStemTimeAdjustmentSeconds() {
        return preRouteStemTimeAdjustmentSeconds;
    }


    /**
     * Sets the preRouteStemTimeAdjustmentSeconds value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @param preRouteStemTimeAdjustmentSeconds
     */
    public void setPreRouteStemTimeAdjustmentSeconds(int preRouteStemTimeAdjustmentSeconds) {
        this.preRouteStemTimeAdjustmentSeconds = preRouteStemTimeAdjustmentSeconds;
    }


    /**
     * Gets the postRouteStemTimeAdjustmentSeconds value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @return postRouteStemTimeAdjustmentSeconds
     */
    public int getPostRouteStemTimeAdjustmentSeconds() {
        return postRouteStemTimeAdjustmentSeconds;
    }


    /**
     * Sets the postRouteStemTimeAdjustmentSeconds value for this SchedulerDeliveryWindowMetricsOptions.
     * 
     * @param postRouteStemTimeAdjustmentSeconds
     */
    public void setPostRouteStemTimeAdjustmentSeconds(int postRouteStemTimeAdjustmentSeconds) {
        this.postRouteStemTimeAdjustmentSeconds = postRouteStemTimeAdjustmentSeconds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchedulerDeliveryWindowMetricsOptions)) return false;
        SchedulerDeliveryWindowMetricsOptions other = (SchedulerDeliveryWindowMetricsOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.deliveryWindows==null && other.getDeliveryWindows()==null) || 
             (this.deliveryWindows!=null &&
              java.util.Arrays.equals(this.deliveryWindows, other.getDeliveryWindows()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            this.preRouteStemTimeAdjustmentSeconds == other.getPreRouteStemTimeAdjustmentSeconds() &&
            this.postRouteStemTimeAdjustmentSeconds == other.getPostRouteStemTimeAdjustmentSeconds();
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDeliveryWindows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryWindows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryWindows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        _hashCode += getPreRouteStemTimeAdjustmentSeconds();
        _hashCode += getPostRouteStemTimeAdjustmentSeconds();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SchedulerDeliveryWindowMetricsOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SchedulerDeliveryWindowMetricsOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SchedulerDeliveryWindowMetricsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryWindows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "deliveryWindows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SchedulerDeliveryWindowBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TimeZoneValue"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preRouteStemTimeAdjustmentSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "preRouteStemTimeAdjustmentSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postRouteStemTimeAdjustmentSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "postRouteStemTimeAdjustmentSeconds"));
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
