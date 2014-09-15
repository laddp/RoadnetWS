/**
 * DriverCostInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class DriverCostInfo  implements java.io.Serializable {
    private double regularRate;

    private double overtimeRate;

    private int minimumTime;

    private int overtimeHoursBegin;

    private double stopRate;

    private double minimumStops;

    private double distanceRate;

    private double minimumDistance;

    private double pieceRate;

    private double minimumPieces;

    private double fixedCost;

    public DriverCostInfo() {
    }

    public DriverCostInfo(
           double regularRate,
           double overtimeRate,
           int minimumTime,
           int overtimeHoursBegin,
           double stopRate,
           double minimumStops,
           double distanceRate,
           double minimumDistance,
           double pieceRate,
           double minimumPieces,
           double fixedCost) {
           this.regularRate = regularRate;
           this.overtimeRate = overtimeRate;
           this.minimumTime = minimumTime;
           this.overtimeHoursBegin = overtimeHoursBegin;
           this.stopRate = stopRate;
           this.minimumStops = minimumStops;
           this.distanceRate = distanceRate;
           this.minimumDistance = minimumDistance;
           this.pieceRate = pieceRate;
           this.minimumPieces = minimumPieces;
           this.fixedCost = fixedCost;
    }


    /**
     * Gets the regularRate value for this DriverCostInfo.
     * 
     * @return regularRate
     */
    public double getRegularRate() {
        return regularRate;
    }


    /**
     * Sets the regularRate value for this DriverCostInfo.
     * 
     * @param regularRate
     */
    public void setRegularRate(double regularRate) {
        this.regularRate = regularRate;
    }


    /**
     * Gets the overtimeRate value for this DriverCostInfo.
     * 
     * @return overtimeRate
     */
    public double getOvertimeRate() {
        return overtimeRate;
    }


    /**
     * Sets the overtimeRate value for this DriverCostInfo.
     * 
     * @param overtimeRate
     */
    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }


    /**
     * Gets the minimumTime value for this DriverCostInfo.
     * 
     * @return minimumTime
     */
    public int getMinimumTime() {
        return minimumTime;
    }


    /**
     * Sets the minimumTime value for this DriverCostInfo.
     * 
     * @param minimumTime
     */
    public void setMinimumTime(int minimumTime) {
        this.minimumTime = minimumTime;
    }


    /**
     * Gets the overtimeHoursBegin value for this DriverCostInfo.
     * 
     * @return overtimeHoursBegin
     */
    public int getOvertimeHoursBegin() {
        return overtimeHoursBegin;
    }


    /**
     * Sets the overtimeHoursBegin value for this DriverCostInfo.
     * 
     * @param overtimeHoursBegin
     */
    public void setOvertimeHoursBegin(int overtimeHoursBegin) {
        this.overtimeHoursBegin = overtimeHoursBegin;
    }


    /**
     * Gets the stopRate value for this DriverCostInfo.
     * 
     * @return stopRate
     */
    public double getStopRate() {
        return stopRate;
    }


    /**
     * Sets the stopRate value for this DriverCostInfo.
     * 
     * @param stopRate
     */
    public void setStopRate(double stopRate) {
        this.stopRate = stopRate;
    }


    /**
     * Gets the minimumStops value for this DriverCostInfo.
     * 
     * @return minimumStops
     */
    public double getMinimumStops() {
        return minimumStops;
    }


    /**
     * Sets the minimumStops value for this DriverCostInfo.
     * 
     * @param minimumStops
     */
    public void setMinimumStops(double minimumStops) {
        this.minimumStops = minimumStops;
    }


    /**
     * Gets the distanceRate value for this DriverCostInfo.
     * 
     * @return distanceRate
     */
    public double getDistanceRate() {
        return distanceRate;
    }


    /**
     * Sets the distanceRate value for this DriverCostInfo.
     * 
     * @param distanceRate
     */
    public void setDistanceRate(double distanceRate) {
        this.distanceRate = distanceRate;
    }


    /**
     * Gets the minimumDistance value for this DriverCostInfo.
     * 
     * @return minimumDistance
     */
    public double getMinimumDistance() {
        return minimumDistance;
    }


    /**
     * Sets the minimumDistance value for this DriverCostInfo.
     * 
     * @param minimumDistance
     */
    public void setMinimumDistance(double minimumDistance) {
        this.minimumDistance = minimumDistance;
    }


    /**
     * Gets the pieceRate value for this DriverCostInfo.
     * 
     * @return pieceRate
     */
    public double getPieceRate() {
        return pieceRate;
    }


    /**
     * Sets the pieceRate value for this DriverCostInfo.
     * 
     * @param pieceRate
     */
    public void setPieceRate(double pieceRate) {
        this.pieceRate = pieceRate;
    }


    /**
     * Gets the minimumPieces value for this DriverCostInfo.
     * 
     * @return minimumPieces
     */
    public double getMinimumPieces() {
        return minimumPieces;
    }


    /**
     * Sets the minimumPieces value for this DriverCostInfo.
     * 
     * @param minimumPieces
     */
    public void setMinimumPieces(double minimumPieces) {
        this.minimumPieces = minimumPieces;
    }


    /**
     * Gets the fixedCost value for this DriverCostInfo.
     * 
     * @return fixedCost
     */
    public double getFixedCost() {
        return fixedCost;
    }


    /**
     * Sets the fixedCost value for this DriverCostInfo.
     * 
     * @param fixedCost
     */
    public void setFixedCost(double fixedCost) {
        this.fixedCost = fixedCost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DriverCostInfo)) return false;
        DriverCostInfo other = (DriverCostInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.regularRate == other.getRegularRate() &&
            this.overtimeRate == other.getOvertimeRate() &&
            this.minimumTime == other.getMinimumTime() &&
            this.overtimeHoursBegin == other.getOvertimeHoursBegin() &&
            this.stopRate == other.getStopRate() &&
            this.minimumStops == other.getMinimumStops() &&
            this.distanceRate == other.getDistanceRate() &&
            this.minimumDistance == other.getMinimumDistance() &&
            this.pieceRate == other.getPieceRate() &&
            this.minimumPieces == other.getMinimumPieces() &&
            this.fixedCost == other.getFixedCost();
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
        _hashCode += new Double(getRegularRate()).hashCode();
        _hashCode += new Double(getOvertimeRate()).hashCode();
        _hashCode += getMinimumTime();
        _hashCode += getOvertimeHoursBegin();
        _hashCode += new Double(getStopRate()).hashCode();
        _hashCode += new Double(getMinimumStops()).hashCode();
        _hashCode += new Double(getDistanceRate()).hashCode();
        _hashCode += new Double(getMinimumDistance()).hashCode();
        _hashCode += new Double(getPieceRate()).hashCode();
        _hashCode += new Double(getMinimumPieces()).hashCode();
        _hashCode += new Double(getFixedCost()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DriverCostInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DriverCostInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regularRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "regularRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overtimeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "overtimeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "minimumTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overtimeHoursBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "overtimeHoursBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumStops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "minimumStops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanceRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "distanceRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "minimumDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieceRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "pieceRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumPieces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "minimumPieces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "fixedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
