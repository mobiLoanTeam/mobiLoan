/**
 * ModifyCustomerFinancialDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerFinancialDataRequest  implements java.io.Serializable {
    private java.lang.String customerCode;

    private java.lang.String currency;

    private com.soprabanking.amplitude.ExpressionUnit expressionUnit;

    private com.soprabanking.amplitude.CustomerFinancialDataInformations[] financialData;

    public ModifyCustomerFinancialDataRequest() {
    }

    public ModifyCustomerFinancialDataRequest(
           java.lang.String customerCode,
           java.lang.String currency,
           com.soprabanking.amplitude.ExpressionUnit expressionUnit,
           com.soprabanking.amplitude.CustomerFinancialDataInformations[] financialData) {
           this.customerCode = customerCode;
           this.currency = currency;
           this.expressionUnit = expressionUnit;
           this.financialData = financialData;
    }


    /**
     * Gets the customerCode value for this ModifyCustomerFinancialDataRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this ModifyCustomerFinancialDataRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the currency value for this ModifyCustomerFinancialDataRequest.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ModifyCustomerFinancialDataRequest.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the expressionUnit value for this ModifyCustomerFinancialDataRequest.
     * 
     * @return expressionUnit
     */
    public com.soprabanking.amplitude.ExpressionUnit getExpressionUnit() {
        return expressionUnit;
    }


    /**
     * Sets the expressionUnit value for this ModifyCustomerFinancialDataRequest.
     * 
     * @param expressionUnit
     */
    public void setExpressionUnit(com.soprabanking.amplitude.ExpressionUnit expressionUnit) {
        this.expressionUnit = expressionUnit;
    }


    /**
     * Gets the financialData value for this ModifyCustomerFinancialDataRequest.
     * 
     * @return financialData
     */
    public com.soprabanking.amplitude.CustomerFinancialDataInformations[] getFinancialData() {
        return financialData;
    }


    /**
     * Sets the financialData value for this ModifyCustomerFinancialDataRequest.
     * 
     * @param financialData
     */
    public void setFinancialData(com.soprabanking.amplitude.CustomerFinancialDataInformations[] financialData) {
        this.financialData = financialData;
    }

    public com.soprabanking.amplitude.CustomerFinancialDataInformations getFinancialData(int i) {
        return this.financialData[i];
    }

    public void setFinancialData(int i, com.soprabanking.amplitude.CustomerFinancialDataInformations _value) {
        this.financialData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerFinancialDataRequest)) return false;
        ModifyCustomerFinancialDataRequest other = (ModifyCustomerFinancialDataRequest) obj;
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
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.expressionUnit==null && other.getExpressionUnit()==null) || 
             (this.expressionUnit!=null &&
              this.expressionUnit.equals(other.getExpressionUnit()))) &&
            ((this.financialData==null && other.getFinancialData()==null) || 
             (this.financialData!=null &&
              java.util.Arrays.equals(this.financialData, other.getFinancialData())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getExpressionUnit() != null) {
            _hashCode += getExpressionUnit().hashCode();
        }
        if (getFinancialData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinancialData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinancialData(), i);
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
        new org.apache.axis.description.TypeDesc(ModifyCustomerFinancialDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerFinancialDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressionUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "expressionUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "expressionUnit"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financialData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "financialData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFinancialDataInformations"));
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
