/**
 * ErrorResponseFlow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ErrorResponseFlow  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.soprabanking.amplitude.ResponseHeader responseHeader;

    private com.soprabanking.amplitude.ResponseStatus responseStatus;

    public ErrorResponseFlow() {
    }

    public ErrorResponseFlow(
           com.soprabanking.amplitude.ResponseHeader responseHeader,
           com.soprabanking.amplitude.ResponseStatus responseStatus) {
        this.responseHeader = responseHeader;
        this.responseStatus = responseStatus;
    }


    /**
     * Gets the responseHeader value for this ErrorResponseFlow.
     * 
     * @return responseHeader
     */
    public com.soprabanking.amplitude.ResponseHeader getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this ErrorResponseFlow.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(com.soprabanking.amplitude.ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the responseStatus value for this ErrorResponseFlow.
     * 
     * @return responseStatus
     */
    public com.soprabanking.amplitude.ResponseStatus getResponseStatus() {
        return responseStatus;
    }


    /**
     * Sets the responseStatus value for this ErrorResponseFlow.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(com.soprabanking.amplitude.ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorResponseFlow)) return false;
        ErrorResponseFlow other = (ErrorResponseFlow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseHeader==null && other.getResponseHeader()==null) || 
             (this.responseHeader!=null &&
              this.responseHeader.equals(other.getResponseHeader()))) &&
            ((this.responseStatus==null && other.getResponseStatus()==null) || 
             (this.responseStatus!=null &&
              this.responseStatus.equals(other.getResponseStatus())));
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
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getResponseStatus() != null) {
            _hashCode += getResponseStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorResponseFlow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "errorResponseFlow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "responseHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "responseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "responseStatus"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
