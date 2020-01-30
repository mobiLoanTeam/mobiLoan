/**
 * ModifyCustomerJointAccountsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerJointAccountsRequest  implements java.io.Serializable {
    private java.lang.String mainCustomerCode;

    private com.soprabanking.amplitude.CustomerJointAccountInformations[] customerJointAccount;

    public ModifyCustomerJointAccountsRequest() {
    }

    public ModifyCustomerJointAccountsRequest(
           java.lang.String mainCustomerCode,
           com.soprabanking.amplitude.CustomerJointAccountInformations[] customerJointAccount) {
           this.mainCustomerCode = mainCustomerCode;
           this.customerJointAccount = customerJointAccount;
    }


    /**
     * Gets the mainCustomerCode value for this ModifyCustomerJointAccountsRequest.
     * 
     * @return mainCustomerCode
     */
    public java.lang.String getMainCustomerCode() {
        return mainCustomerCode;
    }


    /**
     * Sets the mainCustomerCode value for this ModifyCustomerJointAccountsRequest.
     * 
     * @param mainCustomerCode
     */
    public void setMainCustomerCode(java.lang.String mainCustomerCode) {
        this.mainCustomerCode = mainCustomerCode;
    }


    /**
     * Gets the customerJointAccount value for this ModifyCustomerJointAccountsRequest.
     * 
     * @return customerJointAccount
     */
    public com.soprabanking.amplitude.CustomerJointAccountInformations[] getCustomerJointAccount() {
        return customerJointAccount;
    }


    /**
     * Sets the customerJointAccount value for this ModifyCustomerJointAccountsRequest.
     * 
     * @param customerJointAccount
     */
    public void setCustomerJointAccount(com.soprabanking.amplitude.CustomerJointAccountInformations[] customerJointAccount) {
        this.customerJointAccount = customerJointAccount;
    }

    public com.soprabanking.amplitude.CustomerJointAccountInformations getCustomerJointAccount(int i) {
        return this.customerJointAccount[i];
    }

    public void setCustomerJointAccount(int i, com.soprabanking.amplitude.CustomerJointAccountInformations _value) {
        this.customerJointAccount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerJointAccountsRequest)) return false;
        ModifyCustomerJointAccountsRequest other = (ModifyCustomerJointAccountsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mainCustomerCode==null && other.getMainCustomerCode()==null) || 
             (this.mainCustomerCode!=null &&
              this.mainCustomerCode.equals(other.getMainCustomerCode()))) &&
            ((this.customerJointAccount==null && other.getCustomerJointAccount()==null) || 
             (this.customerJointAccount!=null &&
              java.util.Arrays.equals(this.customerJointAccount, other.getCustomerJointAccount())));
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
        if (getMainCustomerCode() != null) {
            _hashCode += getMainCustomerCode().hashCode();
        }
        if (getCustomerJointAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerJointAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerJointAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCustomerJointAccountsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerJointAccountsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "mainCustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJointAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerJointAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerJointAccountInformations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
