/**
 * CustomerSituationCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerSituationCreate  implements java.io.Serializable {
    private java.lang.String nationalityCode;

    private java.lang.String countryOfResidence;

    private java.lang.String legalSituation;

    private java.util.Date applicationDateOfLegalSituation;

    public CustomerSituationCreate() {
    }

    public CustomerSituationCreate(
           java.lang.String nationalityCode,
           java.lang.String countryOfResidence,
           java.lang.String legalSituation,
           java.util.Date applicationDateOfLegalSituation) {
           this.nationalityCode = nationalityCode;
           this.countryOfResidence = countryOfResidence;
           this.legalSituation = legalSituation;
           this.applicationDateOfLegalSituation = applicationDateOfLegalSituation;
    }


    /**
     * Gets the nationalityCode value for this CustomerSituationCreate.
     * 
     * @return nationalityCode
     */
    public java.lang.String getNationalityCode() {
        return nationalityCode;
    }


    /**
     * Sets the nationalityCode value for this CustomerSituationCreate.
     * 
     * @param nationalityCode
     */
    public void setNationalityCode(java.lang.String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }


    /**
     * Gets the countryOfResidence value for this CustomerSituationCreate.
     * 
     * @return countryOfResidence
     */
    public java.lang.String getCountryOfResidence() {
        return countryOfResidence;
    }


    /**
     * Sets the countryOfResidence value for this CustomerSituationCreate.
     * 
     * @param countryOfResidence
     */
    public void setCountryOfResidence(java.lang.String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }


    /**
     * Gets the legalSituation value for this CustomerSituationCreate.
     * 
     * @return legalSituation
     */
    public java.lang.String getLegalSituation() {
        return legalSituation;
    }


    /**
     * Sets the legalSituation value for this CustomerSituationCreate.
     * 
     * @param legalSituation
     */
    public void setLegalSituation(java.lang.String legalSituation) {
        this.legalSituation = legalSituation;
    }


    /**
     * Gets the applicationDateOfLegalSituation value for this CustomerSituationCreate.
     * 
     * @return applicationDateOfLegalSituation
     */
    public java.util.Date getApplicationDateOfLegalSituation() {
        return applicationDateOfLegalSituation;
    }


    /**
     * Sets the applicationDateOfLegalSituation value for this CustomerSituationCreate.
     * 
     * @param applicationDateOfLegalSituation
     */
    public void setApplicationDateOfLegalSituation(java.util.Date applicationDateOfLegalSituation) {
        this.applicationDateOfLegalSituation = applicationDateOfLegalSituation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerSituationCreate)) return false;
        CustomerSituationCreate other = (CustomerSituationCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nationalityCode==null && other.getNationalityCode()==null) || 
             (this.nationalityCode!=null &&
              this.nationalityCode.equals(other.getNationalityCode()))) &&
            ((this.countryOfResidence==null && other.getCountryOfResidence()==null) || 
             (this.countryOfResidence!=null &&
              this.countryOfResidence.equals(other.getCountryOfResidence()))) &&
            ((this.legalSituation==null && other.getLegalSituation()==null) || 
             (this.legalSituation!=null &&
              this.legalSituation.equals(other.getLegalSituation()))) &&
            ((this.applicationDateOfLegalSituation==null && other.getApplicationDateOfLegalSituation()==null) || 
             (this.applicationDateOfLegalSituation!=null &&
              this.applicationDateOfLegalSituation.equals(other.getApplicationDateOfLegalSituation())));
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
        if (getNationalityCode() != null) {
            _hashCode += getNationalityCode().hashCode();
        }
        if (getCountryOfResidence() != null) {
            _hashCode += getCountryOfResidence().hashCode();
        }
        if (getLegalSituation() != null) {
            _hashCode += getLegalSituation().hashCode();
        }
        if (getApplicationDateOfLegalSituation() != null) {
            _hashCode += getApplicationDateOfLegalSituation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerSituationCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerSituationCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "nationalityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfResidence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "countryOfResidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalSituation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "legalSituation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDateOfLegalSituation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "applicationDateOfLegalSituation"));
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
