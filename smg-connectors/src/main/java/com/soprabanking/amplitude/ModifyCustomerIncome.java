/**
 * ModifyCustomerIncome.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerIncome  implements java.io.Serializable {
    private java.lang.String incomeCode;

    private com.soprabanking.amplitude.Periodicity incomePeriodicityCode;

    private java.math.BigDecimal amount;

    private java.lang.String currency;

    public ModifyCustomerIncome() {
    }

    public ModifyCustomerIncome(
           java.lang.String incomeCode,
           com.soprabanking.amplitude.Periodicity incomePeriodicityCode,
           java.math.BigDecimal amount,
           java.lang.String currency) {
           this.incomeCode = incomeCode;
           this.incomePeriodicityCode = incomePeriodicityCode;
           this.amount = amount;
           this.currency = currency;
    }


    /**
     * Gets the incomeCode value for this ModifyCustomerIncome.
     * 
     * @return incomeCode
     */
    public java.lang.String getIncomeCode() {
        return incomeCode;
    }


    /**
     * Sets the incomeCode value for this ModifyCustomerIncome.
     * 
     * @param incomeCode
     */
    public void setIncomeCode(java.lang.String incomeCode) {
        this.incomeCode = incomeCode;
    }


    /**
     * Gets the incomePeriodicityCode value for this ModifyCustomerIncome.
     * 
     * @return incomePeriodicityCode
     */
    public com.soprabanking.amplitude.Periodicity getIncomePeriodicityCode() {
        return incomePeriodicityCode;
    }


    /**
     * Sets the incomePeriodicityCode value for this ModifyCustomerIncome.
     * 
     * @param incomePeriodicityCode
     */
    public void setIncomePeriodicityCode(com.soprabanking.amplitude.Periodicity incomePeriodicityCode) {
        this.incomePeriodicityCode = incomePeriodicityCode;
    }


    /**
     * Gets the amount value for this ModifyCustomerIncome.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ModifyCustomerIncome.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this ModifyCustomerIncome.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ModifyCustomerIncome.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerIncome)) return false;
        ModifyCustomerIncome other = (ModifyCustomerIncome) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.incomeCode==null && other.getIncomeCode()==null) || 
             (this.incomeCode!=null &&
              this.incomeCode.equals(other.getIncomeCode()))) &&
            ((this.incomePeriodicityCode==null && other.getIncomePeriodicityCode()==null) || 
             (this.incomePeriodicityCode!=null &&
              this.incomePeriodicityCode.equals(other.getIncomePeriodicityCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
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
        if (getIncomeCode() != null) {
            _hashCode += getIncomeCode().hashCode();
        }
        if (getIncomePeriodicityCode() != null) {
            _hashCode += getIncomePeriodicityCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCustomerIncome.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerIncome"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "incomeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomePeriodicityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "incomePeriodicityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "periodicity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
