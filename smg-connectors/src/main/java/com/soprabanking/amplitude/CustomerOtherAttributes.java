/**
 * CustomerOtherAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerOtherAttributes  implements java.io.Serializable {
    private java.lang.String holderMotherName;

    public CustomerOtherAttributes() {
    }

    public CustomerOtherAttributes(
           java.lang.String holderMotherName) {
           this.holderMotherName = holderMotherName;
    }


    /**
     * Gets the holderMotherName value for this CustomerOtherAttributes.
     * 
     * @return holderMotherName
     */
    public java.lang.String getHolderMotherName() {
        return holderMotherName;
    }


    /**
     * Sets the holderMotherName value for this CustomerOtherAttributes.
     * 
     * @param holderMotherName
     */
    public void setHolderMotherName(java.lang.String holderMotherName) {
        this.holderMotherName = holderMotherName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerOtherAttributes)) return false;
        CustomerOtherAttributes other = (CustomerOtherAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.holderMotherName==null && other.getHolderMotherName()==null) || 
             (this.holderMotherName!=null &&
              this.holderMotherName.equals(other.getHolderMotherName())));
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
        if (getHolderMotherName() != null) {
            _hashCode += getHolderMotherName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerOtherAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOtherAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holderMotherName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "holderMotherName"));
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
