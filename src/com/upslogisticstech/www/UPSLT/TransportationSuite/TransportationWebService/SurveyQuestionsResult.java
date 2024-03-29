/**
 * SurveyQuestionsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SurveyQuestionsResult  implements java.io.Serializable {
    private java.lang.String surveyCode;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition[] defs;

    public SurveyQuestionsResult() {
    }

    public SurveyQuestionsResult(
           java.lang.String surveyCode,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition[] defs) {
           this.surveyCode = surveyCode;
           this.defs = defs;
    }


    /**
     * Gets the surveyCode value for this SurveyQuestionsResult.
     * 
     * @return surveyCode
     */
    public java.lang.String getSurveyCode() {
        return surveyCode;
    }


    /**
     * Sets the surveyCode value for this SurveyQuestionsResult.
     * 
     * @param surveyCode
     */
    public void setSurveyCode(java.lang.String surveyCode) {
        this.surveyCode = surveyCode;
    }


    /**
     * Gets the defs value for this SurveyQuestionsResult.
     * 
     * @return defs
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition[] getDefs() {
        return defs;
    }


    /**
     * Sets the defs value for this SurveyQuestionsResult.
     * 
     * @param defs
     */
    public void setDefs(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition[] defs) {
        this.defs = defs;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition getDefs(int i) {
        return this.defs[i];
    }

    public void setDefs(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuestionDefinition _value) {
        this.defs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurveyQuestionsResult)) return false;
        SurveyQuestionsResult other = (SurveyQuestionsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.surveyCode==null && other.getSurveyCode()==null) || 
             (this.surveyCode!=null &&
              this.surveyCode.equals(other.getSurveyCode()))) &&
            ((this.defs==null && other.getDefs()==null) || 
             (this.defs!=null &&
              java.util.Arrays.equals(this.defs, other.getDefs())));
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
        if (getSurveyCode() != null) {
            _hashCode += getSurveyCode().hashCode();
        }
        if (getDefs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefs(), i);
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
        new org.apache.axis.description.TypeDesc(SurveyQuestionsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SurveyQuestionsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "surveyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "defs"));
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
