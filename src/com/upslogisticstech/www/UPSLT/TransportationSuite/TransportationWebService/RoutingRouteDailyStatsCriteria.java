/**
 * RoutingRouteDailyStatsCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class RoutingRouteDailyStatsCriteria  implements java.io.Serializable {
    private java.lang.String regionID;

    private java.util.Date dateStart;

    private java.util.Date dateEnd;

    private java.lang.String scenario;

    private java.lang.String sessionDescription;

    public RoutingRouteDailyStatsCriteria() {
    }

    public RoutingRouteDailyStatsCriteria(
           java.lang.String regionID,
           java.util.Date dateStart,
           java.util.Date dateEnd,
           java.lang.String scenario,
           java.lang.String sessionDescription) {
           this.regionID = regionID;
           this.dateStart = dateStart;
           this.dateEnd = dateEnd;
           this.scenario = scenario;
           this.sessionDescription = sessionDescription;
    }


    /**
     * Gets the regionID value for this RoutingRouteDailyStatsCriteria.
     * 
     * @return regionID
     */
    public java.lang.String getRegionID() {
        return regionID;
    }


    /**
     * Sets the regionID value for this RoutingRouteDailyStatsCriteria.
     * 
     * @param regionID
     */
    public void setRegionID(java.lang.String regionID) {
        this.regionID = regionID;
    }


    /**
     * Gets the dateStart value for this RoutingRouteDailyStatsCriteria.
     * 
     * @return dateStart
     */
    public java.util.Date getDateStart() {
        return dateStart;
    }


    /**
     * Sets the dateStart value for this RoutingRouteDailyStatsCriteria.
     * 
     * @param dateStart
     */
    public void setDateStart(java.util.Date dateStart) {
        this.dateStart = dateStart;
    }


    /**
     * Gets the dateEnd value for this RoutingRouteDailyStatsCriteria.
     * 
     * @return dateEnd
     */
    public java.util.Date getDateEnd() {
        return dateEnd;
    }


    /**
     * Sets the dateEnd value for this RoutingRouteDailyStatsCriteria.
     * 
     * @param dateEnd
     */
    public void setDateEnd(java.util.Date dateEnd) {
        this.dateEnd = dateEnd;
    }


    /**
     * Gets the scenario value for this RoutingRouteDailyStatsCriteria.
     * 
     * @return scenario
     */
    public java.lang.String getScenario() {
        return scenario;
    }


    /**
     * Sets the scenario value for this RoutingRouteDailyStatsCriteria.
     * 
     * @param scenario
     */
    public void setScenario(java.lang.String scenario) {
        this.scenario = scenario;
    }


    /**
     * Gets the sessionDescription value for this RoutingRouteDailyStatsCriteria.
     * 
     * @return sessionDescription
     */
    public java.lang.String getSessionDescription() {
        return sessionDescription;
    }


    /**
     * Sets the sessionDescription value for this RoutingRouteDailyStatsCriteria.
     * 
     * @param sessionDescription
     */
    public void setSessionDescription(java.lang.String sessionDescription) {
        this.sessionDescription = sessionDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutingRouteDailyStatsCriteria)) return false;
        RoutingRouteDailyStatsCriteria other = (RoutingRouteDailyStatsCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regionID==null && other.getRegionID()==null) || 
             (this.regionID!=null &&
              this.regionID.equals(other.getRegionID()))) &&
            ((this.dateStart==null && other.getDateStart()==null) || 
             (this.dateStart!=null &&
              this.dateStart.equals(other.getDateStart()))) &&
            ((this.dateEnd==null && other.getDateEnd()==null) || 
             (this.dateEnd!=null &&
              this.dateEnd.equals(other.getDateEnd()))) &&
            ((this.scenario==null && other.getScenario()==null) || 
             (this.scenario!=null &&
              this.scenario.equals(other.getScenario()))) &&
            ((this.sessionDescription==null && other.getSessionDescription()==null) || 
             (this.sessionDescription!=null &&
              this.sessionDescription.equals(other.getSessionDescription())));
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
        if (getRegionID() != null) {
            _hashCode += getRegionID().hashCode();
        }
        if (getDateStart() != null) {
            _hashCode += getDateStart().hashCode();
        }
        if (getDateEnd() != null) {
            _hashCode += getDateEnd().hashCode();
        }
        if (getScenario() != null) {
            _hashCode += getScenario().hashCode();
        }
        if (getSessionDescription() != null) {
            _hashCode += getSessionDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutingRouteDailyStatsCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RoutingRouteDailyStatsCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "regionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "dateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "dateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "scenario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "sessionDescription"));
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
