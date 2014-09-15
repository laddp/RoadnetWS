/**
 * SapShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SapShipment  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipmentIdentity sapShipmentIdentity;

    private java.lang.String sapShipmentId;

    private java.lang.String tppt;

    public SapShipment() {
    }

    public SapShipment(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipmentIdentity sapShipmentIdentity,
           java.lang.String sapShipmentId,
           java.lang.String tppt) {
           this.sapShipmentIdentity = sapShipmentIdentity;
           this.sapShipmentId = sapShipmentId;
           this.tppt = tppt;
    }


    /**
     * Gets the sapShipmentIdentity value for this SapShipment.
     * 
     * @return sapShipmentIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipmentIdentity getSapShipmentIdentity() {
        return sapShipmentIdentity;
    }


    /**
     * Sets the sapShipmentIdentity value for this SapShipment.
     * 
     * @param sapShipmentIdentity
     */
    public void setSapShipmentIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SapShipmentIdentity sapShipmentIdentity) {
        this.sapShipmentIdentity = sapShipmentIdentity;
    }


    /**
     * Gets the sapShipmentId value for this SapShipment.
     * 
     * @return sapShipmentId
     */
    public java.lang.String getSapShipmentId() {
        return sapShipmentId;
    }


    /**
     * Sets the sapShipmentId value for this SapShipment.
     * 
     * @param sapShipmentId
     */
    public void setSapShipmentId(java.lang.String sapShipmentId) {
        this.sapShipmentId = sapShipmentId;
    }


    /**
     * Gets the tppt value for this SapShipment.
     * 
     * @return tppt
     */
    public java.lang.String getTppt() {
        return tppt;
    }


    /**
     * Sets the tppt value for this SapShipment.
     * 
     * @param tppt
     */
    public void setTppt(java.lang.String tppt) {
        this.tppt = tppt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SapShipment)) return false;
        SapShipment other = (SapShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sapShipmentIdentity==null && other.getSapShipmentIdentity()==null) || 
             (this.sapShipmentIdentity!=null &&
              this.sapShipmentIdentity.equals(other.getSapShipmentIdentity()))) &&
            ((this.sapShipmentId==null && other.getSapShipmentId()==null) || 
             (this.sapShipmentId!=null &&
              this.sapShipmentId.equals(other.getSapShipmentId()))) &&
            ((this.tppt==null && other.getTppt()==null) || 
             (this.tppt!=null &&
              this.tppt.equals(other.getTppt())));
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
        if (getSapShipmentIdentity() != null) {
            _hashCode += getSapShipmentIdentity().hashCode();
        }
        if (getSapShipmentId() != null) {
            _hashCode += getSapShipmentId().hashCode();
        }
        if (getTppt() != null) {
            _hashCode += getTppt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SapShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SapShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sapShipmentIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "sapShipmentIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SapShipmentIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sapShipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "sapShipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tppt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tppt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
