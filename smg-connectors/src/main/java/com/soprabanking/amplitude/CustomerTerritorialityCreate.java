/**
 * CustomerTerritorialityCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerTerritorialityCreate  implements java.io.Serializable {
    private java.lang.String territorialityCode;

    private java.lang.String spouseTerritorialityCode;

    public CustomerTerritorialityCreate() {
    }

    public CustomerTerritorialityCreate(
           java.lang.String territorialityCode,
           java.lang.String spouseTerritorialityCode) {
           this.territorialityCode = territorialityCode;
           this.spouseTerritorialityCode = spouseTerritorialityCode;
    }


    /**
     * Gets the territorialityCode value for this CustomerTerritorialityCreate.
     * 
     * @return territorialityCode
     */
    public java.lang.String getTerritorialityCode() {
        return territorialityCode;
    }


    /**
     * Sets the territorialityCode value for this CustomerTerritorialityCreate.
     * 
     * @param territorialityCode
     */
    public void setTerritorialityCode(java.lang.String territorialityCode) {
        this.territorialityCode = territorialityCode;
    }


    /**
     * Gets the spouseTerritorialityCode value for this CustomerTerritorialityCreate.
     * 
     * @return spouseTerritorialityCode
     */
    public java.lang.String getSpouseTerritorialityCode() {
        return spouseTerritorialityCode;
    }


    /**
     * Sets the spouseTerritorialityCode value for this CustomerTerritorialityCreate.
     * 
     * @param spouseTerritorialityCode
     */
    public void setSpouseTerritorialityCode(java.lang.String spouseTerritorialityCode) {
        this.spouseTerritorialityCode = spouseTerritorialityCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerTerritorialityCreate)) return false;
        CustomerTerritorialityCreate other = (CustomerTerritorialityCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.territorialityCode==null && other.getTerritorialityCode()==null) || 
             (this.territorialityCode!=null &&
              this.territorialityCode.equals(other.getTerritorialityCode()))) &&
            ((this.spouseTerritorialityCode==null && other.getSpouseTerritorialityCode()==null) || 
             (this.spouseTerritorialityCode!=null &&
              this.spouseTerritorialityCode.equals(other.getSpouseTerritorialityCode())));
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
        if (getTerritorialityCode() != null) {
            _hashCode += getTerritorialityCode().hashCode();
        }
        if (getSpouseTerritorialityCode() != null) {
            _hashCode += getSpouseTerritorialityCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerTerritorialityCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerTerritorialityCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territorialityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "territorialityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spouseTerritorialityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "spouseTerritorialityCode"));
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
