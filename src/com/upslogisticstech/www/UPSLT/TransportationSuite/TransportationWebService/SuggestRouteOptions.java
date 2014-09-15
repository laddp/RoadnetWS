/**
 * SuggestRouteOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class SuggestRouteOptions  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GradeMethod suggestBy;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeWindowOptions timeWindowOptions;

    private int maxRoutes;

    private boolean considerSkillSets;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteFilterType routeFilter;

    private boolean includeDutyPeriodViolations;

    private boolean considerBeforeNext;

    private int nextArrivalTimeOut;

    public SuggestRouteOptions() {
    }

    public SuggestRouteOptions(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GradeMethod suggestBy,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeWindowOptions timeWindowOptions,
           int maxRoutes,
           boolean considerSkillSets,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteFilterType routeFilter,
           boolean includeDutyPeriodViolations,
           boolean considerBeforeNext,
           int nextArrivalTimeOut) {
           this.suggestBy = suggestBy;
           this.timeWindowOptions = timeWindowOptions;
           this.maxRoutes = maxRoutes;
           this.considerSkillSets = considerSkillSets;
           this.routeFilter = routeFilter;
           this.includeDutyPeriodViolations = includeDutyPeriodViolations;
           this.considerBeforeNext = considerBeforeNext;
           this.nextArrivalTimeOut = nextArrivalTimeOut;
    }


    /**
     * Gets the suggestBy value for this SuggestRouteOptions.
     * 
     * @return suggestBy
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GradeMethod getSuggestBy() {
        return suggestBy;
    }


    /**
     * Sets the suggestBy value for this SuggestRouteOptions.
     * 
     * @param suggestBy
     */
    public void setSuggestBy(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.GradeMethod suggestBy) {
        this.suggestBy = suggestBy;
    }


    /**
     * Gets the timeWindowOptions value for this SuggestRouteOptions.
     * 
     * @return timeWindowOptions
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeWindowOptions getTimeWindowOptions() {
        return timeWindowOptions;
    }


    /**
     * Sets the timeWindowOptions value for this SuggestRouteOptions.
     * 
     * @param timeWindowOptions
     */
    public void setTimeWindowOptions(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeWindowOptions timeWindowOptions) {
        this.timeWindowOptions = timeWindowOptions;
    }


    /**
     * Gets the maxRoutes value for this SuggestRouteOptions.
     * 
     * @return maxRoutes
     */
    public int getMaxRoutes() {
        return maxRoutes;
    }


    /**
     * Sets the maxRoutes value for this SuggestRouteOptions.
     * 
     * @param maxRoutes
     */
    public void setMaxRoutes(int maxRoutes) {
        this.maxRoutes = maxRoutes;
    }


    /**
     * Gets the considerSkillSets value for this SuggestRouteOptions.
     * 
     * @return considerSkillSets
     */
    public boolean isConsiderSkillSets() {
        return considerSkillSets;
    }


    /**
     * Sets the considerSkillSets value for this SuggestRouteOptions.
     * 
     * @param considerSkillSets
     */
    public void setConsiderSkillSets(boolean considerSkillSets) {
        this.considerSkillSets = considerSkillSets;
    }


    /**
     * Gets the routeFilter value for this SuggestRouteOptions.
     * 
     * @return routeFilter
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteFilterType getRouteFilter() {
        return routeFilter;
    }


    /**
     * Sets the routeFilter value for this SuggestRouteOptions.
     * 
     * @param routeFilter
     */
    public void setRouteFilter(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.RouteFilterType routeFilter) {
        this.routeFilter = routeFilter;
    }


    /**
     * Gets the includeDutyPeriodViolations value for this SuggestRouteOptions.
     * 
     * @return includeDutyPeriodViolations
     */
    public boolean isIncludeDutyPeriodViolations() {
        return includeDutyPeriodViolations;
    }


    /**
     * Sets the includeDutyPeriodViolations value for this SuggestRouteOptions.
     * 
     * @param includeDutyPeriodViolations
     */
    public void setIncludeDutyPeriodViolations(boolean includeDutyPeriodViolations) {
        this.includeDutyPeriodViolations = includeDutyPeriodViolations;
    }


    /**
     * Gets the considerBeforeNext value for this SuggestRouteOptions.
     * 
     * @return considerBeforeNext
     */
    public boolean isConsiderBeforeNext() {
        return considerBeforeNext;
    }


    /**
     * Sets the considerBeforeNext value for this SuggestRouteOptions.
     * 
     * @param considerBeforeNext
     */
    public void setConsiderBeforeNext(boolean considerBeforeNext) {
        this.considerBeforeNext = considerBeforeNext;
    }


    /**
     * Gets the nextArrivalTimeOut value for this SuggestRouteOptions.
     * 
     * @return nextArrivalTimeOut
     */
    public int getNextArrivalTimeOut() {
        return nextArrivalTimeOut;
    }


    /**
     * Sets the nextArrivalTimeOut value for this SuggestRouteOptions.
     * 
     * @param nextArrivalTimeOut
     */
    public void setNextArrivalTimeOut(int nextArrivalTimeOut) {
        this.nextArrivalTimeOut = nextArrivalTimeOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuggestRouteOptions)) return false;
        SuggestRouteOptions other = (SuggestRouteOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suggestBy==null && other.getSuggestBy()==null) || 
             (this.suggestBy!=null &&
              this.suggestBy.equals(other.getSuggestBy()))) &&
            ((this.timeWindowOptions==null && other.getTimeWindowOptions()==null) || 
             (this.timeWindowOptions!=null &&
              this.timeWindowOptions.equals(other.getTimeWindowOptions()))) &&
            this.maxRoutes == other.getMaxRoutes() &&
            this.considerSkillSets == other.isConsiderSkillSets() &&
            ((this.routeFilter==null && other.getRouteFilter()==null) || 
             (this.routeFilter!=null &&
              this.routeFilter.equals(other.getRouteFilter()))) &&
            this.includeDutyPeriodViolations == other.isIncludeDutyPeriodViolations() &&
            this.considerBeforeNext == other.isConsiderBeforeNext() &&
            this.nextArrivalTimeOut == other.getNextArrivalTimeOut();
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
        if (getSuggestBy() != null) {
            _hashCode += getSuggestBy().hashCode();
        }
        if (getTimeWindowOptions() != null) {
            _hashCode += getTimeWindowOptions().hashCode();
        }
        _hashCode += getMaxRoutes();
        _hashCode += (isConsiderSkillSets() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRouteFilter() != null) {
            _hashCode += getRouteFilter().hashCode();
        }
        _hashCode += (isIncludeDutyPeriodViolations() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConsiderBeforeNext() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNextArrivalTimeOut();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuggestRouteOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SuggestRouteOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "suggestBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "GradeMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeWindowOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeWindowOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TimeWindowOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRoutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "maxRoutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("considerSkillSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "considerSkillSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RouteFilterType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDutyPeriodViolations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "includeDutyPeriodViolations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("considerBeforeNext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "considerBeforeNext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextArrivalTimeOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "nextArrivalTimeOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
