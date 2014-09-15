/**
 * UserDefinedData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class UserDefinedData  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType type;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDatum[] data;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataIdentity identity;

    public UserDefinedData() {
    }

    public UserDefinedData(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType type,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDatum[] data,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataIdentity identity) {
           this.type = type;
           this.data = data;
           this.identity = identity;
    }


    /**
     * Gets the type value for this UserDefinedData.
     * 
     * @return type
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType getType() {
        return type;
    }


    /**
     * Sets the type value for this UserDefinedData.
     * 
     * @param type
     */
    public void setType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType type) {
        this.type = type;
    }


    /**
     * Gets the data value for this UserDefinedData.
     * 
     * @return data
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDatum[] getData() {
        return data;
    }


    /**
     * Sets the data value for this UserDefinedData.
     * 
     * @param data
     */
    public void setData(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDatum[] data) {
        this.data = data;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDatum getData(int i) {
        return this.data[i];
    }

    public void setData(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDatum _value) {
        this.data[i] = _value;
    }


    /**
     * Gets the identity value for this UserDefinedData.
     * 
     * @return identity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataIdentity getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this UserDefinedData.
     * 
     * @param identity
     */
    public void setIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedDataIdentity identity) {
        this.identity = identity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedData)) return false;
        UserDefinedData other = (UserDefinedData) obj;
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
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity())));
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
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TableType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedDatum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedDataIdentity"));
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
