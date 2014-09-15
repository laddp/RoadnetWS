/**
 * Stop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class Stop  implements java.io.Serializable {
    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity;

    private int stopIndex;

    private int plannedSequenceNum;

    private int actualSequenceNum;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopType stopType;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity locationIdentity;

    private int latitude;

    private int longitude;

    private int buildingDeliverySequence;

    private java.lang.String consignee;

    private java.lang.String shipper;

    private double deliveryRadius;

    private java.util.Calendar plannedArrival;

    private java.util.Calendar projectedArrival;

    private java.util.Calendar actualArrival;

    private java.util.Calendar plannedDeparture;

    private java.util.Calendar projectedDeparture;

    private java.util.Calendar actualDeparture;

    private boolean cancelled;

    private double plannedDistance;

    private double projectedDistance;

    private double actualDistance;

    private java.util.Calendar openTime;

    private java.util.Calendar closeTime;

    private java.util.Calendar tw1OpenTime;

    private java.util.Calendar tw1CloseTime;

    private java.util.Calendar tw2OpenTime;

    private java.util.Calendar tw2CloseTime;

    private java.lang.String delayType;

    private int delayMinutes;

    private java.lang.String seal;

    private java.lang.String userDefinedField1;

    private java.lang.String userDefinedField2;

    private java.lang.String userDefinedField3;

    private java.lang.String locationUserDefinedField1;

    private java.lang.String locationUserDefinedField2;

    private java.lang.String locationUserDefinedField3;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneValue timeZone;

    private java.lang.String instructions;

    private int redeliveryID;

    private java.lang.String cancelCode;

    private java.lang.String undeliverableCode;

    private boolean undeliverable;

    private int additionalServiceTime;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ItemQuantities quantities;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReasonCodes reasonCodes;

    private java.lang.String locationName;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Address address;

    private java.lang.String phoneNumber;

    private java.lang.String driver1Name;

    private java.lang.String driver2Name;

    private boolean routeComplete;

    private boolean routeInProgress;

    private double plannedDeliveryCost;

    private double actualDeliveryCost;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyIdentity surveyIdentity;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DriverAlert[] driverAlerts;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Order[] orders;

    private boolean removeFlag;

    public Stop() {
    }

    public Stop(
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity,
           int stopIndex,
           int plannedSequenceNum,
           int actualSequenceNum,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopType stopType,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity locationIdentity,
           int latitude,
           int longitude,
           int buildingDeliverySequence,
           java.lang.String consignee,
           java.lang.String shipper,
           double deliveryRadius,
           java.util.Calendar plannedArrival,
           java.util.Calendar projectedArrival,
           java.util.Calendar actualArrival,
           java.util.Calendar plannedDeparture,
           java.util.Calendar projectedDeparture,
           java.util.Calendar actualDeparture,
           boolean cancelled,
           double plannedDistance,
           double projectedDistance,
           double actualDistance,
           java.util.Calendar openTime,
           java.util.Calendar closeTime,
           java.util.Calendar tw1OpenTime,
           java.util.Calendar tw1CloseTime,
           java.util.Calendar tw2OpenTime,
           java.util.Calendar tw2CloseTime,
           java.lang.String delayType,
           int delayMinutes,
           java.lang.String seal,
           java.lang.String userDefinedField1,
           java.lang.String userDefinedField2,
           java.lang.String userDefinedField3,
           java.lang.String locationUserDefinedField1,
           java.lang.String locationUserDefinedField2,
           java.lang.String locationUserDefinedField3,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneValue timeZone,
           java.lang.String instructions,
           int redeliveryID,
           java.lang.String cancelCode,
           java.lang.String undeliverableCode,
           boolean undeliverable,
           int additionalServiceTime,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ItemQuantities quantities,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReasonCodes reasonCodes,
           java.lang.String locationName,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Address address,
           java.lang.String phoneNumber,
           java.lang.String driver1Name,
           java.lang.String driver2Name,
           boolean routeComplete,
           boolean routeInProgress,
           double plannedDeliveryCost,
           double actualDeliveryCost,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyIdentity surveyIdentity,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DriverAlert[] driverAlerts,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Order[] orders,
           boolean removeFlag) {
           this.stopIdentity = stopIdentity;
           this.stopIndex = stopIndex;
           this.plannedSequenceNum = plannedSequenceNum;
           this.actualSequenceNum = actualSequenceNum;
           this.stopType = stopType;
           this.locationIdentity = locationIdentity;
           this.latitude = latitude;
           this.longitude = longitude;
           this.buildingDeliverySequence = buildingDeliverySequence;
           this.consignee = consignee;
           this.shipper = shipper;
           this.deliveryRadius = deliveryRadius;
           this.plannedArrival = plannedArrival;
           this.projectedArrival = projectedArrival;
           this.actualArrival = actualArrival;
           this.plannedDeparture = plannedDeparture;
           this.projectedDeparture = projectedDeparture;
           this.actualDeparture = actualDeparture;
           this.cancelled = cancelled;
           this.plannedDistance = plannedDistance;
           this.projectedDistance = projectedDistance;
           this.actualDistance = actualDistance;
           this.openTime = openTime;
           this.closeTime = closeTime;
           this.tw1OpenTime = tw1OpenTime;
           this.tw1CloseTime = tw1CloseTime;
           this.tw2OpenTime = tw2OpenTime;
           this.tw2CloseTime = tw2CloseTime;
           this.delayType = delayType;
           this.delayMinutes = delayMinutes;
           this.seal = seal;
           this.userDefinedField1 = userDefinedField1;
           this.userDefinedField2 = userDefinedField2;
           this.userDefinedField3 = userDefinedField3;
           this.locationUserDefinedField1 = locationUserDefinedField1;
           this.locationUserDefinedField2 = locationUserDefinedField2;
           this.locationUserDefinedField3 = locationUserDefinedField3;
           this.timeZone = timeZone;
           this.instructions = instructions;
           this.redeliveryID = redeliveryID;
           this.cancelCode = cancelCode;
           this.undeliverableCode = undeliverableCode;
           this.undeliverable = undeliverable;
           this.additionalServiceTime = additionalServiceTime;
           this.quantities = quantities;
           this.reasonCodes = reasonCodes;
           this.locationName = locationName;
           this.address = address;
           this.phoneNumber = phoneNumber;
           this.driver1Name = driver1Name;
           this.driver2Name = driver2Name;
           this.routeComplete = routeComplete;
           this.routeInProgress = routeInProgress;
           this.plannedDeliveryCost = plannedDeliveryCost;
           this.actualDeliveryCost = actualDeliveryCost;
           this.surveyIdentity = surveyIdentity;
           this.driverAlerts = driverAlerts;
           this.orders = orders;
           this.removeFlag = removeFlag;
    }


    /**
     * Gets the stopIdentity value for this Stop.
     * 
     * @return stopIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity getStopIdentity() {
        return stopIdentity;
    }


    /**
     * Sets the stopIdentity value for this Stop.
     * 
     * @param stopIdentity
     */
    public void setStopIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopIdentity stopIdentity) {
        this.stopIdentity = stopIdentity;
    }


    /**
     * Gets the stopIndex value for this Stop.
     * 
     * @return stopIndex
     */
    public int getStopIndex() {
        return stopIndex;
    }


    /**
     * Sets the stopIndex value for this Stop.
     * 
     * @param stopIndex
     */
    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }


    /**
     * Gets the plannedSequenceNum value for this Stop.
     * 
     * @return plannedSequenceNum
     */
    public int getPlannedSequenceNum() {
        return plannedSequenceNum;
    }


    /**
     * Sets the plannedSequenceNum value for this Stop.
     * 
     * @param plannedSequenceNum
     */
    public void setPlannedSequenceNum(int plannedSequenceNum) {
        this.plannedSequenceNum = plannedSequenceNum;
    }


    /**
     * Gets the actualSequenceNum value for this Stop.
     * 
     * @return actualSequenceNum
     */
    public int getActualSequenceNum() {
        return actualSequenceNum;
    }


    /**
     * Sets the actualSequenceNum value for this Stop.
     * 
     * @param actualSequenceNum
     */
    public void setActualSequenceNum(int actualSequenceNum) {
        this.actualSequenceNum = actualSequenceNum;
    }


    /**
     * Gets the stopType value for this Stop.
     * 
     * @return stopType
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopType getStopType() {
        return stopType;
    }


    /**
     * Sets the stopType value for this Stop.
     * 
     * @param stopType
     */
    public void setStopType(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.StopType stopType) {
        this.stopType = stopType;
    }


    /**
     * Gets the locationIdentity value for this Stop.
     * 
     * @return locationIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity getLocationIdentity() {
        return locationIdentity;
    }


    /**
     * Sets the locationIdentity value for this Stop.
     * 
     * @param locationIdentity
     */
    public void setLocationIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.LocationIdentity locationIdentity) {
        this.locationIdentity = locationIdentity;
    }


    /**
     * Gets the latitude value for this Stop.
     * 
     * @return latitude
     */
    public int getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this Stop.
     * 
     * @param latitude
     */
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this Stop.
     * 
     * @return longitude
     */
    public int getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this Stop.
     * 
     * @param longitude
     */
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the buildingDeliverySequence value for this Stop.
     * 
     * @return buildingDeliverySequence
     */
    public int getBuildingDeliverySequence() {
        return buildingDeliverySequence;
    }


    /**
     * Sets the buildingDeliverySequence value for this Stop.
     * 
     * @param buildingDeliverySequence
     */
    public void setBuildingDeliverySequence(int buildingDeliverySequence) {
        this.buildingDeliverySequence = buildingDeliverySequence;
    }


    /**
     * Gets the consignee value for this Stop.
     * 
     * @return consignee
     */
    public java.lang.String getConsignee() {
        return consignee;
    }


    /**
     * Sets the consignee value for this Stop.
     * 
     * @param consignee
     */
    public void setConsignee(java.lang.String consignee) {
        this.consignee = consignee;
    }


    /**
     * Gets the shipper value for this Stop.
     * 
     * @return shipper
     */
    public java.lang.String getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this Stop.
     * 
     * @param shipper
     */
    public void setShipper(java.lang.String shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the deliveryRadius value for this Stop.
     * 
     * @return deliveryRadius
     */
    public double getDeliveryRadius() {
        return deliveryRadius;
    }


    /**
     * Sets the deliveryRadius value for this Stop.
     * 
     * @param deliveryRadius
     */
    public void setDeliveryRadius(double deliveryRadius) {
        this.deliveryRadius = deliveryRadius;
    }


    /**
     * Gets the plannedArrival value for this Stop.
     * 
     * @return plannedArrival
     */
    public java.util.Calendar getPlannedArrival() {
        return plannedArrival;
    }


    /**
     * Sets the plannedArrival value for this Stop.
     * 
     * @param plannedArrival
     */
    public void setPlannedArrival(java.util.Calendar plannedArrival) {
        this.plannedArrival = plannedArrival;
    }


    /**
     * Gets the projectedArrival value for this Stop.
     * 
     * @return projectedArrival
     */
    public java.util.Calendar getProjectedArrival() {
        return projectedArrival;
    }


    /**
     * Sets the projectedArrival value for this Stop.
     * 
     * @param projectedArrival
     */
    public void setProjectedArrival(java.util.Calendar projectedArrival) {
        this.projectedArrival = projectedArrival;
    }


    /**
     * Gets the actualArrival value for this Stop.
     * 
     * @return actualArrival
     */
    public java.util.Calendar getActualArrival() {
        return actualArrival;
    }


    /**
     * Sets the actualArrival value for this Stop.
     * 
     * @param actualArrival
     */
    public void setActualArrival(java.util.Calendar actualArrival) {
        this.actualArrival = actualArrival;
    }


    /**
     * Gets the plannedDeparture value for this Stop.
     * 
     * @return plannedDeparture
     */
    public java.util.Calendar getPlannedDeparture() {
        return plannedDeparture;
    }


    /**
     * Sets the plannedDeparture value for this Stop.
     * 
     * @param plannedDeparture
     */
    public void setPlannedDeparture(java.util.Calendar plannedDeparture) {
        this.plannedDeparture = plannedDeparture;
    }


    /**
     * Gets the projectedDeparture value for this Stop.
     * 
     * @return projectedDeparture
     */
    public java.util.Calendar getProjectedDeparture() {
        return projectedDeparture;
    }


    /**
     * Sets the projectedDeparture value for this Stop.
     * 
     * @param projectedDeparture
     */
    public void setProjectedDeparture(java.util.Calendar projectedDeparture) {
        this.projectedDeparture = projectedDeparture;
    }


    /**
     * Gets the actualDeparture value for this Stop.
     * 
     * @return actualDeparture
     */
    public java.util.Calendar getActualDeparture() {
        return actualDeparture;
    }


    /**
     * Sets the actualDeparture value for this Stop.
     * 
     * @param actualDeparture
     */
    public void setActualDeparture(java.util.Calendar actualDeparture) {
        this.actualDeparture = actualDeparture;
    }


    /**
     * Gets the cancelled value for this Stop.
     * 
     * @return cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }


    /**
     * Sets the cancelled value for this Stop.
     * 
     * @param cancelled
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }


    /**
     * Gets the plannedDistance value for this Stop.
     * 
     * @return plannedDistance
     */
    public double getPlannedDistance() {
        return plannedDistance;
    }


    /**
     * Sets the plannedDistance value for this Stop.
     * 
     * @param plannedDistance
     */
    public void setPlannedDistance(double plannedDistance) {
        this.plannedDistance = plannedDistance;
    }


    /**
     * Gets the projectedDistance value for this Stop.
     * 
     * @return projectedDistance
     */
    public double getProjectedDistance() {
        return projectedDistance;
    }


    /**
     * Sets the projectedDistance value for this Stop.
     * 
     * @param projectedDistance
     */
    public void setProjectedDistance(double projectedDistance) {
        this.projectedDistance = projectedDistance;
    }


    /**
     * Gets the actualDistance value for this Stop.
     * 
     * @return actualDistance
     */
    public double getActualDistance() {
        return actualDistance;
    }


    /**
     * Sets the actualDistance value for this Stop.
     * 
     * @param actualDistance
     */
    public void setActualDistance(double actualDistance) {
        this.actualDistance = actualDistance;
    }


    /**
     * Gets the openTime value for this Stop.
     * 
     * @return openTime
     */
    public java.util.Calendar getOpenTime() {
        return openTime;
    }


    /**
     * Sets the openTime value for this Stop.
     * 
     * @param openTime
     */
    public void setOpenTime(java.util.Calendar openTime) {
        this.openTime = openTime;
    }


    /**
     * Gets the closeTime value for this Stop.
     * 
     * @return closeTime
     */
    public java.util.Calendar getCloseTime() {
        return closeTime;
    }


    /**
     * Sets the closeTime value for this Stop.
     * 
     * @param closeTime
     */
    public void setCloseTime(java.util.Calendar closeTime) {
        this.closeTime = closeTime;
    }


    /**
     * Gets the tw1OpenTime value for this Stop.
     * 
     * @return tw1OpenTime
     */
    public java.util.Calendar getTw1OpenTime() {
        return tw1OpenTime;
    }


    /**
     * Sets the tw1OpenTime value for this Stop.
     * 
     * @param tw1OpenTime
     */
    public void setTw1OpenTime(java.util.Calendar tw1OpenTime) {
        this.tw1OpenTime = tw1OpenTime;
    }


    /**
     * Gets the tw1CloseTime value for this Stop.
     * 
     * @return tw1CloseTime
     */
    public java.util.Calendar getTw1CloseTime() {
        return tw1CloseTime;
    }


    /**
     * Sets the tw1CloseTime value for this Stop.
     * 
     * @param tw1CloseTime
     */
    public void setTw1CloseTime(java.util.Calendar tw1CloseTime) {
        this.tw1CloseTime = tw1CloseTime;
    }


    /**
     * Gets the tw2OpenTime value for this Stop.
     * 
     * @return tw2OpenTime
     */
    public java.util.Calendar getTw2OpenTime() {
        return tw2OpenTime;
    }


    /**
     * Sets the tw2OpenTime value for this Stop.
     * 
     * @param tw2OpenTime
     */
    public void setTw2OpenTime(java.util.Calendar tw2OpenTime) {
        this.tw2OpenTime = tw2OpenTime;
    }


    /**
     * Gets the tw2CloseTime value for this Stop.
     * 
     * @return tw2CloseTime
     */
    public java.util.Calendar getTw2CloseTime() {
        return tw2CloseTime;
    }


    /**
     * Sets the tw2CloseTime value for this Stop.
     * 
     * @param tw2CloseTime
     */
    public void setTw2CloseTime(java.util.Calendar tw2CloseTime) {
        this.tw2CloseTime = tw2CloseTime;
    }


    /**
     * Gets the delayType value for this Stop.
     * 
     * @return delayType
     */
    public java.lang.String getDelayType() {
        return delayType;
    }


    /**
     * Sets the delayType value for this Stop.
     * 
     * @param delayType
     */
    public void setDelayType(java.lang.String delayType) {
        this.delayType = delayType;
    }


    /**
     * Gets the delayMinutes value for this Stop.
     * 
     * @return delayMinutes
     */
    public int getDelayMinutes() {
        return delayMinutes;
    }


    /**
     * Sets the delayMinutes value for this Stop.
     * 
     * @param delayMinutes
     */
    public void setDelayMinutes(int delayMinutes) {
        this.delayMinutes = delayMinutes;
    }


    /**
     * Gets the seal value for this Stop.
     * 
     * @return seal
     */
    public java.lang.String getSeal() {
        return seal;
    }


    /**
     * Sets the seal value for this Stop.
     * 
     * @param seal
     */
    public void setSeal(java.lang.String seal) {
        this.seal = seal;
    }


    /**
     * Gets the userDefinedField1 value for this Stop.
     * 
     * @return userDefinedField1
     */
    public java.lang.String getUserDefinedField1() {
        return userDefinedField1;
    }


    /**
     * Sets the userDefinedField1 value for this Stop.
     * 
     * @param userDefinedField1
     */
    public void setUserDefinedField1(java.lang.String userDefinedField1) {
        this.userDefinedField1 = userDefinedField1;
    }


    /**
     * Gets the userDefinedField2 value for this Stop.
     * 
     * @return userDefinedField2
     */
    public java.lang.String getUserDefinedField2() {
        return userDefinedField2;
    }


    /**
     * Sets the userDefinedField2 value for this Stop.
     * 
     * @param userDefinedField2
     */
    public void setUserDefinedField2(java.lang.String userDefinedField2) {
        this.userDefinedField2 = userDefinedField2;
    }


    /**
     * Gets the userDefinedField3 value for this Stop.
     * 
     * @return userDefinedField3
     */
    public java.lang.String getUserDefinedField3() {
        return userDefinedField3;
    }


    /**
     * Sets the userDefinedField3 value for this Stop.
     * 
     * @param userDefinedField3
     */
    public void setUserDefinedField3(java.lang.String userDefinedField3) {
        this.userDefinedField3 = userDefinedField3;
    }


    /**
     * Gets the locationUserDefinedField1 value for this Stop.
     * 
     * @return locationUserDefinedField1
     */
    public java.lang.String getLocationUserDefinedField1() {
        return locationUserDefinedField1;
    }


    /**
     * Sets the locationUserDefinedField1 value for this Stop.
     * 
     * @param locationUserDefinedField1
     */
    public void setLocationUserDefinedField1(java.lang.String locationUserDefinedField1) {
        this.locationUserDefinedField1 = locationUserDefinedField1;
    }


    /**
     * Gets the locationUserDefinedField2 value for this Stop.
     * 
     * @return locationUserDefinedField2
     */
    public java.lang.String getLocationUserDefinedField2() {
        return locationUserDefinedField2;
    }


    /**
     * Sets the locationUserDefinedField2 value for this Stop.
     * 
     * @param locationUserDefinedField2
     */
    public void setLocationUserDefinedField2(java.lang.String locationUserDefinedField2) {
        this.locationUserDefinedField2 = locationUserDefinedField2;
    }


    /**
     * Gets the locationUserDefinedField3 value for this Stop.
     * 
     * @return locationUserDefinedField3
     */
    public java.lang.String getLocationUserDefinedField3() {
        return locationUserDefinedField3;
    }


    /**
     * Sets the locationUserDefinedField3 value for this Stop.
     * 
     * @param locationUserDefinedField3
     */
    public void setLocationUserDefinedField3(java.lang.String locationUserDefinedField3) {
        this.locationUserDefinedField3 = locationUserDefinedField3;
    }


    /**
     * Gets the timeZone value for this Stop.
     * 
     * @return timeZone
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneValue getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this Stop.
     * 
     * @param timeZone
     */
    public void setTimeZone(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.TimeZoneValue timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the instructions value for this Stop.
     * 
     * @return instructions
     */
    public java.lang.String getInstructions() {
        return instructions;
    }


    /**
     * Sets the instructions value for this Stop.
     * 
     * @param instructions
     */
    public void setInstructions(java.lang.String instructions) {
        this.instructions = instructions;
    }


    /**
     * Gets the redeliveryID value for this Stop.
     * 
     * @return redeliveryID
     */
    public int getRedeliveryID() {
        return redeliveryID;
    }


    /**
     * Sets the redeliveryID value for this Stop.
     * 
     * @param redeliveryID
     */
    public void setRedeliveryID(int redeliveryID) {
        this.redeliveryID = redeliveryID;
    }


    /**
     * Gets the cancelCode value for this Stop.
     * 
     * @return cancelCode
     */
    public java.lang.String getCancelCode() {
        return cancelCode;
    }


    /**
     * Sets the cancelCode value for this Stop.
     * 
     * @param cancelCode
     */
    public void setCancelCode(java.lang.String cancelCode) {
        this.cancelCode = cancelCode;
    }


    /**
     * Gets the undeliverableCode value for this Stop.
     * 
     * @return undeliverableCode
     */
    public java.lang.String getUndeliverableCode() {
        return undeliverableCode;
    }


    /**
     * Sets the undeliverableCode value for this Stop.
     * 
     * @param undeliverableCode
     */
    public void setUndeliverableCode(java.lang.String undeliverableCode) {
        this.undeliverableCode = undeliverableCode;
    }


    /**
     * Gets the undeliverable value for this Stop.
     * 
     * @return undeliverable
     */
    public boolean isUndeliverable() {
        return undeliverable;
    }


    /**
     * Sets the undeliverable value for this Stop.
     * 
     * @param undeliverable
     */
    public void setUndeliverable(boolean undeliverable) {
        this.undeliverable = undeliverable;
    }


    /**
     * Gets the additionalServiceTime value for this Stop.
     * 
     * @return additionalServiceTime
     */
    public int getAdditionalServiceTime() {
        return additionalServiceTime;
    }


    /**
     * Sets the additionalServiceTime value for this Stop.
     * 
     * @param additionalServiceTime
     */
    public void setAdditionalServiceTime(int additionalServiceTime) {
        this.additionalServiceTime = additionalServiceTime;
    }


    /**
     * Gets the quantities value for this Stop.
     * 
     * @return quantities
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ItemQuantities getQuantities() {
        return quantities;
    }


    /**
     * Sets the quantities value for this Stop.
     * 
     * @param quantities
     */
    public void setQuantities(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ItemQuantities quantities) {
        this.quantities = quantities;
    }


    /**
     * Gets the reasonCodes value for this Stop.
     * 
     * @return reasonCodes
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReasonCodes getReasonCodes() {
        return reasonCodes;
    }


    /**
     * Sets the reasonCodes value for this Stop.
     * 
     * @param reasonCodes
     */
    public void setReasonCodes(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.ReasonCodes reasonCodes) {
        this.reasonCodes = reasonCodes;
    }


    /**
     * Gets the locationName value for this Stop.
     * 
     * @return locationName
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this Stop.
     * 
     * @param locationName
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the address value for this Stop.
     * 
     * @return address
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Stop.
     * 
     * @param address
     */
    public void setAddress(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Address address) {
        this.address = address;
    }


    /**
     * Gets the phoneNumber value for this Stop.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this Stop.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the driver1Name value for this Stop.
     * 
     * @return driver1Name
     */
    public java.lang.String getDriver1Name() {
        return driver1Name;
    }


    /**
     * Sets the driver1Name value for this Stop.
     * 
     * @param driver1Name
     */
    public void setDriver1Name(java.lang.String driver1Name) {
        this.driver1Name = driver1Name;
    }


    /**
     * Gets the driver2Name value for this Stop.
     * 
     * @return driver2Name
     */
    public java.lang.String getDriver2Name() {
        return driver2Name;
    }


    /**
     * Sets the driver2Name value for this Stop.
     * 
     * @param driver2Name
     */
    public void setDriver2Name(java.lang.String driver2Name) {
        this.driver2Name = driver2Name;
    }


    /**
     * Gets the routeComplete value for this Stop.
     * 
     * @return routeComplete
     */
    public boolean isRouteComplete() {
        return routeComplete;
    }


    /**
     * Sets the routeComplete value for this Stop.
     * 
     * @param routeComplete
     */
    public void setRouteComplete(boolean routeComplete) {
        this.routeComplete = routeComplete;
    }


    /**
     * Gets the routeInProgress value for this Stop.
     * 
     * @return routeInProgress
     */
    public boolean isRouteInProgress() {
        return routeInProgress;
    }


    /**
     * Sets the routeInProgress value for this Stop.
     * 
     * @param routeInProgress
     */
    public void setRouteInProgress(boolean routeInProgress) {
        this.routeInProgress = routeInProgress;
    }


    /**
     * Gets the plannedDeliveryCost value for this Stop.
     * 
     * @return plannedDeliveryCost
     */
    public double getPlannedDeliveryCost() {
        return plannedDeliveryCost;
    }


    /**
     * Sets the plannedDeliveryCost value for this Stop.
     * 
     * @param plannedDeliveryCost
     */
    public void setPlannedDeliveryCost(double plannedDeliveryCost) {
        this.plannedDeliveryCost = plannedDeliveryCost;
    }


    /**
     * Gets the actualDeliveryCost value for this Stop.
     * 
     * @return actualDeliveryCost
     */
    public double getActualDeliveryCost() {
        return actualDeliveryCost;
    }


    /**
     * Sets the actualDeliveryCost value for this Stop.
     * 
     * @param actualDeliveryCost
     */
    public void setActualDeliveryCost(double actualDeliveryCost) {
        this.actualDeliveryCost = actualDeliveryCost;
    }


    /**
     * Gets the surveyIdentity value for this Stop.
     * 
     * @return surveyIdentity
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyIdentity getSurveyIdentity() {
        return surveyIdentity;
    }


    /**
     * Sets the surveyIdentity value for this Stop.
     * 
     * @param surveyIdentity
     */
    public void setSurveyIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.SurveyIdentity surveyIdentity) {
        this.surveyIdentity = surveyIdentity;
    }


    /**
     * Gets the driverAlerts value for this Stop.
     * 
     * @return driverAlerts
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DriverAlert[] getDriverAlerts() {
        return driverAlerts;
    }


    /**
     * Sets the driverAlerts value for this Stop.
     * 
     * @param driverAlerts
     */
    public void setDriverAlerts(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DriverAlert[] driverAlerts) {
        this.driverAlerts = driverAlerts;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DriverAlert getDriverAlerts(int i) {
        return this.driverAlerts[i];
    }

    public void setDriverAlerts(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DriverAlert _value) {
        this.driverAlerts[i] = _value;
    }


    /**
     * Gets the orders value for this Stop.
     * 
     * @return orders
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Order[] getOrders() {
        return orders;
    }


    /**
     * Sets the orders value for this Stop.
     * 
     * @param orders
     */
    public void setOrders(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Order[] orders) {
        this.orders = orders;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Order getOrders(int i) {
        return this.orders[i];
    }

    public void setOrders(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.Order _value) {
        this.orders[i] = _value;
    }


    /**
     * Gets the removeFlag value for this Stop.
     * 
     * @return removeFlag
     */
    public boolean isRemoveFlag() {
        return removeFlag;
    }


    /**
     * Sets the removeFlag value for this Stop.
     * 
     * @param removeFlag
     */
    public void setRemoveFlag(boolean removeFlag) {
        this.removeFlag = removeFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stop)) return false;
        Stop other = (Stop) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stopIdentity==null && other.getStopIdentity()==null) || 
             (this.stopIdentity!=null &&
              this.stopIdentity.equals(other.getStopIdentity()))) &&
            this.stopIndex == other.getStopIndex() &&
            this.plannedSequenceNum == other.getPlannedSequenceNum() &&
            this.actualSequenceNum == other.getActualSequenceNum() &&
            ((this.stopType==null && other.getStopType()==null) || 
             (this.stopType!=null &&
              this.stopType.equals(other.getStopType()))) &&
            ((this.locationIdentity==null && other.getLocationIdentity()==null) || 
             (this.locationIdentity!=null &&
              this.locationIdentity.equals(other.getLocationIdentity()))) &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            this.buildingDeliverySequence == other.getBuildingDeliverySequence() &&
            ((this.consignee==null && other.getConsignee()==null) || 
             (this.consignee!=null &&
              this.consignee.equals(other.getConsignee()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            this.deliveryRadius == other.getDeliveryRadius() &&
            ((this.plannedArrival==null && other.getPlannedArrival()==null) || 
             (this.plannedArrival!=null &&
              this.plannedArrival.equals(other.getPlannedArrival()))) &&
            ((this.projectedArrival==null && other.getProjectedArrival()==null) || 
             (this.projectedArrival!=null &&
              this.projectedArrival.equals(other.getProjectedArrival()))) &&
            ((this.actualArrival==null && other.getActualArrival()==null) || 
             (this.actualArrival!=null &&
              this.actualArrival.equals(other.getActualArrival()))) &&
            ((this.plannedDeparture==null && other.getPlannedDeparture()==null) || 
             (this.plannedDeparture!=null &&
              this.plannedDeparture.equals(other.getPlannedDeparture()))) &&
            ((this.projectedDeparture==null && other.getProjectedDeparture()==null) || 
             (this.projectedDeparture!=null &&
              this.projectedDeparture.equals(other.getProjectedDeparture()))) &&
            ((this.actualDeparture==null && other.getActualDeparture()==null) || 
             (this.actualDeparture!=null &&
              this.actualDeparture.equals(other.getActualDeparture()))) &&
            this.cancelled == other.isCancelled() &&
            this.plannedDistance == other.getPlannedDistance() &&
            this.projectedDistance == other.getProjectedDistance() &&
            this.actualDistance == other.getActualDistance() &&
            ((this.openTime==null && other.getOpenTime()==null) || 
             (this.openTime!=null &&
              this.openTime.equals(other.getOpenTime()))) &&
            ((this.closeTime==null && other.getCloseTime()==null) || 
             (this.closeTime!=null &&
              this.closeTime.equals(other.getCloseTime()))) &&
            ((this.tw1OpenTime==null && other.getTw1OpenTime()==null) || 
             (this.tw1OpenTime!=null &&
              this.tw1OpenTime.equals(other.getTw1OpenTime()))) &&
            ((this.tw1CloseTime==null && other.getTw1CloseTime()==null) || 
             (this.tw1CloseTime!=null &&
              this.tw1CloseTime.equals(other.getTw1CloseTime()))) &&
            ((this.tw2OpenTime==null && other.getTw2OpenTime()==null) || 
             (this.tw2OpenTime!=null &&
              this.tw2OpenTime.equals(other.getTw2OpenTime()))) &&
            ((this.tw2CloseTime==null && other.getTw2CloseTime()==null) || 
             (this.tw2CloseTime!=null &&
              this.tw2CloseTime.equals(other.getTw2CloseTime()))) &&
            ((this.delayType==null && other.getDelayType()==null) || 
             (this.delayType!=null &&
              this.delayType.equals(other.getDelayType()))) &&
            this.delayMinutes == other.getDelayMinutes() &&
            ((this.seal==null && other.getSeal()==null) || 
             (this.seal!=null &&
              this.seal.equals(other.getSeal()))) &&
            ((this.userDefinedField1==null && other.getUserDefinedField1()==null) || 
             (this.userDefinedField1!=null &&
              this.userDefinedField1.equals(other.getUserDefinedField1()))) &&
            ((this.userDefinedField2==null && other.getUserDefinedField2()==null) || 
             (this.userDefinedField2!=null &&
              this.userDefinedField2.equals(other.getUserDefinedField2()))) &&
            ((this.userDefinedField3==null && other.getUserDefinedField3()==null) || 
             (this.userDefinedField3!=null &&
              this.userDefinedField3.equals(other.getUserDefinedField3()))) &&
            ((this.locationUserDefinedField1==null && other.getLocationUserDefinedField1()==null) || 
             (this.locationUserDefinedField1!=null &&
              this.locationUserDefinedField1.equals(other.getLocationUserDefinedField1()))) &&
            ((this.locationUserDefinedField2==null && other.getLocationUserDefinedField2()==null) || 
             (this.locationUserDefinedField2!=null &&
              this.locationUserDefinedField2.equals(other.getLocationUserDefinedField2()))) &&
            ((this.locationUserDefinedField3==null && other.getLocationUserDefinedField3()==null) || 
             (this.locationUserDefinedField3!=null &&
              this.locationUserDefinedField3.equals(other.getLocationUserDefinedField3()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.instructions==null && other.getInstructions()==null) || 
             (this.instructions!=null &&
              this.instructions.equals(other.getInstructions()))) &&
            this.redeliveryID == other.getRedeliveryID() &&
            ((this.cancelCode==null && other.getCancelCode()==null) || 
             (this.cancelCode!=null &&
              this.cancelCode.equals(other.getCancelCode()))) &&
            ((this.undeliverableCode==null && other.getUndeliverableCode()==null) || 
             (this.undeliverableCode!=null &&
              this.undeliverableCode.equals(other.getUndeliverableCode()))) &&
            this.undeliverable == other.isUndeliverable() &&
            this.additionalServiceTime == other.getAdditionalServiceTime() &&
            ((this.quantities==null && other.getQuantities()==null) || 
             (this.quantities!=null &&
              this.quantities.equals(other.getQuantities()))) &&
            ((this.reasonCodes==null && other.getReasonCodes()==null) || 
             (this.reasonCodes!=null &&
              this.reasonCodes.equals(other.getReasonCodes()))) &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.driver1Name==null && other.getDriver1Name()==null) || 
             (this.driver1Name!=null &&
              this.driver1Name.equals(other.getDriver1Name()))) &&
            ((this.driver2Name==null && other.getDriver2Name()==null) || 
             (this.driver2Name!=null &&
              this.driver2Name.equals(other.getDriver2Name()))) &&
            this.routeComplete == other.isRouteComplete() &&
            this.routeInProgress == other.isRouteInProgress() &&
            this.plannedDeliveryCost == other.getPlannedDeliveryCost() &&
            this.actualDeliveryCost == other.getActualDeliveryCost() &&
            ((this.surveyIdentity==null && other.getSurveyIdentity()==null) || 
             (this.surveyIdentity!=null &&
              this.surveyIdentity.equals(other.getSurveyIdentity()))) &&
            ((this.driverAlerts==null && other.getDriverAlerts()==null) || 
             (this.driverAlerts!=null &&
              java.util.Arrays.equals(this.driverAlerts, other.getDriverAlerts()))) &&
            ((this.orders==null && other.getOrders()==null) || 
             (this.orders!=null &&
              java.util.Arrays.equals(this.orders, other.getOrders()))) &&
            this.removeFlag == other.isRemoveFlag();
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
        if (getStopIdentity() != null) {
            _hashCode += getStopIdentity().hashCode();
        }
        _hashCode += getStopIndex();
        _hashCode += getPlannedSequenceNum();
        _hashCode += getActualSequenceNum();
        if (getStopType() != null) {
            _hashCode += getStopType().hashCode();
        }
        if (getLocationIdentity() != null) {
            _hashCode += getLocationIdentity().hashCode();
        }
        _hashCode += getLatitude();
        _hashCode += getLongitude();
        _hashCode += getBuildingDeliverySequence();
        if (getConsignee() != null) {
            _hashCode += getConsignee().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        _hashCode += new Double(getDeliveryRadius()).hashCode();
        if (getPlannedArrival() != null) {
            _hashCode += getPlannedArrival().hashCode();
        }
        if (getProjectedArrival() != null) {
            _hashCode += getProjectedArrival().hashCode();
        }
        if (getActualArrival() != null) {
            _hashCode += getActualArrival().hashCode();
        }
        if (getPlannedDeparture() != null) {
            _hashCode += getPlannedDeparture().hashCode();
        }
        if (getProjectedDeparture() != null) {
            _hashCode += getProjectedDeparture().hashCode();
        }
        if (getActualDeparture() != null) {
            _hashCode += getActualDeparture().hashCode();
        }
        _hashCode += (isCancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getPlannedDistance()).hashCode();
        _hashCode += new Double(getProjectedDistance()).hashCode();
        _hashCode += new Double(getActualDistance()).hashCode();
        if (getOpenTime() != null) {
            _hashCode += getOpenTime().hashCode();
        }
        if (getCloseTime() != null) {
            _hashCode += getCloseTime().hashCode();
        }
        if (getTw1OpenTime() != null) {
            _hashCode += getTw1OpenTime().hashCode();
        }
        if (getTw1CloseTime() != null) {
            _hashCode += getTw1CloseTime().hashCode();
        }
        if (getTw2OpenTime() != null) {
            _hashCode += getTw2OpenTime().hashCode();
        }
        if (getTw2CloseTime() != null) {
            _hashCode += getTw2CloseTime().hashCode();
        }
        if (getDelayType() != null) {
            _hashCode += getDelayType().hashCode();
        }
        _hashCode += getDelayMinutes();
        if (getSeal() != null) {
            _hashCode += getSeal().hashCode();
        }
        if (getUserDefinedField1() != null) {
            _hashCode += getUserDefinedField1().hashCode();
        }
        if (getUserDefinedField2() != null) {
            _hashCode += getUserDefinedField2().hashCode();
        }
        if (getUserDefinedField3() != null) {
            _hashCode += getUserDefinedField3().hashCode();
        }
        if (getLocationUserDefinedField1() != null) {
            _hashCode += getLocationUserDefinedField1().hashCode();
        }
        if (getLocationUserDefinedField2() != null) {
            _hashCode += getLocationUserDefinedField2().hashCode();
        }
        if (getLocationUserDefinedField3() != null) {
            _hashCode += getLocationUserDefinedField3().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getInstructions() != null) {
            _hashCode += getInstructions().hashCode();
        }
        _hashCode += getRedeliveryID();
        if (getCancelCode() != null) {
            _hashCode += getCancelCode().hashCode();
        }
        if (getUndeliverableCode() != null) {
            _hashCode += getUndeliverableCode().hashCode();
        }
        _hashCode += (isUndeliverable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getAdditionalServiceTime();
        if (getQuantities() != null) {
            _hashCode += getQuantities().hashCode();
        }
        if (getReasonCodes() != null) {
            _hashCode += getReasonCodes().hashCode();
        }
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getDriver1Name() != null) {
            _hashCode += getDriver1Name().hashCode();
        }
        if (getDriver2Name() != null) {
            _hashCode += getDriver2Name().hashCode();
        }
        _hashCode += (isRouteComplete() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRouteInProgress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getPlannedDeliveryCost()).hashCode();
        _hashCode += new Double(getActualDeliveryCost()).hashCode();
        if (getSurveyIdentity() != null) {
            _hashCode += getSurveyIdentity().hashCode();
        }
        if (getDriverAlerts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDriverAlerts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDriverAlerts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isRemoveFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Stop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Stop"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedSequenceNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "plannedSequenceNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualSequenceNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualSequenceNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "stopType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "StopType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "locationIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "LocationIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingDeliverySequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "buildingDeliverySequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consignee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "consignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "deliveryRadius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedArrival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "plannedArrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedArrival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "projectedArrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualArrival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualArrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedDeparture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "plannedDeparture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedDeparture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "projectedDeparture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeparture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualDeparture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "plannedDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "projectedDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "openTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "closeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tw1OpenTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tw1OpenTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tw1CloseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tw1CloseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tw2OpenTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tw2OpenTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tw2CloseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "tw2CloseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "delayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delayMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "delayMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "seal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "userDefinedField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "userDefinedField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedField3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "userDefinedField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationUserDefinedField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "locationUserDefinedField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationUserDefinedField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "locationUserDefinedField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationUserDefinedField3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "locationUserDefinedField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "TimeZoneValue"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "instructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redeliveryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "redeliveryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "cancelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undeliverableCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "undeliverableCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undeliverable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "undeliverable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalServiceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "additionalServiceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "quantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ItemQuantities"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "reasonCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ReasonCodes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "locationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driver1Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "driver1Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driver2Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "driver2Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeInProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "routeInProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedDeliveryCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "plannedDeliveryCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeliveryCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "actualDeliveryCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "surveyIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "SurveyIdentity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverAlerts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "driverAlerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DriverAlert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "Order"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "removeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
