/**
 * CreateCustomerFreeAttributeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CreateCustomerFreeAttributeRequest  implements java.io.Serializable {
    private java.lang.String customerCode;

    private com.soprabanking.amplitude.AdditionalData additionalData;

    private java.lang.String freeText;

    public CreateCustomerFreeAttributeRequest() {
    }

    public CreateCustomerFreeAttributeRequest(
           java.lang.String customerCode,
           com.soprabanking.amplitude.AdditionalData additionalData,
           java.lang.String freeText) {
           this.customerCode = customerCode;
           this.additionalData = additionalData;
           this.freeText = freeText;
    }


    /**
     * Gets the customerCode value for this CreateCustomerFreeAttributeRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CreateCustomerFreeAttributeRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the additionalData value for this CreateCustomerFreeAttributeRequest.
     * 
     * @return additionalData
     */
    public com.soprabanking.amplitude.AdditionalData getAdditionalData() {
        return additionalData;
    }


    /**
     * Sets the additionalData value for this CreateCustomerFreeAttributeRequest.
     * 
     * @param additionalData
     */
    public void setAdditionalData(com.soprabanking.amplitude.AdditionalData additionalData) {
        this.additionalData = additionalData;
    }


    /**
     * Gets the freeText value for this CreateCustomerFreeAttributeRequest.
     * 
     * @return freeText
     */
    public java.lang.String getFreeText() {
        return freeText;
    }


    /**
     * Sets the freeText value for this CreateCustomerFreeAttributeRequest.
     * 
     * @param freeText
     */
    public void setFreeText(java.lang.String freeText) {
        this.freeText = freeText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerFreeAttributeRequest)) return false;
        CreateCustomerFreeAttributeRequest other = (CreateCustomerFreeAttributeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.additionalData==null && other.getAdditionalData()==null) || 
             (this.additionalData!=null &&
              this.additionalData.equals(other.getAdditionalData()))) &&
            ((this.freeText==null && other.getFreeText()==null) || 
             (this.freeText!=null &&
              this.freeText.equals(other.getFreeText())));
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
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getAdditionalData() != null) {
            _hashCode += getAdditionalData().hashCode();
        }
        if (getFreeText() != null) {
            _hashCode += getFreeText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerFreeAttributeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerFreeAttributeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "additionalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "additionalData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "freeText"));
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
