/**
 * ModifyCustomerBudget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerBudget  implements java.io.Serializable {
    private java.lang.String customerCode;

    private java.lang.Integer budgetReferenceYear;

    private java.math.BigDecimal averageTaxRate;

    public ModifyCustomerBudget() {
    }

    public ModifyCustomerBudget(
           java.lang.String customerCode,
           java.lang.Integer budgetReferenceYear,
           java.math.BigDecimal averageTaxRate) {
           this.customerCode = customerCode;
           this.budgetReferenceYear = budgetReferenceYear;
           this.averageTaxRate = averageTaxRate;
    }


    /**
     * Gets the customerCode value for this ModifyCustomerBudget.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this ModifyCustomerBudget.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the budgetReferenceYear value for this ModifyCustomerBudget.
     * 
     * @return budgetReferenceYear
     */
    public java.lang.Integer getBudgetReferenceYear() {
        return budgetReferenceYear;
    }


    /**
     * Sets the budgetReferenceYear value for this ModifyCustomerBudget.
     * 
     * @param budgetReferenceYear
     */
    public void setBudgetReferenceYear(java.lang.Integer budgetReferenceYear) {
        this.budgetReferenceYear = budgetReferenceYear;
    }


    /**
     * Gets the averageTaxRate value for this ModifyCustomerBudget.
     * 
     * @return averageTaxRate
     */
    public java.math.BigDecimal getAverageTaxRate() {
        return averageTaxRate;
    }


    /**
     * Sets the averageTaxRate value for this ModifyCustomerBudget.
     * 
     * @param averageTaxRate
     */
    public void setAverageTaxRate(java.math.BigDecimal averageTaxRate) {
        this.averageTaxRate = averageTaxRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerBudget)) return false;
        ModifyCustomerBudget other = (ModifyCustomerBudget) obj;
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
            ((this.budgetReferenceYear==null && other.getBudgetReferenceYear()==null) || 
             (this.budgetReferenceYear!=null &&
              this.budgetReferenceYear.equals(other.getBudgetReferenceYear()))) &&
            ((this.averageTaxRate==null && other.getAverageTaxRate()==null) || 
             (this.averageTaxRate!=null &&
              this.averageTaxRate.equals(other.getAverageTaxRate())));
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
        if (getBudgetReferenceYear() != null) {
            _hashCode += getBudgetReferenceYear().hashCode();
        }
        if (getAverageTaxRate() != null) {
            _hashCode += getAverageTaxRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCustomerBudget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerBudget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetReferenceYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "budgetReferenceYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageTaxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "averageTaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
