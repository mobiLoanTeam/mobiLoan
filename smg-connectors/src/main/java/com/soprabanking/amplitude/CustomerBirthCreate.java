/**
 * CustomerBirthCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerBirthCreate  implements java.io.Serializable {
    private com.soprabanking.amplitude.Sex holderSex;

    private java.lang.String maidenName;

    private java.util.Date birthDate;

    private java.lang.String birthCity;

    private java.lang.String birthCounty;

    private java.lang.String birthRegion;

    private java.lang.String birthCountry;

    public CustomerBirthCreate() {
    }

    public CustomerBirthCreate(
           com.soprabanking.amplitude.Sex holderSex,
           java.lang.String maidenName,
           java.util.Date birthDate,
           java.lang.String birthCity,
           java.lang.String birthCounty,
           java.lang.String birthRegion,
           java.lang.String birthCountry) {
           this.holderSex = holderSex;
           this.maidenName = maidenName;
           this.birthDate = birthDate;
           this.birthCity = birthCity;
           this.birthCounty = birthCounty;
           this.birthRegion = birthRegion;
           this.birthCountry = birthCountry;
    }


    /**
     * Gets the holderSex value for this CustomerBirthCreate.
     * 
     * @return holderSex
     */
    public com.soprabanking.amplitude.Sex getHolderSex() {
        return holderSex;
    }


    /**
     * Sets the holderSex value for this CustomerBirthCreate.
     * 
     * @param holderSex
     */
    public void setHolderSex(com.soprabanking.amplitude.Sex holderSex) {
        this.holderSex = holderSex;
    }


    /**
     * Gets the maidenName value for this CustomerBirthCreate.
     * 
     * @return maidenName
     */
    public java.lang.String getMaidenName() {
        return maidenName;
    }


    /**
     * Sets the maidenName value for this CustomerBirthCreate.
     * 
     * @param maidenName
     */
    public void setMaidenName(java.lang.String maidenName) {
        this.maidenName = maidenName;
    }


    /**
     * Gets the birthDate value for this CustomerBirthCreate.
     * 
     * @return birthDate
     */
    public java.util.Date getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this CustomerBirthCreate.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the birthCity value for this CustomerBirthCreate.
     * 
     * @return birthCity
     */
    public java.lang.String getBirthCity() {
        return birthCity;
    }


    /**
     * Sets the birthCity value for this CustomerBirthCreate.
     * 
     * @param birthCity
     */
    public void setBirthCity(java.lang.String birthCity) {
        this.birthCity = birthCity;
    }


    /**
     * Gets the birthCounty value for this CustomerBirthCreate.
     * 
     * @return birthCounty
     */
    public java.lang.String getBirthCounty() {
        return birthCounty;
    }


    /**
     * Sets the birthCounty value for this CustomerBirthCreate.
     * 
     * @param birthCounty
     */
    public void setBirthCounty(java.lang.String birthCounty) {
        this.birthCounty = birthCounty;
    }


    /**
     * Gets the birthRegion value for this CustomerBirthCreate.
     * 
     * @return birthRegion
     */
    public java.lang.String getBirthRegion() {
        return birthRegion;
    }


    /**
     * Sets the birthRegion value for this CustomerBirthCreate.
     * 
     * @param birthRegion
     */
    public void setBirthRegion(java.lang.String birthRegion) {
        this.birthRegion = birthRegion;
    }


    /**
     * Gets the birthCountry value for this CustomerBirthCreate.
     * 
     * @return birthCountry
     */
    public java.lang.String getBirthCountry() {
        return birthCountry;
    }


    /**
     * Sets the birthCountry value for this CustomerBirthCreate.
     * 
     * @param birthCountry
     */
    public void setBirthCountry(java.lang.String birthCountry) {
        this.birthCountry = birthCountry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerBirthCreate)) return false;
        CustomerBirthCreate other = (CustomerBirthCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.holderSex==null && other.getHolderSex()==null) || 
             (this.holderSex!=null &&
              this.holderSex.equals(other.getHolderSex()))) &&
            ((this.maidenName==null && other.getMaidenName()==null) || 
             (this.maidenName!=null &&
              this.maidenName.equals(other.getMaidenName()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.birthCity==null && other.getBirthCity()==null) || 
             (this.birthCity!=null &&
              this.birthCity.equals(other.getBirthCity()))) &&
            ((this.birthCounty==null && other.getBirthCounty()==null) || 
             (this.birthCounty!=null &&
              this.birthCounty.equals(other.getBirthCounty()))) &&
            ((this.birthRegion==null && other.getBirthRegion()==null) || 
             (this.birthRegion!=null &&
              this.birthRegion.equals(other.getBirthRegion()))) &&
            ((this.birthCountry==null && other.getBirthCountry()==null) || 
             (this.birthCountry!=null &&
              this.birthCountry.equals(other.getBirthCountry())));
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
        if (getHolderSex() != null) {
            _hashCode += getHolderSex().hashCode();
        }
        if (getMaidenName() != null) {
            _hashCode += getMaidenName().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getBirthCity() != null) {
            _hashCode += getBirthCity().hashCode();
        }
        if (getBirthCounty() != null) {
            _hashCode += getBirthCounty().hashCode();
        }
        if (getBirthRegion() != null) {
            _hashCode += getBirthRegion().hashCode();
        }
        if (getBirthCountry() != null) {
            _hashCode += getBirthCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerBirthCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerBirthCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holderSex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "holderSex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "sex"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maidenName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "maidenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "birthCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "birthCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "birthRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "birthCountry"));
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
