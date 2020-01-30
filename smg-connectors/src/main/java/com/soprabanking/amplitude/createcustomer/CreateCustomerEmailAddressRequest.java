/**
 * CreateCustomerEmailAddressRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CreateCustomerEmailAddressRequest  implements java.io.Serializable {
    private com.soprabanking.amplitude.EmailCreateIdentifier identifier;

    private java.lang.String email;

    public CreateCustomerEmailAddressRequest() {
    }

    public CreateCustomerEmailAddressRequest(
           com.soprabanking.amplitude.EmailCreateIdentifier identifier,
           java.lang.String email) {
           this.identifier = identifier;
           this.email = email;
    }


    /**
     * Gets the identifier value for this CreateCustomerEmailAddressRequest.
     * 
     * @return identifier
     */
    public com.soprabanking.amplitude.EmailCreateIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this CreateCustomerEmailAddressRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(com.soprabanking.amplitude.EmailCreateIdentifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the email value for this CreateCustomerEmailAddressRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CreateCustomerEmailAddressRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerEmailAddressRequest)) return false;
        CreateCustomerEmailAddressRequest other = (CreateCustomerEmailAddressRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerEmailAddressRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerEmailAddressRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "emailCreateIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "email"));
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
