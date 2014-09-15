/**
 * ServiceTimeOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class ServiceTimeOverride  implements java.io.Serializable {
    private java.lang.String scenario;

    private java.lang.String deliveryDays;

    private org.apache.axis.types.Time fixedNonHelperTime;

    private org.apache.axis.types.Time fixedHelperTime;

    private org.apache.axis.types.Time variableNonHelperTime;

    private org.apache.axis.types.Time variableHelperTime;

    private org.apache.axis.types.Time bulkFixedNonHelperTime;

    private org.apache.axis.types.Time bulkFixedHelperTime;

    private org.apache.axis.types.Time bulkVariableNonHelperTime;

    private org.apache.axis.types.Time bulkVariableHelperTime;

    public ServiceTimeOverride() {
    }

    public ServiceTimeOverride(
           java.lang.String scenario,
           java.lang.String deliveryDays,
           org.apache.axis.types.Time fixedNonHelperTime,
           org.apache.axis.types.Time fixedHelperTime,
           org.apache.axis.types.Time variableNonHelperTime,
           org.apache.axis.types.Time variableHelperTime,
           org.apache.axis.types.Time bulkFixedNonHelperTime,
           org.apache.axis.types.Time bulkFixedHelperTime,
           org.apache.axis.types.Time bulkVariableNonHelperTime,
           org.apache.axis.types.Time bulkVariableHelperTime) {
           this.scenario = scenario;
           this.deliveryDays = deliveryDays;
           this.fixedNonHelperTime = fixedNonHelperTime;
           this.fixedHelperTime = fixedHelperTime;
           this.variableNonHelperTime = variableNonHelperTime;
           this.variableHelperTime = variableHelperTime;
           this.bulkFixedNonHelperTime = bulkFixedNonHelperTime;
           this.bulkFixedHelperTime = bulkFixedHelperTime;
           this.bulkVariableNonHelperTime = bulkVariableNonHelperTime;
           this.bulkVariableHelperTime = bulkVariableHelperTime;
    }


    /**
     * Gets the scenario value for this ServiceTimeOverride.
     * 
     * @return scenario
     */
    public java.lang.String getScenario() {
        return scenario;
    }


    /**
     * Sets the scenario value for this ServiceTimeOverride.
     * 
     * @param scenario
     */
    public void setScenario(java.lang.String scenario) {
        this.scenario = scenario;
    }


    /**
     * Gets the deliveryDays value for this ServiceTimeOverride.
     * 
     * @return deliveryDays
     */
    public java.lang.String getDeliveryDays() {
        return deliveryDays;
    }


    /**
     * Sets the deliveryDays value for this ServiceTimeOverride.
     * 
     * @param deliveryDays
     */
    public void setDeliveryDays(java.lang.String deliveryDays) {
        this.deliveryDays = deliveryDays;
    }


    /**
     * Gets the fixedNonHelperTime value for this ServiceTimeOverride.
     * 
     * @return fixedNonHelperTime
     */
    public org.apache.axis.types.Time getFixedNonHelperTime() {
        return fixedNonHelperTime;
    }


    /**
     * Sets the fixedNonHelperTime value for this ServiceTimeOverride.
     * 
     * @param fixedNonHelperTime
     */
    public void setFixedNonHelperTime(org.apache.axis.types.Time fixedNonHelperTime) {
        this.fixedNonHelperTime = fixedNonHelperTime;
    }


    /**
     * Gets the fixedHelperTime value for this ServiceTimeOverride.
     * 
     * @return fixedHelperTime
     */
    public org.apache.axis.types.Time getFixedHelperTime() {
        return fixedHelperTime;
    }


    /**
     * Sets the fixedHelperTime value for this ServiceTimeOverride.
     * 
     * @param fixedHelperTime
     */
    public void setFixedHelperTime(org.apache.axis.types.Time fixedHelperTime) {
        this.fixedHelperTime = fixedHelperTime;
    }


    /**
     * Gets the variableNonHelperTime value for this ServiceTimeOverride.
     * 
     * @return variableNonHelperTime
     */
    public org.apache.axis.types.Time getVariableNonHelperTime() {
        return variableNonHelperTime;
    }


    /**
     * Sets the variableNonHelperTime value for this ServiceTimeOverride.
     * 
     * @param variableNonHelperTime
     */
    public void setVariableNonHelperTime(org.apache.axis.types.Time variableNonHelperTime) {
        this.variableNonHelperTime = variableNonHelperTime;
    }


    /**
     * Gets the variableHelperTime value for this ServiceTimeOverride.
     * 
     * @return variableHelperTime
     */
    public org.apache.axis.types.Time getVariableHelperTime() {
        return variableHelperTime;
    }


    /**
     * Sets the variableHelperTime value for this ServiceTimeOverride.
     * 
     * @param variableHelperTime
     */
    public void setVariableHelperTime(org.apache.axis.types.Time variableHelperTime) {
        this.variableHelperTime = variableHelperTime;
    }


    /**
     * Gets the bulkFixedNonHelperTime value for this ServiceTimeOverride.
     * 
     * @return bulkFixedNonHelperTime
     */
    public org.apache.axis.types.Time getBulkFixedNonHelperTime() {
        return bulkFixedNonHelperTime;
    }


    /**
     * Sets the bulkFixedNonHelperTime value for this ServiceTimeOverride.
     * 
     * @param bulkFixedNonHelperTime
     */
    public void setBulkFixedNonHelperTime(org.apache.axis.types.Time bulkFixedNonHelperTime) {
        this.bulkFixedNonHelperTime = bulkFixedNonHelperTime;
    }


    /**
     * Gets the bulkFixedHelperTime value for this ServiceTimeOverride.
     * 
     * @return bulkFixedHelperTime
     */
    public org.apache.axis.types.Time getBulkFixedHelperTime() {
        return bulkFixedHelperTime;
    }


    /**
     * Sets the bulkFixedHelperTime value for this ServiceTimeOverride.
     * 
     * @param bulkFixedHelperTime
     */
    public void setBulkFixedHelperTime(org.apache.axis.types.Time bulkFixedHelperTime) {
        this.bulkFixedHelperTime = bulkFixedHelperTime;
    }


    /**
     * Gets the bulkVariableNonHelperTime value for this ServiceTimeOverride.
     * 
     * @return bulkVariableNonHelperTime
     */
    public org.apache.axis.types.Time getBulkVariableNonHelperTime() {
        return bulkVariableNonHelperTime;
    }


    /**
     * Sets the bulkVariableNonHelperTime value for this ServiceTimeOverride.
     * 
     * @param bulkVariableNonHelperTime
     */
    public void setBulkVariableNonHelperTime(org.apache.axis.types.Time bulkVariableNonHelperTime) {
        this.bulkVariableNonHelperTime = bulkVariableNonHelperTime;
    }


    /**
     * Gets the bulkVariableHelperTime value for this ServiceTimeOverride.
     * 
     * @return bulkVariableHelperTime
     */
    public org.apache.axis.types.Time getBulkVariableHelperTime() {
        return bulkVariableHelperTime;
    }


    /**
     * Sets the bulkVariableHelperTime value for this ServiceTimeOverride.
     * 
     * @param bulkVariableHelperTime
     */
    public void setBulkVariableHelperTime(org.apache.axis.types.Time bulkVariableHelperTime) {
        this.bulkVariableHelperTime = bulkVariableHelperTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceTimeOverride)) return false;
        ServiceTimeOverride other = (ServiceTimeOverride) obj;
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
            ((this.fixedNonHelperTime==null && other.getFixedNonHelperTime()==null) || 
             (this.fixedNonHelperTime!=null &&
              this.fixedNonHelperTime.equals(other.getFixedNonHelperTime()))) &&
            ((this.fixedHelperTime==null && other.getFixedHelperTime()==null) || 
             (this.fixedHelperTime!=null &&
              this.fixedHelperTime.equals(other.getFixedHelperTime()))) &&
            ((this.variableNonHelperTime==null && other.getVariableNonHelperTime()==null) || 
             (this.variableNonHelperTime!=null &&
              this.variableNonHelperTime.equals(other.getVariableNonHelperTime()))) &&
            ((this.variableHelperTime==null && other.getVariableHelperTime()==null) || 
             (this.variableHelperTime!=null &&
              this.variableHelperTime.equals(other.getVariableHelperTime()))) &&
            ((this.bulkFixedNonHelperTime==null && other.getBulkFixedNonHelperTime()==null) || 
             (this.bulkFixedNonHelperTime!=null &&
              this.bulkFixedNonHelperTime.equals(other.getBulkFixedNonHelperTime()))) &&
            ((this.bulkFixedHelperTime==null && other.getBulkFixedHelperTime()==null) || 
             (this.bulkFixedHelperTime!=null &&
              this.bulkFixedHelperTime.equals(other.getBulkFixedHelperTime()))) &&
            ((this.bulkVariableNonHelperTime==null && other.getBulkVariableNonHelperTime()==null) || 
             (this.bulkVariableNonHelperTime!=null &&
              this.bulkVariableNonHelperTime.equals(other.getBulkVariableNonHelperTime()))) &&
            ((this.bulkVariableHelperTime==null && other.getBulkVariableHelperTime()==null) || 
             (this.bulkVariableHelperTime!=null &&
              this.bulkVariableHelperTime.equals(other.getBulkVariableHelperTime())));
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
        if (getFixedNonHelperTime() != null) {
            _hashCode += getFixedNonHelperTime().hashCode();
        }
        if (getFixedHelperTime() != null) {
            _hashCode += getFixedHelperTime().hashCode();
        }
        if (getVariableNonHelperTime() != null) {
            _hashCode += getVariableNonHelperTime().hashCode();
        }
        if (getVariableHelperTime() != null) {
            _hashCode += getVariableHelperTime().hashCode();
        }
        if (getBulkFixedNonHelperTime() != null) {
            _hashCode += getBulkFixedNonHelperTime().hashCode();
        }
        if (getBulkFixedHelperTime() != null) {
            _hashCode += getBulkFixedHelperTime().hashCode();
        }
        if (getBulkVariableNonHelperTime() != null) {
            _hashCode += getBulkVariableNonHelperTime().hashCode();
        }
        if (getBulkVariableHelperTime() != null) {
            _hashCode += getBulkVariableHelperTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceTimeOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ServiceTimeOverride"));
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
        elemField.setFieldName("fixedNonHelperTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "fixedNonHelperTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedHelperTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "fixedHelperTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableNonHelperTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "variableNonHelperTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHelperTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "variableHelperTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkFixedNonHelperTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "bulkFixedNonHelperTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkFixedHelperTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "bulkFixedHelperTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkVariableNonHelperTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "bulkVariableNonHelperTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkVariableHelperTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "bulkVariableHelperTime"));
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
