/**
 * EMailSenderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.emailsender.webservices.source;

public class EMailSenderServiceLocator extends org.apache.axis.client.Service implements com.seda.emailsender.webservices.source.EMailSenderService {

    public EMailSenderServiceLocator() {
    }


    public EMailSenderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EMailSenderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EMailSenderPort
    private java.lang.String EMailSenderPort_address = "http://10.10.9.107:10110/EMailSender/service";

    public java.lang.String getEMailSenderPortAddress() {
        return EMailSenderPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EMailSenderPortWSDDServiceName = "EMailSenderPort";

    public java.lang.String getEMailSenderPortWSDDServiceName() {
        return EMailSenderPortWSDDServiceName;
    }

    public void setEMailSenderPortWSDDServiceName(java.lang.String name) {
        EMailSenderPortWSDDServiceName = name;
    }

    public com.seda.emailsender.webservices.source.EMailSenderInterface getEMailSenderPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EMailSenderPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEMailSenderPort(endpoint);
    }

    public com.seda.emailsender.webservices.source.EMailSenderInterface getEMailSenderPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.emailsender.webservices.source.EMailSenderSOAPBindingStub _stub = new com.seda.emailsender.webservices.source.EMailSenderSOAPBindingStub(portAddress, this);
            _stub.setPortName(getEMailSenderPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEMailSenderPortEndpointAddress(java.lang.String address) {
        EMailSenderPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.emailsender.webservices.source.EMailSenderInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.emailsender.webservices.source.EMailSenderSOAPBindingStub _stub = new com.seda.emailsender.webservices.source.EMailSenderSOAPBindingStub(new java.net.URL(EMailSenderPort_address), this);
                _stub.setPortName(getEMailSenderPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EMailSenderPort".equals(inputPortName)) {
            return getEMailSenderPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservices.emailsender.seda.com", "EMailSenderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservices.emailsender.seda.com", "EMailSenderPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EMailSenderPort".equals(portName)) {
            setEMailSenderPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
