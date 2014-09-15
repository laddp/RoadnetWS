/**
 * NoteRetrievalOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class NoteRetrievalOptions  implements java.io.Serializable {
    private boolean includeText;

    private boolean includeThumbnail;

    private boolean includePicture;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions;

    public NoteRetrievalOptions() {
    }

    public NoteRetrievalOptions(
           boolean includeText,
           boolean includeThumbnail,
           boolean includePicture,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) {
           this.includeText = includeText;
           this.includeThumbnail = includeThumbnail;
           this.includePicture = includePicture;
           this.timeZoneOptions = timeZoneOptions;
    }


    /**
     * Gets the includeText value for this NoteRetrievalOptions.
     * 
     * @return includeText
     */
    public boolean isIncludeText() {
        return includeText;
    }


    /**
     * Sets the includeText value for this NoteRetrievalOptions.
     * 
     * @param includeText
     */
    public void setIncludeText(boolean includeText) {
        this.includeText = includeText;
    }


    /**
     * Gets the includeThumbnail value for this NoteRetrievalOptions.
     * 
     * @return includeThumbnail
     */
    public boolean isIncludeThumbnail() {
        return includeThumbnail;
    }


    /**
     * Sets the includeThumbnail value for this NoteRetrievalOptions.
     * 
     * @param includeThumbnail
     */
    public void setIncludeThumbnail(boolean includeThumbnail) {
        this.includeThumbnail = includeThumbnail;
    }


    /**
     * Gets the includePicture value for this NoteRetrievalOptions.
     * 
     * @return includePicture
     */
    public boolean isIncludePicture() {
        return includePicture;
    }


    /**
     * Sets the includePicture value for this NoteRetrievalOptions.
     * 
     * @param includePicture
     */
    public void setIncludePicture(boolean includePicture) {
        this.includePicture = includePicture;
    }


    /**
     * Gets the timeZoneOptions value for this NoteRetrievalOptions.
     * 
     * @return timeZoneOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions getTimeZoneOptions() {
        return timeZoneOptions;
    }


    /**
     * Sets the timeZoneOptions value for this NoteRetrievalOptions.
     * 
     * @param timeZoneOptions
     */
    public void setTimeZoneOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) {
        this.timeZoneOptions = timeZoneOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoteRetrievalOptions)) return false;
        NoteRetrievalOptions other = (NoteRetrievalOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.includeText == other.isIncludeText() &&
            this.includeThumbnail == other.isIncludeThumbnail() &&
            this.includePicture == other.isIncludePicture() &&
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
        int _hashCode = 1;
        _hashCode += (isIncludeText() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludeThumbnail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludePicture() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimeZoneOptions() != null) {
            _hashCode += getTimeZoneOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NoteRetrievalOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "NoteRetrievalOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "includeText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "includeThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includePicture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "includePicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
