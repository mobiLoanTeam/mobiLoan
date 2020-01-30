/**
 * ModifyCustomerProfessionsAndIncomesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerProfessionsAndIncomesRequest  implements java.io.Serializable {
    private java.lang.String customerCode;

    private com.soprabanking.amplitude.CustomerProfessionAndIncomesInformations[] professionAndIncomes;

    public ModifyCustomerProfessionsAndIncomesRequest() {
    }

    public ModifyCustomerProfessionsAndIncomesRequest(
           java.lang.String customerCode,
           com.soprabanking.amplitude.CustomerProfessionAndIncomesInformations[] professionAndIncomes) {
           this.customerCode = customerCode;
           this.professionAndIncomes = professionAndIncomes;
    }


    /**
     * Gets the customerCode value for this ModifyCustomerProfessionsAndIncomesRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this ModifyCustomerProfessionsAndIncomesRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the professionAndIncomes value for this ModifyCustomerProfessionsAndIncomesRequest.
     * 
     * @return professionAndIncomes
     */
    public com.soprabanking.amplitude.CustomerProfessionAndIncomesInformations[] getProfessionAndIncomes() {
        return professionAndIncomes;
    }


    /**
     * Sets the professionAndIncomes value for this ModifyCustomerProfessionsAndIncomesRequest.
     * 
     * @param professionAndIncomes
     */
    public void setProfessionAndIncomes(com.soprabanking.amplitude.CustomerProfessionAndIncomesInformations[] professionAndIncomes) {
        this.professionAndIncomes = professionAndIncomes;
    }

    public com.soprabanking.amplitude.CustomerProfessionAndIncomesInformations getProfessionAndIncomes(int i) {
        return this.professionAndIncomes[i];
    }

    public void setProfessionAndIncomes(int i, com.soprabanking.amplitude.CustomerProfessionAndIncomesInformations _value) {
        this.professionAndIncomes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerProfessionsAndIncomesRequest)) return false;
        ModifyCustomerProfessionsAndIncomesRequest other = (ModifyCustomerProfessionsAndIncomesRequest) obj;
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
            ((this.professionAndIncomes==null && other.getProfessionAndIncomes()==null) || 
             (this.professionAndIncomes!=null &&
              java.util.Arrays.equals(this.professionAndIncomes, other.getProfessionAndIncomes())));
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
        if (getProfessionAndIncomes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfessionAndIncomes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfessionAndIncomes(), i);
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
        new org.apache.axis.description.TypeDesc(ModifyCustomerProfessionsAndIncomesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerProfessionsAndIncomesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professionAndIncomes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "professionAndIncomes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerProfessionAndIncomesInformations"));
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
