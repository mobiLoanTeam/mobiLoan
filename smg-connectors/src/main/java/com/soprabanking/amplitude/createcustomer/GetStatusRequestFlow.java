/**
 * GetStatusRequestFlow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class GetStatusRequestFlow  implements java.io.Serializable {
    private java.lang.String getStatusRequest;

    public GetStatusRequestFlow() {
    }

    public GetStatusRequestFlow(
           java.lang.String getStatusRequest) {
           this.getStatusRequest = getStatusRequest;
    }


    /**
     * Gets the getStatusRequest value for this GetStatusRequestFlow.
     * 
     * @return getStatusRequest
     */
    public java.lang.String getGetStatusRequest() {
        return getStatusRequest;
    }


    /**
     * Sets the getStatusRequest value for this GetStatusRequestFlow.
     * 
     * @param getStatusRequest
     */
    public void setGetStatusRequest(java.lang.String getStatusRequest) {
        this.getStatusRequest = getStatusRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStatusRequestFlow)) return false;
        GetStatusRequestFlow other = (GetStatusRequestFlow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStatusRequest==null && other.getGetStatusRequest()==null) || 
             (this.getStatusRequest!=null &&
              this.getStatusRequest.equals(other.getGetStatusRequest())));
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
        if (getGetStatusRequest() != null) {
            _hashCode += getGetStatusRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStatusRequestFlow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "getStatusRequestFlow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStatusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "getStatusRequest"));
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
