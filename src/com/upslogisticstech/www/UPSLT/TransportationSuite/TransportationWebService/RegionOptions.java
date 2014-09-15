/**
 * RegionOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class RegionOptions  implements java.io.Serializable {
    private java.lang.String size1Alias;

    private java.lang.String size2Alias;

    private java.lang.String size3Alias;

    private java.lang.String locationUserDefinedField1Alias;

    private java.lang.String locationUserDefinedField2Alias;

    private java.lang.String locationUserDefinedField3Alias;

    private java.lang.String routeUserDefinedField1Alias;

    private java.lang.String routeUserDefinedField2Alias;

    private java.lang.String routeUserDefinedField3Alias;

    private java.lang.String stopUserDefinedField1Alias;

    private java.lang.String stopUserDefinedField2Alias;

    private java.lang.String stopUserDefinedField3Alias;

    private java.lang.String orderUserDefinedField1Alias;

    private java.lang.String orderUserDefinedField2Alias;

    private java.lang.String orderUserDefinedField3Alias;

    private java.lang.String lineItemUserDefinedField1Alias;

    private java.lang.String lineItemUserDefinedField2Alias;

    private java.lang.String lineItemUserDefinedField3Alias;

    private int size1Precision;

    private int size2Precision;

    private int size3Precision;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnitDistance unitOfDistance;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DetailLevel detailLevel;

    private boolean ratioMode;

    private boolean allowAdditionalStopTypes;

    private boolean validateQuantities;

    private boolean verifyByException;

    private boolean deliveryReasonCodeRequired;

    private boolean pickupReasonCodeRequired;

    private boolean overReasonCodeRequired;

    private boolean shortReasonCodeRequired;

    private boolean damagedReasonCodeRequired;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuantityReference costQuantityReference;

    private int stopCriticalMinutes;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CarbonComputationMethod carbonComputationMethod;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CarbonDisplayUnits carbonDisplayUnits;

    public RegionOptions() {
    }

    public RegionOptions(
           java.lang.String size1Alias,
           java.lang.String size2Alias,
           java.lang.String size3Alias,
           java.lang.String locationUserDefinedField1Alias,
           java.lang.String locationUserDefinedField2Alias,
           java.lang.String locationUserDefinedField3Alias,
           java.lang.String routeUserDefinedField1Alias,
           java.lang.String routeUserDefinedField2Alias,
           java.lang.String routeUserDefinedField3Alias,
           java.lang.String stopUserDefinedField1Alias,
           java.lang.String stopUserDefinedField2Alias,
           java.lang.String stopUserDefinedField3Alias,
           java.lang.String orderUserDefinedField1Alias,
           java.lang.String orderUserDefinedField2Alias,
           java.lang.String orderUserDefinedField3Alias,
           java.lang.String lineItemUserDefinedField1Alias,
           java.lang.String lineItemUserDefinedField2Alias,
           java.lang.String lineItemUserDefinedField3Alias,
           int size1Precision,
           int size2Precision,
           int size3Precision,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnitDistance unitOfDistance,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DetailLevel detailLevel,
           boolean ratioMode,
           boolean allowAdditionalStopTypes,
           boolean validateQuantities,
           boolean verifyByException,
           boolean deliveryReasonCodeRequired,
           boolean pickupReasonCodeRequired,
           boolean overReasonCodeRequired,
           boolean shortReasonCodeRequired,
           boolean damagedReasonCodeRequired,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuantityReference costQuantityReference,
           int stopCriticalMinutes,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CarbonComputationMethod carbonComputationMethod,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CarbonDisplayUnits carbonDisplayUnits) {
           this.size1Alias = size1Alias;
           this.size2Alias = size2Alias;
           this.size3Alias = size3Alias;
           this.locationUserDefinedField1Alias = locationUserDefinedField1Alias;
           this.locationUserDefinedField2Alias = locationUserDefinedField2Alias;
           this.locationUserDefinedField3Alias = locationUserDefinedField3Alias;
           this.routeUserDefinedField1Alias = routeUserDefinedField1Alias;
           this.routeUserDefinedField2Alias = routeUserDefinedField2Alias;
           this.routeUserDefinedField3Alias = routeUserDefinedField3Alias;
           this.stopUserDefinedField1Alias = stopUserDefinedField1Alias;
           this.stopUserDefinedField2Alias = stopUserDefinedField2Alias;
           this.stopUserDefinedField3Alias = stopUserDefinedField3Alias;
           this.orderUserDefinedField1Alias = orderUserDefinedField1Alias;
           this.orderUserDefinedField2Alias = orderUserDefinedField2Alias;
           this.orderUserDefinedField3Alias = orderUserDefinedField3Alias;
           this.lineItemUserDefinedField1Alias = lineItemUserDefinedField1Alias;
           this.lineItemUserDefinedField2Alias = lineItemUserDefinedField2Alias;
           this.lineItemUserDefinedField3Alias = lineItemUserDefinedField3Alias;
           this.size1Precision = size1Precision;
           this.size2Precision = size2Precision;
           this.size3Precision = size3Precision;
           this.unitOfDistance = unitOfDistance;
           this.detailLevel = detailLevel;
           this.ratioMode = ratioMode;
           this.allowAdditionalStopTypes = allowAdditionalStopTypes;
           this.validateQuantities = validateQuantities;
           this.verifyByException = verifyByException;
           this.deliveryReasonCodeRequired = deliveryReasonCodeRequired;
           this.pickupReasonCodeRequired = pickupReasonCodeRequired;
           this.overReasonCodeRequired = overReasonCodeRequired;
           this.shortReasonCodeRequired = shortReasonCodeRequired;
           this.damagedReasonCodeRequired = damagedReasonCodeRequired;
           this.costQuantityReference = costQuantityReference;
           this.stopCriticalMinutes = stopCriticalMinutes;
           this.carbonComputationMethod = carbonComputationMethod;
           this.carbonDisplayUnits = carbonDisplayUnits;
    }


    /**
     * Gets the size1Alias value for this RegionOptions.
     * 
     * @return size1Alias
     */
    public java.lang.String getSize1Alias() {
        return size1Alias;
    }


    /**
     * Sets the size1Alias value for this RegionOptions.
     * 
     * @param size1Alias
     */
    public void setSize1Alias(java.lang.String size1Alias) {
        this.size1Alias = size1Alias;
    }


    /**
     * Gets the size2Alias value for this RegionOptions.
     * 
     * @return size2Alias
     */
    public java.lang.String getSize2Alias() {
        return size2Alias;
    }


    /**
     * Sets the size2Alias value for this RegionOptions.
     * 
     * @param size2Alias
     */
    public void setSize2Alias(java.lang.String size2Alias) {
        this.size2Alias = size2Alias;
    }


    /**
     * Gets the size3Alias value for this RegionOptions.
     * 
     * @return size3Alias
     */
    public java.lang.String getSize3Alias() {
        return size3Alias;
    }


    /**
     * Sets the size3Alias value for this RegionOptions.
     * 
     * @param size3Alias
     */
    public void setSize3Alias(java.lang.String size3Alias) {
        this.size3Alias = size3Alias;
    }


    /**
     * Gets the locationUserDefinedField1Alias value for this RegionOptions.
     * 
     * @return locationUserDefinedField1Alias
     */
    public java.lang.String getLocationUserDefinedField1Alias() {
        return locationUserDefinedField1Alias;
    }


    /**
     * Sets the locationUserDefinedField1Alias value for this RegionOptions.
     * 
     * @param locationUserDefinedField1Alias
     */
    public void setLocationUserDefinedField1Alias(java.lang.String locationUserDefinedField1Alias) {
        this.locationUserDefinedField1Alias = locationUserDefinedField1Alias;
    }


    /**
     * Gets the locationUserDefinedField2Alias value for this RegionOptions.
     * 
     * @return locationUserDefinedField2Alias
     */
    public java.lang.String getLocationUserDefinedField2Alias() {
        return locationUserDefinedField2Alias;
    }


    /**
     * Sets the locationUserDefinedField2Alias value for this RegionOptions.
     * 
     * @param locationUserDefinedField2Alias
     */
    public void setLocationUserDefinedField2Alias(java.lang.String locationUserDefinedField2Alias) {
        this.locationUserDefinedField2Alias = locationUserDefinedField2Alias;
    }


    /**
     * Gets the locationUserDefinedField3Alias value for this RegionOptions.
     * 
     * @return locationUserDefinedField3Alias
     */
    public java.lang.String getLocationUserDefinedField3Alias() {
        return locationUserDefinedField3Alias;
    }


    /**
     * Sets the locationUserDefinedField3Alias value for this RegionOptions.
     * 
     * @param locationUserDefinedField3Alias
     */
    public void setLocationUserDefinedField3Alias(java.lang.String locationUserDefinedField3Alias) {
        this.locationUserDefinedField3Alias = locationUserDefinedField3Alias;
    }


    /**
     * Gets the routeUserDefinedField1Alias value for this RegionOptions.
     * 
     * @return routeUserDefinedField1Alias
     */
    public java.lang.String getRouteUserDefinedField1Alias() {
        return routeUserDefinedField1Alias;
    }


    /**
     * Sets the routeUserDefinedField1Alias value for this RegionOptions.
     * 
     * @param routeUserDefinedField1Alias
     */
    public void setRouteUserDefinedField1Alias(java.lang.String routeUserDefinedField1Alias) {
        this.routeUserDefinedField1Alias = routeUserDefinedField1Alias;
    }


    /**
     * Gets the routeUserDefinedField2Alias value for this RegionOptions.
     * 
     * @return routeUserDefinedField2Alias
     */
    public java.lang.String getRouteUserDefinedField2Alias() {
        return routeUserDefinedField2Alias;
    }


    /**
     * Sets the routeUserDefinedField2Alias value for this RegionOptions.
     * 
     * @param routeUserDefinedField2Alias
     */
    public void setRouteUserDefinedField2Alias(java.lang.String routeUserDefinedField2Alias) {
        this.routeUserDefinedField2Alias = routeUserDefinedField2Alias;
    }


    /**
     * Gets the routeUserDefinedField3Alias value for this RegionOptions.
     * 
     * @return routeUserDefinedField3Alias
     */
    public java.lang.String getRouteUserDefinedField3Alias() {
        return routeUserDefinedField3Alias;
    }


    /**
     * Sets the routeUserDefinedField3Alias value for this RegionOptions.
     * 
     * @param routeUserDefinedField3Alias
     */
    public void setRouteUserDefinedField3Alias(java.lang.String routeUserDefinedField3Alias) {
        this.routeUserDefinedField3Alias = routeUserDefinedField3Alias;
    }


    /**
     * Gets the stopUserDefinedField1Alias value for this RegionOptions.
     * 
     * @return stopUserDefinedField1Alias
     */
    public java.lang.String getStopUserDefinedField1Alias() {
        return stopUserDefinedField1Alias;
    }


    /**
     * Sets the stopUserDefinedField1Alias value for this RegionOptions.
     * 
     * @param stopUserDefinedField1Alias
     */
    public void setStopUserDefinedField1Alias(java.lang.String stopUserDefinedField1Alias) {
        this.stopUserDefinedField1Alias = stopUserDefinedField1Alias;
    }


    /**
     * Gets the stopUserDefinedField2Alias value for this RegionOptions.
     * 
     * @return stopUserDefinedField2Alias
     */
    public java.lang.String getStopUserDefinedField2Alias() {
        return stopUserDefinedField2Alias;
    }


    /**
     * Sets the stopUserDefinedField2Alias value for this RegionOptions.
     * 
     * @param stopUserDefinedField2Alias
     */
    public void setStopUserDefinedField2Alias(java.lang.String stopUserDefinedField2Alias) {
        this.stopUserDefinedField2Alias = stopUserDefinedField2Alias;
    }


    /**
     * Gets the stopUserDefinedField3Alias value for this RegionOptions.
     * 
     * @return stopUserDefinedField3Alias
     */
    public java.lang.String getStopUserDefinedField3Alias() {
        return stopUserDefinedField3Alias;
    }


    /**
     * Sets the stopUserDefinedField3Alias value for this RegionOptions.
     * 
     * @param stopUserDefinedField3Alias
     */
    public void setStopUserDefinedField3Alias(java.lang.String stopUserDefinedField3Alias) {
        this.stopUserDefinedField3Alias = stopUserDefinedField3Alias;
    }


    /**
     * Gets the orderUserDefinedField1Alias value for this RegionOptions.
     * 
     * @return orderUserDefinedField1Alias
     */
    public java.lang.String getOrderUserDefinedField1Alias() {
        return orderUserDefinedField1Alias;
    }


    /**
     * Sets the orderUserDefinedField1Alias value for this RegionOptions.
     * 
     * @param orderUserDefinedField1Alias
     */
    public void setOrderUserDefinedField1Alias(java.lang.String orderUserDefinedField1Alias) {
        this.orderUserDefinedField1Alias = orderUserDefinedField1Alias;
    }


    /**
     * Gets the orderUserDefinedField2Alias value for this RegionOptions.
     * 
     * @return orderUserDefinedField2Alias
     */
    public java.lang.String getOrderUserDefinedField2Alias() {
        return orderUserDefinedField2Alias;
    }


    /**
     * Sets the orderUserDefinedField2Alias value for this RegionOptions.
     * 
     * @param orderUserDefinedField2Alias
     */
    public void setOrderUserDefinedField2Alias(java.lang.String orderUserDefinedField2Alias) {
        this.orderUserDefinedField2Alias = orderUserDefinedField2Alias;
    }


    /**
     * Gets the orderUserDefinedField3Alias value for this RegionOptions.
     * 
     * @return orderUserDefinedField3Alias
     */
    public java.lang.String getOrderUserDefinedField3Alias() {
        return orderUserDefinedField3Alias;
    }


    /**
     * Sets the orderUserDefinedField3Alias value for this RegionOptions.
     * 
     * @param orderUserDefinedField3Alias
     */
    public void setOrderUserDefinedField3Alias(java.lang.String orderUserDefinedField3Alias) {
        this.orderUserDefinedField3Alias = orderUserDefinedField3Alias;
    }


    /**
     * Gets the lineItemUserDefinedField1Alias value for this RegionOptions.
     * 
     * @return lineItemUserDefinedField1Alias
     */
    public java.lang.String getLineItemUserDefinedField1Alias() {
        return lineItemUserDefinedField1Alias;
    }


    /**
     * Sets the lineItemUserDefinedField1Alias value for this RegionOptions.
     * 
     * @param lineItemUserDefinedField1Alias
     */
    public void setLineItemUserDefinedField1Alias(java.lang.String lineItemUserDefinedField1Alias) {
        this.lineItemUserDefinedField1Alias = lineItemUserDefinedField1Alias;
    }


    /**
     * Gets the lineItemUserDefinedField2Alias value for this RegionOptions.
     * 
     * @return lineItemUserDefinedField2Alias
     */
    public java.lang.String getLineItemUserDefinedField2Alias() {
        return lineItemUserDefinedField2Alias;
    }


    /**
     * Sets the lineItemUserDefinedField2Alias value for this RegionOptions.
     * 
     * @param lineItemUserDefinedField2Alias
     */
    public void setLineItemUserDefinedField2Alias(java.lang.String lineItemUserDefinedField2Alias) {
        this.lineItemUserDefinedField2Alias = lineItemUserDefinedField2Alias;
    }


    /**
     * Gets the lineItemUserDefinedField3Alias value for this RegionOptions.
     * 
     * @return lineItemUserDefinedField3Alias
     */
    public java.lang.String getLineItemUserDefinedField3Alias() {
        return lineItemUserDefinedField3Alias;
    }


    /**
     * Sets the lineItemUserDefinedField3Alias value for this RegionOptions.
     * 
     * @param lineItemUserDefinedField3Alias
     */
    public void setLineItemUserDefinedField3Alias(java.lang.String lineItemUserDefinedField3Alias) {
        this.lineItemUserDefinedField3Alias = lineItemUserDefinedField3Alias;
    }


    /**
     * Gets the size1Precision value for this RegionOptions.
     * 
     * @return size1Precision
     */
    public int getSize1Precision() {
        return size1Precision;
    }


    /**
     * Sets the size1Precision value for this RegionOptions.
     * 
     * @param size1Precision
     */
    public void setSize1Precision(int size1Precision) {
        this.size1Precision = size1Precision;
    }


    /**
     * Gets the size2Precision value for this RegionOptions.
     * 
     * @return size2Precision
     */
    public int getSize2Precision() {
        return size2Precision;
    }


    /**
     * Sets the size2Precision value for this RegionOptions.
     * 
     * @param size2Precision
     */
    public void setSize2Precision(int size2Precision) {
        this.size2Precision = size2Precision;
    }


    /**
     * Gets the size3Precision value for this RegionOptions.
     * 
     * @return size3Precision
     */
    public int getSize3Precision() {
        return size3Precision;
    }


    /**
     * Sets the size3Precision value for this RegionOptions.
     * 
     * @param size3Precision
     */
    public void setSize3Precision(int size3Precision) {
        this.size3Precision = size3Precision;
    }


    /**
     * Gets the unitOfDistance value for this RegionOptions.
     * 
     * @return unitOfDistance
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnitDistance getUnitOfDistance() {
        return unitOfDistance;
    }


    /**
     * Sets the unitOfDistance value for this RegionOptions.
     * 
     * @param unitOfDistance
     */
    public void setUnitOfDistance(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.UnitDistance unitOfDistance) {
        this.unitOfDistance = unitOfDistance;
    }


    /**
     * Gets the detailLevel value for this RegionOptions.
     * 
     * @return detailLevel
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DetailLevel getDetailLevel() {
        return detailLevel;
    }


    /**
     * Sets the detailLevel value for this RegionOptions.
     * 
     * @param detailLevel
     */
    public void setDetailLevel(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DetailLevel detailLevel) {
        this.detailLevel = detailLevel;
    }


    /**
     * Gets the ratioMode value for this RegionOptions.
     * 
     * @return ratioMode
     */
    public boolean isRatioMode() {
        return ratioMode;
    }


    /**
     * Sets the ratioMode value for this RegionOptions.
     * 
     * @param ratioMode
     */
    public void setRatioMode(boolean ratioMode) {
        this.ratioMode = ratioMode;
    }


    /**
     * Gets the allowAdditionalStopTypes value for this RegionOptions.
     * 
     * @return allowAdditionalStopTypes
     */
    public boolean isAllowAdditionalStopTypes() {
        return allowAdditionalStopTypes;
    }


    /**
     * Sets the allowAdditionalStopTypes value for this RegionOptions.
     * 
     * @param allowAdditionalStopTypes
     */
    public void setAllowAdditionalStopTypes(boolean allowAdditionalStopTypes) {
        this.allowAdditionalStopTypes = allowAdditionalStopTypes;
    }


    /**
     * Gets the validateQuantities value for this RegionOptions.
     * 
     * @return validateQuantities
     */
    public boolean isValidateQuantities() {
        return validateQuantities;
    }


    /**
     * Sets the validateQuantities value for this RegionOptions.
     * 
     * @param validateQuantities
     */
    public void setValidateQuantities(boolean validateQuantities) {
        this.validateQuantities = validateQuantities;
    }


    /**
     * Gets the verifyByException value for this RegionOptions.
     * 
     * @return verifyByException
     */
    public boolean isVerifyByException() {
        return verifyByException;
    }


    /**
     * Sets the verifyByException value for this RegionOptions.
     * 
     * @param verifyByException
     */
    public void setVerifyByException(boolean verifyByException) {
        this.verifyByException = verifyByException;
    }


    /**
     * Gets the deliveryReasonCodeRequired value for this RegionOptions.
     * 
     * @return deliveryReasonCodeRequired
     */
    public boolean isDeliveryReasonCodeRequired() {
        return deliveryReasonCodeRequired;
    }


    /**
     * Sets the deliveryReasonCodeRequired value for this RegionOptions.
     * 
     * @param deliveryReasonCodeRequired
     */
    public void setDeliveryReasonCodeRequired(boolean deliveryReasonCodeRequired) {
        this.deliveryReasonCodeRequired = deliveryReasonCodeRequired;
    }


    /**
     * Gets the pickupReasonCodeRequired value for this RegionOptions.
     * 
     * @return pickupReasonCodeRequired
     */
    public boolean isPickupReasonCodeRequired() {
        return pickupReasonCodeRequired;
    }


    /**
     * Sets the pickupReasonCodeRequired value for this RegionOptions.
     * 
     * @param pickupReasonCodeRequired
     */
    public void setPickupReasonCodeRequired(boolean pickupReasonCodeRequired) {
        this.pickupReasonCodeRequired = pickupReasonCodeRequired;
    }


    /**
     * Gets the overReasonCodeRequired value for this RegionOptions.
     * 
     * @return overReasonCodeRequired
     */
    public boolean isOverReasonCodeRequired() {
        return overReasonCodeRequired;
    }


    /**
     * Sets the overReasonCodeRequired value for this RegionOptions.
     * 
     * @param overReasonCodeRequired
     */
    public void setOverReasonCodeRequired(boolean overReasonCodeRequired) {
        this.overReasonCodeRequired = overReasonCodeRequired;
    }


    /**
     * Gets the shortReasonCodeRequired value for this RegionOptions.
     * 
     * @return shortReasonCodeRequired
     */
    public boolean isShortReasonCodeRequired() {
        return shortReasonCodeRequired;
    }


    /**
     * Sets the shortReasonCodeRequired value for this RegionOptions.
     * 
     * @param shortReasonCodeRequired
     */
    public void setShortReasonCodeRequired(boolean shortReasonCodeRequired) {
        this.shortReasonCodeRequired = shortReasonCodeRequired;
    }


    /**
     * Gets the damagedReasonCodeRequired value for this RegionOptions.
     * 
     * @return damagedReasonCodeRequired
     */
    public boolean isDamagedReasonCodeRequired() {
        return damagedReasonCodeRequired;
    }


    /**
     * Sets the damagedReasonCodeRequired value for this RegionOptions.
     * 
     * @param damagedReasonCodeRequired
     */
    public void setDamagedReasonCodeRequired(boolean damagedReasonCodeRequired) {
        this.damagedReasonCodeRequired = damagedReasonCodeRequired;
    }


    /**
     * Gets the costQuantityReference value for this RegionOptions.
     * 
     * @return costQuantityReference
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuantityReference getCostQuantityReference() {
        return costQuantityReference;
    }


    /**
     * Sets the costQuantityReference value for this RegionOptions.
     * 
     * @param costQuantityReference
     */
    public void setCostQuantityReference(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.QuantityReference costQuantityReference) {
        this.costQuantityReference = costQuantityReference;
    }


    /**
     * Gets the stopCriticalMinutes value for this RegionOptions.
     * 
     * @return stopCriticalMinutes
     */
    public int getStopCriticalMinutes() {
        return stopCriticalMinutes;
    }


    /**
     * Sets the stopCriticalMinutes value for this RegionOptions.
     * 
     * @param stopCriticalMinutes
     */
    public void setStopCriticalMinutes(int stopCriticalMinutes) {
        this.stopCriticalMinutes = stopCriticalMinutes;
    }


    /**
     * Gets the carbonComputationMethod value for this RegionOptions.
     * 
     * @return carbonComputationMethod
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CarbonComputationMethod getCarbonComputationMethod() {
        return carbonComputationMethod;
    }


    /**
     * Sets the carbonComputationMethod value for this RegionOptions.
     * 
     * @param carbonComputationMethod
     */
    public void setCarbonComputationMethod(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CarbonComputationMethod carbonComputationMethod) {
        this.carbonComputationMethod = carbonComputationMethod;
    }


    /**
     * Gets the carbonDisplayUnits value for this RegionOptions.
     * 
     * @return carbonDisplayUnits
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CarbonDisplayUnits getCarbonDisplayUnits() {
        return carbonDisplayUnits;
    }


    /**
     * Sets the carbonDisplayUnits value for this RegionOptions.
     * 
     * @param carbonDisplayUnits
     */
    public void setCarbonDisplayUnits(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.CarbonDisplayUnits carbonDisplayUnits) {
        this.carbonDisplayUnits = carbonDisplayUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionOptions)) return false;
        RegionOptions other = (RegionOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.size1Alias==null && other.getSize1Alias()==null) || 
             (this.size1Alias!=null &&
              this.size1Alias.equals(other.getSize1Alias()))) &&
            ((this.size2Alias==null && other.getSize2Alias()==null) || 
             (this.size2Alias!=null &&
              this.size2Alias.equals(other.getSize2Alias()))) &&
            ((this.size3Alias==null && other.getSize3Alias()==null) || 
             (this.size3Alias!=null &&
              this.size3Alias.equals(other.getSize3Alias()))) &&
            ((this.locationUserDefinedField1Alias==null && other.getLocationUserDefinedField1Alias()==null) || 
             (this.locationUserDefinedField1Alias!=null &&
              this.locationUserDefinedField1Alias.equals(other.getLocationUserDefinedField1Alias()))) &&
            ((this.locationUserDefinedField2Alias==null && other.getLocationUserDefinedField2Alias()==null) || 
             (this.locationUserDefinedField2Alias!=null &&
              this.locationUserDefinedField2Alias.equals(other.getLocationUserDefinedField2Alias()))) &&
            ((this.locationUserDefinedField3Alias==null && other.getLocationUserDefinedField3Alias()==null) || 
             (this.locationUserDefinedField3Alias!=null &&
              this.locationUserDefinedField3Alias.equals(other.getLocationUserDefinedField3Alias()))) &&
            ((this.routeUserDefinedField1Alias==null && other.getRouteUserDefinedField1Alias()==null) || 
             (this.routeUserDefinedField1Alias!=null &&
              this.routeUserDefinedField1Alias.equals(other.getRouteUserDefinedField1Alias()))) &&
            ((this.routeUserDefinedField2Alias==null && other.getRouteUserDefinedField2Alias()==null) || 
             (this.routeUserDefinedField2Alias!=null &&
              this.routeUserDefinedField2Alias.equals(other.getRouteUserDefinedField2Alias()))) &&
            ((this.routeUserDefinedField3Alias==null && other.getRouteUserDefinedField3Alias()==null) || 
             (this.routeUserDefinedField3Alias!=null &&
              this.routeUserDefinedField3Alias.equals(other.getRouteUserDefinedField3Alias()))) &&
            ((this.stopUserDefinedField1Alias==null && other.getStopUserDefinedField1Alias()==null) || 
             (this.stopUserDefinedField1Alias!=null &&
              this.stopUserDefinedField1Alias.equals(other.getStopUserDefinedField1Alias()))) &&
            ((this.stopUserDefinedField2Alias==null && other.getStopUserDefinedField2Alias()==null) || 
             (this.stopUserDefinedField2Alias!=null &&
              this.stopUserDefinedField2Alias.equals(other.getStopUserDefinedField2Alias()))) &&
            ((this.stopUserDefinedField3Alias==null && other.getStopUserDefinedField3Alias()==null) || 
             (this.stopUserDefinedField3Alias!=null &&
              this.stopUserDefinedField3Alias.equals(other.getStopUserDefinedField3Alias()))) &&
            ((this.orderUserDefinedField1Alias==null && other.getOrderUserDefinedField1Alias()==null) || 
             (this.orderUserDefinedField1Alias!=null &&
              this.orderUserDefinedField1Alias.equals(other.getOrderUserDefinedField1Alias()))) &&
            ((this.orderUserDefinedField2Alias==null && other.getOrderUserDefinedField2Alias()==null) || 
             (this.orderUserDefinedField2Alias!=null &&
              this.orderUserDefinedField2Alias.equals(other.getOrderUserDefinedField2Alias()))) &&
            ((this.orderUserDefinedField3Alias==null && other.getOrderUserDefinedField3Alias()==null) || 
             (this.orderUserDefinedField3Alias!=null &&
              this.orderUserDefinedField3Alias.equals(other.getOrderUserDefinedField3Alias()))) &&
            ((this.lineItemUserDefinedField1Alias==null && other.getLineItemUserDefinedField1Alias()==null) || 
             (this.lineItemUserDefinedField1Alias!=null &&
              this.lineItemUserDefinedField1Alias.equals(other.getLineItemUserDefinedField1Alias()))) &&
            ((this.lineItemUserDefinedField2Alias==null && other.getLineItemUserDefinedField2Alias()==null) || 
             (this.lineItemUserDefinedField2Alias!=null &&
              this.lineItemUserDefinedField2Alias.equals(other.getLineItemUserDefinedField2Alias()))) &&
            ((this.lineItemUserDefinedField3Alias==null && other.getLineItemUserDefinedField3Alias()==null) || 
             (this.lineItemUserDefinedField3Alias!=null &&
              this.lineItemUserDefinedField3Alias.equals(other.getLineItemUserDefinedField3Alias()))) &&
            this.size1Precision == other.getSize1Precision() &&
            this.size2Precision == other.getSize2Precision() &&
            this.size3Precision == other.getSize3Precision() &&
            ((this.unitOfDistance==null && other.getUnitOfDistance()==null) || 
             (this.unitOfDistance!=null &&
              this.unitOfDistance.equals(other.getUnitOfDistance()))) &&
            ((this.detailLevel==null && other.getDetailLevel()==null) || 
             (this.detailLevel!=null &&
              this.detailLevel.equals(other.getDetailLevel()))) &&
            this.ratioMode == other.isRatioMode() &&
            this.allowAdditionalStopTypes == other.isAllowAdditionalStopTypes() &&
            this.validateQuantities == other.isValidateQuantities() &&
            this.verifyByException == other.isVerifyByException() &&
            this.deliveryReasonCodeRequired == other.isDeliveryReasonCodeRequired() &&
            this.pickupReasonCodeRequired == other.isPickupReasonCodeRequired() &&
            this.overReasonCodeRequired == other.isOverReasonCodeRequired() &&
            this.shortReasonCodeRequired == other.isShortReasonCodeRequired() &&
            this.damagedReasonCodeRequired == other.isDamagedReasonCodeRequired() &&
            ((this.costQuantityReference==null && other.getCostQuantityReference()==null) || 
             (this.costQuantityReference!=null &&
              this.costQuantityReference.equals(other.getCostQuantityReference()))) &&
            this.stopCriticalMinutes == other.getStopCriticalMinutes() &&
            ((this.carbonComputationMethod==null && other.getCarbonComputationMethod()==null) || 
             (this.carbonComputationMethod!=null &&
              this.carbonComputationMethod.equals(other.getCarbonComputationMethod()))) &&
            ((this.carbonDisplayUnits==null && other.getCarbonDisplayUnits()==null) || 
             (this.carbonDisplayUnits!=null &&
              this.carbonDisplayUnits.equals(other.getCarbonDisplayUnits())));
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
        if (getSize1Alias() != null) {
            _hashCode += getSize1Alias().hashCode();
        }
        if (getSize2Alias() != null) {
            _hashCode += getSize2Alias().hashCode();
        }
        if (getSize3Alias() != null) {
            _hashCode += getSize3Alias().hashCode();
        }
        if (getLocationUserDefinedField1Alias() != null) {
            _hashCode += getLocationUserDefinedField1Alias().hashCode();
        }
        if (getLocationUserDefinedField2Alias() != null) {
            _hashCode += getLocationUserDefinedField2Alias().hashCode();
        }
        if (getLocationUserDefinedField3Alias() != null) {
            _hashCode += getLocationUserDefinedField3Alias().hashCode();
        }
        if (getRouteUserDefinedField1Alias() != null) {
            _hashCode += getRouteUserDefinedField1Alias().hashCode();
        }
        if (getRouteUserDefinedField2Alias() != null) {
            _hashCode += getRouteUserDefinedField2Alias().hashCode();
        }
        if (getRouteUserDefinedField3Alias() != null) {
            _hashCode += getRouteUserDefinedField3Alias().hashCode();
        }
        if (getStopUserDefinedField1Alias() != null) {
            _hashCode += getStopUserDefinedField1Alias().hashCode();
        }
        if (getStopUserDefinedField2Alias() != null) {
            _hashCode += getStopUserDefinedField2Alias().hashCode();
        }
        if (getStopUserDefinedField3Alias() != null) {
            _hashCode += getStopUserDefinedField3Alias().hashCode();
        }
        if (getOrderUserDefinedField1Alias() != null) {
            _hashCode += getOrderUserDefinedField1Alias().hashCode();
        }
        if (getOrderUserDefinedField2Alias() != null) {
            _hashCode += getOrderUserDefinedField2Alias().hashCode();
        }
        if (getOrderUserDefinedField3Alias() != null) {
            _hashCode += getOrderUserDefinedField3Alias().hashCode();
        }
        if (getLineItemUserDefinedField1Alias() != null) {
            _hashCode += getLineItemUserDefinedField1Alias().hashCode();
        }
        if (getLineItemUserDefinedField2Alias() != null) {
            _hashCode += getLineItemUserDefinedField2Alias().hashCode();
        }
        if (getLineItemUserDefinedField3Alias() != null) {
            _hashCode += getLineItemUserDefinedField3Alias().hashCode();
        }
        _hashCode += getSize1Precision();
        _hashCode += getSize2Precision();
        _hashCode += getSize3Precision();
        if (getUnitOfDistance() != null) {
            _hashCode += getUnitOfDistance().hashCode();
        }
        if (getDetailLevel() != null) {
            _hashCode += getDetailLevel().hashCode();
        }
        _hashCode += (isRatioMode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowAdditionalStopTypes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isValidateQuantities() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVerifyByException() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeliveryReasonCodeRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPickupReasonCodeRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOverReasonCodeRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShortReasonCodeRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDamagedReasonCodeRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCostQuantityReference() != null) {
            _hashCode += getCostQuantityReference().hashCode();
        }
        _hashCode += getStopCriticalMinutes();
        if (getCarbonComputationMethod() != null) {
            _hashCode += getCarbonComputationMethod().hashCode();
        }
        if (getCarbonDisplayUnits() != null) {
            _hashCode += getCarbonDisplayUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "RegionOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size1Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "size1Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size2Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "size2Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size3Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "size3Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationUserDefinedField1Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "locationUserDefinedField1Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationUserDefinedField2Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "locationUserDefinedField2Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationUserDefinedField3Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "locationUserDefinedField3Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeUserDefinedField1Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeUserDefinedField1Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeUserDefinedField2Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeUserDefinedField2Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeUserDefinedField3Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeUserDefinedField3Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopUserDefinedField1Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopUserDefinedField1Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopUserDefinedField2Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopUserDefinedField2Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopUserDefinedField3Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopUserDefinedField3Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderUserDefinedField1Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orderUserDefinedField1Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderUserDefinedField2Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orderUserDefinedField2Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderUserDefinedField3Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orderUserDefinedField3Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemUserDefinedField1Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "lineItemUserDefinedField1Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemUserDefinedField2Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "lineItemUserDefinedField2Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemUserDefinedField3Alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "lineItemUserDefinedField3Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size1Precision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "size1Precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size2Precision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "size2Precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size3Precision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "size3Precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "unitOfDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "UnitDistance"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "detailLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DetailLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratioMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ratioMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAdditionalStopTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "allowAdditionalStopTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "validateQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyByException");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "verifyByException"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryReasonCodeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "deliveryReasonCodeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupReasonCodeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "pickupReasonCodeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overReasonCodeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "overReasonCodeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortReasonCodeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "shortReasonCodeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("damagedReasonCodeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "damagedReasonCodeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costQuantityReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "costQuantityReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "QuantityReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopCriticalMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopCriticalMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carbonComputationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "carbonComputationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "CarbonComputationMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carbonDisplayUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "carbonDisplayUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "CarbonDisplayUnits"));
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
