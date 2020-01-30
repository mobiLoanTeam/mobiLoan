/**
 * ResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ResponseHeader  implements java.io.Serializable {
    private java.lang.String requestId;

    private java.lang.String responseId;

    private java.util.Calendar timestamp;

    private java.lang.String serviceVersion;

    private com.soprabanking.amplitude.Language language;

    public ResponseHeader() {
    }

    public ResponseHeader(
           java.lang.String requestId,
           java.lang.String responseId,
           java.util.Calendar timestamp,
           java.lang.String serviceVersion,
           com.soprabanking.amplitude.Language language) {
           this.requestId = requestId;
           this.responseId = responseId;
           this.timestamp = timestamp;
           this.serviceVersion = serviceVersion;
           this.language = language;
    }


    /**
     * Gets the requestId value for this ResponseHeader.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ResponseHeader.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the responseId value for this ResponseHeader.
     * 
     * @return responseId
     */
    public java.lang.String getResponseId() {
        return responseId;
    }


    /**
     * Sets the responseId value for this ResponseHeader.
     * 
     * @param responseId
     */
    public void setResponseId(java.lang.String responseId) {
        this.responseId = responseId;
    }


    /**
     * Gets the timestamp value for this ResponseHeader.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this ResponseHeader.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the serviceVersion value for this ResponseHeader.
     * 
     * @return serviceVersion
     */
    public java.lang.String getServiceVersion() {
        return serviceVersion;
    }


    /**
     * Sets the serviceVersion value for this ResponseHeader.
     * 
     * @param serviceVersion
     */
    public void setServiceVersion(java.lang.String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }


    /**
     * Gets the language value for this ResponseHeader.
     * 
     * @return language
     */
    public com.soprabanking.amplitude.Language getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ResponseHeader.
     * 
     * @param language
     */
    public void setLanguage(com.soprabanking.amplitude.Language language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseHeader)) return false;
        ResponseHeader other = (ResponseHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.responseId==null && other.getResponseId()==null) || 
             (this.responseId!=null &&
              this.responseId.equals(other.getResponseId()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.serviceVersion==null && other.getServiceVersion()==null) || 
             (this.serviceVersion!=null &&
              this.serviceVersion.equals(other.getServiceVersion()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getResponseId() != null) {
            _hashCode += getResponseId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getServiceVersion() != null) {
            _hashCode += getServiceVersion().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "responseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "responseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "serviceVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "language"));
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
