/**
 * ModifyCustomerBudgetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerBudgetRequest  implements java.io.Serializable {
    private com.soprabanking.amplitude.ModifyCustomerBudget customerBudget;

    private com.soprabanking.amplitude.ModifyCustomerIncome[] customerIncomes;

    private com.soprabanking.amplitude.ModifyCustomerCharge[] customerCharges;

    public ModifyCustomerBudgetRequest() {
    }

    public ModifyCustomerBudgetRequest(
           com.soprabanking.amplitude.ModifyCustomerBudget customerBudget,
           com.soprabanking.amplitude.ModifyCustomerIncome[] customerIncomes,
           com.soprabanking.amplitude.ModifyCustomerCharge[] customerCharges) {
           this.customerBudget = customerBudget;
           this.customerIncomes = customerIncomes;
           this.customerCharges = customerCharges;
    }


    /**
     * Gets the customerBudget value for this ModifyCustomerBudgetRequest.
     * 
     * @return customerBudget
     */
    public com.soprabanking.amplitude.ModifyCustomerBudget getCustomerBudget() {
        return customerBudget;
    }


    /**
     * Sets the customerBudget value for this ModifyCustomerBudgetRequest.
     * 
     * @param customerBudget
     */
    public void setCustomerBudget(com.soprabanking.amplitude.ModifyCustomerBudget customerBudget) {
        this.customerBudget = customerBudget;
    }


    /**
     * Gets the customerIncomes value for this ModifyCustomerBudgetRequest.
     * 
     * @return customerIncomes
     */
    public com.soprabanking.amplitude.ModifyCustomerIncome[] getCustomerIncomes() {
        return customerIncomes;
    }


    /**
     * Sets the customerIncomes value for this ModifyCustomerBudgetRequest.
     * 
     * @param customerIncomes
     */
    public void setCustomerIncomes(com.soprabanking.amplitude.ModifyCustomerIncome[] customerIncomes) {
        this.customerIncomes = customerIncomes;
    }


    /**
     * Gets the customerCharges value for this ModifyCustomerBudgetRequest.
     * 
     * @return customerCharges
     */
    public com.soprabanking.amplitude.ModifyCustomerCharge[] getCustomerCharges() {
        return customerCharges;
    }


    /**
     * Sets the customerCharges value for this ModifyCustomerBudgetRequest.
     * 
     * @param customerCharges
     */
    public void setCustomerCharges(com.soprabanking.amplitude.ModifyCustomerCharge[] customerCharges) {
        this.customerCharges = customerCharges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerBudgetRequest)) return false;
        ModifyCustomerBudgetRequest other = (ModifyCustomerBudgetRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerBudget==null && other.getCustomerBudget()==null) || 
             (this.customerBudget!=null &&
              this.customerBudget.equals(other.getCustomerBudget()))) &&
            ((this.customerIncomes==null && other.getCustomerIncomes()==null) || 
             (this.customerIncomes!=null &&
              java.util.Arrays.equals(this.customerIncomes, other.getCustomerIncomes()))) &&
            ((this.customerCharges==null && other.getCustomerCharges()==null) || 
             (this.customerCharges!=null &&
              java.util.Arrays.equals(this.customerCharges, other.getCustomerCharges())));
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
        if (getCustomerBudget() != null) {
            _hashCode += getCustomerBudget().hashCode();
        }
        if (getCustomerIncomes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerIncomes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerIncomes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerCharges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerCharges(), i);
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
        new org.apache.axis.description.TypeDesc(ModifyCustomerBudgetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerBudgetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerBudget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerIncomes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerIncomes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerIncome"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerIncome"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCharge"));
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
