/**
 * ResponseStatusMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ResponseStatusMessage  implements java.io.Serializable {
    private com.soprabanking.amplitude.ResponseMessageNature nature;

    private java.lang.String code;

    private java.lang.String[] line;

    private com.soprabanking.amplitude.ErrorInformation errorInformation;

    public ResponseStatusMessage() {
    }

    public ResponseStatusMessage(
           com.soprabanking.amplitude.ResponseMessageNature nature,
           java.lang.String code,
           java.lang.String[] line,
           com.soprabanking.amplitude.ErrorInformation errorInformation) {
           this.nature = nature;
           this.code = code;
           this.line = line;
           this.errorInformation = errorInformation;
    }


    /**
     * Gets the nature value for this ResponseStatusMessage.
     * 
     * @return nature
     */
    public com.soprabanking.amplitude.ResponseMessageNature getNature() {
        return nature;
    }


    /**
     * Sets the nature value for this ResponseStatusMessage.
     * 
     * @param nature
     */
    public void setNature(com.soprabanking.amplitude.ResponseMessageNature nature) {
        this.nature = nature;
    }


    /**
     * Gets the code value for this ResponseStatusMessage.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ResponseStatusMessage.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the line value for this ResponseStatusMessage.
     * 
     * @return line
     */
    public java.lang.String[] getLine() {
        return line;
    }


    /**
     * Sets the line value for this ResponseStatusMessage.
     * 
     * @param line
     */
    public void setLine(java.lang.String[] line) {
        this.line = line;
    }

    public java.lang.String getLine(int i) {
        return this.line[i];
    }

    public void setLine(int i, java.lang.String _value) {
        this.line[i] = _value;
    }


    /**
     * Gets the errorInformation value for this ResponseStatusMessage.
     * 
     * @return errorInformation
     */
    public com.soprabanking.amplitude.ErrorInformation getErrorInformation() {
        return errorInformation;
    }


    /**
     * Sets the errorInformation value for this ResponseStatusMessage.
     * 
     * @param errorInformation
     */
    public void setErrorInformation(com.soprabanking.amplitude.ErrorInformation errorInformation) {
        this.errorInformation = errorInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseStatusMessage)) return false;
        ResponseStatusMessage other = (ResponseStatusMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nature==null && other.getNature()==null) || 
             (this.nature!=null &&
              this.nature.equals(other.getNature()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              java.util.Arrays.equals(this.line, other.getLine()))) &&
            ((this.errorInformation==null && other.getErrorInformation()==null) || 
             (this.errorInformation!=null &&
              this.errorInformation.equals(other.getErrorInformation())));
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
        if (getNature() != null) {
            _hashCode += getNature().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorInformation() != null) {
            _hashCode += getErrorInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseStatusMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "responseStatusMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "nature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "responseMessageNature"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "errorInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "errorInformation"));
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
