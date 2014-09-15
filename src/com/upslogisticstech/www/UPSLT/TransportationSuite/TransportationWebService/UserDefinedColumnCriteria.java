/**
 * UserDefinedColumnCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class UserDefinedColumnCriteria  implements java.io.Serializable {
    private java.lang.String tableId;

    private java.lang.String columnId;

    private java.lang.String columnLabel;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataType dataType;

    public UserDefinedColumnCriteria() {
    }

    public UserDefinedColumnCriteria(
           java.lang.String tableId,
           java.lang.String columnId,
           java.lang.String columnLabel,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataType dataType) {
           this.tableId = tableId;
           this.columnId = columnId;
           this.columnLabel = columnLabel;
           this.dataType = dataType;
    }


    /**
     * Gets the tableId value for this UserDefinedColumnCriteria.
     * 
     * @return tableId
     */
    public java.lang.String getTableId() {
        return tableId;
    }


    /**
     * Sets the tableId value for this UserDefinedColumnCriteria.
     * 
     * @param tableId
     */
    public void setTableId(java.lang.String tableId) {
        this.tableId = tableId;
    }


    /**
     * Gets the columnId value for this UserDefinedColumnCriteria.
     * 
     * @return columnId
     */
    public java.lang.String getColumnId() {
        return columnId;
    }


    /**
     * Sets the columnId value for this UserDefinedColumnCriteria.
     * 
     * @param columnId
     */
    public void setColumnId(java.lang.String columnId) {
        this.columnId = columnId;
    }


    /**
     * Gets the columnLabel value for this UserDefinedColumnCriteria.
     * 
     * @return columnLabel
     */
    public java.lang.String getColumnLabel() {
        return columnLabel;
    }


    /**
     * Sets the columnLabel value for this UserDefinedColumnCriteria.
     * 
     * @param columnLabel
     */
    public void setColumnLabel(java.lang.String columnLabel) {
        this.columnLabel = columnLabel;
    }


    /**
     * Gets the dataType value for this UserDefinedColumnCriteria.
     * 
     * @return dataType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this UserDefinedColumnCriteria.
     * 
     * @param dataType
     */
    public void setDataType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DataType dataType) {
        this.dataType = dataType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedColumnCriteria)) return false;
        UserDefinedColumnCriteria other = (UserDefinedColumnCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tableId==null && other.getTableId()==null) || 
             (this.tableId!=null &&
              this.tableId.equals(other.getTableId()))) &&
            ((this.columnId==null && other.getColumnId()==null) || 
             (this.columnId!=null &&
              this.columnId.equals(other.getColumnId()))) &&
            ((this.columnLabel==null && other.getColumnLabel()==null) || 
             (this.columnLabel!=null &&
              this.columnLabel.equals(other.getColumnLabel()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType())));
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
        if (getTableId() != null) {
            _hashCode += getTableId().hashCode();
        }
        if (getColumnId() != null) {
            _hashCode += getColumnId().hashCode();
        }
        if (getColumnLabel() != null) {
            _hashCode += getColumnLabel().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedColumnCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedColumnCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "columnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "columnLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DataType"));
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
