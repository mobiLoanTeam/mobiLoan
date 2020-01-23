/**
 * CustomerMarketingAttributesCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerMarketingAttributesCreate  implements java.io.Serializable {
    private com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes;

    public CustomerMarketingAttributesCreate() {
    }

    public CustomerMarketingAttributesCreate(
           com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes) {
           this.freeAttributes = freeAttributes;
    }


    /**
     * Gets the freeAttributes value for this CustomerMarketingAttributesCreate.
     * 
     * @return freeAttributes
     */
    public com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] getFreeAttributes() {
        return freeAttributes;
    }


    /**
     * Sets the freeAttributes value for this CustomerMarketingAttributesCreate.
     * 
     * @param freeAttributes
     */
    public void setFreeAttributes(com.soprabanking.amplitude.CreateCustomerFreeAttributeRequest[] freeAttributes) {
        this.freeAttributes = freeAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerMarketingAttributesCreate)) return false;
        CustomerMarketingAttributesCreate other = (CustomerMarketingAttributesCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(CustomerMarketingAttributesCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerMarketingAttributesCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
