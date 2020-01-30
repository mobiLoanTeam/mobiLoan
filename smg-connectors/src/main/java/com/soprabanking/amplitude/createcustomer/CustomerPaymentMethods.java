/**
 * CustomerPaymentMethods.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerPaymentMethods  implements java.io.Serializable {
    private java.lang.String chequeBookFacilitySuspension;

    private java.util.Date chequeBookFacilitySuspensionDate;

    private java.lang.String withdrawalOfCreditCard;

    private java.util.Date dateOfWithdrawalOfCreditCard;

    public CustomerPaymentMethods() {
    }

    public CustomerPaymentMethods(
           java.lang.String chequeBookFacilitySuspension,
           java.util.Date chequeBookFacilitySuspensionDate,
           java.lang.String withdrawalOfCreditCard,
           java.util.Date dateOfWithdrawalOfCreditCard) {
           this.chequeBookFacilitySuspension = chequeBookFacilitySuspension;
           this.chequeBookFacilitySuspensionDate = chequeBookFacilitySuspensionDate;
           this.withdrawalOfCreditCard = withdrawalOfCreditCard;
           this.dateOfWithdrawalOfCreditCard = dateOfWithdrawalOfCreditCard;
    }


    /**
     * Gets the chequeBookFacilitySuspension value for this CustomerPaymentMethods.
     * 
     * @return chequeBookFacilitySuspension
     */
    public java.lang.String getChequeBookFacilitySuspension() {
        return chequeBookFacilitySuspension;
    }


    /**
     * Sets the chequeBookFacilitySuspension value for this CustomerPaymentMethods.
     * 
     * @param chequeBookFacilitySuspension
     */
    public void setChequeBookFacilitySuspension(java.lang.String chequeBookFacilitySuspension) {
        this.chequeBookFacilitySuspension = chequeBookFacilitySuspension;
    }


    /**
     * Gets the chequeBookFacilitySuspensionDate value for this CustomerPaymentMethods.
     * 
     * @return chequeBookFacilitySuspensionDate
     */
    public java.util.Date getChequeBookFacilitySuspensionDate() {
        return chequeBookFacilitySuspensionDate;
    }


    /**
     * Sets the chequeBookFacilitySuspensionDate value for this CustomerPaymentMethods.
     * 
     * @param chequeBookFacilitySuspensionDate
     */
    public void setChequeBookFacilitySuspensionDate(java.util.Date chequeBookFacilitySuspensionDate) {
        this.chequeBookFacilitySuspensionDate = chequeBookFacilitySuspensionDate;
    }


    /**
     * Gets the withdrawalOfCreditCard value for this CustomerPaymentMethods.
     * 
     * @return withdrawalOfCreditCard
     */
    public java.lang.String getWithdrawalOfCreditCard() {
        return withdrawalOfCreditCard;
    }


    /**
     * Sets the withdrawalOfCreditCard value for this CustomerPaymentMethods.
     * 
     * @param withdrawalOfCreditCard
     */
    public void setWithdrawalOfCreditCard(java.lang.String withdrawalOfCreditCard) {
        this.withdrawalOfCreditCard = withdrawalOfCreditCard;
    }


    /**
     * Gets the dateOfWithdrawalOfCreditCard value for this CustomerPaymentMethods.
     * 
     * @return dateOfWithdrawalOfCreditCard
     */
    public java.util.Date getDateOfWithdrawalOfCreditCard() {
        return dateOfWithdrawalOfCreditCard;
    }


    /**
     * Sets the dateOfWithdrawalOfCreditCard value for this CustomerPaymentMethods.
     * 
     * @param dateOfWithdrawalOfCreditCard
     */
    public void setDateOfWithdrawalOfCreditCard(java.util.Date dateOfWithdrawalOfCreditCard) {
        this.dateOfWithdrawalOfCreditCard = dateOfWithdrawalOfCreditCard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerPaymentMethods)) return false;
        CustomerPaymentMethods other = (CustomerPaymentMethods) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chequeBookFacilitySuspension==null && other.getChequeBookFacilitySuspension()==null) || 
             (this.chequeBookFacilitySuspension!=null &&
              this.chequeBookFacilitySuspension.equals(other.getChequeBookFacilitySuspension()))) &&
            ((this.chequeBookFacilitySuspensionDate==null && other.getChequeBookFacilitySuspensionDate()==null) || 
             (this.chequeBookFacilitySuspensionDate!=null &&
              this.chequeBookFacilitySuspensionDate.equals(other.getChequeBookFacilitySuspensionDate()))) &&
            ((this.withdrawalOfCreditCard==null && other.getWithdrawalOfCreditCard()==null) || 
             (this.withdrawalOfCreditCard!=null &&
              this.withdrawalOfCreditCard.equals(other.getWithdrawalOfCreditCard()))) &&
            ((this.dateOfWithdrawalOfCreditCard==null && other.getDateOfWithdrawalOfCreditCard()==null) || 
             (this.dateOfWithdrawalOfCreditCard!=null &&
              this.dateOfWithdrawalOfCreditCard.equals(other.getDateOfWithdrawalOfCreditCard())));
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
        if (getChequeBookFacilitySuspension() != null) {
            _hashCode += getChequeBookFacilitySuspension().hashCode();
        }
        if (getChequeBookFacilitySuspensionDate() != null) {
            _hashCode += getChequeBookFacilitySuspensionDate().hashCode();
        }
        if (getWithdrawalOfCreditCard() != null) {
            _hashCode += getWithdrawalOfCreditCard().hashCode();
        }
        if (getDateOfWithdrawalOfCreditCard() != null) {
            _hashCode += getDateOfWithdrawalOfCreditCard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerPaymentMethods.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerPaymentMethods"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeBookFacilitySuspension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "chequeBookFacilitySuspension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeBookFacilitySuspensionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "chequeBookFacilitySuspensionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawalOfCreditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "withdrawalOfCreditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfWithdrawalOfCreditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "dateOfWithdrawalOfCreditCard"));
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
