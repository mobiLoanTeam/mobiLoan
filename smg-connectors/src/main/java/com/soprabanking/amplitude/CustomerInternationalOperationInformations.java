/**
 * CustomerInternationalOperationInformations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerInternationalOperationInformations  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerInternationalOperationType customerInternationalOperationType;

    private java.lang.String customerInternationalOperationCode;

    public CustomerInternationalOperationInformations() {
    }

    public CustomerInternationalOperationInformations(
           com.soprabanking.amplitude.CustomerInternationalOperationType customerInternationalOperationType,
           java.lang.String customerInternationalOperationCode) {
           this.customerInternationalOperationType = customerInternationalOperationType;
           this.customerInternationalOperationCode = customerInternationalOperationCode;
    }


    /**
     * Gets the customerInternationalOperationType value for this CustomerInternationalOperationInformations.
     * 
     * @return customerInternationalOperationType
     */
    public com.soprabanking.amplitude.CustomerInternationalOperationType getCustomerInternationalOperationType() {
        return customerInternationalOperationType;
    }


    /**
     * Sets the customerInternationalOperationType value for this CustomerInternationalOperationInformations.
     * 
     * @param customerInternationalOperationType
     */
    public void setCustomerInternationalOperationType(com.soprabanking.amplitude.CustomerInternationalOperationType customerInternationalOperationType) {
        this.customerInternationalOperationType = customerInternationalOperationType;
    }


    /**
     * Gets the customerInternationalOperationCode value for this CustomerInternationalOperationInformations.
     * 
     * @return customerInternationalOperationCode
     */
    public java.lang.String getCustomerInternationalOperationCode() {
        return customerInternationalOperationCode;
    }


    /**
     * Sets the customerInternationalOperationCode value for this CustomerInternationalOperationInformations.
     * 
     * @param customerInternationalOperationCode
     */
    public void setCustomerInternationalOperationCode(java.lang.String customerInternationalOperationCode) {
        this.customerInternationalOperationCode = customerInternationalOperationCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerInternationalOperationInformations)) return false;
        CustomerInternationalOperationInformations other = (CustomerInternationalOperationInformations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerInternationalOperationType==null && other.getCustomerInternationalOperationType()==null) || 
             (this.customerInternationalOperationType!=null &&
              this.customerInternationalOperationType.equals(other.getCustomerInternationalOperationType()))) &&
            ((this.customerInternationalOperationCode==null && other.getCustomerInternationalOperationCode()==null) || 
             (this.customerInternationalOperationCode!=null &&
              this.customerInternationalOperationCode.equals(other.getCustomerInternationalOperationCode())));
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
        if (getCustomerInternationalOperationType() != null) {
            _hashCode += getCustomerInternationalOperationType().hashCode();
        }
        if (getCustomerInternationalOperationCode() != null) {
            _hashCode += getCustomerInternationalOperationCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerInternationalOperationInformations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerInternationalOperationInformations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerInternationalOperationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerInternationalOperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerInternationalOperationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerInternationalOperationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerInternationalOperationCode"));
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
