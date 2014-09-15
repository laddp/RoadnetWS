/**
 * RouteNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class RouteNote  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNoteIdentity routeNoteIdentity;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity;

    private java.lang.String noteText;

    private java.lang.String fromUserID;

    private java.util.Calendar dateTimeSent;

    private boolean isError;

    private boolean acknowledged;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType thumbnailImageType;

    private byte[] thumbnailImageData;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType pictureImageType;

    private byte[] pictureImageData;

    public RouteNote() {
    }

    public RouteNote(
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
           byte[] pictureImageData) {
           this.routeNoteIdentity = routeNoteIdentity;
           this.routeIdentity = routeIdentity;
           this.noteText = noteText;
           this.fromUserID = fromUserID;
           this.dateTimeSent = dateTimeSent;
           this.isError = isError;
           this.acknowledged = acknowledged;
           this.thumbnailImageType = thumbnailImageType;
           this.thumbnailImageData = thumbnailImageData;
           this.pictureImageType = pictureImageType;
           this.pictureImageData = pictureImageData;
    }


    /**
     * Gets the routeNoteIdentity value for this RouteNote.
     * 
     * @return routeNoteIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNoteIdentity getRouteNoteIdentity() {
        return routeNoteIdentity;
    }


    /**
     * Sets the routeNoteIdentity value for this RouteNote.
     * 
     * @param routeNoteIdentity
     */
    public void setRouteNoteIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteNoteIdentity routeNoteIdentity) {
        this.routeNoteIdentity = routeNoteIdentity;
    }


    /**
     * Gets the routeIdentity value for this RouteNote.
     * 
     * @return routeIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity getRouteIdentity() {
        return routeIdentity;
    }


    /**
     * Sets the routeIdentity value for this RouteNote.
     * 
     * @param routeIdentity
     */
    public void setRouteIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteIdentity routeIdentity) {
        this.routeIdentity = routeIdentity;
    }


    /**
     * Gets the noteText value for this RouteNote.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this RouteNote.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the fromUserID value for this RouteNote.
     * 
     * @return fromUserID
     */
    public java.lang.String getFromUserID() {
        return fromUserID;
    }


    /**
     * Sets the fromUserID value for this RouteNote.
     * 
     * @param fromUserID
     */
    public void setFromUserID(java.lang.String fromUserID) {
        this.fromUserID = fromUserID;
    }


    /**
     * Gets the dateTimeSent value for this RouteNote.
     * 
     * @return dateTimeSent
     */
    public java.util.Calendar getDateTimeSent() {
        return dateTimeSent;
    }


    /**
     * Sets the dateTimeSent value for this RouteNote.
     * 
     * @param dateTimeSent
     */
    public void setDateTimeSent(java.util.Calendar dateTimeSent) {
        this.dateTimeSent = dateTimeSent;
    }


    /**
     * Gets the isError value for this RouteNote.
     * 
     * @return isError
     */
    public boolean isIsError() {
        return isError;
    }


    /**
     * Sets the isError value for this RouteNote.
     * 
     * @param isError
     */
    public void setIsError(boolean isError) {
        this.isError = isError;
    }


    /**
     * Gets the acknowledged value for this RouteNote.
     * 
     * @return acknowledged
     */
    public boolean isAcknowledged() {
        return acknowledged;
    }


    /**
     * Sets the acknowledged value for this RouteNote.
     * 
     * @param acknowledged
     */
    public void setAcknowledged(boolean acknowledged) {
        this.acknowledged = acknowledged;
    }


    /**
     * Gets the thumbnailImageType value for this RouteNote.
     * 
     * @return thumbnailImageType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType getThumbnailImageType() {
        return thumbnailImageType;
    }


    /**
     * Sets the thumbnailImageType value for this RouteNote.
     * 
     * @param thumbnailImageType
     */
    public void setThumbnailImageType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType thumbnailImageType) {
        this.thumbnailImageType = thumbnailImageType;
    }


    /**
     * Gets the thumbnailImageData value for this RouteNote.
     * 
     * @return thumbnailImageData
     */
    public byte[] getThumbnailImageData() {
        return thumbnailImageData;
    }


    /**
     * Sets the thumbnailImageData value for this RouteNote.
     * 
     * @param thumbnailImageData
     */
    public void setThumbnailImageData(byte[] thumbnailImageData) {
        this.thumbnailImageData = thumbnailImageData;
    }


    /**
     * Gets the pictureImageType value for this RouteNote.
     * 
     * @return pictureImageType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType getPictureImageType() {
        return pictureImageType;
    }


    /**
     * Sets the pictureImageType value for this RouteNote.
     * 
     * @param pictureImageType
     */
    public void setPictureImageType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ImageType pictureImageType) {
        this.pictureImageType = pictureImageType;
    }


    /**
     * Gets the pictureImageData value for this RouteNote.
     * 
     * @return pictureImageData
     */
    public byte[] getPictureImageData() {
        return pictureImageData;
    }


    /**
     * Sets the pictureImageData value for this RouteNote.
     * 
     * @param pictureImageData
     */
    public void setPictureImageData(byte[] pictureImageData) {
        this.pictureImageData = pictureImageData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteNote)) return false;
        RouteNote other = (RouteNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routeNoteIdentity==null && other.getRouteNoteIdentity()==null) || 
             (this.routeNoteIdentity!=null &&
              this.routeNoteIdentity.equals(other.getRouteNoteIdentity()))) &&
            ((this.routeIdentity==null && other.getRouteIdentity()==null) || 
             (this.routeIdentity!=null &&
              this.routeIdentity.equals(other.getRouteIdentity()))) &&
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              this.noteText.equals(other.getNoteText()))) &&
            ((this.fromUserID==null && other.getFromUserID()==null) || 
             (this.fromUserID!=null &&
              this.fromUserID.equals(other.getFromUserID()))) &&
            ((this.dateTimeSent==null && other.getDateTimeSent()==null) || 
             (this.dateTimeSent!=null &&
              this.dateTimeSent.equals(other.getDateTimeSent()))) &&
            this.isError == other.isIsError() &&
            this.acknowledged == other.isAcknowledged() &&
            ((this.thumbnailImageType==null && other.getThumbnailImageType()==null) || 
             (this.thumbnailImageType!=null &&
              this.thumbnailImageType.equals(other.getThumbnailImageType()))) &&
            ((this.thumbnailImageData==null && other.getThumbnailImageData()==null) || 
             (this.thumbnailImageData!=null &&
              java.util.Arrays.equals(this.thumbnailImageData, other.getThumbnailImageData()))) &&
            ((this.pictureImageType==null && other.getPictureImageType()==null) || 
             (this.pictureImageType!=null &&
              this.pictureImageType.equals(other.getPictureImageType()))) &&
            ((this.pictureImageData==null && other.getPictureImageData()==null) || 
             (this.pictureImageData!=null &&
              java.util.Arrays.equals(this.pictureImageData, other.getPictureImageData())));
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
        if (getRouteNoteIdentity() != null) {
            _hashCode += getRouteNoteIdentity().hashCode();
        }
        if (getRouteIdentity() != null) {
            _hashCode += getRouteIdentity().hashCode();
        }
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        if (getFromUserID() != null) {
            _hashCode += getFromUserID().hashCode();
        }
        if (getDateTimeSent() != null) {
            _hashCode += getDateTimeSent().hashCode();
        }
        _hashCode += (isIsError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAcknowledged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getThumbnailImageType() != null) {
            _hashCode += getThumbnailImageType().hashCode();
        }
        if (getThumbnailImageData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThumbnailImageData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThumbnailImageData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPictureImageType() != null) {
            _hashCode += getPictureImageType().hashCode();
        }
        if (getPictureImageData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPictureImageData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPictureImageData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteNote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeNoteIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeNoteIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteNoteIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "noteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "fromUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeSent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "dateTimeSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "isError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acknowledged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "acknowledged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbnailImageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "thumbnailImageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbnailImageData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "thumbnailImageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureImageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "pictureImageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureImageData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "pictureImageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
