/**
 * ShareholderCreateIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ShareholderCreateIdentifier  implements java.io.Serializable {
    private java.lang.String customerCode;

    private java.lang.String shareholderCode;

    private com.soprabanking.amplitude.CustomerOrThirdPartyType shareholderType;

    public ShareholderCreateIdentifier() {
    }

    public ShareholderCreateIdentifier(
           java.lang.String customerCode,
           java.lang.String shareholderCode,
           com.soprabanking.amplitude.CustomerOrThirdPartyType shareholderType) {
           this.customerCode = customerCode;
           this.shareholderCode = shareholderCode;
           this.shareholderType = shareholderType;
    }


    /**
     * Gets the customerCode value for this ShareholderCreateIdentifier.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this ShareholderCreateIdentifier.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the shareholderCode value for this ShareholderCreateIdentifier.
     * 
     * @return shareholderCode
     */
    public java.lang.String getShareholderCode() {
        return shareholderCode;
    }


    /**
     * Sets the shareholderCode value for this ShareholderCreateIdentifier.
     * 
     * @param shareholderCode
     */
    public void setShareholderCode(java.lang.String shareholderCode) {
        this.shareholderCode = shareholderCode;
    }


    /**
     * Gets the shareholderType value for this ShareholderCreateIdentifier.
     * 
     * @return shareholderType
     */
    public com.soprabanking.amplitude.CustomerOrThirdPartyType getShareholderType() {
        return shareholderType;
    }


    /**
     * Sets the shareholderType value for this ShareholderCreateIdentifier.
     * 
     * @param shareholderType
     */
    public void setShareholderType(com.soprabanking.amplitude.CustomerOrThirdPartyType shareholderType) {
        this.shareholderType = shareholderType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShareholderCreateIdentifier)) return false;
        ShareholderCreateIdentifier other = (ShareholderCreateIdentifier) obj;
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
            ((this.shareholderCode==null && other.getShareholderCode()==null) || 
             (this.shareholderCode!=null &&
              this.shareholderCode.equals(other.getShareholderCode()))) &&
            ((this.shareholderType==null && other.getShareholderType()==null) || 
             (this.shareholderType!=null &&
              this.shareholderType.equals(other.getShareholderType())));
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
        if (getShareholderCode() != null) {
            _hashCode += getShareholderCode().hashCode();
        }
        if (getShareholderType() != null) {
            _hashCode += getShareholderType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShareholderCreateIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "shareholderCreateIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareholderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "shareholderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareholderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "shareholderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOrThirdPartyType"));
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
