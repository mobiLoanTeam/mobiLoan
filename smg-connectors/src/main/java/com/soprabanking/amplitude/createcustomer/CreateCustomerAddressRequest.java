/**
 * CreateCustomerAddressRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CreateCustomerAddressRequest  implements java.io.Serializable {
    private com.soprabanking.amplitude.AddressCreateIdentifier identifier;

    private java.lang.String languageCode;

    private java.lang.String addressFormat;

    private java.lang.String addressLine1;

    private java.lang.String addressLine2;

    private java.lang.String addressLine3;

    private java.lang.String city;

    private java.lang.String postalCode;

    private java.lang.String deliveryOffice;

    private java.lang.String poBox;

    private java.lang.String postalSector;

    private java.lang.String postalSectorDesignation;

    private java.lang.String countryCode;

    private java.lang.String branchCode;

    private java.lang.String locker;

    private java.lang.String serviceCode;

    private java.lang.String transportTypeCode;

    private java.lang.String emailAddress;

    private java.util.Date provisionalAddressStartDate;

    private java.util.Date provisionalAddressEndDate;

    private java.lang.String geographicalDepartment;

    private java.lang.String county;

    public CreateCustomerAddressRequest() {
    }

    public CreateCustomerAddressRequest(
           com.soprabanking.amplitude.AddressCreateIdentifier identifier,
           java.lang.String languageCode,
           java.lang.String addressFormat,
           java.lang.String addressLine1,
           java.lang.String addressLine2,
           java.lang.String addressLine3,
           java.lang.String city,
           java.lang.String postalCode,
           java.lang.String deliveryOffice,
           java.lang.String poBox,
           java.lang.String postalSector,
           java.lang.String postalSectorDesignation,
           java.lang.String countryCode,
           java.lang.String branchCode,
           java.lang.String locker,
           java.lang.String serviceCode,
           java.lang.String transportTypeCode,
           java.lang.String emailAddress,
           java.util.Date provisionalAddressStartDate,
           java.util.Date provisionalAddressEndDate,
           java.lang.String geographicalDepartment,
           java.lang.String county) {
           this.identifier = identifier;
           this.languageCode = languageCode;
           this.addressFormat = addressFormat;
           this.addressLine1 = addressLine1;
           this.addressLine2 = addressLine2;
           this.addressLine3 = addressLine3;
           this.city = city;
           this.postalCode = postalCode;
           this.deliveryOffice = deliveryOffice;
           this.poBox = poBox;
           this.postalSector = postalSector;
           this.postalSectorDesignation = postalSectorDesignation;
           this.countryCode = countryCode;
           this.branchCode = branchCode;
           this.locker = locker;
           this.serviceCode = serviceCode;
           this.transportTypeCode = transportTypeCode;
           this.emailAddress = emailAddress;
           this.provisionalAddressStartDate = provisionalAddressStartDate;
           this.provisionalAddressEndDate = provisionalAddressEndDate;
           this.geographicalDepartment = geographicalDepartment;
           this.county = county;
    }


    /**
     * Gets the identifier value for this CreateCustomerAddressRequest.
     * 
     * @return identifier
     */
    public com.soprabanking.amplitude.AddressCreateIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this CreateCustomerAddressRequest.
     * 
     * @param identifier
     */
    public void setIdentifier(com.soprabanking.amplitude.AddressCreateIdentifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the languageCode value for this CreateCustomerAddressRequest.
     * 
     * @return languageCode
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this CreateCustomerAddressRequest.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the addressFormat value for this CreateCustomerAddressRequest.
     * 
     * @return addressFormat
     */
    public java.lang.String getAddressFormat() {
        return addressFormat;
    }


    /**
     * Sets the addressFormat value for this CreateCustomerAddressRequest.
     * 
     * @param addressFormat
     */
    public void setAddressFormat(java.lang.String addressFormat) {
        this.addressFormat = addressFormat;
    }


    /**
     * Gets the addressLine1 value for this CreateCustomerAddressRequest.
     * 
     * @return addressLine1
     */
    public java.lang.String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the addressLine1 value for this CreateCustomerAddressRequest.
     * 
     * @param addressLine1
     */
    public void setAddressLine1(java.lang.String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    /**
     * Gets the addressLine2 value for this CreateCustomerAddressRequest.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this CreateCustomerAddressRequest.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the addressLine3 value for this CreateCustomerAddressRequest.
     * 
     * @return addressLine3
     */
    public java.lang.String getAddressLine3() {
        return addressLine3;
    }


    /**
     * Sets the addressLine3 value for this CreateCustomerAddressRequest.
     * 
     * @param addressLine3
     */
    public void setAddressLine3(java.lang.String addressLine3) {
        this.addressLine3 = addressLine3;
    }


    /**
     * Gets the city value for this CreateCustomerAddressRequest.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CreateCustomerAddressRequest.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the postalCode value for this CreateCustomerAddressRequest.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this CreateCustomerAddressRequest.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the deliveryOffice value for this CreateCustomerAddressRequest.
     * 
     * @return deliveryOffice
     */
    public java.lang.String getDeliveryOffice() {
        return deliveryOffice;
    }


    /**
     * Sets the deliveryOffice value for this CreateCustomerAddressRequest.
     * 
     * @param deliveryOffice
     */
    public void setDeliveryOffice(java.lang.String deliveryOffice) {
        this.deliveryOffice = deliveryOffice;
    }


    /**
     * Gets the poBox value for this CreateCustomerAddressRequest.
     * 
     * @return poBox
     */
    public java.lang.String getPoBox() {
        return poBox;
    }


    /**
     * Sets the poBox value for this CreateCustomerAddressRequest.
     * 
     * @param poBox
     */
    public void setPoBox(java.lang.String poBox) {
        this.poBox = poBox;
    }


    /**
     * Gets the postalSector value for this CreateCustomerAddressRequest.
     * 
     * @return postalSector
     */
    public java.lang.String getPostalSector() {
        return postalSector;
    }


    /**
     * Sets the postalSector value for this CreateCustomerAddressRequest.
     * 
     * @param postalSector
     */
    public void setPostalSector(java.lang.String postalSector) {
        this.postalSector = postalSector;
    }


    /**
     * Gets the postalSectorDesignation value for this CreateCustomerAddressRequest.
     * 
     * @return postalSectorDesignation
     */
    public java.lang.String getPostalSectorDesignation() {
        return postalSectorDesignation;
    }


    /**
     * Sets the postalSectorDesignation value for this CreateCustomerAddressRequest.
     * 
     * @param postalSectorDesignation
     */
    public void setPostalSectorDesignation(java.lang.String postalSectorDesignation) {
        this.postalSectorDesignation = postalSectorDesignation;
    }


    /**
     * Gets the countryCode value for this CreateCustomerAddressRequest.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CreateCustomerAddressRequest.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the branchCode value for this CreateCustomerAddressRequest.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this CreateCustomerAddressRequest.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the locker value for this CreateCustomerAddressRequest.
     * 
     * @return locker
     */
    public java.lang.String getLocker() {
        return locker;
    }


    /**
     * Sets the locker value for this CreateCustomerAddressRequest.
     * 
     * @param locker
     */
    public void setLocker(java.lang.String locker) {
        this.locker = locker;
    }


    /**
     * Gets the serviceCode value for this CreateCustomerAddressRequest.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this CreateCustomerAddressRequest.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the transportTypeCode value for this CreateCustomerAddressRequest.
     * 
     * @return transportTypeCode
     */
    public java.lang.String getTransportTypeCode() {
        return transportTypeCode;
    }


    /**
     * Sets the transportTypeCode value for this CreateCustomerAddressRequest.
     * 
     * @param transportTypeCode
     */
    public void setTransportTypeCode(java.lang.String transportTypeCode) {
        this.transportTypeCode = transportTypeCode;
    }


    /**
     * Gets the emailAddress value for this CreateCustomerAddressRequest.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this CreateCustomerAddressRequest.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the provisionalAddressStartDate value for this CreateCustomerAddressRequest.
     * 
     * @return provisionalAddressStartDate
     */
    public java.util.Date getProvisionalAddressStartDate() {
        return provisionalAddressStartDate;
    }


    /**
     * Sets the provisionalAddressStartDate value for this CreateCustomerAddressRequest.
     * 
     * @param provisionalAddressStartDate
     */
    public void setProvisionalAddressStartDate(java.util.Date provisionalAddressStartDate) {
        this.provisionalAddressStartDate = provisionalAddressStartDate;
    }


    /**
     * Gets the provisionalAddressEndDate value for this CreateCustomerAddressRequest.
     * 
     * @return provisionalAddressEndDate
     */
    public java.util.Date getProvisionalAddressEndDate() {
        return provisionalAddressEndDate;
    }


    /**
     * Sets the provisionalAddressEndDate value for this CreateCustomerAddressRequest.
     * 
     * @param provisionalAddressEndDate
     */
    public void setProvisionalAddressEndDate(java.util.Date provisionalAddressEndDate) {
        this.provisionalAddressEndDate = provisionalAddressEndDate;
    }


    /**
     * Gets the geographicalDepartment value for this CreateCustomerAddressRequest.
     * 
     * @return geographicalDepartment
     */
    public java.lang.String getGeographicalDepartment() {
        return geographicalDepartment;
    }


    /**
     * Sets the geographicalDepartment value for this CreateCustomerAddressRequest.
     * 
     * @param geographicalDepartment
     */
    public void setGeographicalDepartment(java.lang.String geographicalDepartment) {
        this.geographicalDepartment = geographicalDepartment;
    }


    /**
     * Gets the county value for this CreateCustomerAddressRequest.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this CreateCustomerAddressRequest.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerAddressRequest)) return false;
        CreateCustomerAddressRequest other = (CreateCustomerAddressRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.addressFormat==null && other.getAddressFormat()==null) || 
             (this.addressFormat!=null &&
              this.addressFormat.equals(other.getAddressFormat()))) &&
            ((this.addressLine1==null && other.getAddressLine1()==null) || 
             (this.addressLine1!=null &&
              this.addressLine1.equals(other.getAddressLine1()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.addressLine3==null && other.getAddressLine3()==null) || 
             (this.addressLine3!=null &&
              this.addressLine3.equals(other.getAddressLine3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.deliveryOffice==null && other.getDeliveryOffice()==null) || 
             (this.deliveryOffice!=null &&
              this.deliveryOffice.equals(other.getDeliveryOffice()))) &&
            ((this.poBox==null && other.getPoBox()==null) || 
             (this.poBox!=null &&
              this.poBox.equals(other.getPoBox()))) &&
            ((this.postalSector==null && other.getPostalSector()==null) || 
             (this.postalSector!=null &&
              this.postalSector.equals(other.getPostalSector()))) &&
            ((this.postalSectorDesignation==null && other.getPostalSectorDesignation()==null) || 
             (this.postalSectorDesignation!=null &&
              this.postalSectorDesignation.equals(other.getPostalSectorDesignation()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.locker==null && other.getLocker()==null) || 
             (this.locker!=null &&
              this.locker.equals(other.getLocker()))) &&
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.transportTypeCode==null && other.getTransportTypeCode()==null) || 
             (this.transportTypeCode!=null &&
              this.transportTypeCode.equals(other.getTransportTypeCode()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.provisionalAddressStartDate==null && other.getProvisionalAddressStartDate()==null) || 
             (this.provisionalAddressStartDate!=null &&
              this.provisionalAddressStartDate.equals(other.getProvisionalAddressStartDate()))) &&
            ((this.provisionalAddressEndDate==null && other.getProvisionalAddressEndDate()==null) || 
             (this.provisionalAddressEndDate!=null &&
              this.provisionalAddressEndDate.equals(other.getProvisionalAddressEndDate()))) &&
            ((this.geographicalDepartment==null && other.getGeographicalDepartment()==null) || 
             (this.geographicalDepartment!=null &&
              this.geographicalDepartment.equals(other.getGeographicalDepartment()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getAddressFormat() != null) {
            _hashCode += getAddressFormat().hashCode();
        }
        if (getAddressLine1() != null) {
            _hashCode += getAddressLine1().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getAddressLine3() != null) {
            _hashCode += getAddressLine3().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getDeliveryOffice() != null) {
            _hashCode += getDeliveryOffice().hashCode();
        }
        if (getPoBox() != null) {
            _hashCode += getPoBox().hashCode();
        }
        if (getPostalSector() != null) {
            _hashCode += getPostalSector().hashCode();
        }
        if (getPostalSectorDesignation() != null) {
            _hashCode += getPostalSectorDesignation().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getLocker() != null) {
            _hashCode += getLocker().hashCode();
        }
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getTransportTypeCode() != null) {
            _hashCode += getTransportTypeCode().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getProvisionalAddressStartDate() != null) {
            _hashCode += getProvisionalAddressStartDate().hashCode();
        }
        if (getProvisionalAddressEndDate() != null) {
            _hashCode += getProvisionalAddressEndDate().hashCode();
        }
        if (getGeographicalDepartment() != null) {
            _hashCode += getGeographicalDepartment().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerAddressRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerAddressRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "addressCreateIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "languageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "addressFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "addressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "addressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "addressLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "deliveryOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "poBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalSector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "postalSector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalSectorDesignation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "postalSectorDesignation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "locker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "serviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "transportTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionalAddressStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "provisionalAddressStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionalAddressEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "provisionalAddressEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geographicalDepartment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "geographicalDepartment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "county"));
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
