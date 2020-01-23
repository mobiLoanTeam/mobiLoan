/**
 * CustomerLegalInformationCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerLegalInformationCreate  implements java.io.Serializable {
    private java.lang.String tradeRegisterNumber;

    private java.util.Date deliveryDateOfTradeRegister;

    private java.lang.String tradeRegisterDeliveryPlace;

    private java.util.Date validityDateOfTradeRegister;

    private java.lang.String chamberOfCommerceCode;

    private java.lang.String licenseNumber;

    private java.util.Date validityDateOfLicense;

    public CustomerLegalInformationCreate() {
    }

    public CustomerLegalInformationCreate(
           java.lang.String tradeRegisterNumber,
           java.util.Date deliveryDateOfTradeRegister,
           java.lang.String tradeRegisterDeliveryPlace,
           java.util.Date validityDateOfTradeRegister,
           java.lang.String chamberOfCommerceCode,
           java.lang.String licenseNumber,
           java.util.Date validityDateOfLicense) {
           this.tradeRegisterNumber = tradeRegisterNumber;
           this.deliveryDateOfTradeRegister = deliveryDateOfTradeRegister;
           this.tradeRegisterDeliveryPlace = tradeRegisterDeliveryPlace;
           this.validityDateOfTradeRegister = validityDateOfTradeRegister;
           this.chamberOfCommerceCode = chamberOfCommerceCode;
           this.licenseNumber = licenseNumber;
           this.validityDateOfLicense = validityDateOfLicense;
    }


    /**
     * Gets the tradeRegisterNumber value for this CustomerLegalInformationCreate.
     * 
     * @return tradeRegisterNumber
     */
    public java.lang.String getTradeRegisterNumber() {
        return tradeRegisterNumber;
    }


    /**
     * Sets the tradeRegisterNumber value for this CustomerLegalInformationCreate.
     * 
     * @param tradeRegisterNumber
     */
    public void setTradeRegisterNumber(java.lang.String tradeRegisterNumber) {
        this.tradeRegisterNumber = tradeRegisterNumber;
    }


    /**
     * Gets the deliveryDateOfTradeRegister value for this CustomerLegalInformationCreate.
     * 
     * @return deliveryDateOfTradeRegister
     */
    public java.util.Date getDeliveryDateOfTradeRegister() {
        return deliveryDateOfTradeRegister;
    }


    /**
     * Sets the deliveryDateOfTradeRegister value for this CustomerLegalInformationCreate.
     * 
     * @param deliveryDateOfTradeRegister
     */
    public void setDeliveryDateOfTradeRegister(java.util.Date deliveryDateOfTradeRegister) {
        this.deliveryDateOfTradeRegister = deliveryDateOfTradeRegister;
    }


    /**
     * Gets the tradeRegisterDeliveryPlace value for this CustomerLegalInformationCreate.
     * 
     * @return tradeRegisterDeliveryPlace
     */
    public java.lang.String getTradeRegisterDeliveryPlace() {
        return tradeRegisterDeliveryPlace;
    }


    /**
     * Sets the tradeRegisterDeliveryPlace value for this CustomerLegalInformationCreate.
     * 
     * @param tradeRegisterDeliveryPlace
     */
    public void setTradeRegisterDeliveryPlace(java.lang.String tradeRegisterDeliveryPlace) {
        this.tradeRegisterDeliveryPlace = tradeRegisterDeliveryPlace;
    }


    /**
     * Gets the validityDateOfTradeRegister value for this CustomerLegalInformationCreate.
     * 
     * @return validityDateOfTradeRegister
     */
    public java.util.Date getValidityDateOfTradeRegister() {
        return validityDateOfTradeRegister;
    }


    /**
     * Sets the validityDateOfTradeRegister value for this CustomerLegalInformationCreate.
     * 
     * @param validityDateOfTradeRegister
     */
    public void setValidityDateOfTradeRegister(java.util.Date validityDateOfTradeRegister) {
        this.validityDateOfTradeRegister = validityDateOfTradeRegister;
    }


    /**
     * Gets the chamberOfCommerceCode value for this CustomerLegalInformationCreate.
     * 
     * @return chamberOfCommerceCode
     */
    public java.lang.String getChamberOfCommerceCode() {
        return chamberOfCommerceCode;
    }


    /**
     * Sets the chamberOfCommerceCode value for this CustomerLegalInformationCreate.
     * 
     * @param chamberOfCommerceCode
     */
    public void setChamberOfCommerceCode(java.lang.String chamberOfCommerceCode) {
        this.chamberOfCommerceCode = chamberOfCommerceCode;
    }


    /**
     * Gets the licenseNumber value for this CustomerLegalInformationCreate.
     * 
     * @return licenseNumber
     */
    public java.lang.String getLicenseNumber() {
        return licenseNumber;
    }


    /**
     * Sets the licenseNumber value for this CustomerLegalInformationCreate.
     * 
     * @param licenseNumber
     */
    public void setLicenseNumber(java.lang.String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }


    /**
     * Gets the validityDateOfLicense value for this CustomerLegalInformationCreate.
     * 
     * @return validityDateOfLicense
     */
    public java.util.Date getValidityDateOfLicense() {
        return validityDateOfLicense;
    }


    /**
     * Sets the validityDateOfLicense value for this CustomerLegalInformationCreate.
     * 
     * @param validityDateOfLicense
     */
    public void setValidityDateOfLicense(java.util.Date validityDateOfLicense) {
        this.validityDateOfLicense = validityDateOfLicense;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerLegalInformationCreate)) return false;
        CustomerLegalInformationCreate other = (CustomerLegalInformationCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tradeRegisterNumber==null && other.getTradeRegisterNumber()==null) || 
             (this.tradeRegisterNumber!=null &&
              this.tradeRegisterNumber.equals(other.getTradeRegisterNumber()))) &&
            ((this.deliveryDateOfTradeRegister==null && other.getDeliveryDateOfTradeRegister()==null) || 
             (this.deliveryDateOfTradeRegister!=null &&
              this.deliveryDateOfTradeRegister.equals(other.getDeliveryDateOfTradeRegister()))) &&
            ((this.tradeRegisterDeliveryPlace==null && other.getTradeRegisterDeliveryPlace()==null) || 
             (this.tradeRegisterDeliveryPlace!=null &&
              this.tradeRegisterDeliveryPlace.equals(other.getTradeRegisterDeliveryPlace()))) &&
            ((this.validityDateOfTradeRegister==null && other.getValidityDateOfTradeRegister()==null) || 
             (this.validityDateOfTradeRegister!=null &&
              this.validityDateOfTradeRegister.equals(other.getValidityDateOfTradeRegister()))) &&
            ((this.chamberOfCommerceCode==null && other.getChamberOfCommerceCode()==null) || 
             (this.chamberOfCommerceCode!=null &&
              this.chamberOfCommerceCode.equals(other.getChamberOfCommerceCode()))) &&
            ((this.licenseNumber==null && other.getLicenseNumber()==null) || 
             (this.licenseNumber!=null &&
              this.licenseNumber.equals(other.getLicenseNumber()))) &&
            ((this.validityDateOfLicense==null && other.getValidityDateOfLicense()==null) || 
             (this.validityDateOfLicense!=null &&
              this.validityDateOfLicense.equals(other.getValidityDateOfLicense())));
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
        if (getTradeRegisterNumber() != null) {
            _hashCode += getTradeRegisterNumber().hashCode();
        }
        if (getDeliveryDateOfTradeRegister() != null) {
            _hashCode += getDeliveryDateOfTradeRegister().hashCode();
        }
        if (getTradeRegisterDeliveryPlace() != null) {
            _hashCode += getTradeRegisterDeliveryPlace().hashCode();
        }
        if (getValidityDateOfTradeRegister() != null) {
            _hashCode += getValidityDateOfTradeRegister().hashCode();
        }
        if (getChamberOfCommerceCode() != null) {
            _hashCode += getChamberOfCommerceCode().hashCode();
        }
        if (getLicenseNumber() != null) {
            _hashCode += getLicenseNumber().hashCode();
        }
        if (getValidityDateOfLicense() != null) {
            _hashCode += getValidityDateOfLicense().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerLegalInformationCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerLegalInformationCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeRegisterNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "tradeRegisterNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDateOfTradeRegister");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "deliveryDateOfTradeRegister"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeRegisterDeliveryPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "tradeRegisterDeliveryPlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDateOfTradeRegister");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "validityDateOfTradeRegister"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chamberOfCommerceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "chamberOfCommerceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "licenseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDateOfLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "validityDateOfLicense"));
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
