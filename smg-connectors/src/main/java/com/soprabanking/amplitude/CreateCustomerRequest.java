/**
 * CreateCustomerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CreateCustomerRequest  implements java.io.Serializable {
    private java.lang.String customerCode;

    private com.soprabanking.amplitude.CustomerType customerType;

    private java.lang.String language;

    private java.lang.String titleCode;

    private java.lang.String lastName;

    private java.lang.String nameToReturn;

    private java.lang.String freeFieldCode1;

    private java.lang.String freeFieldCode2;

    private java.lang.String freeFieldCode3;

    private java.lang.String memo;

    private java.lang.String externalIdentifier;

    private com.soprabanking.amplitude.CustomerSituationCreate situation;

    private com.soprabanking.amplitude.CustomerSpecInfoCreate specificInformation;

    private com.soprabanking.amplitude.CustomerGeneralAttributesCreate generalAttributes;

    private com.soprabanking.amplitude.CustomerReportingAttributesCreate reportingAttributes;

    private com.soprabanking.amplitude.CustomerMarketingAttributesCreate marketingAttributes;

    private com.soprabanking.amplitude.CustomerFatcaAttributesCreate fatcaAttributes;

    private com.soprabanking.amplitude.CustomerPaymentMethods paymentMethods;

    private com.soprabanking.amplitude.CreateCustomerAddressRequest[] adressesList;

    private com.soprabanking.amplitude.CreateCustomerPhoneNumberRequest[] phoneNumbersList;

    private com.soprabanking.amplitude.CreateCustomerEmailAddressRequest[] emailAdressesList;

    private com.soprabanking.amplitude.ModifyCustomerContactsRequest contactsList;

    private com.soprabanking.amplitude.CreateCustomerProfile customerProfile;

    private com.soprabanking.amplitude.ModifyCustomerAssetRequest customerAsset;

    private com.soprabanking.amplitude.CreateCustomerIdPaperRequest[] idPapersList;

    private com.soprabanking.amplitude.ModifyCustomerDocumentsRequest documentsList;

    private com.soprabanking.amplitude.ModifyCustomerInternationalOperationsRequest internationalOperationsList;

    private com.soprabanking.amplitude.CustomerDefaultCustomer defaultCustomer;

    private java.lang.String[] kpp;

    public CreateCustomerRequest() {
    }

    public CreateCustomerRequest(
           java.lang.String customerCode,
           com.soprabanking.amplitude.CustomerType customerType,
           java.lang.String language,
           java.lang.String titleCode,
           java.lang.String lastName,
           java.lang.String nameToReturn,
           java.lang.String freeFieldCode1,
           java.lang.String freeFieldCode2,
           java.lang.String freeFieldCode3,
           java.lang.String memo,
           java.lang.String externalIdentifier,
           com.soprabanking.amplitude.CustomerSituationCreate situation,
           com.soprabanking.amplitude.CustomerSpecInfoCreate specificInformation,
           com.soprabanking.amplitude.CustomerGeneralAttributesCreate generalAttributes,
           com.soprabanking.amplitude.CustomerReportingAttributesCreate reportingAttributes,
           com.soprabanking.amplitude.CustomerMarketingAttributesCreate marketingAttributes,
           com.soprabanking.amplitude.CustomerFatcaAttributesCreate fatcaAttributes,
           com.soprabanking.amplitude.CustomerPaymentMethods paymentMethods,
           com.soprabanking.amplitude.CreateCustomerAddressRequest[] adressesList,
           com.soprabanking.amplitude.CreateCustomerPhoneNumberRequest[] phoneNumbersList,
           com.soprabanking.amplitude.CreateCustomerEmailAddressRequest[] emailAdressesList,
           com.soprabanking.amplitude.ModifyCustomerContactsRequest contactsList,
           com.soprabanking.amplitude.CreateCustomerProfile customerProfile,
           com.soprabanking.amplitude.ModifyCustomerAssetRequest customerAsset,
           com.soprabanking.amplitude.CreateCustomerIdPaperRequest[] idPapersList,
           com.soprabanking.amplitude.ModifyCustomerDocumentsRequest documentsList,
           com.soprabanking.amplitude.ModifyCustomerInternationalOperationsRequest internationalOperationsList,
           com.soprabanking.amplitude.CustomerDefaultCustomer defaultCustomer,
           java.lang.String[] kpp) {
           this.customerCode = customerCode;
           this.customerType = customerType;
           this.language = language;
           this.titleCode = titleCode;
           this.lastName = lastName;
           this.nameToReturn = nameToReturn;
           this.freeFieldCode1 = freeFieldCode1;
           this.freeFieldCode2 = freeFieldCode2;
           this.freeFieldCode3 = freeFieldCode3;
           this.memo = memo;
           this.externalIdentifier = externalIdentifier;
           this.situation = situation;
           this.specificInformation = specificInformation;
           this.generalAttributes = generalAttributes;
           this.reportingAttributes = reportingAttributes;
           this.marketingAttributes = marketingAttributes;
           this.fatcaAttributes = fatcaAttributes;
           this.paymentMethods = paymentMethods;
           this.adressesList = adressesList;
           this.phoneNumbersList = phoneNumbersList;
           this.emailAdressesList = emailAdressesList;
           this.contactsList = contactsList;
           this.customerProfile = customerProfile;
           this.customerAsset = customerAsset;
           this.idPapersList = idPapersList;
           this.documentsList = documentsList;
           this.internationalOperationsList = internationalOperationsList;
           this.defaultCustomer = defaultCustomer;
           this.kpp = kpp;
    }


    /**
     * Gets the customerCode value for this CreateCustomerRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CreateCustomerRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the customerType value for this CreateCustomerRequest.
     * 
     * @return customerType
     */
    public com.soprabanking.amplitude.CustomerType getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this CreateCustomerRequest.
     * 
     * @param customerType
     */
    public void setCustomerType(com.soprabanking.amplitude.CustomerType customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the language value for this CreateCustomerRequest.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this CreateCustomerRequest.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the titleCode value for this CreateCustomerRequest.
     * 
     * @return titleCode
     */
    public java.lang.String getTitleCode() {
        return titleCode;
    }


    /**
     * Sets the titleCode value for this CreateCustomerRequest.
     * 
     * @param titleCode
     */
    public void setTitleCode(java.lang.String titleCode) {
        this.titleCode = titleCode;
    }


    /**
     * Gets the lastName value for this CreateCustomerRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this CreateCustomerRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the nameToReturn value for this CreateCustomerRequest.
     * 
     * @return nameToReturn
     */
    public java.lang.String getNameToReturn() {
        return nameToReturn;
    }


    /**
     * Sets the nameToReturn value for this CreateCustomerRequest.
     * 
     * @param nameToReturn
     */
    public void setNameToReturn(java.lang.String nameToReturn) {
        this.nameToReturn = nameToReturn;
    }


    /**
     * Gets the freeFieldCode1 value for this CreateCustomerRequest.
     * 
     * @return freeFieldCode1
     */
    public java.lang.String getFreeFieldCode1() {
        return freeFieldCode1;
    }


    /**
     * Sets the freeFieldCode1 value for this CreateCustomerRequest.
     * 
     * @param freeFieldCode1
     */
    public void setFreeFieldCode1(java.lang.String freeFieldCode1) {
        this.freeFieldCode1 = freeFieldCode1;
    }


    /**
     * Gets the freeFieldCode2 value for this CreateCustomerRequest.
     * 
     * @return freeFieldCode2
     */
    public java.lang.String getFreeFieldCode2() {
        return freeFieldCode2;
    }


    /**
     * Sets the freeFieldCode2 value for this CreateCustomerRequest.
     * 
     * @param freeFieldCode2
     */
    public void setFreeFieldCode2(java.lang.String freeFieldCode2) {
        this.freeFieldCode2 = freeFieldCode2;
    }


    /**
     * Gets the freeFieldCode3 value for this CreateCustomerRequest.
     * 
     * @return freeFieldCode3
     */
    public java.lang.String getFreeFieldCode3() {
        return freeFieldCode3;
    }


    /**
     * Sets the freeFieldCode3 value for this CreateCustomerRequest.
     * 
     * @param freeFieldCode3
     */
    public void setFreeFieldCode3(java.lang.String freeFieldCode3) {
        this.freeFieldCode3 = freeFieldCode3;
    }


    /**
     * Gets the memo value for this CreateCustomerRequest.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this CreateCustomerRequest.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the externalIdentifier value for this CreateCustomerRequest.
     * 
     * @return externalIdentifier
     */
    public java.lang.String getExternalIdentifier() {
        return externalIdentifier;
    }


    /**
     * Sets the externalIdentifier value for this CreateCustomerRequest.
     * 
     * @param externalIdentifier
     */
    public void setExternalIdentifier(java.lang.String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }


    /**
     * Gets the situation value for this CreateCustomerRequest.
     * 
     * @return situation
     */
    public com.soprabanking.amplitude.CustomerSituationCreate getSituation() {
        return situation;
    }


    /**
     * Sets the situation value for this CreateCustomerRequest.
     * 
     * @param situation
     */
    public void setSituation(com.soprabanking.amplitude.CustomerSituationCreate situation) {
        this.situation = situation;
    }


    /**
     * Gets the specificInformation value for this CreateCustomerRequest.
     * 
     * @return specificInformation
     */
    public com.soprabanking.amplitude.CustomerSpecInfoCreate getSpecificInformation() {
        return specificInformation;
    }


    /**
     * Sets the specificInformation value for this CreateCustomerRequest.
     * 
     * @param specificInformation
     */
    public void setSpecificInformation(com.soprabanking.amplitude.CustomerSpecInfoCreate specificInformation) {
        this.specificInformation = specificInformation;
    }


    /**
     * Gets the generalAttributes value for this CreateCustomerRequest.
     * 
     * @return generalAttributes
     */
    public com.soprabanking.amplitude.CustomerGeneralAttributesCreate getGeneralAttributes() {
        return generalAttributes;
    }


    /**
     * Sets the generalAttributes value for this CreateCustomerRequest.
     * 
     * @param generalAttributes
     */
    public void setGeneralAttributes(com.soprabanking.amplitude.CustomerGeneralAttributesCreate generalAttributes) {
        this.generalAttributes = generalAttributes;
    }


    /**
     * Gets the reportingAttributes value for this CreateCustomerRequest.
     * 
     * @return reportingAttributes
     */
    public com.soprabanking.amplitude.CustomerReportingAttributesCreate getReportingAttributes() {
        return reportingAttributes;
    }


    /**
     * Sets the reportingAttributes value for this CreateCustomerRequest.
     * 
     * @param reportingAttributes
     */
    public void setReportingAttributes(com.soprabanking.amplitude.CustomerReportingAttributesCreate reportingAttributes) {
        this.reportingAttributes = reportingAttributes;
    }


    /**
     * Gets the marketingAttributes value for this CreateCustomerRequest.
     * 
     * @return marketingAttributes
     */
    public com.soprabanking.amplitude.CustomerMarketingAttributesCreate getMarketingAttributes() {
        return marketingAttributes;
    }


    /**
     * Sets the marketingAttributes value for this CreateCustomerRequest.
     * 
     * @param marketingAttributes
     */
    public void setMarketingAttributes(com.soprabanking.amplitude.CustomerMarketingAttributesCreate marketingAttributes) {
        this.marketingAttributes = marketingAttributes;
    }


    /**
     * Gets the fatcaAttributes value for this CreateCustomerRequest.
     * 
     * @return fatcaAttributes
     */
    public com.soprabanking.amplitude.CustomerFatcaAttributesCreate getFatcaAttributes() {
        return fatcaAttributes;
    }


    /**
     * Sets the fatcaAttributes value for this CreateCustomerRequest.
     * 
     * @param fatcaAttributes
     */
    public void setFatcaAttributes(com.soprabanking.amplitude.CustomerFatcaAttributesCreate fatcaAttributes) {
        this.fatcaAttributes = fatcaAttributes;
    }


    /**
     * Gets the paymentMethods value for this CreateCustomerRequest.
     * 
     * @return paymentMethods
     */
    public com.soprabanking.amplitude.CustomerPaymentMethods getPaymentMethods() {
        return paymentMethods;
    }


    /**
     * Sets the paymentMethods value for this CreateCustomerRequest.
     * 
     * @param paymentMethods
     */
    public void setPaymentMethods(com.soprabanking.amplitude.CustomerPaymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
    }


    /**
     * Gets the adressesList value for this CreateCustomerRequest.
     * 
     * @return adressesList
     */
    public com.soprabanking.amplitude.CreateCustomerAddressRequest[] getAdressesList() {
        return adressesList;
    }


    /**
     * Sets the adressesList value for this CreateCustomerRequest.
     * 
     * @param adressesList
     */
    public void setAdressesList(com.soprabanking.amplitude.CreateCustomerAddressRequest[] adressesList) {
        this.adressesList = adressesList;
    }


    /**
     * Gets the phoneNumbersList value for this CreateCustomerRequest.
     * 
     * @return phoneNumbersList
     */
    public com.soprabanking.amplitude.CreateCustomerPhoneNumberRequest[] getPhoneNumbersList() {
        return phoneNumbersList;
    }


    /**
     * Sets the phoneNumbersList value for this CreateCustomerRequest.
     * 
     * @param phoneNumbersList
     */
    public void setPhoneNumbersList(com.soprabanking.amplitude.CreateCustomerPhoneNumberRequest[] phoneNumbersList) {
        this.phoneNumbersList = phoneNumbersList;
    }


    /**
     * Gets the emailAdressesList value for this CreateCustomerRequest.
     * 
     * @return emailAdressesList
     */
    public com.soprabanking.amplitude.CreateCustomerEmailAddressRequest[] getEmailAdressesList() {
        return emailAdressesList;
    }


    /**
     * Sets the emailAdressesList value for this CreateCustomerRequest.
     * 
     * @param emailAdressesList
     */
    public void setEmailAdressesList(com.soprabanking.amplitude.CreateCustomerEmailAddressRequest[] emailAdressesList) {
        this.emailAdressesList = emailAdressesList;
    }


    /**
     * Gets the contactsList value for this CreateCustomerRequest.
     * 
     * @return contactsList
     */
    public com.soprabanking.amplitude.ModifyCustomerContactsRequest getContactsList() {
        return contactsList;
    }


    /**
     * Sets the contactsList value for this CreateCustomerRequest.
     * 
     * @param contactsList
     */
    public void setContactsList(com.soprabanking.amplitude.ModifyCustomerContactsRequest contactsList) {
        this.contactsList = contactsList;
    }


    /**
     * Gets the customerProfile value for this CreateCustomerRequest.
     * 
     * @return customerProfile
     */
    public com.soprabanking.amplitude.CreateCustomerProfile getCustomerProfile() {
        return customerProfile;
    }


    /**
     * Sets the customerProfile value for this CreateCustomerRequest.
     * 
     * @param customerProfile
     */
    public void setCustomerProfile(com.soprabanking.amplitude.CreateCustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }


    /**
     * Gets the customerAsset value for this CreateCustomerRequest.
     * 
     * @return customerAsset
     */
    public com.soprabanking.amplitude.ModifyCustomerAssetRequest getCustomerAsset() {
        return customerAsset;
    }


    /**
     * Sets the customerAsset value for this CreateCustomerRequest.
     * 
     * @param customerAsset
     */
    public void setCustomerAsset(com.soprabanking.amplitude.ModifyCustomerAssetRequest customerAsset) {
        this.customerAsset = customerAsset;
    }


    /**
     * Gets the idPapersList value for this CreateCustomerRequest.
     * 
     * @return idPapersList
     */
    public com.soprabanking.amplitude.CreateCustomerIdPaperRequest[] getIdPapersList() {
        return idPapersList;
    }


    /**
     * Sets the idPapersList value for this CreateCustomerRequest.
     * 
     * @param idPapersList
     */
    public void setIdPapersList(com.soprabanking.amplitude.CreateCustomerIdPaperRequest[] idPapersList) {
        this.idPapersList = idPapersList;
    }


    /**
     * Gets the documentsList value for this CreateCustomerRequest.
     * 
     * @return documentsList
     */
    public com.soprabanking.amplitude.ModifyCustomerDocumentsRequest getDocumentsList() {
        return documentsList;
    }


    /**
     * Sets the documentsList value for this CreateCustomerRequest.
     * 
     * @param documentsList
     */
    public void setDocumentsList(com.soprabanking.amplitude.ModifyCustomerDocumentsRequest documentsList) {
        this.documentsList = documentsList;
    }


    /**
     * Gets the internationalOperationsList value for this CreateCustomerRequest.
     * 
     * @return internationalOperationsList
     */
    public com.soprabanking.amplitude.ModifyCustomerInternationalOperationsRequest getInternationalOperationsList() {
        return internationalOperationsList;
    }


    /**
     * Sets the internationalOperationsList value for this CreateCustomerRequest.
     * 
     * @param internationalOperationsList
     */
    public void setInternationalOperationsList(com.soprabanking.amplitude.ModifyCustomerInternationalOperationsRequest internationalOperationsList) {
        this.internationalOperationsList = internationalOperationsList;
    }


    /**
     * Gets the defaultCustomer value for this CreateCustomerRequest.
     * 
     * @return defaultCustomer
     */
    public com.soprabanking.amplitude.CustomerDefaultCustomer getDefaultCustomer() {
        return defaultCustomer;
    }


    /**
     * Sets the defaultCustomer value for this CreateCustomerRequest.
     * 
     * @param defaultCustomer
     */
    public void setDefaultCustomer(com.soprabanking.amplitude.CustomerDefaultCustomer defaultCustomer) {
        this.defaultCustomer = defaultCustomer;
    }


    /**
     * Gets the kpp value for this CreateCustomerRequest.
     * 
     * @return kpp
     */
    public java.lang.String[] getKpp() {
        return kpp;
    }


    /**
     * Sets the kpp value for this CreateCustomerRequest.
     * 
     * @param kpp
     */
    public void setKpp(java.lang.String[] kpp) {
        this.kpp = kpp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerRequest)) return false;
        CreateCustomerRequest other = (CreateCustomerRequest) obj;
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
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.titleCode==null && other.getTitleCode()==null) || 
             (this.titleCode!=null &&
              this.titleCode.equals(other.getTitleCode()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.nameToReturn==null && other.getNameToReturn()==null) || 
             (this.nameToReturn!=null &&
              this.nameToReturn.equals(other.getNameToReturn()))) &&
            ((this.freeFieldCode1==null && other.getFreeFieldCode1()==null) || 
             (this.freeFieldCode1!=null &&
              this.freeFieldCode1.equals(other.getFreeFieldCode1()))) &&
            ((this.freeFieldCode2==null && other.getFreeFieldCode2()==null) || 
             (this.freeFieldCode2!=null &&
              this.freeFieldCode2.equals(other.getFreeFieldCode2()))) &&
            ((this.freeFieldCode3==null && other.getFreeFieldCode3()==null) || 
             (this.freeFieldCode3!=null &&
              this.freeFieldCode3.equals(other.getFreeFieldCode3()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.externalIdentifier==null && other.getExternalIdentifier()==null) || 
             (this.externalIdentifier!=null &&
              this.externalIdentifier.equals(other.getExternalIdentifier()))) &&
            ((this.situation==null && other.getSituation()==null) || 
             (this.situation!=null &&
              this.situation.equals(other.getSituation()))) &&
            ((this.specificInformation==null && other.getSpecificInformation()==null) || 
             (this.specificInformation!=null &&
              this.specificInformation.equals(other.getSpecificInformation()))) &&
            ((this.generalAttributes==null && other.getGeneralAttributes()==null) || 
             (this.generalAttributes!=null &&
              this.generalAttributes.equals(other.getGeneralAttributes()))) &&
            ((this.reportingAttributes==null && other.getReportingAttributes()==null) || 
             (this.reportingAttributes!=null &&
              this.reportingAttributes.equals(other.getReportingAttributes()))) &&
            ((this.marketingAttributes==null && other.getMarketingAttributes()==null) || 
             (this.marketingAttributes!=null &&
              this.marketingAttributes.equals(other.getMarketingAttributes()))) &&
            ((this.fatcaAttributes==null && other.getFatcaAttributes()==null) || 
             (this.fatcaAttributes!=null &&
              this.fatcaAttributes.equals(other.getFatcaAttributes()))) &&
            ((this.paymentMethods==null && other.getPaymentMethods()==null) || 
             (this.paymentMethods!=null &&
              this.paymentMethods.equals(other.getPaymentMethods()))) &&
            ((this.adressesList==null && other.getAdressesList()==null) || 
             (this.adressesList!=null &&
              java.util.Arrays.equals(this.adressesList, other.getAdressesList()))) &&
            ((this.phoneNumbersList==null && other.getPhoneNumbersList()==null) || 
             (this.phoneNumbersList!=null &&
              java.util.Arrays.equals(this.phoneNumbersList, other.getPhoneNumbersList()))) &&
            ((this.emailAdressesList==null && other.getEmailAdressesList()==null) || 
             (this.emailAdressesList!=null &&
              java.util.Arrays.equals(this.emailAdressesList, other.getEmailAdressesList()))) &&
            ((this.contactsList==null && other.getContactsList()==null) || 
             (this.contactsList!=null &&
              this.contactsList.equals(other.getContactsList()))) &&
            ((this.customerProfile==null && other.getCustomerProfile()==null) || 
             (this.customerProfile!=null &&
              this.customerProfile.equals(other.getCustomerProfile()))) &&
            ((this.customerAsset==null && other.getCustomerAsset()==null) || 
             (this.customerAsset!=null &&
              this.customerAsset.equals(other.getCustomerAsset()))) &&
            ((this.idPapersList==null && other.getIdPapersList()==null) || 
             (this.idPapersList!=null &&
              java.util.Arrays.equals(this.idPapersList, other.getIdPapersList()))) &&
            ((this.documentsList==null && other.getDocumentsList()==null) || 
             (this.documentsList!=null &&
              this.documentsList.equals(other.getDocumentsList()))) &&
            ((this.internationalOperationsList==null && other.getInternationalOperationsList()==null) || 
             (this.internationalOperationsList!=null &&
              this.internationalOperationsList.equals(other.getInternationalOperationsList()))) &&
            ((this.defaultCustomer==null && other.getDefaultCustomer()==null) || 
             (this.defaultCustomer!=null &&
              this.defaultCustomer.equals(other.getDefaultCustomer()))) &&
            ((this.kpp==null && other.getKpp()==null) || 
             (this.kpp!=null &&
              java.util.Arrays.equals(this.kpp, other.getKpp())));
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
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getTitleCode() != null) {
            _hashCode += getTitleCode().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getNameToReturn() != null) {
            _hashCode += getNameToReturn().hashCode();
        }
        if (getFreeFieldCode1() != null) {
            _hashCode += getFreeFieldCode1().hashCode();
        }
        if (getFreeFieldCode2() != null) {
            _hashCode += getFreeFieldCode2().hashCode();
        }
        if (getFreeFieldCode3() != null) {
            _hashCode += getFreeFieldCode3().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getExternalIdentifier() != null) {
            _hashCode += getExternalIdentifier().hashCode();
        }
        if (getSituation() != null) {
            _hashCode += getSituation().hashCode();
        }
        if (getSpecificInformation() != null) {
            _hashCode += getSpecificInformation().hashCode();
        }
        if (getGeneralAttributes() != null) {
            _hashCode += getGeneralAttributes().hashCode();
        }
        if (getReportingAttributes() != null) {
            _hashCode += getReportingAttributes().hashCode();
        }
        if (getMarketingAttributes() != null) {
            _hashCode += getMarketingAttributes().hashCode();
        }
        if (getFatcaAttributes() != null) {
            _hashCode += getFatcaAttributes().hashCode();
        }
        if (getPaymentMethods() != null) {
            _hashCode += getPaymentMethods().hashCode();
        }
        if (getAdressesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdressesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdressesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhoneNumbersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneNumbersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneNumbersList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailAdressesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailAdressesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailAdressesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactsList() != null) {
            _hashCode += getContactsList().hashCode();
        }
        if (getCustomerProfile() != null) {
            _hashCode += getCustomerProfile().hashCode();
        }
        if (getCustomerAsset() != null) {
            _hashCode += getCustomerAsset().hashCode();
        }
        if (getIdPapersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdPapersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdPapersList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentsList() != null) {
            _hashCode += getDocumentsList().hashCode();
        }
        if (getInternationalOperationsList() != null) {
            _hashCode += getInternationalOperationsList().hashCode();
        }
        if (getDefaultCustomer() != null) {
            _hashCode += getDefaultCustomer().hashCode();
        }
        if (getKpp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKpp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKpp(), i);
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
        new org.apache.axis.description.TypeDesc(CreateCustomerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "titleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameToReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "nameToReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeFieldCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "freeFieldCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeFieldCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "freeFieldCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeFieldCode3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "freeFieldCode3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "externalIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "situation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerSituationCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "specificInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerSpecInfoCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "generalAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerGeneralAttributesCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportingAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "reportingAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerReportingAttributesCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "marketingAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerMarketingAttributesCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatcaAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "fatcaAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFatcaAttributesCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "paymentMethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerPaymentMethods"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adressesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "adressesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerAddressRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "address"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumbersList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "phoneNumbersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerPhoneNumberRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "phoneNumber"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAdressesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "emailAdressesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerEmailAddressRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "emailAddress"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "contactsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerContactsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerAssetRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPapersList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "idPapersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerIdPaperRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "idPaper"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "documentsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerDocumentsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalOperationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "internationalOperationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerInternationalOperationsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "defaultCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerDefaultCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kpp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "kpp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "kppNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "kppNumber"));
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
