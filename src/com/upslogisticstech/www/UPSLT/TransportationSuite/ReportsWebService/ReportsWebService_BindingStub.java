/**
 * ReportsWebService_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService;

public class ReportsWebService_BindingStub extends org.apache.axis.client.Stub implements com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportsWebService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Nop");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(java.lang.Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "notUsed"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveVersionInformation");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "version"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveRICReportByIdentity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "identity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportIdentity"), com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportIdentity.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "retrieveOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportRetrievalOptions"), com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "Report"));
        oper.setReturnClass(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "report"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveRICReports");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "retrieveOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportRetrievalOptions"), com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "Report"));
        oper.setReturnClass(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "report"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExportReportToFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "report"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "Report"), com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "exportOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportExportOptions"), com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportExportOptions.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "url"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public ReportsWebService_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ReportsWebService_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ReportsWebService_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "Report");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportCriteriaType");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportCriteriaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportExportOptions");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportExportOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportExportType");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportIdentity");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportParameter");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportParameterDataType");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportParameterDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportParameterKind");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportParameterKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportParameterValue");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "values");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportRetrievalOptions");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ReportType");
            cachedSerQNames.add(qName);
            cls = com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.Integer nop() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "Nop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Integer) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String retrieveVersionInformation() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "RetrieveVersionInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report retrieveRICReportByIdentity(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportIdentity identity, com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions retrieveOptions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "RetrieveRICReportByIdentity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identity, retrieveOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report) org.apache.axis.utils.JavaUtils.convert(_resp, com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report[] retrieveRICReports(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportRetrievalOptions retrieveOptions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "RetrieveRICReports"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String exportReportToFile(com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.Report report, com.upslogisticstech.www.UPSLT.TransportationSuite.ReportsWebService.ReportExportOptions exportOptions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.upslogisticstech.com/UPSLT/TransportationSuite/ReportsWebService", "ExportReportToFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {report, exportOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
