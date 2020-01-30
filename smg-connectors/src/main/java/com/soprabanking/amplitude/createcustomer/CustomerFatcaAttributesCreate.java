/**
 * CustomerFatcaAttributesCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerFatcaAttributesCreate  implements java.io.Serializable {
    private java.lang.String fatcaStatus;

    private java.util.Date fatcaStatusDate;

    private java.lang.String crsStatus;

    private java.util.Date crsStatusDate;

    private com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes;

    public CustomerFatcaAttributesCreate() {
    }

    public CustomerFatcaAttributesCreate(
           java.lang.String fatcaStatus,
           java.util.Date fatcaStatusDate,
           java.lang.String crsStatus,
           java.util.Date crsStatusDate,
           com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes) {
           this.fatcaStatus = fatcaStatus;
           this.fatcaStatusDate = fatcaStatusDate;
           this.crsStatus = crsStatus;
           this.crsStatusDate = crsStatusDate;
           this.freeAttributes = freeAttributes;
    }


    /**
     * Gets the fatcaStatus value for this CustomerFatcaAttributesCreate.
     * 
     * @return fatcaStatus
     */
    public java.lang.String getFatcaStatus() {
        return fatcaStatus;
    }


    /**
     * Sets the fatcaStatus value for this CustomerFatcaAttributesCreate.
     * 
     * @param fatcaStatus
     */
    public void setFatcaStatus(java.lang.String fatcaStatus) {
        this.fatcaStatus = fatcaStatus;
    }


    /**
     * Gets the fatcaStatusDate value for this CustomerFatcaAttributesCreate.
     * 
     * @return fatcaStatusDate
     */
    public java.util.Date getFatcaStatusDate() {
        return fatcaStatusDate;
    }


    /**
     * Sets the fatcaStatusDate value for this CustomerFatcaAttributesCreate.
     * 
     * @param fatcaStatusDate
     */
    public void setFatcaStatusDate(java.util.Date fatcaStatusDate) {
        this.fatcaStatusDate = fatcaStatusDate;
    }


    /**
     * Gets the crsStatus value for this CustomerFatcaAttributesCreate.
     * 
     * @return crsStatus
     */
    public java.lang.String getCrsStatus() {
        return crsStatus;
    }


    /**
     * Sets the crsStatus value for this CustomerFatcaAttributesCreate.
     * 
     * @param crsStatus
     */
    public void setCrsStatus(java.lang.String crsStatus) {
        this.crsStatus = crsStatus;
    }


    /**
     * Gets the crsStatusDate value for this CustomerFatcaAttributesCreate.
     * 
     * @return crsStatusDate
     */
    public java.util.Date getCrsStatusDate() {
        return crsStatusDate;
    }


    /**
     * Sets the crsStatusDate value for this CustomerFatcaAttributesCreate.
     * 
     * @param crsStatusDate
     */
    public void setCrsStatusDate(java.util.Date crsStatusDate) {
        this.crsStatusDate = crsStatusDate;
    }


    /**
     * Gets the freeAttributes value for this CustomerFatcaAttributesCreate.
     * 
     * @return freeAttributes
     */
    public com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] getFreeAttributes() {
        return freeAttributes;
    }


    /**
     * Sets the freeAttributes value for this CustomerFatcaAttributesCreate.
     * 
     * @param freeAttributes
     */
    public void setFreeAttributes(com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes) {
        this.freeAttributes = freeAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerFatcaAttributesCreate)) return false;
        CustomerFatcaAttributesCreate other = (CustomerFatcaAttributesCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fatcaStatus==null && other.getFatcaStatus()==null) || 
             (this.fatcaStatus!=null &&
              this.fatcaStatus.equals(other.getFatcaStatus()))) &&
            ((this.fatcaStatusDate==null && other.getFatcaStatusDate()==null) || 
             (this.fatcaStatusDate!=null &&
              this.fatcaStatusDate.equals(other.getFatcaStatusDate()))) &&
            ((this.crsStatus==null && other.getCrsStatus()==null) || 
             (this.crsStatus!=null &&
              this.crsStatus.equals(other.getCrsStatus()))) &&
            ((this.crsStatusDate==null && other.getCrsStatusDate()==null) || 
             (this.crsStatusDate!=null &&
              this.crsStatusDate.equals(other.getCrsStatusDate()))) &&
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
        if (getFatcaStatus() != null) {
            _hashCode += getFatcaStatus().hashCode();
        }
        if (getFatcaStatusDate() != null) {
            _hashCode += getFatcaStatusDate().hashCode();
        }
        if (getCrsStatus() != null) {
            _hashCode += getCrsStatus().hashCode();
        }
        if (getCrsStatusDate() != null) {
            _hashCode += getCrsStatusDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomerFatcaAttributesCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerFatcaAttributesCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatcaStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "fatcaStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatcaStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "fatcaStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "crsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crsStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "crsStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
