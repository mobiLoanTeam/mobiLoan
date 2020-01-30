/**
 * CreateCustomerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public interface CreateCustomerPortType extends java.rmi.Remote {
    public com.soprabanking.amplitude.GetStatusResponseFlow getStatus(com.soprabanking.amplitude.GetStatusRequestFlow parameters) throws java.rmi.RemoteException, com.soprabanking.amplitude.ErrorResponseFlow;
    public com.soprabanking.amplitude.CreateCustomerResponseFlow createCustomer(com.soprabanking.amplitude.CreateCustomerRequestFlow parameters) throws java.rmi.RemoteException, com.soprabanking.amplitude.ErrorResponseFlow;
}
