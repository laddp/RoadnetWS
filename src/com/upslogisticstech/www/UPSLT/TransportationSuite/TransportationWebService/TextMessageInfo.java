/**
 * TextMessageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class TextMessageInfo  extends com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteEventInfo  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity;

    private int cannedTextID;

    private java.lang.String messageText;

    private int internalStopID;

    private java.lang.String orderNumber;

    private java.lang.String lineItemID;

    private byte[] imageData;

    private java.util.Calendar timeSent;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions;

    public TextMessageInfo() {
    }

    public TextMessageInfo(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteEventSource source,
           int messageId,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity,
           int cannedTextID,
           java.lang.String messageText,
           int internalStopID,
           java.lang.String orderNumber,
           java.lang.String lineItemID,
           byte[] imageData,
           java.util.Calendar timeSent,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) {
        super(
            source,
            messageId);
        this.routeIdentity = routeIdentity;
        this.cannedTextID = cannedTextID;
        this.messageText = messageText;
        this.internalStopID = internalStopID;
        this.orderNumber = orderNumber;
        this.lineItemID = lineItemID;
        this.imageData = imageData;
        this.timeSent = timeSent;
        this.timeZoneOptions = timeZoneOptions;
    }


    /**
     * Gets the routeIdentity value for this TextMessageInfo.
     * 
     * @return routeIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity getRouteIdentity() {
        return routeIdentity;
    }


    /**
     * Sets the routeIdentity value for this TextMessageInfo.
     * 
     * @param routeIdentity
     */
    public void setRouteIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity) {
        this.routeIdentity = routeIdentity;
    }


    /**
     * Gets the cannedTextID value for this TextMessageInfo.
     * 
     * @return cannedTextID
     */
    public int getCannedTextID() {
        return cannedTextID;
    }


    /**
     * Sets the cannedTextID value for this TextMessageInfo.
     * 
     * @param cannedTextID
     */
    public void setCannedTextID(int cannedTextID) {
        this.cannedTextID = cannedTextID;
    }


    /**
     * Gets the messageText value for this TextMessageInfo.
     * 
     * @return messageText
     */
    public java.lang.String getMessageText() {
        return messageText;
    }


    /**
     * Sets the messageText value for this TextMessageInfo.
     * 
     * @param messageText
     */
    public void setMessageText(java.lang.String messageText) {
        this.messageText = messageText;
    }


    /**
     * Gets the internalStopID value for this TextMessageInfo.
     * 
     * @return internalStopID
     */
    public int getInternalStopID() {
        return internalStopID;
    }


    /**
     * Sets the internalStopID value for this TextMessageInfo.
     * 
     * @param internalStopID
     */
    public void setInternalStopID(int internalStopID) {
        this.internalStopID = internalStopID;
    }


    /**
     * Gets the orderNumber value for this TextMessageInfo.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this TextMessageInfo.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the lineItemID value for this TextMessageInfo.
     * 
     * @return lineItemID
     */
    public java.lang.String getLineItemID() {
        return lineItemID;
    }


    /**
     * Sets the lineItemID value for this TextMessageInfo.
     * 
     * @param lineItemID
     */
    public void setLineItemID(java.lang.String lineItemID) {
        this.lineItemID = lineItemID;
    }


    /**
     * Gets the imageData value for this TextMessageInfo.
     * 
     * @return imageData
     */
    public byte[] getImageData() {
        return imageData;
    }


    /**
     * Sets the imageData value for this TextMessageInfo.
     * 
     * @param imageData
     */
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }


    /**
     * Gets the timeSent value for this TextMessageInfo.
     * 
     * @return timeSent
     */
    public java.util.Calendar getTimeSent() {
        return timeSent;
    }


    /**
     * Sets the timeSent value for this TextMessageInfo.
     * 
     * @param timeSent
     */
    public void setTimeSent(java.util.Calendar timeSent) {
        this.timeSent = timeSent;
    }


    /**
     * Gets the timeZoneOptions value for this TextMessageInfo.
     * 
     * @return timeZoneOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions getTimeZoneOptions() {
        return timeZoneOptions;
    }


    /**
     * Sets the timeZoneOptions value for this TextMessageInfo.
     * 
     * @param timeZoneOptions
     */
    public void setTimeZoneOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneOptions timeZoneOptions) {
        this.timeZoneOptions = timeZoneOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TextMessageInfo)) return false;
        TextMessageInfo other = (TextMessageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.routeIdentity==null && other.getRouteIdentity()==null) || 
             (this.routeIdentity!=null &&
              this.routeIdentity.equals(other.getRouteIdentity()))) &&
            this.cannedTextID == other.getCannedTextID() &&
            ((this.messageText==null && other.getMessageText()==null) || 
             (this.messageText!=null &&
              this.messageText.equals(other.getMessageText()))) &&
            this.internalStopID == other.getInternalStopID() &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.lineItemID==null && other.getLineItemID()==null) || 
             (this.lineItemID!=null &&
              this.lineItemID.equals(other.getLineItemID()))) &&
            ((this.imageData==null && other.getImageData()==null) || 
             (this.imageData!=null &&
              java.util.Arrays.equals(this.imageData, other.getImageData()))) &&
            ((this.timeSent==null && other.getTimeSent()==null) || 
             (this.timeSent!=null &&
              this.timeSent.equals(other.getTimeSent()))) &&
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
        int _hashCode = super.hashCode();
        if (getRouteIdentity() != null) {
            _hashCode += getRouteIdentity().hashCode();
        }
        _hashCode += getCannedTextID();
        if (getMessageText() != null) {
            _hashCode += getMessageText().hashCode();
        }
        _hashCode += getInternalStopID();
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getLineItemID() != null) {
            _hashCode += getLineItemID().hashCode();
        }
        if (getImageData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeSent() != null) {
            _hashCode += getTimeSent().hashCode();
        }
        if (getTimeZoneOptions() != null) {
            _hashCode += getTimeZoneOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TextMessageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TextMessageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cannedTextID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "cannedTextID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "messageText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalStopID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "internalStopID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "lineItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "imageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
