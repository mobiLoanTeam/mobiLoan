/**
 * CustomerIndividualGeneralInfoCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerIndividualGeneralInfoCreate  implements java.io.Serializable {
    private java.lang.String firstname;

    private java.lang.String middlename;

    private java.lang.String thirdname;

    private java.lang.String familyStatusCode;

    private java.lang.String marriageSettlementCode;

    private java.lang.String holderLegalCapacity;

    private java.util.Date applicationDateOfLegalCapacity;

    private java.lang.String realEstateSituationCode;

    public CustomerIndividualGeneralInfoCreate() {
    }

    public CustomerIndividualGeneralInfoCreate(
           java.lang.String firstname,
           java.lang.String middlename,
           java.lang.String thirdname,
           java.lang.String familyStatusCode,
           java.lang.String marriageSettlementCode,
           java.lang.String holderLegalCapacity,
           java.util.Date applicationDateOfLegalCapacity,
           java.lang.String realEstateSituationCode) {
           this.firstname = firstname;
           this.middlename = middlename;
           this.thirdname = thirdname;
           this.familyStatusCode = familyStatusCode;
           this.marriageSettlementCode = marriageSettlementCode;
           this.holderLegalCapacity = holderLegalCapacity;
           this.applicationDateOfLegalCapacity = applicationDateOfLegalCapacity;
           this.realEstateSituationCode = realEstateSituationCode;
    }


    /**
     * Gets the firstname value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the middlename value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @return middlename
     */
    public java.lang.String getMiddlename() {
        return middlename;
    }


    /**
     * Sets the middlename value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @param middlename
     */
    public void setMiddlename(java.lang.String middlename) {
        this.middlename = middlename;
    }


    /**
     * Gets the thirdname value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @return thirdname
     */
    public java.lang.String getThirdname() {
        return thirdname;
    }


    /**
     * Sets the thirdname value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @param thirdname
     */
    public void setThirdname(java.lang.String thirdname) {
        this.thirdname = thirdname;
    }


    /**
     * Gets the familyStatusCode value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @return familyStatusCode
     */
    public java.lang.String getFamilyStatusCode() {
        return familyStatusCode;
    }


    /**
     * Sets the familyStatusCode value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @param familyStatusCode
     */
    public void setFamilyStatusCode(java.lang.String familyStatusCode) {
        this.familyStatusCode = familyStatusCode;
    }


    /**
     * Gets the marriageSettlementCode value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @return marriageSettlementCode
     */
    public java.lang.String getMarriageSettlementCode() {
        return marriageSettlementCode;
    }


    /**
     * Sets the marriageSettlementCode value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @param marriageSettlementCode
     */
    public void setMarriageSettlementCode(java.lang.String marriageSettlementCode) {
        this.marriageSettlementCode = marriageSettlementCode;
    }


    /**
     * Gets the holderLegalCapacity value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @return holderLegalCapacity
     */
    public java.lang.String getHolderLegalCapacity() {
        return holderLegalCapacity;
    }


    /**
     * Sets the holderLegalCapacity value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @param holderLegalCapacity
     */
    public void setHolderLegalCapacity(java.lang.String holderLegalCapacity) {
        this.holderLegalCapacity = holderLegalCapacity;
    }


    /**
     * Gets the applicationDateOfLegalCapacity value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @return applicationDateOfLegalCapacity
     */
    public java.util.Date getApplicationDateOfLegalCapacity() {
        return applicationDateOfLegalCapacity;
    }


    /**
     * Sets the applicationDateOfLegalCapacity value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @param applicationDateOfLegalCapacity
     */
    public void setApplicationDateOfLegalCapacity(java.util.Date applicationDateOfLegalCapacity) {
        this.applicationDateOfLegalCapacity = applicationDateOfLegalCapacity;
    }


    /**
     * Gets the realEstateSituationCode value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @return realEstateSituationCode
     */
    public java.lang.String getRealEstateSituationCode() {
        return realEstateSituationCode;
    }


    /**
     * Sets the realEstateSituationCode value for this CustomerIndividualGeneralInfoCreate.
     * 
     * @param realEstateSituationCode
     */
    public void setRealEstateSituationCode(java.lang.String realEstateSituationCode) {
        this.realEstateSituationCode = realEstateSituationCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerIndividualGeneralInfoCreate)) return false;
        CustomerIndividualGeneralInfoCreate other = (CustomerIndividualGeneralInfoCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.middlename==null && other.getMiddlename()==null) || 
             (this.middlename!=null &&
              this.middlename.equals(other.getMiddlename()))) &&
            ((this.thirdname==null && other.getThirdname()==null) || 
             (this.thirdname!=null &&
              this.thirdname.equals(other.getThirdname()))) &&
            ((this.familyStatusCode==null && other.getFamilyStatusCode()==null) || 
             (this.familyStatusCode!=null &&
              this.familyStatusCode.equals(other.getFamilyStatusCode()))) &&
            ((this.marriageSettlementCode==null && other.getMarriageSettlementCode()==null) || 
             (this.marriageSettlementCode!=null &&
              this.marriageSettlementCode.equals(other.getMarriageSettlementCode()))) &&
            ((this.holderLegalCapacity==null && other.getHolderLegalCapacity()==null) || 
             (this.holderLegalCapacity!=null &&
              this.holderLegalCapacity.equals(other.getHolderLegalCapacity()))) &&
            ((this.applicationDateOfLegalCapacity==null && other.getApplicationDateOfLegalCapacity()==null) || 
             (this.applicationDateOfLegalCapacity!=null &&
              this.applicationDateOfLegalCapacity.equals(other.getApplicationDateOfLegalCapacity()))) &&
            ((this.realEstateSituationCode==null && other.getRealEstateSituationCode()==null) || 
             (this.realEstateSituationCode!=null &&
              this.realEstateSituationCode.equals(other.getRealEstateSituationCode())));
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
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getMiddlename() != null) {
            _hashCode += getMiddlename().hashCode();
        }
        if (getThirdname() != null) {
            _hashCode += getThirdname().hashCode();
        }
        if (getFamilyStatusCode() != null) {
            _hashCode += getFamilyStatusCode().hashCode();
        }
        if (getMarriageSettlementCode() != null) {
            _hashCode += getMarriageSettlementCode().hashCode();
        }
        if (getHolderLegalCapacity() != null) {
            _hashCode += getHolderLegalCapacity().hashCode();
        }
        if (getApplicationDateOfLegalCapacity() != null) {
            _hashCode += getApplicationDateOfLegalCapacity().hashCode();
        }
        if (getRealEstateSituationCode() != null) {
            _hashCode += getRealEstateSituationCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerIndividualGeneralInfoCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerIndividualGeneralInfoCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "middlename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "thirdname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "familyStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marriageSettlementCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "marriageSettlementCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holderLegalCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "holderLegalCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDateOfLegalCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "applicationDateOfLegalCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realEstateSituationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "realEstateSituationCode"));
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
