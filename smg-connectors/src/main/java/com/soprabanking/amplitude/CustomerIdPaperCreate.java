/**
 * CustomerIdPaperCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerIdPaperCreate  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String idPaperNumber;

    private java.util.Date idPaperDeliveryDate;

    private java.lang.String idPaperDeliveryPlace;

    private java.lang.String organisationWhichDeliver;

    private java.util.Date idPaperValidityDate;

    private java.lang.String nationalIdentifier;

    public CustomerIdPaperCreate() {
    }

    public CustomerIdPaperCreate(
           java.lang.String type,
           java.lang.String idPaperNumber,
           java.util.Date idPaperDeliveryDate,
           java.lang.String idPaperDeliveryPlace,
           java.lang.String organisationWhichDeliver,
           java.util.Date idPaperValidityDate,
           java.lang.String nationalIdentifier) {
           this.type = type;
           this.idPaperNumber = idPaperNumber;
           this.idPaperDeliveryDate = idPaperDeliveryDate;
           this.idPaperDeliveryPlace = idPaperDeliveryPlace;
           this.organisationWhichDeliver = organisationWhichDeliver;
           this.idPaperValidityDate = idPaperValidityDate;
           this.nationalIdentifier = nationalIdentifier;
    }


    /**
     * Gets the type value for this CustomerIdPaperCreate.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CustomerIdPaperCreate.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the idPaperNumber value for this CustomerIdPaperCreate.
     * 
     * @return idPaperNumber
     */
    public java.lang.String getIdPaperNumber() {
        return idPaperNumber;
    }


    /**
     * Sets the idPaperNumber value for this CustomerIdPaperCreate.
     * 
     * @param idPaperNumber
     */
    public void setIdPaperNumber(java.lang.String idPaperNumber) {
        this.idPaperNumber = idPaperNumber;
    }


    /**
     * Gets the idPaperDeliveryDate value for this CustomerIdPaperCreate.
     * 
     * @return idPaperDeliveryDate
     */
    public java.util.Date getIdPaperDeliveryDate() {
        return idPaperDeliveryDate;
    }


    /**
     * Sets the idPaperDeliveryDate value for this CustomerIdPaperCreate.
     * 
     * @param idPaperDeliveryDate
     */
    public void setIdPaperDeliveryDate(java.util.Date idPaperDeliveryDate) {
        this.idPaperDeliveryDate = idPaperDeliveryDate;
    }


    /**
     * Gets the idPaperDeliveryPlace value for this CustomerIdPaperCreate.
     * 
     * @return idPaperDeliveryPlace
     */
    public java.lang.String getIdPaperDeliveryPlace() {
        return idPaperDeliveryPlace;
    }


    /**
     * Sets the idPaperDeliveryPlace value for this CustomerIdPaperCreate.
     * 
     * @param idPaperDeliveryPlace
     */
    public void setIdPaperDeliveryPlace(java.lang.String idPaperDeliveryPlace) {
        this.idPaperDeliveryPlace = idPaperDeliveryPlace;
    }


    /**
     * Gets the organisationWhichDeliver value for this CustomerIdPaperCreate.
     * 
     * @return organisationWhichDeliver
     */
    public java.lang.String getOrganisationWhichDeliver() {
        return organisationWhichDeliver;
    }


    /**
     * Sets the organisationWhichDeliver value for this CustomerIdPaperCreate.
     * 
     * @param organisationWhichDeliver
     */
    public void setOrganisationWhichDeliver(java.lang.String organisationWhichDeliver) {
        this.organisationWhichDeliver = organisationWhichDeliver;
    }


    /**
     * Gets the idPaperValidityDate value for this CustomerIdPaperCreate.
     * 
     * @return idPaperValidityDate
     */
    public java.util.Date getIdPaperValidityDate() {
        return idPaperValidityDate;
    }


    /**
     * Sets the idPaperValidityDate value for this CustomerIdPaperCreate.
     * 
     * @param idPaperValidityDate
     */
    public void setIdPaperValidityDate(java.util.Date idPaperValidityDate) {
        this.idPaperValidityDate = idPaperValidityDate;
    }


    /**
     * Gets the nationalIdentifier value for this CustomerIdPaperCreate.
     * 
     * @return nationalIdentifier
     */
    public java.lang.String getNationalIdentifier() {
        return nationalIdentifier;
    }


    /**
     * Sets the nationalIdentifier value for this CustomerIdPaperCreate.
     * 
     * @param nationalIdentifier
     */
    public void setNationalIdentifier(java.lang.String nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerIdPaperCreate)) return false;
        CustomerIdPaperCreate other = (CustomerIdPaperCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.idPaperNumber==null && other.getIdPaperNumber()==null) || 
             (this.idPaperNumber!=null &&
              this.idPaperNumber.equals(other.getIdPaperNumber()))) &&
            ((this.idPaperDeliveryDate==null && other.getIdPaperDeliveryDate()==null) || 
             (this.idPaperDeliveryDate!=null &&
              this.idPaperDeliveryDate.equals(other.getIdPaperDeliveryDate()))) &&
            ((this.idPaperDeliveryPlace==null && other.getIdPaperDeliveryPlace()==null) || 
             (this.idPaperDeliveryPlace!=null &&
              this.idPaperDeliveryPlace.equals(other.getIdPaperDeliveryPlace()))) &&
            ((this.organisationWhichDeliver==null && other.getOrganisationWhichDeliver()==null) || 
             (this.organisationWhichDeliver!=null &&
              this.organisationWhichDeliver.equals(other.getOrganisationWhichDeliver()))) &&
            ((this.idPaperValidityDate==null && other.getIdPaperValidityDate()==null) || 
             (this.idPaperValidityDate!=null &&
              this.idPaperValidityDate.equals(other.getIdPaperValidityDate()))) &&
            ((this.nationalIdentifier==null && other.getNationalIdentifier()==null) || 
             (this.nationalIdentifier!=null &&
              this.nationalIdentifier.equals(other.getNationalIdentifier())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIdPaperNumber() != null) {
            _hashCode += getIdPaperNumber().hashCode();
        }
        if (getIdPaperDeliveryDate() != null) {
            _hashCode += getIdPaperDeliveryDate().hashCode();
        }
        if (getIdPaperDeliveryPlace() != null) {
            _hashCode += getIdPaperDeliveryPlace().hashCode();
        }
        if (getOrganisationWhichDeliver() != null) {
            _hashCode += getOrganisationWhichDeliver().hashCode();
        }
        if (getIdPaperValidityDate() != null) {
            _hashCode += getIdPaperValidityDate().hashCode();
        }
        if (getNationalIdentifier() != null) {
            _hashCode += getNationalIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerIdPaperCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerIdPaperCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "type"));
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
        elemField.setFieldName("idPaperDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "idPaperDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPaperDeliveryPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "idPaperDeliveryPlace"));
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
        elemField.setFieldName("idPaperValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "idPaperValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "nationalIdentifier"));
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
