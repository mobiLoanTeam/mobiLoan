/**
 * CustomerReportingAttributesCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerReportingAttributesCreate  implements java.io.Serializable {
    private java.lang.String declaredHome;

    private java.lang.String economicAgentCode;

    private java.lang.String activityFieldCode;

    private java.lang.String relationshipWithTheBank;

    private java.lang.String gradingAgreement;

    private java.math.BigDecimal gradingAgreementAmount;

    private java.lang.String securityIssuer;

    private java.lang.String internationalOperationsIndicator;

    private com.soprabanking.amplitude.CustomerCreditInfoCentreCreate creditInfoCentre;

    private com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes;

    public CustomerReportingAttributesCreate() {
    }

    public CustomerReportingAttributesCreate(
           java.lang.String declaredHome,
           java.lang.String economicAgentCode,
           java.lang.String activityFieldCode,
           java.lang.String relationshipWithTheBank,
           java.lang.String gradingAgreement,
           java.math.BigDecimal gradingAgreementAmount,
           java.lang.String securityIssuer,
           java.lang.String internationalOperationsIndicator,
           com.soprabanking.amplitude.CustomerCreditInfoCentreCreate creditInfoCentre,
           com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes) {
           this.declaredHome = declaredHome;
           this.economicAgentCode = economicAgentCode;
           this.activityFieldCode = activityFieldCode;
           this.relationshipWithTheBank = relationshipWithTheBank;
           this.gradingAgreement = gradingAgreement;
           this.gradingAgreementAmount = gradingAgreementAmount;
           this.securityIssuer = securityIssuer;
           this.internationalOperationsIndicator = internationalOperationsIndicator;
           this.creditInfoCentre = creditInfoCentre;
           this.freeAttributes = freeAttributes;
    }


    /**
     * Gets the declaredHome value for this CustomerReportingAttributesCreate.
     * 
     * @return declaredHome
     */
    public java.lang.String getDeclaredHome() {
        return declaredHome;
    }


    /**
     * Sets the declaredHome value for this CustomerReportingAttributesCreate.
     * 
     * @param declaredHome
     */
    public void setDeclaredHome(java.lang.String declaredHome) {
        this.declaredHome = declaredHome;
    }


    /**
     * Gets the economicAgentCode value for this CustomerReportingAttributesCreate.
     * 
     * @return economicAgentCode
     */
    public java.lang.String getEconomicAgentCode() {
        return economicAgentCode;
    }


    /**
     * Sets the economicAgentCode value for this CustomerReportingAttributesCreate.
     * 
     * @param economicAgentCode
     */
    public void setEconomicAgentCode(java.lang.String economicAgentCode) {
        this.economicAgentCode = economicAgentCode;
    }


    /**
     * Gets the activityFieldCode value for this CustomerReportingAttributesCreate.
     * 
     * @return activityFieldCode
     */
    public java.lang.String getActivityFieldCode() {
        return activityFieldCode;
    }


    /**
     * Sets the activityFieldCode value for this CustomerReportingAttributesCreate.
     * 
     * @param activityFieldCode
     */
    public void setActivityFieldCode(java.lang.String activityFieldCode) {
        this.activityFieldCode = activityFieldCode;
    }


    /**
     * Gets the relationshipWithTheBank value for this CustomerReportingAttributesCreate.
     * 
     * @return relationshipWithTheBank
     */
    public java.lang.String getRelationshipWithTheBank() {
        return relationshipWithTheBank;
    }


    /**
     * Sets the relationshipWithTheBank value for this CustomerReportingAttributesCreate.
     * 
     * @param relationshipWithTheBank
     */
    public void setRelationshipWithTheBank(java.lang.String relationshipWithTheBank) {
        this.relationshipWithTheBank = relationshipWithTheBank;
    }


    /**
     * Gets the gradingAgreement value for this CustomerReportingAttributesCreate.
     * 
     * @return gradingAgreement
     */
    public java.lang.String getGradingAgreement() {
        return gradingAgreement;
    }


    /**
     * Sets the gradingAgreement value for this CustomerReportingAttributesCreate.
     * 
     * @param gradingAgreement
     */
    public void setGradingAgreement(java.lang.String gradingAgreement) {
        this.gradingAgreement = gradingAgreement;
    }


    /**
     * Gets the gradingAgreementAmount value for this CustomerReportingAttributesCreate.
     * 
     * @return gradingAgreementAmount
     */
    public java.math.BigDecimal getGradingAgreementAmount() {
        return gradingAgreementAmount;
    }


    /**
     * Sets the gradingAgreementAmount value for this CustomerReportingAttributesCreate.
     * 
     * @param gradingAgreementAmount
     */
    public void setGradingAgreementAmount(java.math.BigDecimal gradingAgreementAmount) {
        this.gradingAgreementAmount = gradingAgreementAmount;
    }


    /**
     * Gets the securityIssuer value for this CustomerReportingAttributesCreate.
     * 
     * @return securityIssuer
     */
    public java.lang.String getSecurityIssuer() {
        return securityIssuer;
    }


    /**
     * Sets the securityIssuer value for this CustomerReportingAttributesCreate.
     * 
     * @param securityIssuer
     */
    public void setSecurityIssuer(java.lang.String securityIssuer) {
        this.securityIssuer = securityIssuer;
    }


    /**
     * Gets the internationalOperationsIndicator value for this CustomerReportingAttributesCreate.
     * 
     * @return internationalOperationsIndicator
     */
    public java.lang.String getInternationalOperationsIndicator() {
        return internationalOperationsIndicator;
    }


    /**
     * Sets the internationalOperationsIndicator value for this CustomerReportingAttributesCreate.
     * 
     * @param internationalOperationsIndicator
     */
    public void setInternationalOperationsIndicator(java.lang.String internationalOperationsIndicator) {
        this.internationalOperationsIndicator = internationalOperationsIndicator;
    }


    /**
     * Gets the creditInfoCentre value for this CustomerReportingAttributesCreate.
     * 
     * @return creditInfoCentre
     */
    public com.soprabanking.amplitude.CustomerCreditInfoCentreCreate getCreditInfoCentre() {
        return creditInfoCentre;
    }


    /**
     * Sets the creditInfoCentre value for this CustomerReportingAttributesCreate.
     * 
     * @param creditInfoCentre
     */
    public void setCreditInfoCentre(com.soprabanking.amplitude.CustomerCreditInfoCentreCreate creditInfoCentre) {
        this.creditInfoCentre = creditInfoCentre;
    }


    /**
     * Gets the freeAttributes value for this CustomerReportingAttributesCreate.
     * 
     * @return freeAttributes
     */
    public com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] getFreeAttributes() {
        return freeAttributes;
    }


    /**
     * Sets the freeAttributes value for this CustomerReportingAttributesCreate.
     * 
     * @param freeAttributes
     */
    public void setFreeAttributes(com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes) {
        this.freeAttributes = freeAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerReportingAttributesCreate)) return false;
        CustomerReportingAttributesCreate other = (CustomerReportingAttributesCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.declaredHome==null && other.getDeclaredHome()==null) || 
             (this.declaredHome!=null &&
              this.declaredHome.equals(other.getDeclaredHome()))) &&
            ((this.economicAgentCode==null && other.getEconomicAgentCode()==null) || 
             (this.economicAgentCode!=null &&
              this.economicAgentCode.equals(other.getEconomicAgentCode()))) &&
            ((this.activityFieldCode==null && other.getActivityFieldCode()==null) || 
             (this.activityFieldCode!=null &&
              this.activityFieldCode.equals(other.getActivityFieldCode()))) &&
            ((this.relationshipWithTheBank==null && other.getRelationshipWithTheBank()==null) || 
             (this.relationshipWithTheBank!=null &&
              this.relationshipWithTheBank.equals(other.getRelationshipWithTheBank()))) &&
            ((this.gradingAgreement==null && other.getGradingAgreement()==null) || 
             (this.gradingAgreement!=null &&
              this.gradingAgreement.equals(other.getGradingAgreement()))) &&
            ((this.gradingAgreementAmount==null && other.getGradingAgreementAmount()==null) || 
             (this.gradingAgreementAmount!=null &&
              this.gradingAgreementAmount.equals(other.getGradingAgreementAmount()))) &&
            ((this.securityIssuer==null && other.getSecurityIssuer()==null) || 
             (this.securityIssuer!=null &&
              this.securityIssuer.equals(other.getSecurityIssuer()))) &&
            ((this.internationalOperationsIndicator==null && other.getInternationalOperationsIndicator()==null) || 
             (this.internationalOperationsIndicator!=null &&
              this.internationalOperationsIndicator.equals(other.getInternationalOperationsIndicator()))) &&
            ((this.creditInfoCentre==null && other.getCreditInfoCentre()==null) || 
             (this.creditInfoCentre!=null &&
              this.creditInfoCentre.equals(other.getCreditInfoCentre()))) &&
            ((this.freeAttributes==null && other.getFreeAttributes()==null) || 
             (this.freeAttributes!=null &&
              java.util.Arrays.equals(this.freeAttributes, other.getFreeAttributes())));
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
        if (getDeclaredHome() != null) {
            _hashCode += getDeclaredHome().hashCode();
        }
        if (getEconomicAgentCode() != null) {
            _hashCode += getEconomicAgentCode().hashCode();
        }
        if (getActivityFieldCode() != null) {
            _hashCode += getActivityFieldCode().hashCode();
        }
        if (getRelationshipWithTheBank() != null) {
            _hashCode += getRelationshipWithTheBank().hashCode();
        }
        if (getGradingAgreement() != null) {
            _hashCode += getGradingAgreement().hashCode();
        }
        if (getGradingAgreementAmount() != null) {
            _hashCode += getGradingAgreementAmount().hashCode();
        }
        if (getSecurityIssuer() != null) {
            _hashCode += getSecurityIssuer().hashCode();
        }
        if (getInternationalOperationsIndicator() != null) {
            _hashCode += getInternationalOperationsIndicator().hashCode();
        }
        if (getCreditInfoCentre() != null) {
            _hashCode += getCreditInfoCentre().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerReportingAttributesCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerReportingAttributesCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declaredHome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "declaredHome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("economicAgentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "economicAgentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityFieldCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "activityFieldCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipWithTheBank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "relationshipWithTheBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gradingAgreement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "gradingAgreement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gradingAgreementAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "gradingAgreementAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityIssuer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "securityIssuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalOperationsIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "internationalOperationsIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditInfoCentre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "creditInfoCentre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCreditInfoCentreCreate"));
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
