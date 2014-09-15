/**
 * UserDefinedTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class UserDefinedTable  implements java.io.Serializable {
    private java.lang.String tableLabel;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn[] columns;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType type;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity identity;

    public UserDefinedTable() {
    }

    public UserDefinedTable(
           java.lang.String tableLabel,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn[] columns,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType type,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity identity) {
           this.tableLabel = tableLabel;
           this.columns = columns;
           this.type = type;
           this.identity = identity;
    }


    /**
     * Gets the tableLabel value for this UserDefinedTable.
     * 
     * @return tableLabel
     */
    public java.lang.String getTableLabel() {
        return tableLabel;
    }


    /**
     * Sets the tableLabel value for this UserDefinedTable.
     * 
     * @param tableLabel
     */
    public void setTableLabel(java.lang.String tableLabel) {
        this.tableLabel = tableLabel;
    }


    /**
     * Gets the columns value for this UserDefinedTable.
     * 
     * @return columns
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this UserDefinedTable.
     * 
     * @param columns
     */
    public void setColumns(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn[] columns) {
        this.columns = columns;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedColumn _value) {
        this.columns[i] = _value;
    }


    /**
     * Gets the type value for this UserDefinedTable.
     * 
     * @return type
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType getType() {
        return type;
    }


    /**
     * Sets the type value for this UserDefinedTable.
     * 
     * @param type
     */
    public void setType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TableType type) {
        this.type = type;
    }


    /**
     * Gets the identity value for this UserDefinedTable.
     * 
     * @return identity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this UserDefinedTable.
     * 
     * @param identity
     */
    public void setIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UserDefinedTableIdentity identity) {
        this.identity = identity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDefinedTable)) return false;
        UserDefinedTable other = (UserDefinedTable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tableLabel==null && other.getTableLabel()==null) || 
             (this.tableLabel!=null &&
              this.tableLabel.equals(other.getTableLabel()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getTableLabel() != null) {
            _hashCode += getTableLabel().hashCode();
        }
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDefinedTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tableLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TableType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UserDefinedTableIdentity"));
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
