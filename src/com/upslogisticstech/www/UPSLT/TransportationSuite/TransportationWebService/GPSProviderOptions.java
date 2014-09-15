/**
 * GPSProviderOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.TransportationWebService;

public class GPSProviderOptions  implements java.io.Serializable {
    private int gpsProviderType;

    private java.lang.String providerBinaryLocation;

    private boolean cachePositionData;

    private int ignoreRoutesOlderThanSeconds;

    private int beginGPSPollingBeforeSeconds;

    private java.lang.String webProxyAddress;

    private java.lang.String webProxyUsername;

    private java.lang.String webPRoxyPassword;

    private java.lang.String serverUrl;

    private java.lang.String databaseName;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String apiKey;

    public GPSProviderOptions() {
    }

    public GPSProviderOptions(
           int gpsProviderType,
           java.lang.String providerBinaryLocation,
           boolean cachePositionData,
           int ignoreRoutesOlderThanSeconds,
           int beginGPSPollingBeforeSeconds,
           java.lang.String webProxyAddress,
           java.lang.String webProxyUsername,
           java.lang.String webPRoxyPassword,
           java.lang.String serverUrl,
           java.lang.String databaseName,
           java.lang.String username,
           java.lang.String password,
           java.lang.String apiKey) {
           this.gpsProviderType = gpsProviderType;
           this.providerBinaryLocation = providerBinaryLocation;
           this.cachePositionData = cachePositionData;
           this.ignoreRoutesOlderThanSeconds = ignoreRoutesOlderThanSeconds;
           this.beginGPSPollingBeforeSeconds = beginGPSPollingBeforeSeconds;
           this.webProxyAddress = webProxyAddress;
           this.webProxyUsername = webProxyUsername;
           this.webPRoxyPassword = webPRoxyPassword;
           this.serverUrl = serverUrl;
           this.databaseName = databaseName;
           this.username = username;
           this.password = password;
           this.apiKey = apiKey;
    }


    /**
     * Gets the gpsProviderType value for this GPSProviderOptions.
     * 
     * @return gpsProviderType
     */
    public int getGpsProviderType() {
        return gpsProviderType;
    }


    /**
     * Sets the gpsProviderType value for this GPSProviderOptions.
     * 
     * @param gpsProviderType
     */
    public void setGpsProviderType(int gpsProviderType) {
        this.gpsProviderType = gpsProviderType;
    }


    /**
     * Gets the providerBinaryLocation value for this GPSProviderOptions.
     * 
     * @return providerBinaryLocation
     */
    public java.lang.String getProviderBinaryLocation() {
        return providerBinaryLocation;
    }


    /**
     * Sets the providerBinaryLocation value for this GPSProviderOptions.
     * 
     * @param providerBinaryLocation
     */
    public void setProviderBinaryLocation(java.lang.String providerBinaryLocation) {
        this.providerBinaryLocation = providerBinaryLocation;
    }


    /**
     * Gets the cachePositionData value for this GPSProviderOptions.
     * 
     * @return cachePositionData
     */
    public boolean isCachePositionData() {
        return cachePositionData;
    }


    /**
     * Sets the cachePositionData value for this GPSProviderOptions.
     * 
     * @param cachePositionData
     */
    public void setCachePositionData(boolean cachePositionData) {
        this.cachePositionData = cachePositionData;
    }


    /**
     * Gets the ignoreRoutesOlderThanSeconds value for this GPSProviderOptions.
     * 
     * @return ignoreRoutesOlderThanSeconds
     */
    public int getIgnoreRoutesOlderThanSeconds() {
        return ignoreRoutesOlderThanSeconds;
    }


    /**
     * Sets the ignoreRoutesOlderThanSeconds value for this GPSProviderOptions.
     * 
     * @param ignoreRoutesOlderThanSeconds
     */
    public void setIgnoreRoutesOlderThanSeconds(int ignoreRoutesOlderThanSeconds) {
        this.ignoreRoutesOlderThanSeconds = ignoreRoutesOlderThanSeconds;
    }


    /**
     * Gets the beginGPSPollingBeforeSeconds value for this GPSProviderOptions.
     * 
     * @return beginGPSPollingBeforeSeconds
     */
    public int getBeginGPSPollingBeforeSeconds() {
        return beginGPSPollingBeforeSeconds;
    }


    /**
     * Sets the beginGPSPollingBeforeSeconds value for this GPSProviderOptions.
     * 
     * @param beginGPSPollingBeforeSeconds
     */
    public void setBeginGPSPollingBeforeSeconds(int beginGPSPollingBeforeSeconds) {
        this.beginGPSPollingBeforeSeconds = beginGPSPollingBeforeSeconds;
    }


    /**
     * Gets the webProxyAddress value for this GPSProviderOptions.
     * 
     * @return webProxyAddress
     */
    public java.lang.String getWebProxyAddress() {
        return webProxyAddress;
    }


    /**
     * Sets the webProxyAddress value for this GPSProviderOptions.
     * 
     * @param webProxyAddress
     */
    public void setWebProxyAddress(java.lang.String webProxyAddress) {
        this.webProxyAddress = webProxyAddress;
    }


    /**
     * Gets the webProxyUsername value for this GPSProviderOptions.
     * 
     * @return webProxyUsername
     */
    public java.lang.String getWebProxyUsername() {
        return webProxyUsername;
    }


    /**
     * Sets the webProxyUsername value for this GPSProviderOptions.
     * 
     * @param webProxyUsername
     */
    public void setWebProxyUsername(java.lang.String webProxyUsername) {
        this.webProxyUsername = webProxyUsername;
    }


    /**
     * Gets the webPRoxyPassword value for this GPSProviderOptions.
     * 
     * @return webPRoxyPassword
     */
    public java.lang.String getWebPRoxyPassword() {
        return webPRoxyPassword;
    }


    /**
     * Sets the webPRoxyPassword value for this GPSProviderOptions.
     * 
     * @param webPRoxyPassword
     */
    public void setWebPRoxyPassword(java.lang.String webPRoxyPassword) {
        this.webPRoxyPassword = webPRoxyPassword;
    }


    /**
     * Gets the serverUrl value for this GPSProviderOptions.
     * 
     * @return serverUrl
     */
    public java.lang.String getServerUrl() {
        return serverUrl;
    }


    /**
     * Sets the serverUrl value for this GPSProviderOptions.
     * 
     * @param serverUrl
     */
    public void setServerUrl(java.lang.String serverUrl) {
        this.serverUrl = serverUrl;
    }


    /**
     * Gets the databaseName value for this GPSProviderOptions.
     * 
     * @return databaseName
     */
    public java.lang.String getDatabaseName() {
        return databaseName;
    }


    /**
     * Sets the databaseName value for this GPSProviderOptions.
     * 
     * @param databaseName
     */
    public void setDatabaseName(java.lang.String databaseName) {
        this.databaseName = databaseName;
    }


    /**
     * Gets the username value for this GPSProviderOptions.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this GPSProviderOptions.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this GPSProviderOptions.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GPSProviderOptions.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the apiKey value for this GPSProviderOptions.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this GPSProviderOptions.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GPSProviderOptions)) return false;
        GPSProviderOptions other = (GPSProviderOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gpsProviderType == other.getGpsProviderType() &&
            ((this.providerBinaryLocation==null && other.getProviderBinaryLocation()==null) || 
             (this.providerBinaryLocation!=null &&
              this.providerBinaryLocation.equals(other.getProviderBinaryLocation()))) &&
            this.cachePositionData == other.isCachePositionData() &&
            this.ignoreRoutesOlderThanSeconds == other.getIgnoreRoutesOlderThanSeconds() &&
            this.beginGPSPollingBeforeSeconds == other.getBeginGPSPollingBeforeSeconds() &&
            ((this.webProxyAddress==null && other.getWebProxyAddress()==null) || 
             (this.webProxyAddress!=null &&
              this.webProxyAddress.equals(other.getWebProxyAddress()))) &&
            ((this.webProxyUsername==null && other.getWebProxyUsername()==null) || 
             (this.webProxyUsername!=null &&
              this.webProxyUsername.equals(other.getWebProxyUsername()))) &&
            ((this.webPRoxyPassword==null && other.getWebPRoxyPassword()==null) || 
             (this.webPRoxyPassword!=null &&
              this.webPRoxyPassword.equals(other.getWebPRoxyPassword()))) &&
            ((this.serverUrl==null && other.getServerUrl()==null) || 
             (this.serverUrl!=null &&
              this.serverUrl.equals(other.getServerUrl()))) &&
            ((this.databaseName==null && other.getDatabaseName()==null) || 
             (this.databaseName!=null &&
              this.databaseName.equals(other.getDatabaseName()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.apiKey==null && other.getApiKey()==null) || 
             (this.apiKey!=null &&
              this.apiKey.equals(other.getApiKey())));
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
        _hashCode += getGpsProviderType();
        if (getProviderBinaryLocation() != null) {
            _hashCode += getProviderBinaryLocation().hashCode();
        }
        _hashCode += (isCachePositionData() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getIgnoreRoutesOlderThanSeconds();
        _hashCode += getBeginGPSPollingBeforeSeconds();
        if (getWebProxyAddress() != null) {
            _hashCode += getWebProxyAddress().hashCode();
        }
        if (getWebProxyUsername() != null) {
            _hashCode += getWebProxyUsername().hashCode();
        }
        if (getWebPRoxyPassword() != null) {
            _hashCode += getWebPRoxyPassword().hashCode();
        }
        if (getServerUrl() != null) {
            _hashCode += getServerUrl().hashCode();
        }
        if (getDatabaseName() != null) {
            _hashCode += getDatabaseName().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getApiKey() != null) {
            _hashCode += getApiKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GPSProviderOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "GPSProviderOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpsProviderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "gpsProviderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerBinaryLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "providerBinaryLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachePositionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "cachePositionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreRoutesOlderThanSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "ignoreRoutesOlderThanSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginGPSPollingBeforeSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "beginGPSPollingBeforeSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webProxyAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "webProxyAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webProxyUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "webProxyUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webPRoxyPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "webPRoxyPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "serverUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "databaseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/TransportationWebService", "apiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
