/**
 * SurveyDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SurveyDetails  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyIdentity identity;

    private java.lang.String code;

    private java.lang.String description;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition[] questions;

    public SurveyDetails() {
    }

    public SurveyDetails(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyIdentity identity,
           java.lang.String code,
           java.lang.String description,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition[] questions) {
           this.identity = identity;
           this.code = code;
           this.description = description;
           this.questions = questions;
    }


    /**
     * Gets the identity value for this SurveyDetails.
     * 
     * @return identity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyIdentity getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this SurveyDetails.
     * 
     * @param identity
     */
    public void setIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyIdentity identity) {
        this.identity = identity;
    }


    /**
     * Gets the code value for this SurveyDetails.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this SurveyDetails.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this SurveyDetails.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SurveyDetails.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the questions value for this SurveyDetails.
     * 
     * @return questions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition[] getQuestions() {
        return questions;
    }


    /**
     * Sets the questions value for this SurveyDetails.
     * 
     * @param questions
     */
    public void setQuestions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition[] questions) {
        this.questions = questions;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition getQuestions(int i) {
        return this.questions[i];
    }

    public void setQuestions(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition _value) {
        this.questions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurveyDetails)) return false;
        SurveyDetails other = (SurveyDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.questions==null && other.getQuestions()==null) || 
             (this.questions!=null &&
              java.util.Arrays.equals(this.questions, other.getQuestions())));
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
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQuestions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestions(), i);
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
        new org.apache.axis.description.TypeDesc(SurveyDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SurveyDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SurveyIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "questions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "QuestionDefinition"));
        elemField.setMinOccurs(0);
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
