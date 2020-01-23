/**
 * CustomerDefaultCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerDefaultCustomer  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerRetail retail;

    private com.soprabanking.amplitude.CustomerNonRetail nonRetail;

    public CustomerDefaultCustomer() {
    }

    public CustomerDefaultCustomer(
           com.soprabanking.amplitude.CustomerRetail retail,
           com.soprabanking.amplitude.CustomerNonRetail nonRetail) {
           this.retail = retail;
           this.nonRetail = nonRetail;
    }


    /**
     * Gets the retail value for this CustomerDefaultCustomer.
     * 
     * @return retail
     */
    public com.soprabanking.amplitude.CustomerRetail getRetail() {
        return retail;
    }


    /**
     * Sets the retail value for this CustomerDefaultCustomer.
     * 
     * @param retail
     */
    public void setRetail(com.soprabanking.amplitude.CustomerRetail retail) {
        this.retail = retail;
    }


    /**
     * Gets the nonRetail value for this CustomerDefaultCustomer.
     * 
     * @return nonRetail
     */
    public com.soprabanking.amplitude.CustomerNonRetail getNonRetail() {
        return nonRetail;
    }


    /**
     * Sets the nonRetail value for this CustomerDefaultCustomer.
     * 
     * @param nonRetail
     */
    public void setNonRetail(com.soprabanking.amplitude.CustomerNonRetail nonRetail) {
        this.nonRetail = nonRetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerDefaultCustomer)) return false;
        CustomerDefaultCustomer other = (CustomerDefaultCustomer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retail==null && other.getRetail()==null) || 
             (this.retail!=null &&
              this.retail.equals(other.getRetail()))) &&
            ((this.nonRetail==null && other.getNonRetail()==null) || 
             (this.nonRetail!=null &&
              this.nonRetail.equals(other.getNonRetail())));
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
        if (getRetail() != null) {
            _hashCode += getRetail().hashCode();
        }
        if (getNonRetail() != null) {
            _hashCode += getNonRetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerDefaultCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerDefaultCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "retail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerRetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonRetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "nonRetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerNonRetail"));
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
