/**
 * CustomerCorporateSpecInfoCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerCorporateSpecInfoCreate  implements java.io.Serializable {
    private com.soprabanking.amplitude.CustomerCorporateGeneralInfoCreate corporateGeneralInfo;

    private com.soprabanking.amplitude.CustomerCorporateId corporateId;

    private com.soprabanking.amplitude.CustomerLegalInformationCreate legalInformation;

    private com.soprabanking.amplitude.CustomerGroupAndJobCreate groupAndJob;

    private com.soprabanking.amplitude.ModifyCustomerLeadersRequest leadersList;

    private com.soprabanking.amplitude.CreateCustomerShareholderRequest[] shareholdersList;

    private com.soprabanking.amplitude.ModifyCustomerFinancialDataRequest financialDataList;

    public CustomerCorporateSpecInfoCreate() {
    }

    public CustomerCorporateSpecInfoCreate(
           com.soprabanking.amplitude.CustomerCorporateGeneralInfoCreate corporateGeneralInfo,
           com.soprabanking.amplitude.CustomerCorporateId corporateId,
           com.soprabanking.amplitude.CustomerLegalInformationCreate legalInformation,
           com.soprabanking.amplitude.CustomerGroupAndJobCreate groupAndJob,
           com.soprabanking.amplitude.ModifyCustomerLeadersRequest leadersList,
           com.soprabanking.amplitude.CreateCustomerShareholderRequest[] shareholdersList,
           com.soprabanking.amplitude.ModifyCustomerFinancialDataRequest financialDataList) {
           this.corporateGeneralInfo = corporateGeneralInfo;
           this.corporateId = corporateId;
           this.legalInformation = legalInformation;
           this.groupAndJob = groupAndJob;
           this.leadersList = leadersList;
           this.shareholdersList = shareholdersList;
           this.financialDataList = financialDataList;
    }


    /**
     * Gets the corporateGeneralInfo value for this CustomerCorporateSpecInfoCreate.
     * 
     * @return corporateGeneralInfo
     */
    public com.soprabanking.amplitude.CustomerCorporateGeneralInfoCreate getCorporateGeneralInfo() {
        return corporateGeneralInfo;
    }


    /**
     * Sets the corporateGeneralInfo value for this CustomerCorporateSpecInfoCreate.
     * 
     * @param corporateGeneralInfo
     */
    public void setCorporateGeneralInfo(com.soprabanking.amplitude.CustomerCorporateGeneralInfoCreate corporateGeneralInfo) {
        this.corporateGeneralInfo = corporateGeneralInfo;
    }


    /**
     * Gets the corporateId value for this CustomerCorporateSpecInfoCreate.
     * 
     * @return corporateId
     */
    public com.soprabanking.amplitude.CustomerCorporateId getCorporateId() {
        return corporateId;
    }


    /**
     * Sets the corporateId value for this CustomerCorporateSpecInfoCreate.
     * 
     * @param corporateId
     */
    public void setCorporateId(com.soprabanking.amplitude.CustomerCorporateId corporateId) {
        this.corporateId = corporateId;
    }


    /**
     * Gets the legalInformation value for this CustomerCorporateSpecInfoCreate.
     * 
     * @return legalInformation
     */
    public com.soprabanking.amplitude.CustomerLegalInformationCreate getLegalInformation() {
        return legalInformation;
    }


    /**
     * Sets the legalInformation value for this CustomerCorporateSpecInfoCreate.
     * 
     * @param legalInformation
     */
    public void setLegalInformation(com.soprabanking.amplitude.CustomerLegalInformationCreate legalInformation) {
        this.legalInformation = legalInformation;
    }


    /**
     * Gets the groupAndJob value for this CustomerCorporateSpecInfoCreate.
     * 
     * @return groupAndJob
     */
    public com.soprabanking.amplitude.CustomerGroupAndJobCreate getGroupAndJob() {
        return groupAndJob;
    }


    /**
     * Sets the groupAndJob value for this CustomerCorporateSpecInfoCreate.
     * 
     * @param groupAndJob
     */
    public void setGroupAndJob(com.soprabanking.amplitude.CustomerGroupAndJobCreate groupAndJob) {
        this.groupAndJob = groupAndJob;
    }


    /**
     * Gets the leadersList value for this CustomerCorporateSpecInfoCreate.
     * 
     * @return leadersList
     */
    public com.soprabanking.amplitude.ModifyCustomerLeadersRequest getLeadersList() {
        return leadersList;
    }


    /**
     * Sets the leadersList value for this CustomerCorporateSpecInfoCreate.
     * 
     * @param leadersList
     */
    public void setLeadersList(com.soprabanking.amplitude.ModifyCustomerLeadersRequest leadersList) {
        this.leadersList = leadersList;
    }


    /**
     * Gets the shareholdersList value for this CustomerCorporateSpecInfoCreate.
     * 
     * @return shareholdersList
     */
    public com.soprabanking.amplitude.CreateCustomerShareholderRequest[] getShareholdersList() {
        return shareholdersList;
    }


    /**
     * Sets the shareholdersList value for this CustomerCorporateSpecInfoCreate.
     * 
     * @param shareholdersList
     */
    public void setShareholdersList(com.soprabanking.amplitude.CreateCustomerShareholderRequest[] shareholdersList) {
        this.shareholdersList = shareholdersList;
    }


    /**
     * Gets the financialDataList value for this CustomerCorporateSpecInfoCreate.
     * 
     * @return financialDataList
     */
    public com.soprabanking.amplitude.ModifyCustomerFinancialDataRequest getFinancialDataList() {
        return financialDataList;
    }


    /**
     * Sets the financialDataList value for this CustomerCorporateSpecInfoCreate.
     * 
     * @param financialDataList
     */
    public void setFinancialDataList(com.soprabanking.amplitude.ModifyCustomerFinancialDataRequest financialDataList) {
        this.financialDataList = financialDataList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerCorporateSpecInfoCreate)) return false;
        CustomerCorporateSpecInfoCreate other = (CustomerCorporateSpecInfoCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.corporateGeneralInfo==null && other.getCorporateGeneralInfo()==null) || 
             (this.corporateGeneralInfo!=null &&
              this.corporateGeneralInfo.equals(other.getCorporateGeneralInfo()))) &&
            ((this.corporateId==null && other.getCorporateId()==null) || 
             (this.corporateId!=null &&
              this.corporateId.equals(other.getCorporateId()))) &&
            ((this.legalInformation==null && other.getLegalInformation()==null) || 
             (this.legalInformation!=null &&
              this.legalInformation.equals(other.getLegalInformation()))) &&
            ((this.groupAndJob==null && other.getGroupAndJob()==null) || 
             (this.groupAndJob!=null &&
              this.groupAndJob.equals(other.getGroupAndJob()))) &&
            ((this.leadersList==null && other.getLeadersList()==null) || 
             (this.leadersList!=null &&
              this.leadersList.equals(other.getLeadersList()))) &&
            ((this.shareholdersList==null && other.getShareholdersList()==null) || 
             (this.shareholdersList!=null &&
              java.util.Arrays.equals(this.shareholdersList, other.getShareholdersList()))) &&
            ((this.financialDataList==null && other.getFinancialDataList()==null) || 
             (this.financialDataList!=null &&
              this.financialDataList.equals(other.getFinancialDataList())));
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
        if (getCorporateGeneralInfo() != null) {
            _hashCode += getCorporateGeneralInfo().hashCode();
        }
        if (getCorporateId() != null) {
            _hashCode += getCorporateId().hashCode();
        }
        if (getLegalInformation() != null) {
            _hashCode += getLegalInformation().hashCode();
        }
        if (getGroupAndJob() != null) {
            _hashCode += getGroupAndJob().hashCode();
        }
        if (getLeadersList() != null) {
            _hashCode += getLeadersList().hashCode();
        }
        if (getShareholdersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShareholdersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShareholdersList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinancialDataList() != null) {
            _hashCode += getFinancialDataList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerCorporateSpecInfoCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCorporateSpecInfoCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateGeneralInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "corporateGeneralInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCorporateGeneralInfoCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "corporateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCorporateId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "legalInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerLegalInformationCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupAndJob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "groupAndJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerGroupAndJobCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadersList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "leadersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerLeadersRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareholdersList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "shareholdersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerShareholderRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "shareholder"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financialDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "financialDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerFinancialDataRequest"));
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
