/**
 * CustomerFinancialDataValues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerFinancialDataValues  implements java.io.Serializable {
    private java.math.BigDecimal yearValue;

    private java.math.BigDecimal yearMinus1Value;

    private java.math.BigDecimal yearMinus2Value;

    private java.math.BigDecimal yearMinus3Value;

    public CustomerFinancialDataValues() {
    }

    public CustomerFinancialDataValues(
           java.math.BigDecimal yearValue,
           java.math.BigDecimal yearMinus1Value,
           java.math.BigDecimal yearMinus2Value,
           java.math.BigDecimal yearMinus3Value) {
           this.yearValue = yearValue;
           this.yearMinus1Value = yearMinus1Value;
           this.yearMinus2Value = yearMinus2Value;
           this.yearMinus3Value = yearMinus3Value;
    }


    /**
     * Gets the yearValue value for this CustomerFinancialDataValues.
     * 
     * @return yearValue
     */
    public java.math.BigDecimal getYearValue() {
        return yearValue;
    }


    /**
     * Sets the yearValue value for this CustomerFinancialDataValues.
     * 
     * @param yearValue
     */
    public void setYearValue(java.math.BigDecimal yearValue) {
        this.yearValue = yearValue;
    }


    /**
     * Gets the yearMinus1Value value for this CustomerFinancialDataValues.
     * 
     * @return yearMinus1Value
     */
    public java.math.BigDecimal getYearMinus1Value() {
        return yearMinus1Value;
    }


    /**
     * Sets the yearMinus1Value value for this CustomerFinancialDataValues.
     * 
     * @param yearMinus1Value
     */
    public void setYearMinus1Value(java.math.BigDecimal yearMinus1Value) {
        this.yearMinus1Value = yearMinus1Value;
    }


    /**
     * Gets the yearMinus2Value value for this CustomerFinancialDataValues.
     * 
     * @return yearMinus2Value
     */
    public java.math.BigDecimal getYearMinus2Value() {
        return yearMinus2Value;
    }


    /**
     * Sets the yearMinus2Value value for this CustomerFinancialDataValues.
     * 
     * @param yearMinus2Value
     */
    public void setYearMinus2Value(java.math.BigDecimal yearMinus2Value) {
        this.yearMinus2Value = yearMinus2Value;
    }


    /**
     * Gets the yearMinus3Value value for this CustomerFinancialDataValues.
     * 
     * @return yearMinus3Value
     */
    public java.math.BigDecimal getYearMinus3Value() {
        return yearMinus3Value;
    }


    /**
     * Sets the yearMinus3Value value for this CustomerFinancialDataValues.
     * 
     * @param yearMinus3Value
     */
    public void setYearMinus3Value(java.math.BigDecimal yearMinus3Value) {
        this.yearMinus3Value = yearMinus3Value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerFinancialDataValues)) return false;
        CustomerFinancialDataValues other = (CustomerFinancialDataValues) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.yearValue==null && other.getYearValue()==null) || 
             (this.yearValue!=null &&
              this.yearValue.equals(other.getYearValue()))) &&
            ((this.yearMinus1Value==null && other.getYearMinus1Value()==null) || 
             (this.yearMinus1Value!=null &&
              this.yearMinus1Value.equals(other.getYearMinus1Value()))) &&
            ((this.yearMinus2Value==null && other.getYearMinus2Value()==null) || 
             (this.yearMinus2Value!=null &&
              this.yearMinus2Value.equals(other.getYearMinus2Value()))) &&
            ((this.yearMinus3Value==null && other.getYearMinus3Value()==null) || 
             (this.yearMinus3Value!=null &&
              this.yearMinus3Value.equals(other.getYearMinus3Value())));
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
        if (getYearValue() != null) {
            _hashCode += getYearValue().hashCode();
        }
        if (getYearMinus1Value() != null) {
            _hashCode += getYearMinus1Value().hashCode();
        }
        if (getYearMinus2Value() != null) {
            _hashCode += getYearMinus2Value().hashCode();
        }
        if (getYearMinus3Value() != null) {
            _hashCode += getYearMinus3Value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerFinancialDataValues.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFinancialDataValues"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "yearValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearMinus1Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "yearMinus1Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearMinus2Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "yearMinus2Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearMinus3Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "yearMinus3Value"));
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
