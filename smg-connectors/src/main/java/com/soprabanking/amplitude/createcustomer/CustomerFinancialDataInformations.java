/**
 * CustomerFinancialDataInformations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerFinancialDataInformations  implements java.io.Serializable {
    private java.lang.String dataType;

    private com.soprabanking.amplitude.CustomerFinancialDataValues values;

    public CustomerFinancialDataInformations() {
    }

    public CustomerFinancialDataInformations(
           java.lang.String dataType,
           com.soprabanking.amplitude.CustomerFinancialDataValues values) {
           this.dataType = dataType;
           this.values = values;
    }


    /**
     * Gets the dataType value for this CustomerFinancialDataInformations.
     * 
     * @return dataType
     */
    public java.lang.String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this CustomerFinancialDataInformations.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the values value for this CustomerFinancialDataInformations.
     * 
     * @return values
     */
    public com.soprabanking.amplitude.CustomerFinancialDataValues getValues() {
        return values;
    }


    /**
     * Sets the values value for this CustomerFinancialDataInformations.
     * 
     * @param values
     */
    public void setValues(com.soprabanking.amplitude.CustomerFinancialDataValues values) {
        this.values = values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerFinancialDataInformations)) return false;
        CustomerFinancialDataInformations other = (CustomerFinancialDataInformations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              this.values.equals(other.getValues())));
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
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getValues() != null) {
            _hashCode += getValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerFinancialDataInformations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFinancialDataInformations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFinancialDataValues"));
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
