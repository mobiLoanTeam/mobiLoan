/**
 * CustomerIndividualSpecInfoCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerIndividualSpecInfoCreate  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerIndividualGeneralInfoCreate individualGeneralInfo;

    private com.soprabanking.amplitude.CustomerBirthCreate birth;

    private com.soprabanking.amplitude.CustomerIdPaperCreate idPaper;

    private com.soprabanking.amplitude.CustomerTerritorialityCreate territoriality;

    private com.soprabanking.amplitude.CustomerFamily family;

    private com.soprabanking.amplitude.CustomerOtherAttributes otherAttributes;

    private com.soprabanking.amplitude.ModifyCustomerJointAccountsRequest jointAccountsList;

    private com.soprabanking.amplitude.ModifyCustomerChildrenRequest childrenList;

    private com.soprabanking.amplitude.ModifyCustomerBudgetRequest customerBudget;

    private com.soprabanking.amplitude.ModifyCustomerProfessionsAndIncomesRequest professionAndIncomesList;

    public CustomerIndividualSpecInfoCreate() {
    }

    public CustomerIndividualSpecInfoCreate(
           com.soprabanking.amplitude.CustomerIndividualGeneralInfoCreate individualGeneralInfo,
           com.soprabanking.amplitude.CustomerBirthCreate birth,
           com.soprabanking.amplitude.CustomerIdPaperCreate idPaper,
           com.soprabanking.amplitude.CustomerTerritorialityCreate territoriality,
           com.soprabanking.amplitude.CustomerFamily family,
           com.soprabanking.amplitude.CustomerOtherAttributes otherAttributes,
           com.soprabanking.amplitude.ModifyCustomerJointAccountsRequest jointAccountsList,
           com.soprabanking.amplitude.ModifyCustomerChildrenRequest childrenList,
           com.soprabanking.amplitude.ModifyCustomerBudgetRequest customerBudget,
           com.soprabanking.amplitude.ModifyCustomerProfessionsAndIncomesRequest professionAndIncomesList) {
           this.individualGeneralInfo = individualGeneralInfo;
           this.birth = birth;
           this.idPaper = idPaper;
           this.territoriality = territoriality;
           this.family = family;
           this.otherAttributes = otherAttributes;
           this.jointAccountsList = jointAccountsList;
           this.childrenList = childrenList;
           this.customerBudget = customerBudget;
           this.professionAndIncomesList = professionAndIncomesList;
    }


    /**
     * Gets the individualGeneralInfo value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return individualGeneralInfo
     */
    public com.soprabanking.amplitude.CustomerIndividualGeneralInfoCreate getIndividualGeneralInfo() {
        return individualGeneralInfo;
    }


    /**
     * Sets the individualGeneralInfo value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param individualGeneralInfo
     */
    public void setIndividualGeneralInfo(com.soprabanking.amplitude.CustomerIndividualGeneralInfoCreate individualGeneralInfo) {
        this.individualGeneralInfo = individualGeneralInfo;
    }


    /**
     * Gets the birth value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return birth
     */
    public com.soprabanking.amplitude.CustomerBirthCreate getBirth() {
        return birth;
    }


    /**
     * Sets the birth value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param birth
     */
    public void setBirth(com.soprabanking.amplitude.CustomerBirthCreate birth) {
        this.birth = birth;
    }


    /**
     * Gets the idPaper value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return idPaper
     */
    public com.soprabanking.amplitude.CustomerIdPaperCreate getIdPaper() {
        return idPaper;
    }


    /**
     * Sets the idPaper value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param idPaper
     */
    public void setIdPaper(com.soprabanking.amplitude.CustomerIdPaperCreate idPaper) {
        this.idPaper = idPaper;
    }


    /**
     * Gets the territoriality value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return territoriality
     */
    public com.soprabanking.amplitude.CustomerTerritorialityCreate getTerritoriality() {
        return territoriality;
    }


    /**
     * Sets the territoriality value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param territoriality
     */
    public void setTerritoriality(com.soprabanking.amplitude.CustomerTerritorialityCreate territoriality) {
        this.territoriality = territoriality;
    }


    /**
     * Gets the family value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return family
     */
    public com.soprabanking.amplitude.CustomerFamily getFamily() {
        return family;
    }


    /**
     * Sets the family value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param family
     */
    public void setFamily(com.soprabanking.amplitude.CustomerFamily family) {
        this.family = family;
    }


    /**
     * Gets the otherAttributes value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return otherAttributes
     */
    public com.soprabanking.amplitude.CustomerOtherAttributes getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * Sets the otherAttributes value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param otherAttributes
     */
    public void setOtherAttributes(com.soprabanking.amplitude.CustomerOtherAttributes otherAttributes) {
        this.otherAttributes = otherAttributes;
    }


    /**
     * Gets the jointAccountsList value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return jointAccountsList
     */
    public com.soprabanking.amplitude.ModifyCustomerJointAccountsRequest getJointAccountsList() {
        return jointAccountsList;
    }


    /**
     * Sets the jointAccountsList value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param jointAccountsList
     */
    public void setJointAccountsList(com.soprabanking.amplitude.ModifyCustomerJointAccountsRequest jointAccountsList) {
        this.jointAccountsList = jointAccountsList;
    }


    /**
     * Gets the childrenList value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return childrenList
     */
    public com.soprabanking.amplitude.ModifyCustomerChildrenRequest getChildrenList() {
        return childrenList;
    }


    /**
     * Sets the childrenList value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param childrenList
     */
    public void setChildrenList(com.soprabanking.amplitude.ModifyCustomerChildrenRequest childrenList) {
        this.childrenList = childrenList;
    }


    /**
     * Gets the customerBudget value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return customerBudget
     */
    public com.soprabanking.amplitude.ModifyCustomerBudgetRequest getCustomerBudget() {
        return customerBudget;
    }


    /**
     * Sets the customerBudget value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param customerBudget
     */
    public void setCustomerBudget(com.soprabanking.amplitude.ModifyCustomerBudgetRequest customerBudget) {
        this.customerBudget = customerBudget;
    }


    /**
     * Gets the professionAndIncomesList value for this CustomerIndividualSpecInfoCreate.
     * 
     * @return professionAndIncomesList
     */
    public com.soprabanking.amplitude.ModifyCustomerProfessionsAndIncomesRequest getProfessionAndIncomesList() {
        return professionAndIncomesList;
    }


    /**
     * Sets the professionAndIncomesList value for this CustomerIndividualSpecInfoCreate.
     * 
     * @param professionAndIncomesList
     */
    public void setProfessionAndIncomesList(com.soprabanking.amplitude.ModifyCustomerProfessionsAndIncomesRequest professionAndIncomesList) {
        this.professionAndIncomesList = professionAndIncomesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerIndividualSpecInfoCreate)) return false;
        CustomerIndividualSpecInfoCreate other = (CustomerIndividualSpecInfoCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.individualGeneralInfo==null && other.getIndividualGeneralInfo()==null) || 
             (this.individualGeneralInfo!=null &&
              this.individualGeneralInfo.equals(other.getIndividualGeneralInfo()))) &&
            ((this.birth==null && other.getBirth()==null) || 
             (this.birth!=null &&
              this.birth.equals(other.getBirth()))) &&
            ((this.idPaper==null && other.getIdPaper()==null) || 
             (this.idPaper!=null &&
              this.idPaper.equals(other.getIdPaper()))) &&
            ((this.territoriality==null && other.getTerritoriality()==null) || 
             (this.territoriality!=null &&
              this.territoriality.equals(other.getTerritoriality()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              this.family.equals(other.getFamily()))) &&
            ((this.otherAttributes==null && other.getOtherAttributes()==null) || 
             (this.otherAttributes!=null &&
              this.otherAttributes.equals(other.getOtherAttributes()))) &&
            ((this.jointAccountsList==null && other.getJointAccountsList()==null) || 
             (this.jointAccountsList!=null &&
              this.jointAccountsList.equals(other.getJointAccountsList()))) &&
            ((this.childrenList==null && other.getChildrenList()==null) || 
             (this.childrenList!=null &&
              this.childrenList.equals(other.getChildrenList()))) &&
            ((this.customerBudget==null && other.getCustomerBudget()==null) || 
             (this.customerBudget!=null &&
              this.customerBudget.equals(other.getCustomerBudget()))) &&
            ((this.professionAndIncomesList==null && other.getProfessionAndIncomesList()==null) || 
             (this.professionAndIncomesList!=null &&
              this.professionAndIncomesList.equals(other.getProfessionAndIncomesList())));
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
        if (getIndividualGeneralInfo() != null) {
            _hashCode += getIndividualGeneralInfo().hashCode();
        }
        if (getBirth() != null) {
            _hashCode += getBirth().hashCode();
        }
        if (getIdPaper() != null) {
            _hashCode += getIdPaper().hashCode();
        }
        if (getTerritoriality() != null) {
            _hashCode += getTerritoriality().hashCode();
        }
        if (getFamily() != null) {
            _hashCode += getFamily().hashCode();
        }
        if (getOtherAttributes() != null) {
            _hashCode += getOtherAttributes().hashCode();
        }
        if (getJointAccountsList() != null) {
            _hashCode += getJointAccountsList().hashCode();
        }
        if (getChildrenList() != null) {
            _hashCode += getChildrenList().hashCode();
        }
        if (getCustomerBudget() != null) {
            _hashCode += getCustomerBudget().hashCode();
        }
        if (getProfessionAndIncomesList() != null) {
            _hashCode += getProfessionAndIncomesList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerIndividualSpecInfoCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerIndividualSpecInfoCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualGeneralInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "individualGeneralInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerIndividualGeneralInfoCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "birth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerBirthCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPaper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "idPaper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerIdPaperCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoriality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "territoriality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerTerritorialityCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFamily"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "otherAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerOtherAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jointAccountsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "jointAccountsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerJointAccountsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childrenList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "childrenList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerChildrenRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerBudgetRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professionAndIncomesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "professionAndIncomesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerProfessionsAndIncomesRequest"));
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
