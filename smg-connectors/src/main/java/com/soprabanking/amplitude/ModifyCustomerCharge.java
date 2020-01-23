/**
 * ModifyCustomerCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerCharge  implements java.io.Serializable {
    private java.lang.String chargeCode;

    private com.soprabanking.amplitude.Periodicity periodicityCode;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal initialAmount;

    private java.lang.String currency;

    private java.util.Date maturityDate;

    private java.lang.String organisation;

    public ModifyCustomerCharge() {
    }

    public ModifyCustomerCharge(
           java.lang.String chargeCode,
           com.soprabanking.amplitude.Periodicity periodicityCode,
           java.math.BigDecimal amount,
           java.math.BigDecimal initialAmount,
           java.lang.String currency,
           java.util.Date maturityDate,
           java.lang.String organisation) {
           this.chargeCode = chargeCode;
           this.periodicityCode = periodicityCode;
           this.amount = amount;
           this.initialAmount = initialAmount;
           this.currency = currency;
           this.maturityDate = maturityDate;
           this.organisation = organisation;
    }


    /**
     * Gets the chargeCode value for this ModifyCustomerCharge.
     * 
     * @return chargeCode
     */
    public java.lang.String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this ModifyCustomerCharge.
     * 
     * @param chargeCode
     */
    public void setChargeCode(java.lang.String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the periodicityCode value for this ModifyCustomerCharge.
     * 
     * @return periodicityCode
     */
    public com.soprabanking.amplitude.Periodicity getPeriodicityCode() {
        return periodicityCode;
    }


    /**
     * Sets the periodicityCode value for this ModifyCustomerCharge.
     * 
     * @param periodicityCode
     */
    public void setPeriodicityCode(com.soprabanking.amplitude.Periodicity periodicityCode) {
        this.periodicityCode = periodicityCode;
    }


    /**
     * Gets the amount value for this ModifyCustomerCharge.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ModifyCustomerCharge.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the initialAmount value for this ModifyCustomerCharge.
     * 
     * @return initialAmount
     */
    public java.math.BigDecimal getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this ModifyCustomerCharge.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(java.math.BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the currency value for this ModifyCustomerCharge.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ModifyCustomerCharge.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the maturityDate value for this ModifyCustomerCharge.
     * 
     * @return maturityDate
     */
    public java.util.Date getMaturityDate() {
        return maturityDate;
    }


    /**
     * Sets the maturityDate value for this ModifyCustomerCharge.
     * 
     * @param maturityDate
     */
    public void setMaturityDate(java.util.Date maturityDate) {
        this.maturityDate = maturityDate;
    }


    /**
     * Gets the organisation value for this ModifyCustomerCharge.
     * 
     * @return organisation
     */
    public java.lang.String getOrganisation() {
        return organisation;
    }


    /**
     * Sets the organisation value for this ModifyCustomerCharge.
     * 
     * @param organisation
     */
    public void setOrganisation(java.lang.String organisation) {
        this.organisation = organisation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerCharge)) return false;
        ModifyCustomerCharge other = (ModifyCustomerCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.periodicityCode==null && other.getPeriodicityCode()==null) || 
             (this.periodicityCode!=null &&
              this.periodicityCode.equals(other.getPeriodicityCode()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.initialAmount==null && other.getInitialAmount()==null) || 
             (this.initialAmount!=null &&
              this.initialAmount.equals(other.getInitialAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.maturityDate==null && other.getMaturityDate()==null) || 
             (this.maturityDate!=null &&
              this.maturityDate.equals(other.getMaturityDate()))) &&
            ((this.organisation==null && other.getOrganisation()==null) || 
             (this.organisation!=null &&
              this.organisation.equals(other.getOrganisation())));
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
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getPeriodicityCode() != null) {
            _hashCode += getPeriodicityCode().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getInitialAmount() != null) {
            _hashCode += getInitialAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getMaturityDate() != null) {
            _hashCode += getMaturityDate().hashCode();
        }
        if (getOrganisation() != null) {
            _hashCode += getOrganisation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCustomerCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "chargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "periodicityCode"));
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
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "initialAmount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maturityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "maturityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organisation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "organisation"));
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
