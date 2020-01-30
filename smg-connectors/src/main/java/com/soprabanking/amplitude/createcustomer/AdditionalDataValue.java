/**
 * AdditionalDataValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class AdditionalDataValue  implements java.io.Serializable {
    private java.lang.String alphanumeric;

    private java.math.BigDecimal amountOrRate;

    private java.util.Date date;

    public AdditionalDataValue() {
    }

    public AdditionalDataValue(
           java.lang.String alphanumeric,
           java.math.BigDecimal amountOrRate,
           java.util.Date date) {
           this.alphanumeric = alphanumeric;
           this.amountOrRate = amountOrRate;
           this.date = date;
    }


    /**
     * Gets the alphanumeric value for this AdditionalDataValue.
     * 
     * @return alphanumeric
     */
    public java.lang.String getAlphanumeric() {
        return alphanumeric;
    }


    /**
     * Sets the alphanumeric value for this AdditionalDataValue.
     * 
     * @param alphanumeric
     */
    public void setAlphanumeric(java.lang.String alphanumeric) {
        this.alphanumeric = alphanumeric;
    }


    /**
     * Gets the amountOrRate value for this AdditionalDataValue.
     * 
     * @return amountOrRate
     */
    public java.math.BigDecimal getAmountOrRate() {
        return amountOrRate;
    }


    /**
     * Sets the amountOrRate value for this AdditionalDataValue.
     * 
     * @param amountOrRate
     */
    public void setAmountOrRate(java.math.BigDecimal amountOrRate) {
        this.amountOrRate = amountOrRate;
    }


    /**
     * Gets the date value for this AdditionalDataValue.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this AdditionalDataValue.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdditionalDataValue)) return false;
        AdditionalDataValue other = (AdditionalDataValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alphanumeric==null && other.getAlphanumeric()==null) || 
             (this.alphanumeric!=null &&
              this.alphanumeric.equals(other.getAlphanumeric()))) &&
            ((this.amountOrRate==null && other.getAmountOrRate()==null) || 
             (this.amountOrRate!=null &&
              this.amountOrRate.equals(other.getAmountOrRate()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())));
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
        if (getAlphanumeric() != null) {
            _hashCode += getAlphanumeric().hashCode();
        }
        if (getAmountOrRate() != null) {
            _hashCode += getAmountOrRate().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdditionalDataValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "additionalDataValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alphanumeric");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "alphanumeric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountOrRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "amountOrRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
