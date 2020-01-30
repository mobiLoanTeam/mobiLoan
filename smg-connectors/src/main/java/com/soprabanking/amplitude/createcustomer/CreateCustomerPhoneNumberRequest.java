/**
 * CreateCustomerPhoneNumberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CreateCustomerPhoneNumberRequest  implements java.io.Serializable {
    private com.soprabanking.amplitude.PhoneNumberCreateIdentifier identifier;

    private java.lang.String phoneNumber;

    private java.lang.String format;

    public CreateCustomerPhoneNumberRequest() {
    }

    public CreateCustomerPhoneNumberRequest(
           com.soprabanking.amplitude.PhoneNumberCreateIdentifier identifier,
           java.lang.String phoneNumber,
           java.lang.String format) {
           this.identifier = identifier;
           this.phoneNumber = phoneNumber;
           this.format = format;
    }


    /**
     * Gets the identifier value for this CreateCustomerPhoneNumberRequest.
     * 
     * @return identifier
     */
    public com.soprabanking.amplitude.PhoneNumberCreateIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this CreateCustomerPhoneNumberRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(com.soprabanking.amplitude.PhoneNumberCreateIdentifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the phoneNumber value for this CreateCustomerPhoneNumberRequest.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CreateCustomerPhoneNumberRequest.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the format value for this CreateCustomerPhoneNumberRequest.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this CreateCustomerPhoneNumberRequest.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerPhoneNumberRequest)) return false;
        CreateCustomerPhoneNumberRequest other = (CreateCustomerPhoneNumberRequest) obj;
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
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat())));
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerPhoneNumberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerPhoneNumberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "phoneNumberCreateIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
