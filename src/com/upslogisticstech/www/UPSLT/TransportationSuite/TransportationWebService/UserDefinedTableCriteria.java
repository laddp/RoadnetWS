/**
 * UserDefinedTableCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class UserDefinedTableCriteria  implements java.io.Serializable {
    private java.lang.String tableId;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType tableType;

    private java.lang.String tableLabel;

    public UserDefinedTableCriteria() {
    }

    public UserDefinedTableCriteria(
           java.lang.String tableId,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType tableType,
           java.lang.String tableLabel) {
           this.tableId = tableId;
           this.tableType = tableType;
           this.tableLabel = tableLabel;
    }


    /**
     * Gets the tableId value for this UserDefinedTableCriteria.
     * 
     * @return tableId
     */
    public java.lang.String getTableId() {
        return tableId;
    }


    /**
     * Sets the tableId value for this UserDefinedTableCriteria.
     * 
     * @param tableId
     */
    public void setTableId(java.lang.String tableId) {
        this.tableId = tableId;
    }


    /**
     * Gets the tableType value for this UserDefinedTableCriteria.
     * 
     * @return tableType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType getTableType() {
        return tableType;
    }


    /**
     * Sets the tableType value for this UserDefinedTableCriteria.
     * 
     * @param tableType
     */
    public void setTableType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType tableType) {
        this.tableType = tableType;
    }


    /**
     * Gets the tableLabel value for this UserDefinedTableCriteria.
     * 
     * @return tableLabel
     */
    public java.lang.String getTableLabel() {
        return tableLabel;
    }


    /**
     * Sets the tableLabel value for this UserDefinedTableCriteria.
     * 
     * @param tableLabel
     */
    public void setTableLabel(java.lang.String tableLabel) {
        this.tableLabel = tableLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedTableCriteria)) return false;
        UserDefinedTableCriteria other = (UserDefinedTableCriteria) obj;
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
            ((this.tableType==null && other.getTableType()==null) || 
             (this.tableType!=null &&
              this.tableType.equals(other.getTableType()))) &&
            ((this.tableLabel==null && other.getTableLabel()==null) || 
             (this.tableLabel!=null &&
              this.tableLabel.equals(other.getTableLabel())));
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
        if (getTableType() != null) {
            _hashCode += getTableType().hashCode();
        }
        if (getTableLabel() != null) {
            _hashCode += getTableLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedTableCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedTableCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tableType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TableType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tableLabel"));
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
