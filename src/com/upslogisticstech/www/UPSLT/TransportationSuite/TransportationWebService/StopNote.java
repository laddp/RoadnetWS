/**
 * StopNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class StopNote  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNote  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity;

    public StopNote() {
    }

    public StopNote(
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
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity) {
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
            pictureImageData);
        this.stopIdentity = stopIdentity;
    }


    /**
     * Gets the stopIdentity value for this StopNote.
     * 
     * @return stopIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity getStopIdentity() {
        return stopIdentity;
    }


    /**
     * Sets the stopIdentity value for this StopNote.
     * 
     * @param stopIdentity
     */
    public void setStopIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity) {
        this.stopIdentity = stopIdentity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StopNote)) return false;
        StopNote other = (StopNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.stopIdentity==null && other.getStopIdentity()==null) || 
             (this.stopIdentity!=null &&
              this.stopIdentity.equals(other.getStopIdentity())));
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
        if (getStopIdentity() != null) {
            _hashCode += getStopIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StopNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopNote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopIdentity"));
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
