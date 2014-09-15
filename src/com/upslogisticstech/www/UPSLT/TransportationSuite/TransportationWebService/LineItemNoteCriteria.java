/**
 * LineItemNoteCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class LineItemNoteCriteria  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderNoteCriteria  implements java.io.Serializable {
    private java.lang.String lineItemID;

    public LineItemNoteCriteria() {
    }

    public LineItemNoteCriteria(
           java.lang.String fromUserID,
           java.lang.String regionID,
           java.util.Date routeDate,
           java.lang.String routeID,
           java.lang.Boolean isError,
           java.lang.Boolean acknowledged,
           java.lang.Integer internalStopID,
           java.lang.String orderNumber,
           java.lang.String lineItemID) {
        super(
            fromUserID,
            regionID,
            routeDate,
            routeID,
            isError,
            acknowledged,
            internalStopID,
            orderNumber);
        this.lineItemID = lineItemID;
    }


    /**
     * Gets the lineItemID value for this LineItemNoteCriteria.
     * 
     * @return lineItemID
     */
    public java.lang.String getLineItemID() {
        return lineItemID;
    }


    /**
     * Sets the lineItemID value for this LineItemNoteCriteria.
     * 
     * @param lineItemID
     */
    public void setLineItemID(java.lang.String lineItemID) {
        this.lineItemID = lineItemID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemNoteCriteria)) return false;
        LineItemNoteCriteria other = (LineItemNoteCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lineItemID==null && other.getLineItemID()==null) || 
             (this.lineItemID!=null &&
              this.lineItemID.equals(other.getLineItemID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLineItemID() != null) {
            _hashCode += getLineItemID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemNoteCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "LineItemNoteCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "lineItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
