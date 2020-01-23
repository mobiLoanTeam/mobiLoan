/**
 * CreateCustomerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CreateCustomerLocator extends org.apache.axis.client.Service implements com.soprabanking.amplitude.CreateCustomer {

    public CreateCustomerLocator() {
    }


    public CreateCustomerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreateCustomerLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for createCustomerPortType
    private java.lang.String createCustomerPortType_address = "http://localhost:8088/mockcreateCustomerBinding";

    public java.lang.String getcreateCustomerPortTypeAddress() {
        return createCustomerPortType_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String createCustomerPortTypeWSDDServiceName = "createCustomerPortType";

    public java.lang.String getcreateCustomerPortTypeWSDDServiceName() {
        return createCustomerPortTypeWSDDServiceName;
    }

    public void setcreateCustomerPortTypeWSDDServiceName(java.lang.String name) {
        createCustomerPortTypeWSDDServiceName = name;
    }

    public com.soprabanking.amplitude.CreateCustomerPortType getcreateCustomerPortType() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(createCustomerPortType_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcreateCustomerPortType(endpoint);
    }

    public com.soprabanking.amplitude.CreateCustomerPortType getcreateCustomerPortType(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soprabanking.amplitude.CreateCustomerBindingStub _stub = new com.soprabanking.amplitude.CreateCustomerBindingStub(portAddress, this);
            _stub.setPortName(getcreateCustomerPortTypeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcreateCustomerPortTypeEndpointAddress(java.lang.String address) {
        createCustomerPortType_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soprabanking.amplitude.CreateCustomerPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soprabanking.amplitude.CreateCustomerBindingStub _stub = new com.soprabanking.amplitude.CreateCustomerBindingStub(new java.net.URL(createCustomerPortType_address), this);
                _stub.setPortName(getcreateCustomerPortTypeWSDDServiceName());
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
        if ("createCustomerPortType".equals(inputPortName)) {
            return getcreateCustomerPortType();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomer");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerPortType"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("createCustomerPortType".equals(portName)) {
            setcreateCustomerPortTypeEndpointAddress(address);
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
