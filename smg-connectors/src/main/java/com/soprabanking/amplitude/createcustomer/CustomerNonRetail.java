/**
 * CustomerNonRetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerNonRetail  implements java.io.Serializable {
    private boolean _default;

    private java.util.Date defaultEntry;

    public CustomerNonRetail() {
    }

    public CustomerNonRetail(
           boolean _default,
           java.util.Date defaultEntry) {
           this._default = _default;
           this.defaultEntry = defaultEntry;
    }


    /**
     * Gets the _default value for this CustomerNonRetail.
     * 
     * @return _default
     */
    public boolean is_default() {
        return _default;
    }


    /**
     * Sets the _default value for this CustomerNonRetail.
     * 
     * @param _default
     */
    public void set_default(boolean _default) {
        this._default = _default;
    }


    /**
     * Gets the defaultEntry value for this CustomerNonRetail.
     * 
     * @return defaultEntry
     */
    public java.util.Date getDefaultEntry() {
        return defaultEntry;
    }


    /**
     * Sets the defaultEntry value for this CustomerNonRetail.
     * 
     * @param defaultEntry
     */
    public void setDefaultEntry(java.util.Date defaultEntry) {
        this.defaultEntry = defaultEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerNonRetail)) return false;
        CustomerNonRetail other = (CustomerNonRetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._default == other.is_default() &&
            ((this.defaultEntry==null && other.getDefaultEntry()==null) || 
             (this.defaultEntry!=null &&
              this.defaultEntry.equals(other.getDefaultEntry())));
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
        _hashCode += (is_default() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDefaultEntry() != null) {
            _hashCode += getDefaultEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerNonRetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerNonRetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "defaultEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
