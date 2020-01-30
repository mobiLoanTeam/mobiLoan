/**
 * CustomerJointAccountInformations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerJointAccountInformations  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerCoHolderInformations coHolderInformations;

    private com.soprabanking.amplitude.LinkTyp linkTyp;

    private boolean toBePrintedInTheAddress;

    public CustomerJointAccountInformations() {
    }

    public CustomerJointAccountInformations(
           com.soprabanking.amplitude.CustomerCoHolderInformations coHolderInformations,
           com.soprabanking.amplitude.LinkTyp linkTyp,
           boolean toBePrintedInTheAddress) {
           this.coHolderInformations = coHolderInformations;
           this.linkTyp = linkTyp;
           this.toBePrintedInTheAddress = toBePrintedInTheAddress;
    }


    /**
     * Gets the coHolderInformations value for this CustomerJointAccountInformations.
     * 
     * @return coHolderInformations
     */
    public com.soprabanking.amplitude.CustomerCoHolderInformations getCoHolderInformations() {
        return coHolderInformations;
    }


    /**
     * Sets the coHolderInformations value for this CustomerJointAccountInformations.
     * 
     * @param coHolderInformations
     */
    public void setCoHolderInformations(com.soprabanking.amplitude.CustomerCoHolderInformations coHolderInformations) {
        this.coHolderInformations = coHolderInformations;
    }


    /**
     * Gets the linkTyp value for this CustomerJointAccountInformations.
     * 
     * @return linkTyp
     */
    public com.soprabanking.amplitude.LinkTyp getLinkTyp() {
        return linkTyp;
    }


    /**
     * Sets the linkTyp value for this CustomerJointAccountInformations.
     * 
     * @param linkTyp
     */
    public void setLinkTyp(com.soprabanking.amplitude.LinkTyp linkTyp) {
        this.linkTyp = linkTyp;
    }


    /**
     * Gets the toBePrintedInTheAddress value for this CustomerJointAccountInformations.
     * 
     * @return toBePrintedInTheAddress
     */
    public boolean isToBePrintedInTheAddress() {
        return toBePrintedInTheAddress;
    }


    /**
     * Sets the toBePrintedInTheAddress value for this CustomerJointAccountInformations.
     * 
     * @param toBePrintedInTheAddress
     */
    public void setToBePrintedInTheAddress(boolean toBePrintedInTheAddress) {
        this.toBePrintedInTheAddress = toBePrintedInTheAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerJointAccountInformations)) return false;
        CustomerJointAccountInformations other = (CustomerJointAccountInformations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coHolderInformations==null && other.getCoHolderInformations()==null) || 
             (this.coHolderInformations!=null &&
              this.coHolderInformations.equals(other.getCoHolderInformations()))) &&
            ((this.linkTyp==null && other.getLinkTyp()==null) || 
             (this.linkTyp!=null &&
              this.linkTyp.equals(other.getLinkTyp()))) &&
            this.toBePrintedInTheAddress == other.isToBePrintedInTheAddress();
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
        if (getCoHolderInformations() != null) {
            _hashCode += getCoHolderInformations().hashCode();
        }
        if (getLinkTyp() != null) {
            _hashCode += getLinkTyp().hashCode();
        }
        _hashCode += (isToBePrintedInTheAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerJointAccountInformations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerJointAccountInformations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coHolderInformations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "coHolderInformations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCoHolderInformations"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkTyp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "linkTyp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "linkTyp"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrintedInTheAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "toBePrintedInTheAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
