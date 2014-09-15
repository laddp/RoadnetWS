/**
 * LineItemNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class LineItemNote  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderNote  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LineItemIdentity lineItemIdentity;

    public LineItemNote() {
    }

    public LineItemNote(
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
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.OrderIdentity orderIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LineItemIdentity lineItemIdentity) {
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
            stopIdentity,
            orderIdentity);
        this.lineItemIdentity = lineItemIdentity;
    }


    /**
     * Gets the lineItemIdentity value for this LineItemNote.
     * 
     * @return lineItemIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LineItemIdentity getLineItemIdentity() {
        return lineItemIdentity;
    }


    /**
     * Sets the lineItemIdentity value for this LineItemNote.
     * 
     * @param lineItemIdentity
     */
    public void setLineItemIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LineItemIdentity lineItemIdentity) {
        this.lineItemIdentity = lineItemIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemNote)) return false;
        LineItemNote other = (LineItemNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lineItemIdentity==null && other.getLineItemIdentity()==null) || 
             (this.lineItemIdentity!=null &&
              this.lineItemIdentity.equals(other.getLineItemIdentity())));
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
        if (getLineItemIdentity() != null) {
            _hashCode += getLineItemIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "LineItemNote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "lineItemIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "LineItemIdentity"));
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
