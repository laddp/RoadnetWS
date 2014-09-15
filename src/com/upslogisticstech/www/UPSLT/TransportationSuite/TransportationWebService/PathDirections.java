/**
 * PathDirections.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class PathDirections  implements java.io.Serializable {
    private int time;

    private double distance;

    private com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionArc[] directionArcs;

    private java.lang.String pathDescription1;

    private java.lang.String pathDescription2;

    public PathDirections() {
    }

    public PathDirections(
           int time,
           double distance,
           com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionArc[] directionArcs,
           java.lang.String pathDescription1,
           java.lang.String pathDescription2) {
           this.time = time;
           this.distance = distance;
           this.directionArcs = directionArcs;
           this.pathDescription1 = pathDescription1;
           this.pathDescription2 = pathDescription2;
    }


    /**
     * Gets the time value for this PathDirections.
     * 
     * @return time
     */
    public int getTime() {
        return time;
    }


    /**
     * Sets the time value for this PathDirections.
     * 
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }


    /**
     * Gets the distance value for this PathDirections.
     * 
     * @return distance
     */
    public double getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this PathDirections.
     * 
     * @param distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }


    /**
     * Gets the directionArcs value for this PathDirections.
     * 
     * @return directionArcs
     */
    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionArc[] getDirectionArcs() {
        return directionArcs;
    }


    /**
     * Sets the directionArcs value for this PathDirections.
     * 
     * @param directionArcs
     */
    public void setDirectionArcs(com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionArc[] directionArcs) {
        this.directionArcs = directionArcs;
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionArc getDirectionArcs(int i) {
        return this.directionArcs[i];
    }

    public void setDirectionArcs(int i, com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService.DirectionArc _value) {
        this.directionArcs[i] = _value;
    }


    /**
     * Gets the pathDescription1 value for this PathDirections.
     * 
     * @return pathDescription1
     */
    public java.lang.String getPathDescription1() {
        return pathDescription1;
    }


    /**
     * Sets the pathDescription1 value for this PathDirections.
     * 
     * @param pathDescription1
     */
    public void setPathDescription1(java.lang.String pathDescription1) {
        this.pathDescription1 = pathDescription1;
    }


    /**
     * Gets the pathDescription2 value for this PathDirections.
     * 
     * @return pathDescription2
     */
    public java.lang.String getPathDescription2() {
        return pathDescription2;
    }


    /**
     * Sets the pathDescription2 value for this PathDirections.
     * 
     * @param pathDescription2
     */
    public void setPathDescription2(java.lang.String pathDescription2) {
        this.pathDescription2 = pathDescription2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PathDirections)) return false;
        PathDirections other = (PathDirections) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.time == other.getTime() &&
            this.distance == other.getDistance() &&
            ((this.directionArcs==null && other.getDirectionArcs()==null) || 
             (this.directionArcs!=null &&
              java.util.Arrays.equals(this.directionArcs, other.getDirectionArcs()))) &&
            ((this.pathDescription1==null && other.getPathDescription1()==null) || 
             (this.pathDescription1!=null &&
              this.pathDescription1.equals(other.getPathDescription1()))) &&
            ((this.pathDescription2==null && other.getPathDescription2()==null) || 
             (this.pathDescription2!=null &&
              this.pathDescription2.equals(other.getPathDescription2())));
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
        _hashCode += getTime();
        _hashCode += new Double(getDistance()).hashCode();
        if (getDirectionArcs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirectionArcs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDirectionArcs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPathDescription1() != null) {
            _hashCode += getPathDescription1().hashCode();
        }
        if (getPathDescription2() != null) {
            _hashCode += getPathDescription2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PathDirections.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "PathDirections"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directionArcs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "directionArcs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "DirectionArc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathDescription1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "pathDescription1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathDescription2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "pathDescription2"));
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
