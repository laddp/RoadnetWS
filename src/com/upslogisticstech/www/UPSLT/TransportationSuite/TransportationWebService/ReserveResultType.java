/**
 * ReserveResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class ReserveResultType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReserveResultType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _rrtFailed = "rrtFailed";
    public static final java.lang.String _rrtSuccess = "rrtSuccess";
    public static final java.lang.String _rrtNewCost = "rrtNewCost";
    public static final java.lang.String _rrtFailedDuplicate = "rrtFailedDuplicate";
    public static final java.lang.String _rrtFailedNoResources = "rrtFailedNoResources";
    public static final ReserveResultType rrtFailed = new ReserveResultType(_rrtFailed);
    public static final ReserveResultType rrtSuccess = new ReserveResultType(_rrtSuccess);
    public static final ReserveResultType rrtNewCost = new ReserveResultType(_rrtNewCost);
    public static final ReserveResultType rrtFailedDuplicate = new ReserveResultType(_rrtFailedDuplicate);
    public static final ReserveResultType rrtFailedNoResources = new ReserveResultType(_rrtFailedNoResources);
    public java.lang.String getValue() { return _value_;}
    public static ReserveResultType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReserveResultType enumeration = (ReserveResultType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReserveResultType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReserveResultType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ReserveResultType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
