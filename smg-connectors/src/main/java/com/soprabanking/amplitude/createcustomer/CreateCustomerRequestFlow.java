/**
 * CreateCustomerRequestFlow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CreateCustomerRequestFlow  implements java.io.Serializable {
    private com.soprabanking.amplitude.RequestHeader requestHeader;

    private com.soprabanking.amplitude.CreateCustomerRequest createCustomerRequest;

    public CreateCustomerRequestFlow() {
    }

    public CreateCustomerRequestFlow(
           com.soprabanking.amplitude.RequestHeader requestHeader,
           com.soprabanking.amplitude.CreateCustomerRequest createCustomerRequest) {
           this.requestHeader = requestHeader;
           this.createCustomerRequest = createCustomerRequest;
    }


    /**
     * Gets the requestHeader value for this CreateCustomerRequestFlow.
     * 
     * @return requestHeader
     */
    public com.soprabanking.amplitude.RequestHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CreateCustomerRequestFlow.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(com.soprabanking.amplitude.RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the createCustomerRequest value for this CreateCustomerRequestFlow.
     * 
     * @return createCustomerRequest
     */
    public com.soprabanking.amplitude.CreateCustomerRequest getCreateCustomerRequest() {
        return createCustomerRequest;
    }


    /**
     * Sets the createCustomerRequest value for this CreateCustomerRequestFlow.
     * 
     * @param createCustomerRequest
     */
    public void setCreateCustomerRequest(com.soprabanking.amplitude.CreateCustomerRequest createCustomerRequest) {
        this.createCustomerRequest = createCustomerRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerRequestFlow)) return false;
        CreateCustomerRequestFlow other = (CreateCustomerRequestFlow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestHeader==null && other.getRequestHeader()==null) || 
             (this.requestHeader!=null &&
              this.requestHeader.equals(other.getRequestHeader()))) &&
            ((this.createCustomerRequest==null && other.getCreateCustomerRequest()==null) || 
             (this.createCustomerRequest!=null &&
              this.createCustomerRequest.equals(other.getCreateCustomerRequest())));
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
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getCreateCustomerRequest() != null) {
            _hashCode += getCreateCustomerRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerRequestFlow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerRequestFlow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "requestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createCustomerRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerRequest"));
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
