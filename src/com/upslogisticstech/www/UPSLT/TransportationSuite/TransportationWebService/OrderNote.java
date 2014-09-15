/**
 * OrderNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class OrderNote  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopNote  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderIdentity orderIdentity;

    public OrderNote() {
    }

    public OrderNote(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNoteIdentity routeNoteIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity,
           java.lang.String noteText,
           java.lang.String fromUserID,
           java.util.Calendar dateTimeSent,
           boolean isError,
           boolean acknowledged,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType thumbnailImageType,
           byte[] thumbnailImageData,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType pictureImageType,
           byte[] pictureImageData,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderIdentity orderIdentity) {
        super(
            routeNoteIdentity,
            routeIdentity,
            noteText,
            fromUserID,
            dateTimeSent,
            isError,
            acknowledged,
            thumbnailImageType,
            thumbnailImageData,
            pictureImageType,
            pictureImageData,
            stopIdentity);
        this.orderIdentity = orderIdentity;
    }


    /**
     * Gets the orderIdentity value for this OrderNote.
     * 
     * @return orderIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderIdentity getOrderIdentity() {
        return orderIdentity;
    }


    /**
     * Sets the orderIdentity value for this OrderNote.
     * 
     * @param orderIdentity
     */
    public void setOrderIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderIdentity orderIdentity) {
        this.orderIdentity = orderIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderNote)) return false;
        OrderNote other = (OrderNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderIdentity==null && other.getOrderIdentity()==null) || 
             (this.orderIdentity!=null &&
              this.orderIdentity.equals(other.getOrderIdentity())));
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
        if (getOrderIdentity() != null) {
            _hashCode += getOrderIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "OrderNote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orderIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "OrderIdentity"));
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
