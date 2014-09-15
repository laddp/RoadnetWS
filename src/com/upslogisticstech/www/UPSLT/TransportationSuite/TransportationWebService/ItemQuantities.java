/**
 * ItemQuantities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class ItemQuantities  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities planned;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities actual;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities plannedPickup;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities actualPickup;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities over;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities shorted;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities damaged;

    public ItemQuantities() {
    }

    public ItemQuantities(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities planned,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities actual,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities plannedPickup,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities actualPickup,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities over,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities shorted,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities damaged) {
           this.planned = planned;
           this.actual = actual;
           this.plannedPickup = plannedPickup;
           this.actualPickup = actualPickup;
           this.over = over;
           this.shorted = shorted;
           this.damaged = damaged;
    }


    /**
     * Gets the planned value for this ItemQuantities.
     * 
     * @return planned
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getPlanned() {
        return planned;
    }


    /**
     * Sets the planned value for this ItemQuantities.
     * 
     * @param planned
     */
    public void setPlanned(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities planned) {
        this.planned = planned;
    }


    /**
     * Gets the actual value for this ItemQuantities.
     * 
     * @return actual
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getActual() {
        return actual;
    }


    /**
     * Sets the actual value for this ItemQuantities.
     * 
     * @param actual
     */
    public void setActual(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities actual) {
        this.actual = actual;
    }


    /**
     * Gets the plannedPickup value for this ItemQuantities.
     * 
     * @return plannedPickup
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getPlannedPickup() {
        return plannedPickup;
    }


    /**
     * Sets the plannedPickup value for this ItemQuantities.
     * 
     * @param plannedPickup
     */
    public void setPlannedPickup(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities plannedPickup) {
        this.plannedPickup = plannedPickup;
    }


    /**
     * Gets the actualPickup value for this ItemQuantities.
     * 
     * @return actualPickup
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getActualPickup() {
        return actualPickup;
    }


    /**
     * Sets the actualPickup value for this ItemQuantities.
     * 
     * @param actualPickup
     */
    public void setActualPickup(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities actualPickup) {
        this.actualPickup = actualPickup;
    }


    /**
     * Gets the over value for this ItemQuantities.
     * 
     * @return over
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getOver() {
        return over;
    }


    /**
     * Sets the over value for this ItemQuantities.
     * 
     * @param over
     */
    public void setOver(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities over) {
        this.over = over;
    }


    /**
     * Gets the shorted value for this ItemQuantities.
     * 
     * @return shorted
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getShorted() {
        return shorted;
    }


    /**
     * Sets the shorted value for this ItemQuantities.
     * 
     * @param shorted
     */
    public void setShorted(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities shorted) {
        this.shorted = shorted;
    }


    /**
     * Gets the damaged value for this ItemQuantities.
     * 
     * @return damaged
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getDamaged() {
        return damaged;
    }


    /**
     * Sets the damaged value for this ItemQuantities.
     * 
     * @param damaged
     */
    public void setDamaged(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities damaged) {
        this.damaged = damaged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemQuantities)) return false;
        ItemQuantities other = (ItemQuantities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.planned==null && other.getPlanned()==null) || 
             (this.planned!=null &&
              this.planned.equals(other.getPlanned()))) &&
            ((this.actual==null && other.getActual()==null) || 
             (this.actual!=null &&
              this.actual.equals(other.getActual()))) &&
            ((this.plannedPickup==null && other.getPlannedPickup()==null) || 
             (this.plannedPickup!=null &&
              this.plannedPickup.equals(other.getPlannedPickup()))) &&
            ((this.actualPickup==null && other.getActualPickup()==null) || 
             (this.actualPickup!=null &&
              this.actualPickup.equals(other.getActualPickup()))) &&
            ((this.over==null && other.getOver()==null) || 
             (this.over!=null &&
              this.over.equals(other.getOver()))) &&
            ((this.shorted==null && other.getShorted()==null) || 
             (this.shorted!=null &&
              this.shorted.equals(other.getShorted()))) &&
            ((this.damaged==null && other.getDamaged()==null) || 
             (this.damaged!=null &&
              this.damaged.equals(other.getDamaged())));
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
        if (getPlanned() != null) {
            _hashCode += getPlanned().hashCode();
        }
        if (getActual() != null) {
            _hashCode += getActual().hashCode();
        }
        if (getPlannedPickup() != null) {
            _hashCode += getPlannedPickup().hashCode();
        }
        if (getActualPickup() != null) {
            _hashCode += getActualPickup().hashCode();
        }
        if (getOver() != null) {
            _hashCode += getOver().hashCode();
        }
        if (getShorted() != null) {
            _hashCode += getShorted().hashCode();
        }
        if (getDamaged() != null) {
            _hashCode += getDamaged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemQuantities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ItemQuantities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "planned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedPickup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "plannedPickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualPickup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualPickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("over");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "over"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shorted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "shorted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damaged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "damaged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
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
