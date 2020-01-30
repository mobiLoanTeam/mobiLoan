/**
 * CustomerDocumentInformations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerDocumentInformations  implements java.io.Serializable {
    private java.lang.String documentType;

    private java.lang.String supportingDocumentCode;

    private java.lang.String documentReference;

    private java.util.Date deliveryDate;

    private java.util.Date validityDate;

    private java.lang.String deliveryPlace;

    private java.lang.String organisationWhichDeliver;

    private java.util.Date dateOnWhichSupportingDocumentWasProvided;

    public CustomerDocumentInformations() {
    }

    public CustomerDocumentInformations(
           java.lang.String documentType,
           java.lang.String supportingDocumentCode,
           java.lang.String documentReference,
           java.util.Date deliveryDate,
           java.util.Date validityDate,
           java.lang.String deliveryPlace,
           java.lang.String organisationWhichDeliver,
           java.util.Date dateOnWhichSupportingDocumentWasProvided) {
           this.documentType = documentType;
           this.supportingDocumentCode = supportingDocumentCode;
           this.documentReference = documentReference;
           this.deliveryDate = deliveryDate;
           this.validityDate = validityDate;
           this.deliveryPlace = deliveryPlace;
           this.organisationWhichDeliver = organisationWhichDeliver;
           this.dateOnWhichSupportingDocumentWasProvided = dateOnWhichSupportingDocumentWasProvided;
    }


    /**
     * Gets the documentType value for this CustomerDocumentInformations.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this CustomerDocumentInformations.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the supportingDocumentCode value for this CustomerDocumentInformations.
     * 
     * @return supportingDocumentCode
     */
    public java.lang.String getSupportingDocumentCode() {
        return supportingDocumentCode;
    }


    /**
     * Sets the supportingDocumentCode value for this CustomerDocumentInformations.
     * 
     * @param supportingDocumentCode
     */
    public void setSupportingDocumentCode(java.lang.String supportingDocumentCode) {
        this.supportingDocumentCode = supportingDocumentCode;
    }


    /**
     * Gets the documentReference value for this CustomerDocumentInformations.
     * 
     * @return documentReference
     */
    public java.lang.String getDocumentReference() {
        return documentReference;
    }


    /**
     * Sets the documentReference value for this CustomerDocumentInformations.
     * 
     * @param documentReference
     */
    public void setDocumentReference(java.lang.String documentReference) {
        this.documentReference = documentReference;
    }


    /**
     * Gets the deliveryDate value for this CustomerDocumentInformations.
     * 
     * @return deliveryDate
     */
    public java.util.Date getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this CustomerDocumentInformations.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.util.Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the validityDate value for this CustomerDocumentInformations.
     * 
     * @return validityDate
     */
    public java.util.Date getValidityDate() {
        return validityDate;
    }


    /**
     * Sets the validityDate value for this CustomerDocumentInformations.
     * 
     * @param validityDate
     */
    public void setValidityDate(java.util.Date validityDate) {
        this.validityDate = validityDate;
    }


    /**
     * Gets the deliveryPlace value for this CustomerDocumentInformations.
     * 
     * @return deliveryPlace
     */
    public java.lang.String getDeliveryPlace() {
        return deliveryPlace;
    }


    /**
     * Sets the deliveryPlace value for this CustomerDocumentInformations.
     * 
     * @param deliveryPlace
     */
    public void setDeliveryPlace(java.lang.String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }


    /**
     * Gets the organisationWhichDeliver value for this CustomerDocumentInformations.
     * 
     * @return organisationWhichDeliver
     */
    public java.lang.String getOrganisationWhichDeliver() {
        return organisationWhichDeliver;
    }


    /**
     * Sets the organisationWhichDeliver value for this CustomerDocumentInformations.
     * 
     * @param organisationWhichDeliver
     */
    public void setOrganisationWhichDeliver(java.lang.String organisationWhichDeliver) {
        this.organisationWhichDeliver = organisationWhichDeliver;
    }


    /**
     * Gets the dateOnWhichSupportingDocumentWasProvided value for this CustomerDocumentInformations.
     * 
     * @return dateOnWhichSupportingDocumentWasProvided
     */
    public java.util.Date getDateOnWhichSupportingDocumentWasProvided() {
        return dateOnWhichSupportingDocumentWasProvided;
    }


    /**
     * Sets the dateOnWhichSupportingDocumentWasProvided value for this CustomerDocumentInformations.
     * 
     * @param dateOnWhichSupportingDocumentWasProvided
     */
    public void setDateOnWhichSupportingDocumentWasProvided(java.util.Date dateOnWhichSupportingDocumentWasProvided) {
        this.dateOnWhichSupportingDocumentWasProvided = dateOnWhichSupportingDocumentWasProvided;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerDocumentInformations)) return false;
        CustomerDocumentInformations other = (CustomerDocumentInformations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.supportingDocumentCode==null && other.getSupportingDocumentCode()==null) || 
             (this.supportingDocumentCode!=null &&
              this.supportingDocumentCode.equals(other.getSupportingDocumentCode()))) &&
            ((this.documentReference==null && other.getDocumentReference()==null) || 
             (this.documentReference!=null &&
              this.documentReference.equals(other.getDocumentReference()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.validityDate==null && other.getValidityDate()==null) || 
             (this.validityDate!=null &&
              this.validityDate.equals(other.getValidityDate()))) &&
            ((this.deliveryPlace==null && other.getDeliveryPlace()==null) || 
             (this.deliveryPlace!=null &&
              this.deliveryPlace.equals(other.getDeliveryPlace()))) &&
            ((this.organisationWhichDeliver==null && other.getOrganisationWhichDeliver()==null) || 
             (this.organisationWhichDeliver!=null &&
              this.organisationWhichDeliver.equals(other.getOrganisationWhichDeliver()))) &&
            ((this.dateOnWhichSupportingDocumentWasProvided==null && other.getDateOnWhichSupportingDocumentWasProvided()==null) || 
             (this.dateOnWhichSupportingDocumentWasProvided!=null &&
              this.dateOnWhichSupportingDocumentWasProvided.equals(other.getDateOnWhichSupportingDocumentWasProvided())));
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
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getSupportingDocumentCode() != null) {
            _hashCode += getSupportingDocumentCode().hashCode();
        }
        if (getDocumentReference() != null) {
            _hashCode += getDocumentReference().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getValidityDate() != null) {
            _hashCode += getValidityDate().hashCode();
        }
        if (getDeliveryPlace() != null) {
            _hashCode += getDeliveryPlace().hashCode();
        }
        if (getOrganisationWhichDeliver() != null) {
            _hashCode += getOrganisationWhichDeliver().hashCode();
        }
        if (getDateOnWhichSupportingDocumentWasProvided() != null) {
            _hashCode += getDateOnWhichSupportingDocumentWasProvided().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerDocumentInformations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerDocumentInformations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "documentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportingDocumentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "supportingDocumentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "documentReference"));
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
        elemField.setFieldName("validityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "validityDate"));
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
        elemField.setFieldName("dateOnWhichSupportingDocumentWasProvided");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "dateOnWhichSupportingDocumentWasProvided"));
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
