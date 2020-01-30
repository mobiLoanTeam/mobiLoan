/**
 * CustomerCreditInfoCentreCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerCreditInfoCentreCreate  implements java.io.Serializable {
    private java.lang.String customerRelationshipRisk;

    private java.lang.String creditInfoCentreRegistrationNumber;

    private com.soprabanking.amplitude.CreditInfoCentreCodeToDeclare creditInfoCentreCodeToDeclare;

    private java.lang.String creditInfoCentreKey;

    public CustomerCreditInfoCentreCreate() {
    }

    public CustomerCreditInfoCentreCreate(
           java.lang.String customerRelationshipRisk,
           java.lang.String creditInfoCentreRegistrationNumber,
           com.soprabanking.amplitude.CreditInfoCentreCodeToDeclare creditInfoCentreCodeToDeclare,
           java.lang.String creditInfoCentreKey) {
           this.customerRelationshipRisk = customerRelationshipRisk;
           this.creditInfoCentreRegistrationNumber = creditInfoCentreRegistrationNumber;
           this.creditInfoCentreCodeToDeclare = creditInfoCentreCodeToDeclare;
           this.creditInfoCentreKey = creditInfoCentreKey;
    }


    /**
     * Gets the customerRelationshipRisk value for this CustomerCreditInfoCentreCreate.
     * 
     * @return customerRelationshipRisk
     */
    public java.lang.String getCustomerRelationshipRisk() {
        return customerRelationshipRisk;
    }


    /**
     * Sets the customerRelationshipRisk value for this CustomerCreditInfoCentreCreate.
     * 
     * @param customerRelationshipRisk
     */
    public void setCustomerRelationshipRisk(java.lang.String customerRelationshipRisk) {
        this.customerRelationshipRisk = customerRelationshipRisk;
    }


    /**
     * Gets the creditInfoCentreRegistrationNumber value for this CustomerCreditInfoCentreCreate.
     * 
     * @return creditInfoCentreRegistrationNumber
     */
    public java.lang.String getCreditInfoCentreRegistrationNumber() {
        return creditInfoCentreRegistrationNumber;
    }


    /**
     * Sets the creditInfoCentreRegistrationNumber value for this CustomerCreditInfoCentreCreate.
     * 
     * @param creditInfoCentreRegistrationNumber
     */
    public void setCreditInfoCentreRegistrationNumber(java.lang.String creditInfoCentreRegistrationNumber) {
        this.creditInfoCentreRegistrationNumber = creditInfoCentreRegistrationNumber;
    }


    /**
     * Gets the creditInfoCentreCodeToDeclare value for this CustomerCreditInfoCentreCreate.
     * 
     * @return creditInfoCentreCodeToDeclare
     */
    public com.soprabanking.amplitude.CreditInfoCentreCodeToDeclare getCreditInfoCentreCodeToDeclare() {
        return creditInfoCentreCodeToDeclare;
    }


    /**
     * Sets the creditInfoCentreCodeToDeclare value for this CustomerCreditInfoCentreCreate.
     * 
     * @param creditInfoCentreCodeToDeclare
     */
    public void setCreditInfoCentreCodeToDeclare(com.soprabanking.amplitude.CreditInfoCentreCodeToDeclare creditInfoCentreCodeToDeclare) {
        this.creditInfoCentreCodeToDeclare = creditInfoCentreCodeToDeclare;
    }


    /**
     * Gets the creditInfoCentreKey value for this CustomerCreditInfoCentreCreate.
     * 
     * @return creditInfoCentreKey
     */
    public java.lang.String getCreditInfoCentreKey() {
        return creditInfoCentreKey;
    }


    /**
     * Sets the creditInfoCentreKey value for this CustomerCreditInfoCentreCreate.
     * 
     * @param creditInfoCentreKey
     */
    public void setCreditInfoCentreKey(java.lang.String creditInfoCentreKey) {
        this.creditInfoCentreKey = creditInfoCentreKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerCreditInfoCentreCreate)) return false;
        CustomerCreditInfoCentreCreate other = (CustomerCreditInfoCentreCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerRelationshipRisk==null && other.getCustomerRelationshipRisk()==null) || 
             (this.customerRelationshipRisk!=null &&
              this.customerRelationshipRisk.equals(other.getCustomerRelationshipRisk()))) &&
            ((this.creditInfoCentreRegistrationNumber==null && other.getCreditInfoCentreRegistrationNumber()==null) || 
             (this.creditInfoCentreRegistrationNumber!=null &&
              this.creditInfoCentreRegistrationNumber.equals(other.getCreditInfoCentreRegistrationNumber()))) &&
            ((this.creditInfoCentreCodeToDeclare==null && other.getCreditInfoCentreCodeToDeclare()==null) || 
             (this.creditInfoCentreCodeToDeclare!=null &&
              this.creditInfoCentreCodeToDeclare.equals(other.getCreditInfoCentreCodeToDeclare()))) &&
            ((this.creditInfoCentreKey==null && other.getCreditInfoCentreKey()==null) || 
             (this.creditInfoCentreKey!=null &&
              this.creditInfoCentreKey.equals(other.getCreditInfoCentreKey())));
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
        if (getCustomerRelationshipRisk() != null) {
            _hashCode += getCustomerRelationshipRisk().hashCode();
        }
        if (getCreditInfoCentreRegistrationNumber() != null) {
            _hashCode += getCreditInfoCentreRegistrationNumber().hashCode();
        }
        if (getCreditInfoCentreCodeToDeclare() != null) {
            _hashCode += getCreditInfoCentreCodeToDeclare().hashCode();
        }
        if (getCreditInfoCentreKey() != null) {
            _hashCode += getCreditInfoCentreKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerCreditInfoCentreCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCreditInfoCentreCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRelationshipRisk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerRelationshipRisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditInfoCentreRegistrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "creditInfoCentreRegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditInfoCentreCodeToDeclare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "creditInfoCentreCodeToDeclare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "creditInfoCentreCodeToDeclare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditInfoCentreKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "creditInfoCentreKey"));
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
