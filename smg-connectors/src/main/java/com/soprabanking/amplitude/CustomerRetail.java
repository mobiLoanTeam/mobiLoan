/**
 * CustomerRetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerRetail  implements java.io.Serializable {
    private java.lang.Boolean pmlDefault;

    private java.util.Date pmlDefaultEntry;

    private java.lang.Boolean nonPmlDefault;

    private java.util.Date nonPmlDefaultEntry;

    public CustomerRetail() {
    }

    public CustomerRetail(
           java.lang.Boolean pmlDefault,
           java.util.Date pmlDefaultEntry,
           java.lang.Boolean nonPmlDefault,
           java.util.Date nonPmlDefaultEntry) {
           this.pmlDefault = pmlDefault;
           this.pmlDefaultEntry = pmlDefaultEntry;
           this.nonPmlDefault = nonPmlDefault;
           this.nonPmlDefaultEntry = nonPmlDefaultEntry;
    }


    /**
     * Gets the pmlDefault value for this CustomerRetail.
     * 
     * @return pmlDefault
     */
    public java.lang.Boolean getPmlDefault() {
        return pmlDefault;
    }


    /**
     * Sets the pmlDefault value for this CustomerRetail.
     * 
     * @param pmlDefault
     */
    public void setPmlDefault(java.lang.Boolean pmlDefault) {
        this.pmlDefault = pmlDefault;
    }


    /**
     * Gets the pmlDefaultEntry value for this CustomerRetail.
     * 
     * @return pmlDefaultEntry
     */
    public java.util.Date getPmlDefaultEntry() {
        return pmlDefaultEntry;
    }


    /**
     * Sets the pmlDefaultEntry value for this CustomerRetail.
     * 
     * @param pmlDefaultEntry
     */
    public void setPmlDefaultEntry(java.util.Date pmlDefaultEntry) {
        this.pmlDefaultEntry = pmlDefaultEntry;
    }


    /**
     * Gets the nonPmlDefault value for this CustomerRetail.
     * 
     * @return nonPmlDefault
     */
    public java.lang.Boolean getNonPmlDefault() {
        return nonPmlDefault;
    }


    /**
     * Sets the nonPmlDefault value for this CustomerRetail.
     * 
     * @param nonPmlDefault
     */
    public void setNonPmlDefault(java.lang.Boolean nonPmlDefault) {
        this.nonPmlDefault = nonPmlDefault;
    }


    /**
     * Gets the nonPmlDefaultEntry value for this CustomerRetail.
     * 
     * @return nonPmlDefaultEntry
     */
    public java.util.Date getNonPmlDefaultEntry() {
        return nonPmlDefaultEntry;
    }


    /**
     * Sets the nonPmlDefaultEntry value for this CustomerRetail.
     * 
     * @param nonPmlDefaultEntry
     */
    public void setNonPmlDefaultEntry(java.util.Date nonPmlDefaultEntry) {
        this.nonPmlDefaultEntry = nonPmlDefaultEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerRetail)) return false;
        CustomerRetail other = (CustomerRetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pmlDefault==null && other.getPmlDefault()==null) || 
             (this.pmlDefault!=null &&
              this.pmlDefault.equals(other.getPmlDefault()))) &&
            ((this.pmlDefaultEntry==null && other.getPmlDefaultEntry()==null) || 
             (this.pmlDefaultEntry!=null &&
              this.pmlDefaultEntry.equals(other.getPmlDefaultEntry()))) &&
            ((this.nonPmlDefault==null && other.getNonPmlDefault()==null) || 
             (this.nonPmlDefault!=null &&
              this.nonPmlDefault.equals(other.getNonPmlDefault()))) &&
            ((this.nonPmlDefaultEntry==null && other.getNonPmlDefaultEntry()==null) || 
             (this.nonPmlDefaultEntry!=null &&
              this.nonPmlDefaultEntry.equals(other.getNonPmlDefaultEntry())));
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
        if (getPmlDefault() != null) {
            _hashCode += getPmlDefault().hashCode();
        }
        if (getPmlDefaultEntry() != null) {
            _hashCode += getPmlDefaultEntry().hashCode();
        }
        if (getNonPmlDefault() != null) {
            _hashCode += getNonPmlDefault().hashCode();
        }
        if (getNonPmlDefaultEntry() != null) {
            _hashCode += getNonPmlDefaultEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerRetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerRetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmlDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "pmlDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmlDefaultEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "pmlDefaultEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonPmlDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "nonPmlDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonPmlDefaultEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "nonPmlDefaultEntry"));
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
