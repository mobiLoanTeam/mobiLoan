/**
 * CreateCustomerIdPaperRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CreateCustomerIdPaperRequest  implements java.io.Serializable {
    private java.lang.String customerCode;

    private java.lang.String idPaperType;

    private java.lang.String idPaperNumber;

    private java.util.Date deliveryDate;

    private java.lang.String deliveryPlace;

    private java.lang.String organisationWhichDeliver;

    private java.util.Date validityDateOfIdPaper;

    public CreateCustomerIdPaperRequest() {
    }

    public CreateCustomerIdPaperRequest(
           java.lang.String customerCode,
           java.lang.String idPaperType,
           java.lang.String idPaperNumber,
           java.util.Date deliveryDate,
           java.lang.String deliveryPlace,
           java.lang.String organisationWhichDeliver,
           java.util.Date validityDateOfIdPaper) {
           this.customerCode = customerCode;
           this.idPaperType = idPaperType;
           this.idPaperNumber = idPaperNumber;
           this.deliveryDate = deliveryDate;
           this.deliveryPlace = deliveryPlace;
           this.organisationWhichDeliver = organisationWhichDeliver;
           this.validityDateOfIdPaper = validityDateOfIdPaper;
    }


    /**
     * Gets the customerCode value for this CreateCustomerIdPaperRequest.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this CreateCustomerIdPaperRequest.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the idPaperType value for this CreateCustomerIdPaperRequest.
     * 
     * @return idPaperType
     */
    public java.lang.String getIdPaperType() {
        return idPaperType;
    }


    /**
     * Sets the idPaperType value for this CreateCustomerIdPaperRequest.
     * 
     * @param idPaperType
     */
    public void setIdPaperType(java.lang.String idPaperType) {
        this.idPaperType = idPaperType;
    }


    /**
     * Gets the idPaperNumber value for this CreateCustomerIdPaperRequest.
     * 
     * @return idPaperNumber
     */
    public java.lang.String getIdPaperNumber() {
        return idPaperNumber;
    }


    /**
     * Sets the idPaperNumber value for this CreateCustomerIdPaperRequest.
     * 
     * @param idPaperNumber
     */
    public void setIdPaperNumber(java.lang.String idPaperNumber) {
        this.idPaperNumber = idPaperNumber;
    }


    /**
     * Gets the deliveryDate value for this CreateCustomerIdPaperRequest.
     * 
     * @return deliveryDate
     */
    public java.util.Date getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this CreateCustomerIdPaperRequest.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.util.Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the deliveryPlace value for this CreateCustomerIdPaperRequest.
     * 
     * @return deliveryPlace
     */
    public java.lang.String getDeliveryPlace() {
        return deliveryPlace;
    }


    /**
     * Sets the deliveryPlace value for this CreateCustomerIdPaperRequest.
     * 
     * @param deliveryPlace
     */
    public void setDeliveryPlace(java.lang.String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }


    /**
     * Gets the organisationWhichDeliver value for this CreateCustomerIdPaperRequest.
     * 
     * @return organisationWhichDeliver
     */
    public java.lang.String getOrganisationWhichDeliver() {
        return organisationWhichDeliver;
    }


    /**
     * Sets the organisationWhichDeliver value for this CreateCustomerIdPaperRequest.
     * 
     * @param organisationWhichDeliver
     */
    public void setOrganisationWhichDeliver(java.lang.String organisationWhichDeliver) {
        this.organisationWhichDeliver = organisationWhichDeliver;
    }


    /**
     * Gets the validityDateOfIdPaper value for this CreateCustomerIdPaperRequest.
     * 
     * @return validityDateOfIdPaper
     */
    public java.util.Date getValidityDateOfIdPaper() {
        return validityDateOfIdPaper;
    }


    /**
     * Sets the validityDateOfIdPaper value for this CreateCustomerIdPaperRequest.
     * 
     * @param validityDateOfIdPaper
     */
    public void setValidityDateOfIdPaper(java.util.Date validityDateOfIdPaper) {
        this.validityDateOfIdPaper = validityDateOfIdPaper;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCustomerIdPaperRequest)) return false;
        CreateCustomerIdPaperRequest other = (CreateCustomerIdPaperRequest) obj;
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
            ((this.idPaperType==null && other.getIdPaperType()==null) || 
             (this.idPaperType!=null &&
              this.idPaperType.equals(other.getIdPaperType()))) &&
            ((this.idPaperNumber==null && other.getIdPaperNumber()==null) || 
             (this.idPaperNumber!=null &&
              this.idPaperNumber.equals(other.getIdPaperNumber()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.deliveryPlace==null && other.getDeliveryPlace()==null) || 
             (this.deliveryPlace!=null &&
              this.deliveryPlace.equals(other.getDeliveryPlace()))) &&
            ((this.organisationWhichDeliver==null && other.getOrganisationWhichDeliver()==null) || 
             (this.organisationWhichDeliver!=null &&
              this.organisationWhichDeliver.equals(other.getOrganisationWhichDeliver()))) &&
            ((this.validityDateOfIdPaper==null && other.getValidityDateOfIdPaper()==null) || 
             (this.validityDateOfIdPaper!=null &&
              this.validityDateOfIdPaper.equals(other.getValidityDateOfIdPaper())));
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
        if (getIdPaperType() != null) {
            _hashCode += getIdPaperType().hashCode();
        }
        if (getIdPaperNumber() != null) {
            _hashCode += getIdPaperNumber().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getDeliveryPlace() != null) {
            _hashCode += getDeliveryPlace().hashCode();
        }
        if (getOrganisationWhichDeliver() != null) {
            _hashCode += getOrganisationWhichDeliver().hashCode();
        }
        if (getValidityDateOfIdPaper() != null) {
            _hashCode += getValidityDateOfIdPaper().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCustomerIdPaperRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "createCustomerIdPaperRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPaperType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "idPaperType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPaperNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "idPaperNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "deliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "deliveryPlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organisationWhichDeliver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "organisationWhichDeliver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDateOfIdPaper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "validityDateOfIdPaper"));
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
