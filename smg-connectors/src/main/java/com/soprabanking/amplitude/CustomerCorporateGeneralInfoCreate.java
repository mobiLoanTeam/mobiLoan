/**
 * CustomerCorporateGeneralInfoCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerCorporateGeneralInfoCreate  implements java.io.Serializable {
    private java.lang.String tradeNameToDeclare;

    private java.lang.String secondTradeNameToDeclare;

    private java.util.Date companyCreationDate;

    private java.lang.String legalFormCode;

    private java.lang.String statutoryAuditor1;

    private java.lang.String statutoryAuditor2;

    public CustomerCorporateGeneralInfoCreate() {
    }

    public CustomerCorporateGeneralInfoCreate(
           java.lang.String tradeNameToDeclare,
           java.lang.String secondTradeNameToDeclare,
           java.util.Date companyCreationDate,
           java.lang.String legalFormCode,
           java.lang.String statutoryAuditor1,
           java.lang.String statutoryAuditor2) {
           this.tradeNameToDeclare = tradeNameToDeclare;
           this.secondTradeNameToDeclare = secondTradeNameToDeclare;
           this.companyCreationDate = companyCreationDate;
           this.legalFormCode = legalFormCode;
           this.statutoryAuditor1 = statutoryAuditor1;
           this.statutoryAuditor2 = statutoryAuditor2;
    }


    /**
     * Gets the tradeNameToDeclare value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @return tradeNameToDeclare
     */
    public java.lang.String getTradeNameToDeclare() {
        return tradeNameToDeclare;
    }


    /**
     * Sets the tradeNameToDeclare value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @param tradeNameToDeclare
     */
    public void setTradeNameToDeclare(java.lang.String tradeNameToDeclare) {
        this.tradeNameToDeclare = tradeNameToDeclare;
    }


    /**
     * Gets the secondTradeNameToDeclare value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @return secondTradeNameToDeclare
     */
    public java.lang.String getSecondTradeNameToDeclare() {
        return secondTradeNameToDeclare;
    }


    /**
     * Sets the secondTradeNameToDeclare value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @param secondTradeNameToDeclare
     */
    public void setSecondTradeNameToDeclare(java.lang.String secondTradeNameToDeclare) {
        this.secondTradeNameToDeclare = secondTradeNameToDeclare;
    }


    /**
     * Gets the companyCreationDate value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @return companyCreationDate
     */
    public java.util.Date getCompanyCreationDate() {
        return companyCreationDate;
    }


    /**
     * Sets the companyCreationDate value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @param companyCreationDate
     */
    public void setCompanyCreationDate(java.util.Date companyCreationDate) {
        this.companyCreationDate = companyCreationDate;
    }


    /**
     * Gets the legalFormCode value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @return legalFormCode
     */
    public java.lang.String getLegalFormCode() {
        return legalFormCode;
    }


    /**
     * Sets the legalFormCode value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @param legalFormCode
     */
    public void setLegalFormCode(java.lang.String legalFormCode) {
        this.legalFormCode = legalFormCode;
    }


    /**
     * Gets the statutoryAuditor1 value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @return statutoryAuditor1
     */
    public java.lang.String getStatutoryAuditor1() {
        return statutoryAuditor1;
    }


    /**
     * Sets the statutoryAuditor1 value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @param statutoryAuditor1
     */
    public void setStatutoryAuditor1(java.lang.String statutoryAuditor1) {
        this.statutoryAuditor1 = statutoryAuditor1;
    }


    /**
     * Gets the statutoryAuditor2 value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @return statutoryAuditor2
     */
    public java.lang.String getStatutoryAuditor2() {
        return statutoryAuditor2;
    }


    /**
     * Sets the statutoryAuditor2 value for this CustomerCorporateGeneralInfoCreate.
     * 
     * @param statutoryAuditor2
     */
    public void setStatutoryAuditor2(java.lang.String statutoryAuditor2) {
        this.statutoryAuditor2 = statutoryAuditor2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerCorporateGeneralInfoCreate)) return false;
        CustomerCorporateGeneralInfoCreate other = (CustomerCorporateGeneralInfoCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tradeNameToDeclare==null && other.getTradeNameToDeclare()==null) || 
             (this.tradeNameToDeclare!=null &&
              this.tradeNameToDeclare.equals(other.getTradeNameToDeclare()))) &&
            ((this.secondTradeNameToDeclare==null && other.getSecondTradeNameToDeclare()==null) || 
             (this.secondTradeNameToDeclare!=null &&
              this.secondTradeNameToDeclare.equals(other.getSecondTradeNameToDeclare()))) &&
            ((this.companyCreationDate==null && other.getCompanyCreationDate()==null) || 
             (this.companyCreationDate!=null &&
              this.companyCreationDate.equals(other.getCompanyCreationDate()))) &&
            ((this.legalFormCode==null && other.getLegalFormCode()==null) || 
             (this.legalFormCode!=null &&
              this.legalFormCode.equals(other.getLegalFormCode()))) &&
            ((this.statutoryAuditor1==null && other.getStatutoryAuditor1()==null) || 
             (this.statutoryAuditor1!=null &&
              this.statutoryAuditor1.equals(other.getStatutoryAuditor1()))) &&
            ((this.statutoryAuditor2==null && other.getStatutoryAuditor2()==null) || 
             (this.statutoryAuditor2!=null &&
              this.statutoryAuditor2.equals(other.getStatutoryAuditor2())));
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
        if (getTradeNameToDeclare() != null) {
            _hashCode += getTradeNameToDeclare().hashCode();
        }
        if (getSecondTradeNameToDeclare() != null) {
            _hashCode += getSecondTradeNameToDeclare().hashCode();
        }
        if (getCompanyCreationDate() != null) {
            _hashCode += getCompanyCreationDate().hashCode();
        }
        if (getLegalFormCode() != null) {
            _hashCode += getLegalFormCode().hashCode();
        }
        if (getStatutoryAuditor1() != null) {
            _hashCode += getStatutoryAuditor1().hashCode();
        }
        if (getStatutoryAuditor2() != null) {
            _hashCode += getStatutoryAuditor2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerCorporateGeneralInfoCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCorporateGeneralInfoCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeNameToDeclare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "tradeNameToDeclare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondTradeNameToDeclare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "secondTradeNameToDeclare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "companyCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalFormCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "legalFormCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statutoryAuditor1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "statutoryAuditor1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statutoryAuditor2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "statutoryAuditor2"));
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
