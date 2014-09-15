/**
 * UserDefinedColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class UserDefinedColumn  implements java.io.Serializable {
    private int columnOrdinal;

    private java.lang.String columnLabel;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataType dataType;

    private int dataSize;

    private java.lang.String formatterString;

    private boolean uiDisplay;

    private boolean removeFlag;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumnIdentity identity;

    public UserDefinedColumn() {
    }

    public UserDefinedColumn(
           int columnOrdinal,
           java.lang.String columnLabel,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataType dataType,
           int dataSize,
           java.lang.String formatterString,
           boolean uiDisplay,
           boolean removeFlag,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumnIdentity identity) {
           this.columnOrdinal = columnOrdinal;
           this.columnLabel = columnLabel;
           this.dataType = dataType;
           this.dataSize = dataSize;
           this.formatterString = formatterString;
           this.uiDisplay = uiDisplay;
           this.removeFlag = removeFlag;
           this.identity = identity;
    }


    /**
     * Gets the columnOrdinal value for this UserDefinedColumn.
     * 
     * @return columnOrdinal
     */
    public int getColumnOrdinal() {
        return columnOrdinal;
    }


    /**
     * Sets the columnOrdinal value for this UserDefinedColumn.
     * 
     * @param columnOrdinal
     */
    public void setColumnOrdinal(int columnOrdinal) {
        this.columnOrdinal = columnOrdinal;
    }


    /**
     * Gets the columnLabel value for this UserDefinedColumn.
     * 
     * @return columnLabel
     */
    public java.lang.String getColumnLabel() {
        return columnLabel;
    }


    /**
     * Sets the columnLabel value for this UserDefinedColumn.
     * 
     * @param columnLabel
     */
    public void setColumnLabel(java.lang.String columnLabel) {
        this.columnLabel = columnLabel;
    }


    /**
     * Gets the dataType value for this UserDefinedColumn.
     * 
     * @return dataType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this UserDefinedColumn.
     * 
     * @param dataType
     */
    public void setDataType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the dataSize value for this UserDefinedColumn.
     * 
     * @return dataSize
     */
    public int getDataSize() {
        return dataSize;
    }


    /**
     * Sets the dataSize value for this UserDefinedColumn.
     * 
     * @param dataSize
     */
    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }


    /**
     * Gets the formatterString value for this UserDefinedColumn.
     * 
     * @return formatterString
     */
    public java.lang.String getFormatterString() {
        return formatterString;
    }


    /**
     * Sets the formatterString value for this UserDefinedColumn.
     * 
     * @param formatterString
     */
    public void setFormatterString(java.lang.String formatterString) {
        this.formatterString = formatterString;
    }


    /**
     * Gets the uiDisplay value for this UserDefinedColumn.
     * 
     * @return uiDisplay
     */
    public boolean isUiDisplay() {
        return uiDisplay;
    }


    /**
     * Sets the uiDisplay value for this UserDefinedColumn.
     * 
     * @param uiDisplay
     */
    public void setUiDisplay(boolean uiDisplay) {
        this.uiDisplay = uiDisplay;
    }


    /**
     * Gets the removeFlag value for this UserDefinedColumn.
     * 
     * @return removeFlag
     */
    public boolean isRemoveFlag() {
        return removeFlag;
    }


    /**
     * Sets the removeFlag value for this UserDefinedColumn.
     * 
     * @param removeFlag
     */
    public void setRemoveFlag(boolean removeFlag) {
        this.removeFlag = removeFlag;
    }


    /**
     * Gets the identity value for this UserDefinedColumn.
     * 
     * @return identity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumnIdentity getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this UserDefinedColumn.
     * 
     * @param identity
     */
    public void setIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumnIdentity identity) {
        this.identity = identity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedColumn)) return false;
        UserDefinedColumn other = (UserDefinedColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.columnOrdinal == other.getColumnOrdinal() &&
            ((this.columnLabel==null && other.getColumnLabel()==null) || 
             (this.columnLabel!=null &&
              this.columnLabel.equals(other.getColumnLabel()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            this.dataSize == other.getDataSize() &&
            ((this.formatterString==null && other.getFormatterString()==null) || 
             (this.formatterString!=null &&
              this.formatterString.equals(other.getFormatterString()))) &&
            this.uiDisplay == other.isUiDisplay() &&
            this.removeFlag == other.isRemoveFlag() &&
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
        _hashCode += getColumnOrdinal();
        if (getColumnLabel() != null) {
            _hashCode += getColumnLabel().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        _hashCode += getDataSize();
        if (getFormatterString() != null) {
            _hashCode += getFormatterString().hashCode();
        }
        _hashCode += (isUiDisplay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRemoveFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnOrdinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "columnOrdinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "columnLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "dataSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatterString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "formatterString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uiDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "uiDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "removeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedColumnIdentity"));
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
