/**
 * CustomerLeaderInformations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerLeaderInformations  implements java.io.Serializable {
    private java.lang.String leaderCode;

    private com.soprabanking.amplitude.CustomerOrThirdPartyType leaderType;

    private java.lang.String leaderPosition;

    private java.lang.String typeOfCorporateExecutiveDuty;

    public CustomerLeaderInformations() {
    }

    public CustomerLeaderInformations(
           java.lang.String leaderCode,
           com.soprabanking.amplitude.CustomerOrThirdPartyType leaderType,
           java.lang.String leaderPosition,
           java.lang.String typeOfCorporateExecutiveDuty) {
           this.leaderCode = leaderCode;
           this.leaderType = leaderType;
           this.leaderPosition = leaderPosition;
           this.typeOfCorporateExecutiveDuty = typeOfCorporateExecutiveDuty;
    }


    /**
     * Gets the leaderCode value for this CustomerLeaderInformations.
     * 
     * @return leaderCode
     */
    public java.lang.String getLeaderCode() {
        return leaderCode;
    }


    /**
     * Sets the leaderCode value for this CustomerLeaderInformations.
     * 
     * @param leaderCode
     */
    public void setLeaderCode(java.lang.String leaderCode) {
        this.leaderCode = leaderCode;
    }


    /**
     * Gets the leaderType value for this CustomerLeaderInformations.
     * 
     * @return leaderType
     */
    public com.soprabanking.amplitude.CustomerOrThirdPartyType getLeaderType() {
        return leaderType;
    }


    /**
     * Sets the leaderType value for this CustomerLeaderInformations.
     * 
     * @param leaderType
     */
    public void setLeaderType(com.soprabanking.amplitude.CustomerOrThirdPartyType leaderType) {
        this.leaderType = leaderType;
    }


    /**
     * Gets the leaderPosition value for this CustomerLeaderInformations.
     * 
     * @return leaderPosition
     */
    public java.lang.String getLeaderPosition() {
        return leaderPosition;
    }


    /**
     * Sets the leaderPosition value for this CustomerLeaderInformations.
     * 
     * @param leaderPosition
     */
    public void setLeaderPosition(java.lang.String leaderPosition) {
        this.leaderPosition = leaderPosition;
    }


    /**
     * Gets the typeOfCorporateExecutiveDuty value for this CustomerLeaderInformations.
     * 
     * @return typeOfCorporateExecutiveDuty
     */
    public java.lang.String getTypeOfCorporateExecutiveDuty() {
        return typeOfCorporateExecutiveDuty;
    }


    /**
     * Sets the typeOfCorporateExecutiveDuty value for this CustomerLeaderInformations.
     * 
     * @param typeOfCorporateExecutiveDuty
     */
    public void setTypeOfCorporateExecutiveDuty(java.lang.String typeOfCorporateExecutiveDuty) {
        this.typeOfCorporateExecutiveDuty = typeOfCorporateExecutiveDuty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerLeaderInformations)) return false;
        CustomerLeaderInformations other = (CustomerLeaderInformations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.leaderCode==null && other.getLeaderCode()==null) || 
             (this.leaderCode!=null &&
              this.leaderCode.equals(other.getLeaderCode()))) &&
            ((this.leaderType==null && other.getLeaderType()==null) || 
             (this.leaderType!=null &&
              this.leaderType.equals(other.getLeaderType()))) &&
            ((this.leaderPosition==null && other.getLeaderPosition()==null) || 
             (this.leaderPosition!=null &&
              this.leaderPosition.equals(other.getLeaderPosition()))) &&
            ((this.typeOfCorporateExecutiveDuty==null && other.getTypeOfCorporateExecutiveDuty()==null) || 
             (this.typeOfCorporateExecutiveDuty!=null &&
              this.typeOfCorporateExecutiveDuty.equals(other.getTypeOfCorporateExecutiveDuty())));
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
        if (getLeaderCode() != null) {
            _hashCode += getLeaderCode().hashCode();
        }
        if (getLeaderType() != null) {
            _hashCode += getLeaderType().hashCode();
        }
        if (getLeaderPosition() != null) {
            _hashCode += getLeaderPosition().hashCode();
        }
        if (getTypeOfCorporateExecutiveDuty() != null) {
            _hashCode += getTypeOfCorporateExecutiveDuty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerLeaderInformations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerLeaderInformations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leaderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "leaderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leaderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "leaderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOrThirdPartyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leaderPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "leaderPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfCorporateExecutiveDuty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "typeOfCorporateExecutiveDuty"));
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
