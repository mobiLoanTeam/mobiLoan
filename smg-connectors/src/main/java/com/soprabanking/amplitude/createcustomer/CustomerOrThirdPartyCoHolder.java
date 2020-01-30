/**
 * CustomerOrThirdPartyCoHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerOrThirdPartyCoHolder  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerOrThirdPartyType coHolderType;

    private java.lang.String jointCustomerCode;

    public CustomerOrThirdPartyCoHolder() {
    }

    public CustomerOrThirdPartyCoHolder(
           com.soprabanking.amplitude.CustomerOrThirdPartyType coHolderType,
           java.lang.String jointCustomerCode) {
           this.coHolderType = coHolderType;
           this.jointCustomerCode = jointCustomerCode;
    }


    /**
     * Gets the coHolderType value for this CustomerOrThirdPartyCoHolder.
     * 
     * @return coHolderType
     */
    public com.soprabanking.amplitude.CustomerOrThirdPartyType getCoHolderType() {
        return coHolderType;
    }


    /**
     * Sets the coHolderType value for this CustomerOrThirdPartyCoHolder.
     * 
     * @param coHolderType
     */
    public void setCoHolderType(com.soprabanking.amplitude.CustomerOrThirdPartyType coHolderType) {
        this.coHolderType = coHolderType;
    }


    /**
     * Gets the jointCustomerCode value for this CustomerOrThirdPartyCoHolder.
     * 
     * @return jointCustomerCode
     */
    public java.lang.String getJointCustomerCode() {
        return jointCustomerCode;
    }


    /**
     * Sets the jointCustomerCode value for this CustomerOrThirdPartyCoHolder.
     * 
     * @param jointCustomerCode
     */
    public void setJointCustomerCode(java.lang.String jointCustomerCode) {
        this.jointCustomerCode = jointCustomerCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerOrThirdPartyCoHolder)) return false;
        CustomerOrThirdPartyCoHolder other = (CustomerOrThirdPartyCoHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coHolderType==null && other.getCoHolderType()==null) || 
             (this.coHolderType!=null &&
              this.coHolderType.equals(other.getCoHolderType()))) &&
            ((this.jointCustomerCode==null && other.getJointCustomerCode()==null) || 
             (this.jointCustomerCode!=null &&
              this.jointCustomerCode.equals(other.getJointCustomerCode())));
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
        if (getCoHolderType() != null) {
            _hashCode += getCoHolderType().hashCode();
        }
        if (getJointCustomerCode() != null) {
            _hashCode += getJointCustomerCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerOrThirdPartyCoHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOrThirdPartyCoHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coHolderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "coHolderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOrThirdPartyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jointCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "jointCustomerCode"));
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
