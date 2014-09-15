/**
 * SchedulerRetrieveFeederRoutesOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SchedulerRetrieveFeederRoutesOptions  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities vehicleCapacities;

    public SchedulerRetrieveFeederRoutesOptions() {
    }

    public SchedulerRetrieveFeederRoutesOptions(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities vehicleCapacities) {
           this.vehicleCapacities = vehicleCapacities;
    }


    /**
     * Gets the vehicleCapacities value for this SchedulerRetrieveFeederRoutesOptions.
     * 
     * @return vehicleCapacities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities getVehicleCapacities() {
        return vehicleCapacities;
    }


    /**
     * Sets the vehicleCapacities value for this SchedulerRetrieveFeederRoutesOptions.
     * 
     * @param vehicleCapacities
     */
    public void setVehicleCapacities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Quantities vehicleCapacities) {
        this.vehicleCapacities = vehicleCapacities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchedulerRetrieveFeederRoutesOptions)) return false;
        SchedulerRetrieveFeederRoutesOptions other = (SchedulerRetrieveFeederRoutesOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vehicleCapacities==null && other.getVehicleCapacities()==null) || 
             (this.vehicleCapacities!=null &&
              this.vehicleCapacities.equals(other.getVehicleCapacities())));
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
        if (getVehicleCapacities() != null) {
            _hashCode += getVehicleCapacities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SchedulerRetrieveFeederRoutesOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SchedulerRetrieveFeederRoutesOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleCapacities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "vehicleCapacities"));
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
