/**
 * CustomerSpecInfoCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerSpecInfoCreate  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerIndividualSpecInfoCreate individualSpecInfo;

    private com.soprabanking.amplitude.CustomerCorporateSpecInfoCreate corporateSpecInfo;

    public CustomerSpecInfoCreate() {
    }

    public CustomerSpecInfoCreate(
           com.soprabanking.amplitude.CustomerIndividualSpecInfoCreate individualSpecInfo,
           com.soprabanking.amplitude.CustomerCorporateSpecInfoCreate corporateSpecInfo) {
           this.individualSpecInfo = individualSpecInfo;
           this.corporateSpecInfo = corporateSpecInfo;
    }


    /**
     * Gets the individualSpecInfo value for this CustomerSpecInfoCreate.
     * 
     * @return individualSpecInfo
     */
    public com.soprabanking.amplitude.CustomerIndividualSpecInfoCreate getIndividualSpecInfo() {
        return individualSpecInfo;
    }


    /**
     * Sets the individualSpecInfo value for this CustomerSpecInfoCreate.
     * 
     * @param individualSpecInfo
     */
    public void setIndividualSpecInfo(com.soprabanking.amplitude.CustomerIndividualSpecInfoCreate individualSpecInfo) {
        this.individualSpecInfo = individualSpecInfo;
    }


    /**
     * Gets the corporateSpecInfo value for this CustomerSpecInfoCreate.
     * 
     * @return corporateSpecInfo
     */
    public com.soprabanking.amplitude.CustomerCorporateSpecInfoCreate getCorporateSpecInfo() {
        return corporateSpecInfo;
    }


    /**
     * Sets the corporateSpecInfo value for this CustomerSpecInfoCreate.
     * 
     * @param corporateSpecInfo
     */
    public void setCorporateSpecInfo(com.soprabanking.amplitude.CustomerCorporateSpecInfoCreate corporateSpecInfo) {
        this.corporateSpecInfo = corporateSpecInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerSpecInfoCreate)) return false;
        CustomerSpecInfoCreate other = (CustomerSpecInfoCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.individualSpecInfo==null && other.getIndividualSpecInfo()==null) || 
             (this.individualSpecInfo!=null &&
              this.individualSpecInfo.equals(other.getIndividualSpecInfo()))) &&
            ((this.corporateSpecInfo==null && other.getCorporateSpecInfo()==null) || 
             (this.corporateSpecInfo!=null &&
              this.corporateSpecInfo.equals(other.getCorporateSpecInfo())));
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
        if (getIndividualSpecInfo() != null) {
            _hashCode += getIndividualSpecInfo().hashCode();
        }
        if (getCorporateSpecInfo() != null) {
            _hashCode += getCorporateSpecInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerSpecInfoCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerSpecInfoCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualSpecInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "individualSpecInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerIndividualSpecInfoCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateSpecInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "corporateSpecInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCorporateSpecInfoCreate"));
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
