/**
 * ModifyCustomerAssetHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerAssetHeader  implements java.io.Serializable {
    private java.lang.String customerCode;

    private java.lang.Integer referenceYear;

    private com.soprabanking.amplitude.ReliabilityLevel reliabilityLevel;

    private java.lang.Boolean exhaustiveInformation;

    public ModifyCustomerAssetHeader() {
    }

    public ModifyCustomerAssetHeader(
           java.lang.String customerCode,
           java.lang.Integer referenceYear,
           com.soprabanking.amplitude.ReliabilityLevel reliabilityLevel,
           java.lang.Boolean exhaustiveInformation) {
           this.customerCode = customerCode;
           this.referenceYear = referenceYear;
           this.reliabilityLevel = reliabilityLevel;
           this.exhaustiveInformation = exhaustiveInformation;
    }


    /**
     * Gets the customerCode value for this ModifyCustomerAssetHeader.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this ModifyCustomerAssetHeader.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the referenceYear value for this ModifyCustomerAssetHeader.
     * 
     * @return referenceYear
     */
    public java.lang.Integer getReferenceYear() {
        return referenceYear;
    }


    /**
     * Sets the referenceYear value for this ModifyCustomerAssetHeader.
     * 
     * @param referenceYear
     */
    public void setReferenceYear(java.lang.Integer referenceYear) {
        this.referenceYear = referenceYear;
    }


    /**
     * Gets the reliabilityLevel value for this ModifyCustomerAssetHeader.
     * 
     * @return reliabilityLevel
     */
    public com.soprabanking.amplitude.ReliabilityLevel getReliabilityLevel() {
        return reliabilityLevel;
    }


    /**
     * Sets the reliabilityLevel value for this ModifyCustomerAssetHeader.
     * 
     * @param reliabilityLevel
     */
    public void setReliabilityLevel(com.soprabanking.amplitude.ReliabilityLevel reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
    }


    /**
     * Gets the exhaustiveInformation value for this ModifyCustomerAssetHeader.
     * 
     * @return exhaustiveInformation
     */
    public java.lang.Boolean getExhaustiveInformation() {
        return exhaustiveInformation;
    }


    /**
     * Sets the exhaustiveInformation value for this ModifyCustomerAssetHeader.
     * 
     * @param exhaustiveInformation
     */
    public void setExhaustiveInformation(java.lang.Boolean exhaustiveInformation) {
        this.exhaustiveInformation = exhaustiveInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerAssetHeader)) return false;
        ModifyCustomerAssetHeader other = (ModifyCustomerAssetHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.referenceYear==null && other.getReferenceYear()==null) || 
             (this.referenceYear!=null &&
              this.referenceYear.equals(other.getReferenceYear()))) &&
            ((this.reliabilityLevel==null && other.getReliabilityLevel()==null) || 
             (this.reliabilityLevel!=null &&
              this.reliabilityLevel.equals(other.getReliabilityLevel()))) &&
            ((this.exhaustiveInformation==null && other.getExhaustiveInformation()==null) || 
             (this.exhaustiveInformation!=null &&
              this.exhaustiveInformation.equals(other.getExhaustiveInformation())));
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
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getReferenceYear() != null) {
            _hashCode += getReferenceYear().hashCode();
        }
        if (getReliabilityLevel() != null) {
            _hashCode += getReliabilityLevel().hashCode();
        }
        if (getExhaustiveInformation() != null) {
            _hashCode += getExhaustiveInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCustomerAssetHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerAssetHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "referenceYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reliabilityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "reliabilityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "reliabilityLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exhaustiveInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "exhaustiveInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
