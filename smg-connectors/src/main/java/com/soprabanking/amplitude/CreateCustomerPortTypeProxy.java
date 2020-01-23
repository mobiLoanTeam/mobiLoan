package com.soprabanking.amplitude;

public class CreateCustomerPortTypeProxy implements com.soprabanking.amplitude.CreateCustomerPortType {
  private String _endpoint = null;
  private com.soprabanking.amplitude.CreateCustomerPortType createCustomerPortType = null;
  
  public CreateCustomerPortTypeProxy() {
    _initCreateCustomerPortTypeProxy();
  }
  
  public CreateCustomerPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreateCustomerPortTypeProxy();
  }
  
  private void _initCreateCustomerPortTypeProxy() {
    try {
      createCustomerPortType = (new com.soprabanking.amplitude.CreateCustomerLocator()).getcreateCustomerPortType();
      if (createCustomerPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)createCustomerPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)createCustomerPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (createCustomerPortType != null)
      ((javax.xml.rpc.Stub)createCustomerPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soprabanking.amplitude.CreateCustomerPortType getCreateCustomerPortType() {
    if (createCustomerPortType == null)
      _initCreateCustomerPortTypeProxy();
    return createCustomerPortType;
  }
  
  public com.soprabanking.amplitude.GetStatusResponseFlow getStatus(com.soprabanking.amplitude.GetStatusRequestFlow parameters) throws java.rmi.RemoteException, com.soprabanking.amplitude.ErrorResponseFlow{
    if (createCustomerPortType == null)
      _initCreateCustomerPortTypeProxy();
    return createCustomerPortType.getStatus(parameters);
  }
  
  public com.soprabanking.amplitude.CreateCustomerResponseFlow createCustomer(com.soprabanking.amplitude.CreateCustomerRequestFlow parameters) throws java.rmi.RemoteException, com.soprabanking.amplitude.ErrorResponseFlow{
    if (createCustomerPortType == null)
      _initCreateCustomerPortTypeProxy();
    return createCustomerPortType.createCustomer(parameters);
  }
  
  
}