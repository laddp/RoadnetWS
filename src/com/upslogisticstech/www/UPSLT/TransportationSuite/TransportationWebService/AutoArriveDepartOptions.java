/**
 * AutoArriveDepartOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class AutoArriveDepartOptions  implements java.io.Serializable {
    private boolean autoArriveDepartEnabled;

    private int algoPresetType;

    private boolean autoCancelStops;

    private boolean autoDepartOrigin;

    private boolean autoArriveDestination;

    private boolean useMinServiceTimeForDestination;

    private boolean pushBreaksLayovers;

    private boolean autoSequenceStops;

    private int resequenceMethod;

    private boolean useGPSDeviceSpeed;

    private double minimumTranistSpeed;

    private int minimumRouteDurationSeconds;

    private int minimumServiceTimeSeconds;

    public AutoArriveDepartOptions() {
    }

    public AutoArriveDepartOptions(
           boolean autoArriveDepartEnabled,
           int algoPresetType,
           boolean autoCancelStops,
           boolean autoDepartOrigin,
           boolean autoArriveDestination,
           boolean useMinServiceTimeForDestination,
           boolean pushBreaksLayovers,
           boolean autoSequenceStops,
           int resequenceMethod,
           boolean useGPSDeviceSpeed,
           double minimumTranistSpeed,
           int minimumRouteDurationSeconds,
           int minimumServiceTimeSeconds) {
           this.autoArriveDepartEnabled = autoArriveDepartEnabled;
           this.algoPresetType = algoPresetType;
           this.autoCancelStops = autoCancelStops;
           this.autoDepartOrigin = autoDepartOrigin;
           this.autoArriveDestination = autoArriveDestination;
           this.useMinServiceTimeForDestination = useMinServiceTimeForDestination;
           this.pushBreaksLayovers = pushBreaksLayovers;
           this.autoSequenceStops = autoSequenceStops;
           this.resequenceMethod = resequenceMethod;
           this.useGPSDeviceSpeed = useGPSDeviceSpeed;
           this.minimumTranistSpeed = minimumTranistSpeed;
           this.minimumRouteDurationSeconds = minimumRouteDurationSeconds;
           this.minimumServiceTimeSeconds = minimumServiceTimeSeconds;
    }


    /**
     * Gets the autoArriveDepartEnabled value for this AutoArriveDepartOptions.
     * 
     * @return autoArriveDepartEnabled
     */
    public boolean isAutoArriveDepartEnabled() {
        return autoArriveDepartEnabled;
    }


    /**
     * Sets the autoArriveDepartEnabled value for this AutoArriveDepartOptions.
     * 
     * @param autoArriveDepartEnabled
     */
    public void setAutoArriveDepartEnabled(boolean autoArriveDepartEnabled) {
        this.autoArriveDepartEnabled = autoArriveDepartEnabled;
    }


    /**
     * Gets the algoPresetType value for this AutoArriveDepartOptions.
     * 
     * @return algoPresetType
     */
    public int getAlgoPresetType() {
        return algoPresetType;
    }


    /**
     * Sets the algoPresetType value for this AutoArriveDepartOptions.
     * 
     * @param algoPresetType
     */
    public void setAlgoPresetType(int algoPresetType) {
        this.algoPresetType = algoPresetType;
    }


    /**
     * Gets the autoCancelStops value for this AutoArriveDepartOptions.
     * 
     * @return autoCancelStops
     */
    public boolean isAutoCancelStops() {
        return autoCancelStops;
    }


    /**
     * Sets the autoCancelStops value for this AutoArriveDepartOptions.
     * 
     * @param autoCancelStops
     */
    public void setAutoCancelStops(boolean autoCancelStops) {
        this.autoCancelStops = autoCancelStops;
    }


    /**
     * Gets the autoDepartOrigin value for this AutoArriveDepartOptions.
     * 
     * @return autoDepartOrigin
     */
    public boolean isAutoDepartOrigin() {
        return autoDepartOrigin;
    }


    /**
     * Sets the autoDepartOrigin value for this AutoArriveDepartOptions.
     * 
     * @param autoDepartOrigin
     */
    public void setAutoDepartOrigin(boolean autoDepartOrigin) {
        this.autoDepartOrigin = autoDepartOrigin;
    }


    /**
     * Gets the autoArriveDestination value for this AutoArriveDepartOptions.
     * 
     * @return autoArriveDestination
     */
    public boolean isAutoArriveDestination() {
        return autoArriveDestination;
    }


    /**
     * Sets the autoArriveDestination value for this AutoArriveDepartOptions.
     * 
     * @param autoArriveDestination
     */
    public void setAutoArriveDestination(boolean autoArriveDestination) {
        this.autoArriveDestination = autoArriveDestination;
    }


    /**
     * Gets the useMinServiceTimeForDestination value for this AutoArriveDepartOptions.
     * 
     * @return useMinServiceTimeForDestination
     */
    public boolean isUseMinServiceTimeForDestination() {
        return useMinServiceTimeForDestination;
    }


    /**
     * Sets the useMinServiceTimeForDestination value for this AutoArriveDepartOptions.
     * 
     * @param useMinServiceTimeForDestination
     */
    public void setUseMinServiceTimeForDestination(boolean useMinServiceTimeForDestination) {
        this.useMinServiceTimeForDestination = useMinServiceTimeForDestination;
    }


    /**
     * Gets the pushBreaksLayovers value for this AutoArriveDepartOptions.
     * 
     * @return pushBreaksLayovers
     */
    public boolean isPushBreaksLayovers() {
        return pushBreaksLayovers;
    }


    /**
     * Sets the pushBreaksLayovers value for this AutoArriveDepartOptions.
     * 
     * @param pushBreaksLayovers
     */
    public void setPushBreaksLayovers(boolean pushBreaksLayovers) {
        this.pushBreaksLayovers = pushBreaksLayovers;
    }


    /**
     * Gets the autoSequenceStops value for this AutoArriveDepartOptions.
     * 
     * @return autoSequenceStops
     */
    public boolean isAutoSequenceStops() {
        return autoSequenceStops;
    }


    /**
     * Sets the autoSequenceStops value for this AutoArriveDepartOptions.
     * 
     * @param autoSequenceStops
     */
    public void setAutoSequenceStops(boolean autoSequenceStops) {
        this.autoSequenceStops = autoSequenceStops;
    }


    /**
     * Gets the resequenceMethod value for this AutoArriveDepartOptions.
     * 
     * @return resequenceMethod
     */
    public int getResequenceMethod() {
        return resequenceMethod;
    }


    /**
     * Sets the resequenceMethod value for this AutoArriveDepartOptions.
     * 
     * @param resequenceMethod
     */
    public void setResequenceMethod(int resequenceMethod) {
        this.resequenceMethod = resequenceMethod;
    }


    /**
     * Gets the useGPSDeviceSpeed value for this AutoArriveDepartOptions.
     * 
     * @return useGPSDeviceSpeed
     */
    public boolean isUseGPSDeviceSpeed() {
        return useGPSDeviceSpeed;
    }


    /**
     * Sets the useGPSDeviceSpeed value for this AutoArriveDepartOptions.
     * 
     * @param useGPSDeviceSpeed
     */
    public void setUseGPSDeviceSpeed(boolean useGPSDeviceSpeed) {
        this.useGPSDeviceSpeed = useGPSDeviceSpeed;
    }


    /**
     * Gets the minimumTranistSpeed value for this AutoArriveDepartOptions.
     * 
     * @return minimumTranistSpeed
     */
    public double getMinimumTranistSpeed() {
        return minimumTranistSpeed;
    }


    /**
     * Sets the minimumTranistSpeed value for this AutoArriveDepartOptions.
     * 
     * @param minimumTranistSpeed
     */
    public void setMinimumTranistSpeed(double minimumTranistSpeed) {
        this.minimumTranistSpeed = minimumTranistSpeed;
    }


    /**
     * Gets the minimumRouteDurationSeconds value for this AutoArriveDepartOptions.
     * 
     * @return minimumRouteDurationSeconds
     */
    public int getMinimumRouteDurationSeconds() {
        return minimumRouteDurationSeconds;
    }


    /**
     * Sets the minimumRouteDurationSeconds value for this AutoArriveDepartOptions.
     * 
     * @param minimumRouteDurationSeconds
     */
    public void setMinimumRouteDurationSeconds(int minimumRouteDurationSeconds) {
        this.minimumRouteDurationSeconds = minimumRouteDurationSeconds;
    }


    /**
     * Gets the minimumServiceTimeSeconds value for this AutoArriveDepartOptions.
     * 
     * @return minimumServiceTimeSeconds
     */
    public int getMinimumServiceTimeSeconds() {
        return minimumServiceTimeSeconds;
    }


    /**
     * Sets the minimumServiceTimeSeconds value for this AutoArriveDepartOptions.
     * 
     * @param minimumServiceTimeSeconds
     */
    public void setMinimumServiceTimeSeconds(int minimumServiceTimeSeconds) {
        this.minimumServiceTimeSeconds = minimumServiceTimeSeconds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoArriveDepartOptions)) return false;
        AutoArriveDepartOptions other = (AutoArriveDepartOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.autoArriveDepartEnabled == other.isAutoArriveDepartEnabled() &&
            this.algoPresetType == other.getAlgoPresetType() &&
            this.autoCancelStops == other.isAutoCancelStops() &&
            this.autoDepartOrigin == other.isAutoDepartOrigin() &&
            this.autoArriveDestination == other.isAutoArriveDestination() &&
            this.useMinServiceTimeForDestination == other.isUseMinServiceTimeForDestination() &&
            this.pushBreaksLayovers == other.isPushBreaksLayovers() &&
            this.autoSequenceStops == other.isAutoSequenceStops() &&
            this.resequenceMethod == other.getResequenceMethod() &&
            this.useGPSDeviceSpeed == other.isUseGPSDeviceSpeed() &&
            this.minimumTranistSpeed == other.getMinimumTranistSpeed() &&
            this.minimumRouteDurationSeconds == other.getMinimumRouteDurationSeconds() &&
            this.minimumServiceTimeSeconds == other.getMinimumServiceTimeSeconds();
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
        _hashCode += (isAutoArriveDepartEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getAlgoPresetType();
        _hashCode += (isAutoCancelStops() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAutoDepartOrigin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAutoArriveDestination() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUseMinServiceTimeForDestination() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPushBreaksLayovers() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAutoSequenceStops() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getResequenceMethod();
        _hashCode += (isUseGPSDeviceSpeed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getMinimumTranistSpeed()).hashCode();
        _hashCode += getMinimumRouteDurationSeconds();
        _hashCode += getMinimumServiceTimeSeconds();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoArriveDepartOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "AutoArriveDepartOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoArriveDepartEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "autoArriveDepartEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("algoPresetType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "algoPresetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCancelStops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "autoCancelStops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoDepartOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "autoDepartOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoArriveDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "autoArriveDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMinServiceTimeForDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "useMinServiceTimeForDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushBreaksLayovers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "pushBreaksLayovers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoSequenceStops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "autoSequenceStops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resequenceMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "resequenceMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useGPSDeviceSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "useGPSDeviceSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumTranistSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "minimumTranistSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumRouteDurationSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "minimumRouteDurationSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumServiceTimeSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "minimumServiceTimeSeconds"));
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
