/**
 * CustomerCoHolderInformations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerCoHolderInformations  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerOrThirdPartyCoHolder customerOrThirdParty;

    private com.soprabanking.amplitude.OtherCoHolderType otherCoHolderType;

    public CustomerCoHolderInformations() {
    }

    public CustomerCoHolderInformations(
           com.soprabanking.amplitude.CustomerOrThirdPartyCoHolder customerOrThirdParty,
           com.soprabanking.amplitude.OtherCoHolderType otherCoHolderType) {
           this.customerOrThirdParty = customerOrThirdParty;
           this.otherCoHolderType = otherCoHolderType;
    }


    /**
     * Gets the customerOrThirdParty value for this CustomerCoHolderInformations.
     * 
     * @return customerOrThirdParty
     */
    public com.soprabanking.amplitude.CustomerOrThirdPartyCoHolder getCustomerOrThirdParty() {
        return customerOrThirdParty;
    }


    /**
     * Sets the customerOrThirdParty value for this CustomerCoHolderInformations.
     * 
     * @param customerOrThirdParty
     */
    public void setCustomerOrThirdParty(com.soprabanking.amplitude.CustomerOrThirdPartyCoHolder customerOrThirdParty) {
        this.customerOrThirdParty = customerOrThirdParty;
    }


    /**
     * Gets the otherCoHolderType value for this CustomerCoHolderInformations.
     * 
     * @return otherCoHolderType
     */
    public com.soprabanking.amplitude.OtherCoHolderType getOtherCoHolderType() {
        return otherCoHolderType;
    }


    /**
     * Sets the otherCoHolderType value for this CustomerCoHolderInformations.
     * 
     * @param otherCoHolderType
     */
    public void setOtherCoHolderType(com.soprabanking.amplitude.OtherCoHolderType otherCoHolderType) {
        this.otherCoHolderType = otherCoHolderType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerCoHolderInformations)) return false;
        CustomerCoHolderInformations other = (CustomerCoHolderInformations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerOrThirdParty==null && other.getCustomerOrThirdParty()==null) || 
             (this.customerOrThirdParty!=null &&
              this.customerOrThirdParty.equals(other.getCustomerOrThirdParty()))) &&
            ((this.otherCoHolderType==null && other.getOtherCoHolderType()==null) || 
             (this.otherCoHolderType!=null &&
              this.otherCoHolderType.equals(other.getOtherCoHolderType())));
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
        if (getCustomerOrThirdParty() != null) {
            _hashCode += getCustomerOrThirdParty().hashCode();
        }
        if (getOtherCoHolderType() != null) {
            _hashCode += getOtherCoHolderType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerCoHolderInformations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCoHolderInformations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerOrThirdParty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOrThirdParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOrThirdPartyCoHolder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherCoHolderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "otherCoHolderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "otherCoHolderType"));
        elemField.setMinOccurs(0);
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
