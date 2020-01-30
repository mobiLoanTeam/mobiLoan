/**
 * CustomerGeneralAttributesCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerGeneralAttributesCreate  implements java.io.Serializable {
    private java.lang.String branchCode;

    private java.lang.String customerOfficer;

    private java.lang.String qualityCode;

    private java.lang.Boolean taxableCustomer;

    private java.lang.String internalCategoryCode;

    private java.lang.String segment;

    private java.lang.String statisticNumber;

    private java.lang.String sponsorCustomerCode;

    private com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes;

    private com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] specificFreeAttributes;

    private java.util.Date centralBankRiskEffectiveDate;

    public CustomerGeneralAttributesCreate() {
    }

    public CustomerGeneralAttributesCreate(
           java.lang.String branchCode,
           java.lang.String customerOfficer,
           java.lang.String qualityCode,
           java.lang.Boolean taxableCustomer,
           java.lang.String internalCategoryCode,
           java.lang.String segment,
           java.lang.String statisticNumber,
           java.lang.String sponsorCustomerCode,
           com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes,
           com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] specificFreeAttributes,
           java.util.Date centralBankRiskEffectiveDate) {
           this.branchCode = branchCode;
           this.customerOfficer = customerOfficer;
           this.qualityCode = qualityCode;
           this.taxableCustomer = taxableCustomer;
           this.internalCategoryCode = internalCategoryCode;
           this.segment = segment;
           this.statisticNumber = statisticNumber;
           this.sponsorCustomerCode = sponsorCustomerCode;
           this.freeAttributes = freeAttributes;
           this.specificFreeAttributes = specificFreeAttributes;
           this.centralBankRiskEffectiveDate = centralBankRiskEffectiveDate;
    }


    /**
     * Gets the branchCode value for this CustomerGeneralAttributesCreate.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this CustomerGeneralAttributesCreate.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the customerOfficer value for this CustomerGeneralAttributesCreate.
     * 
     * @return customerOfficer
     */
    public java.lang.String getCustomerOfficer() {
        return customerOfficer;
    }


    /**
     * Sets the customerOfficer value for this CustomerGeneralAttributesCreate.
     * 
     * @param customerOfficer
     */
    public void setCustomerOfficer(java.lang.String customerOfficer) {
        this.customerOfficer = customerOfficer;
    }


    /**
     * Gets the qualityCode value for this CustomerGeneralAttributesCreate.
     * 
     * @return qualityCode
     */
    public java.lang.String getQualityCode() {
        return qualityCode;
    }


    /**
     * Sets the qualityCode value for this CustomerGeneralAttributesCreate.
     * 
     * @param qualityCode
     */
    public void setQualityCode(java.lang.String qualityCode) {
        this.qualityCode = qualityCode;
    }


    /**
     * Gets the taxableCustomer value for this CustomerGeneralAttributesCreate.
     * 
     * @return taxableCustomer
     */
    public java.lang.Boolean getTaxableCustomer() {
        return taxableCustomer;
    }


    /**
     * Sets the taxableCustomer value for this CustomerGeneralAttributesCreate.
     * 
     * @param taxableCustomer
     */
    public void setTaxableCustomer(java.lang.Boolean taxableCustomer) {
        this.taxableCustomer = taxableCustomer;
    }


    /**
     * Gets the internalCategoryCode value for this CustomerGeneralAttributesCreate.
     * 
     * @return internalCategoryCode
     */
    public java.lang.String getInternalCategoryCode() {
        return internalCategoryCode;
    }


    /**
     * Sets the internalCategoryCode value for this CustomerGeneralAttributesCreate.
     * 
     * @param internalCategoryCode
     */
    public void setInternalCategoryCode(java.lang.String internalCategoryCode) {
        this.internalCategoryCode = internalCategoryCode;
    }


    /**
     * Gets the segment value for this CustomerGeneralAttributesCreate.
     * 
     * @return segment
     */
    public java.lang.String getSegment() {
        return segment;
    }


    /**
     * Sets the segment value for this CustomerGeneralAttributesCreate.
     * 
     * @param segment
     */
    public void setSegment(java.lang.String segment) {
        this.segment = segment;
    }


    /**
     * Gets the statisticNumber value for this CustomerGeneralAttributesCreate.
     * 
     * @return statisticNumber
     */
    public java.lang.String getStatisticNumber() {
        return statisticNumber;
    }


    /**
     * Sets the statisticNumber value for this CustomerGeneralAttributesCreate.
     * 
     * @param statisticNumber
     */
    public void setStatisticNumber(java.lang.String statisticNumber) {
        this.statisticNumber = statisticNumber;
    }


    /**
     * Gets the sponsorCustomerCode value for this CustomerGeneralAttributesCreate.
     * 
     * @return sponsorCustomerCode
     */
    public java.lang.String getSponsorCustomerCode() {
        return sponsorCustomerCode;
    }


    /**
     * Sets the sponsorCustomerCode value for this CustomerGeneralAttributesCreate.
     * 
     * @param sponsorCustomerCode
     */
    public void setSponsorCustomerCode(java.lang.String sponsorCustomerCode) {
        this.sponsorCustomerCode = sponsorCustomerCode;
    }


    /**
     * Gets the freeAttributes value for this CustomerGeneralAttributesCreate.
     * 
     * @return freeAttributes
     */
    public com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] getFreeAttributes() {
        return freeAttributes;
    }


    /**
     * Sets the freeAttributes value for this CustomerGeneralAttributesCreate.
     * 
     * @param freeAttributes
     */
    public void setFreeAttributes(com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes) {
        this.freeAttributes = freeAttributes;
    }


    /**
     * Gets the specificFreeAttributes value for this CustomerGeneralAttributesCreate.
     * 
     * @return specificFreeAttributes
     */
    public com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] getSpecificFreeAttributes() {
        return specificFreeAttributes;
    }


    /**
     * Sets the specificFreeAttributes value for this CustomerGeneralAttributesCreate.
     * 
     * @param specificFreeAttributes
     */
    public void setSpecificFreeAttributes(com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] specificFreeAttributes) {
        this.specificFreeAttributes = specificFreeAttributes;
    }


    /**
     * Gets the centralBankRiskEffectiveDate value for this CustomerGeneralAttributesCreate.
     * 
     * @return centralBankRiskEffectiveDate
     */
    public java.util.Date getCentralBankRiskEffectiveDate() {
        return centralBankRiskEffectiveDate;
    }


    /**
     * Sets the centralBankRiskEffectiveDate value for this CustomerGeneralAttributesCreate.
     * 
     * @param centralBankRiskEffectiveDate
     */
    public void setCentralBankRiskEffectiveDate(java.util.Date centralBankRiskEffectiveDate) {
        this.centralBankRiskEffectiveDate = centralBankRiskEffectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerGeneralAttributesCreate)) return false;
        CustomerGeneralAttributesCreate other = (CustomerGeneralAttributesCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.customerOfficer==null && other.getCustomerOfficer()==null) || 
             (this.customerOfficer!=null &&
              this.customerOfficer.equals(other.getCustomerOfficer()))) &&
            ((this.qualityCode==null && other.getQualityCode()==null) || 
             (this.qualityCode!=null &&
              this.qualityCode.equals(other.getQualityCode()))) &&
            ((this.taxableCustomer==null && other.getTaxableCustomer()==null) || 
             (this.taxableCustomer!=null &&
              this.taxableCustomer.equals(other.getTaxableCustomer()))) &&
            ((this.internalCategoryCode==null && other.getInternalCategoryCode()==null) || 
             (this.internalCategoryCode!=null &&
              this.internalCategoryCode.equals(other.getInternalCategoryCode()))) &&
            ((this.segment==null && other.getSegment()==null) || 
             (this.segment!=null &&
              this.segment.equals(other.getSegment()))) &&
            ((this.statisticNumber==null && other.getStatisticNumber()==null) || 
             (this.statisticNumber!=null &&
              this.statisticNumber.equals(other.getStatisticNumber()))) &&
            ((this.sponsorCustomerCode==null && other.getSponsorCustomerCode()==null) || 
             (this.sponsorCustomerCode!=null &&
              this.sponsorCustomerCode.equals(other.getSponsorCustomerCode()))) &&
            ((this.freeAttributes==null && other.getFreeAttributes()==null) || 
             (this.freeAttributes!=null &&
              java.util.Arrays.equals(this.freeAttributes, other.getFreeAttributes()))) &&
            ((this.specificFreeAttributes==null && other.getSpecificFreeAttributes()==null) || 
             (this.specificFreeAttributes!=null &&
              java.util.Arrays.equals(this.specificFreeAttributes, other.getSpecificFreeAttributes()))) &&
            ((this.centralBankRiskEffectiveDate==null && other.getCentralBankRiskEffectiveDate()==null) || 
             (this.centralBankRiskEffectiveDate!=null &&
              this.centralBankRiskEffectiveDate.equals(other.getCentralBankRiskEffectiveDate())));
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
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getCustomerOfficer() != null) {
            _hashCode += getCustomerOfficer().hashCode();
        }
        if (getQualityCode() != null) {
            _hashCode += getQualityCode().hashCode();
        }
        if (getTaxableCustomer() != null) {
            _hashCode += getTaxableCustomer().hashCode();
        }
        if (getInternalCategoryCode() != null) {
            _hashCode += getInternalCategoryCode().hashCode();
        }
        if (getSegment() != null) {
            _hashCode += getSegment().hashCode();
        }
        if (getStatisticNumber() != null) {
            _hashCode += getStatisticNumber().hashCode();
        }
        if (getSponsorCustomerCode() != null) {
            _hashCode += getSponsorCustomerCode().hashCode();
        }
        if (getFreeAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpecificFreeAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecificFreeAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecificFreeAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCentralBankRiskEffectiveDate() != null) {
            _hashCode += getCentralBankRiskEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerGeneralAttributesCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerGeneralAttributesCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerOfficer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOfficer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "qualityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxableCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "taxableCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "internalCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statisticNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "statisticNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sponsorCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "sponsorCustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "freeAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerFreeAttributeRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "freeAttribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificFreeAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "specificFreeAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerFreeAttributeRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "freeAttribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralBankRiskEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "centralBankRiskEffectiveDate"));
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
