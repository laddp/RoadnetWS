/**
 * TelematicsOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class TelematicsOptions  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.AutoArriveDepartOptions autoArriveDepartOptions;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GPSProviderOptions gpsProviderOptions;

    public TelematicsOptions() {
    }

    public TelematicsOptions(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.AutoArriveDepartOptions autoArriveDepartOptions,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GPSProviderOptions gpsProviderOptions) {
           this.autoArriveDepartOptions = autoArriveDepartOptions;
           this.gpsProviderOptions = gpsProviderOptions;
    }


    /**
     * Gets the autoArriveDepartOptions value for this TelematicsOptions.
     * 
     * @return autoArriveDepartOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.AutoArriveDepartOptions getAutoArriveDepartOptions() {
        return autoArriveDepartOptions;
    }


    /**
     * Sets the autoArriveDepartOptions value for this TelematicsOptions.
     * 
     * @param autoArriveDepartOptions
     */
    public void setAutoArriveDepartOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.AutoArriveDepartOptions autoArriveDepartOptions) {
        this.autoArriveDepartOptions = autoArriveDepartOptions;
    }


    /**
     * Gets the gpsProviderOptions value for this TelematicsOptions.
     * 
     * @return gpsProviderOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GPSProviderOptions getGpsProviderOptions() {
        return gpsProviderOptions;
    }


    /**
     * Sets the gpsProviderOptions value for this TelematicsOptions.
     * 
     * @param gpsProviderOptions
     */
    public void setGpsProviderOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GPSProviderOptions gpsProviderOptions) {
        this.gpsProviderOptions = gpsProviderOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelematicsOptions)) return false;
        TelematicsOptions other = (TelematicsOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoArriveDepartOptions==null && other.getAutoArriveDepartOptions()==null) || 
             (this.autoArriveDepartOptions!=null &&
              this.autoArriveDepartOptions.equals(other.getAutoArriveDepartOptions()))) &&
            ((this.gpsProviderOptions==null && other.getGpsProviderOptions()==null) || 
             (this.gpsProviderOptions!=null &&
              this.gpsProviderOptions.equals(other.getGpsProviderOptions())));
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
        if (getAutoArriveDepartOptions() != null) {
            _hashCode += getAutoArriveDepartOptions().hashCode();
        }
        if (getGpsProviderOptions() != null) {
            _hashCode += getGpsProviderOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelematicsOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TelematicsOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoArriveDepartOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "autoArriveDepartOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "AutoArriveDepartOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpsProviderOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "gpsProviderOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "GPSProviderOptions"));
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
