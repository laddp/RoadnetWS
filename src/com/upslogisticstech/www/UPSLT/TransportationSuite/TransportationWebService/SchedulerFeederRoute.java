/**
 * SchedulerFeederRoute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SchedulerFeederRoute  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity depot;

    private org.apache.axis.types.Time arrivalTime;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities totalQuantities;

    private java.lang.String[] orderNumbers;

    public SchedulerFeederRoute() {
    }

    public SchedulerFeederRoute(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity depot,
           org.apache.axis.types.Time arrivalTime,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities totalQuantities,
           java.lang.String[] orderNumbers) {
           this.depot = depot;
           this.arrivalTime = arrivalTime;
           this.totalQuantities = totalQuantities;
           this.orderNumbers = orderNumbers;
    }


    /**
     * Gets the depot value for this SchedulerFeederRoute.
     * 
     * @return depot
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity getDepot() {
        return depot;
    }


    /**
     * Sets the depot value for this SchedulerFeederRoute.
     * 
     * @param depot
     */
    public void setDepot(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity depot) {
        this.depot = depot;
    }


    /**
     * Gets the arrivalTime value for this SchedulerFeederRoute.
     * 
     * @return arrivalTime
     */
    public org.apache.axis.types.Time getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this SchedulerFeederRoute.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(org.apache.axis.types.Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the totalQuantities value for this SchedulerFeederRoute.
     * 
     * @return totalQuantities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getTotalQuantities() {
        return totalQuantities;
    }


    /**
     * Sets the totalQuantities value for this SchedulerFeederRoute.
     * 
     * @param totalQuantities
     */
    public void setTotalQuantities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities totalQuantities) {
        this.totalQuantities = totalQuantities;
    }


    /**
     * Gets the orderNumbers value for this SchedulerFeederRoute.
     * 
     * @return orderNumbers
     */
    public java.lang.String[] getOrderNumbers() {
        return orderNumbers;
    }


    /**
     * Sets the orderNumbers value for this SchedulerFeederRoute.
     * 
     * @param orderNumbers
     */
    public void setOrderNumbers(java.lang.String[] orderNumbers) {
        this.orderNumbers = orderNumbers;
    }

    public java.lang.String getOrderNumbers(int i) {
        return this.orderNumbers[i];
    }

    public void setOrderNumbers(int i, java.lang.String _value) {
        this.orderNumbers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchedulerFeederRoute)) return false;
        SchedulerFeederRoute other = (SchedulerFeederRoute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depot==null && other.getDepot()==null) || 
             (this.depot!=null &&
              this.depot.equals(other.getDepot()))) &&
            ((this.arrivalTime==null && other.getArrivalTime()==null) || 
             (this.arrivalTime!=null &&
              this.arrivalTime.equals(other.getArrivalTime()))) &&
            ((this.totalQuantities==null && other.getTotalQuantities()==null) || 
             (this.totalQuantities!=null &&
              this.totalQuantities.equals(other.getTotalQuantities()))) &&
            ((this.orderNumbers==null && other.getOrderNumbers()==null) || 
             (this.orderNumbers!=null &&
              java.util.Arrays.equals(this.orderNumbers, other.getOrderNumbers())));
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
        if (getDepot() != null) {
            _hashCode += getDepot().hashCode();
        }
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        if (getTotalQuantities() != null) {
            _hashCode += getTotalQuantities().hashCode();
        }
        if (getOrderNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(SchedulerFeederRoute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SchedulerFeederRoute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "depot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "LocationIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "totalQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Quantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orderNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
