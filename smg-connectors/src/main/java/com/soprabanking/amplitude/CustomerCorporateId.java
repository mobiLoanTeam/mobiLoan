/**
 * CustomerCorporateId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerCorporateId  implements java.io.Serializable {
    private java.lang.String nationalIdentifier;

    private java.lang.String socialIdentityNumber;

    private java.lang.String taxIdentityNumber;

    private java.lang.String abbreviation;

    public CustomerCorporateId() {
    }

    public CustomerCorporateId(
           java.lang.String nationalIdentifier,
           java.lang.String socialIdentityNumber,
           java.lang.String taxIdentityNumber,
           java.lang.String abbreviation) {
           this.nationalIdentifier = nationalIdentifier;
           this.socialIdentityNumber = socialIdentityNumber;
           this.taxIdentityNumber = taxIdentityNumber;
           this.abbreviation = abbreviation;
    }


    /**
     * Gets the nationalIdentifier value for this CustomerCorporateId.
     * 
     * @return nationalIdentifier
     */
    public java.lang.String getNationalIdentifier() {
        return nationalIdentifier;
    }


    /**
     * Sets the nationalIdentifier value for this CustomerCorporateId.
     * 
     * @param nationalIdentifier
     */
    public void setNationalIdentifier(java.lang.String nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }


    /**
     * Gets the socialIdentityNumber value for this CustomerCorporateId.
     * 
     * @return socialIdentityNumber
     */
    public java.lang.String getSocialIdentityNumber() {
        return socialIdentityNumber;
    }


    /**
     * Sets the socialIdentityNumber value for this CustomerCorporateId.
     * 
     * @param socialIdentityNumber
     */
    public void setSocialIdentityNumber(java.lang.String socialIdentityNumber) {
        this.socialIdentityNumber = socialIdentityNumber;
    }


    /**
     * Gets the taxIdentityNumber value for this CustomerCorporateId.
     * 
     * @return taxIdentityNumber
     */
    public java.lang.String getTaxIdentityNumber() {
        return taxIdentityNumber;
    }


    /**
     * Sets the taxIdentityNumber value for this CustomerCorporateId.
     * 
     * @param taxIdentityNumber
     */
    public void setTaxIdentityNumber(java.lang.String taxIdentityNumber) {
        this.taxIdentityNumber = taxIdentityNumber;
    }


    /**
     * Gets the abbreviation value for this CustomerCorporateId.
     * 
     * @return abbreviation
     */
    public java.lang.String getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this CustomerCorporateId.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(java.lang.String abbreviation) {
        this.abbreviation = abbreviation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerCorporateId)) return false;
        CustomerCorporateId other = (CustomerCorporateId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nationalIdentifier==null && other.getNationalIdentifier()==null) || 
             (this.nationalIdentifier!=null &&
              this.nationalIdentifier.equals(other.getNationalIdentifier()))) &&
            ((this.socialIdentityNumber==null && other.getSocialIdentityNumber()==null) || 
             (this.socialIdentityNumber!=null &&
              this.socialIdentityNumber.equals(other.getSocialIdentityNumber()))) &&
            ((this.taxIdentityNumber==null && other.getTaxIdentityNumber()==null) || 
             (this.taxIdentityNumber!=null &&
              this.taxIdentityNumber.equals(other.getTaxIdentityNumber()))) &&
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              this.abbreviation.equals(other.getAbbreviation())));
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
        if (getNationalIdentifier() != null) {
            _hashCode += getNationalIdentifier().hashCode();
        }
        if (getSocialIdentityNumber() != null) {
            _hashCode += getSocialIdentityNumber().hashCode();
        }
        if (getTaxIdentityNumber() != null) {
            _hashCode += getTaxIdentityNumber().hashCode();
        }
        if (getAbbreviation() != null) {
            _hashCode += getAbbreviation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerCorporateId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCorporateId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "nationalIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialIdentityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "socialIdentityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdentityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "taxIdentityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "abbreviation"));
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
