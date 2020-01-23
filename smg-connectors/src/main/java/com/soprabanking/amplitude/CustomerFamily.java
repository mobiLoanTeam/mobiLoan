/**
 * CustomerFamily.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerFamily  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerThirdPartyType spouseType;

    private java.lang.String spouseCode;

    private java.lang.Integer numberOfChildren;

    private java.lang.String customerFamilyRelationshipCode;

    public CustomerFamily() {
    }

    public CustomerFamily(
           com.soprabanking.amplitude.CustomerThirdPartyType spouseType,
           java.lang.String spouseCode,
           java.lang.Integer numberOfChildren,
           java.lang.String customerFamilyRelationshipCode) {
           this.spouseType = spouseType;
           this.spouseCode = spouseCode;
           this.numberOfChildren = numberOfChildren;
           this.customerFamilyRelationshipCode = customerFamilyRelationshipCode;
    }


    /**
     * Gets the spouseType value for this CustomerFamily.
     * 
     * @return spouseType
     */
    public com.soprabanking.amplitude.CustomerThirdPartyType getSpouseType() {
        return spouseType;
    }


    /**
     * Sets the spouseType value for this CustomerFamily.
     * 
     * @param spouseType
     */
    public void setSpouseType(com.soprabanking.amplitude.CustomerThirdPartyType spouseType) {
        this.spouseType = spouseType;
    }


    /**
     * Gets the spouseCode value for this CustomerFamily.
     * 
     * @return spouseCode
     */
    public java.lang.String getSpouseCode() {
        return spouseCode;
    }


    /**
     * Sets the spouseCode value for this CustomerFamily.
     * 
     * @param spouseCode
     */
    public void setSpouseCode(java.lang.String spouseCode) {
        this.spouseCode = spouseCode;
    }


    /**
     * Gets the numberOfChildren value for this CustomerFamily.
     * 
     * @return numberOfChildren
     */
    public java.lang.Integer getNumberOfChildren() {
        return numberOfChildren;
    }


    /**
     * Sets the numberOfChildren value for this CustomerFamily.
     * 
     * @param numberOfChildren
     */
    public void setNumberOfChildren(java.lang.Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }


    /**
     * Gets the customerFamilyRelationshipCode value for this CustomerFamily.
     * 
     * @return customerFamilyRelationshipCode
     */
    public java.lang.String getCustomerFamilyRelationshipCode() {
        return customerFamilyRelationshipCode;
    }


    /**
     * Sets the customerFamilyRelationshipCode value for this CustomerFamily.
     * 
     * @param customerFamilyRelationshipCode
     */
    public void setCustomerFamilyRelationshipCode(java.lang.String customerFamilyRelationshipCode) {
        this.customerFamilyRelationshipCode = customerFamilyRelationshipCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerFamily)) return false;
        CustomerFamily other = (CustomerFamily) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.spouseType==null && other.getSpouseType()==null) || 
             (this.spouseType!=null &&
              this.spouseType.equals(other.getSpouseType()))) &&
            ((this.spouseCode==null && other.getSpouseCode()==null) || 
             (this.spouseCode!=null &&
              this.spouseCode.equals(other.getSpouseCode()))) &&
            ((this.numberOfChildren==null && other.getNumberOfChildren()==null) || 
             (this.numberOfChildren!=null &&
              this.numberOfChildren.equals(other.getNumberOfChildren()))) &&
            ((this.customerFamilyRelationshipCode==null && other.getCustomerFamilyRelationshipCode()==null) || 
             (this.customerFamilyRelationshipCode!=null &&
              this.customerFamilyRelationshipCode.equals(other.getCustomerFamilyRelationshipCode())));
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
        if (getSpouseType() != null) {
            _hashCode += getSpouseType().hashCode();
        }
        if (getSpouseCode() != null) {
            _hashCode += getSpouseCode().hashCode();
        }
        if (getNumberOfChildren() != null) {
            _hashCode += getNumberOfChildren().hashCode();
        }
        if (getCustomerFamilyRelationshipCode() != null) {
            _hashCode += getCustomerFamilyRelationshipCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerFamily.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFamily"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spouseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "spouseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerThirdPartyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spouseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "spouseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "numberOfChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFamilyRelationshipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFamilyRelationshipCode"));
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
