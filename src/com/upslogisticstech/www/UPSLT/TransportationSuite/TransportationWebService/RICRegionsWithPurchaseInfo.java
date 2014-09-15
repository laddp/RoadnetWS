/**
 * RICRegionsWithPurchaseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class RICRegionsWithPurchaseInfo  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region[] regions;

    private boolean ricPurchased;

    private boolean rnOrMCPurchased;

    public RICRegionsWithPurchaseInfo() {
    }

    public RICRegionsWithPurchaseInfo(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region[] regions,
           boolean ricPurchased,
           boolean rnOrMCPurchased) {
           this.regions = regions;
           this.ricPurchased = ricPurchased;
           this.rnOrMCPurchased = rnOrMCPurchased;
    }


    /**
     * Gets the regions value for this RICRegionsWithPurchaseInfo.
     * 
     * @return regions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region[] getRegions() {
        return regions;
    }


    /**
     * Sets the regions value for this RICRegionsWithPurchaseInfo.
     * 
     * @param regions
     */
    public void setRegions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region[] regions) {
        this.regions = regions;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region getRegions(int i) {
        return this.regions[i];
    }

    public void setRegions(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Region _value) {
        this.regions[i] = _value;
    }


    /**
     * Gets the ricPurchased value for this RICRegionsWithPurchaseInfo.
     * 
     * @return ricPurchased
     */
    public boolean isRicPurchased() {
        return ricPurchased;
    }


    /**
     * Sets the ricPurchased value for this RICRegionsWithPurchaseInfo.
     * 
     * @param ricPurchased
     */
    public void setRicPurchased(boolean ricPurchased) {
        this.ricPurchased = ricPurchased;
    }


    /**
     * Gets the rnOrMCPurchased value for this RICRegionsWithPurchaseInfo.
     * 
     * @return rnOrMCPurchased
     */
    public boolean isRnOrMCPurchased() {
        return rnOrMCPurchased;
    }


    /**
     * Sets the rnOrMCPurchased value for this RICRegionsWithPurchaseInfo.
     * 
     * @param rnOrMCPurchased
     */
    public void setRnOrMCPurchased(boolean rnOrMCPurchased) {
        this.rnOrMCPurchased = rnOrMCPurchased;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RICRegionsWithPurchaseInfo)) return false;
        RICRegionsWithPurchaseInfo other = (RICRegionsWithPurchaseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regions==null && other.getRegions()==null) || 
             (this.regions!=null &&
              java.util.Arrays.equals(this.regions, other.getRegions()))) &&
            this.ricPurchased == other.isRicPurchased() &&
            this.rnOrMCPurchased == other.isRnOrMCPurchased();
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
        if (getRegions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isRicPurchased() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRnOrMCPurchased() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RICRegionsWithPurchaseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RICRegionsWithPurchaseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "regions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricPurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ricPurchased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rnOrMCPurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "rnOrMCPurchased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
