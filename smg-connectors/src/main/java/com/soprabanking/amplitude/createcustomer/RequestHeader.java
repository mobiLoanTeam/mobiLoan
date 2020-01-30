/**
 * RequestHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class RequestHeader  implements java.io.Serializable {
    private java.lang.String requestId;

    private java.lang.String serviceName;

    private java.util.Calendar timestamp;

    private java.lang.String originalName;

    private java.lang.String originalId;

    private java.util.Calendar originalTimestamp;

    private java.lang.String languageCode;

    private java.lang.String userCode;

    private java.lang.String channelCode;

    public RequestHeader() {
    }

    public RequestHeader(
           java.lang.String requestId,
           java.lang.String serviceName,
           java.util.Calendar timestamp,
           java.lang.String originalName,
           java.lang.String originalId,
           java.util.Calendar originalTimestamp,
           java.lang.String languageCode,
           java.lang.String userCode,
           java.lang.String channelCode) {
           this.requestId = requestId;
           this.serviceName = serviceName;
           this.timestamp = timestamp;
           this.originalName = originalName;
           this.originalId = originalId;
           this.originalTimestamp = originalTimestamp;
           this.languageCode = languageCode;
           this.userCode = userCode;
           this.channelCode = channelCode;
    }


    /**
     * Gets the requestId value for this RequestHeader.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this RequestHeader.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the serviceName value for this RequestHeader.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this RequestHeader.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the timestamp value for this RequestHeader.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this RequestHeader.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the originalName value for this RequestHeader.
     * 
     * @return originalName
     */
    public java.lang.String getOriginalName() {
        return originalName;
    }


    /**
     * Sets the originalName value for this RequestHeader.
     * 
     * @param originalName
     */
    public void setOriginalName(java.lang.String originalName) {
        this.originalName = originalName;
    }


    /**
     * Gets the originalId value for this RequestHeader.
     * 
     * @return originalId
     */
    public java.lang.String getOriginalId() {
        return originalId;
    }


    /**
     * Sets the originalId value for this RequestHeader.
     * 
     * @param originalId
     */
    public void setOriginalId(java.lang.String originalId) {
        this.originalId = originalId;
    }


    /**
     * Gets the originalTimestamp value for this RequestHeader.
     * 
     * @return originalTimestamp
     */
    public java.util.Calendar getOriginalTimestamp() {
        return originalTimestamp;
    }


    /**
     * Sets the originalTimestamp value for this RequestHeader.
     * 
     * @param originalTimestamp
     */
    public void setOriginalTimestamp(java.util.Calendar originalTimestamp) {
        this.originalTimestamp = originalTimestamp;
    }


    /**
     * Gets the languageCode value for this RequestHeader.
     * 
     * @return languageCode
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this RequestHeader.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the userCode value for this RequestHeader.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this RequestHeader.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
    }


    /**
     * Gets the channelCode value for this RequestHeader.
     * 
     * @return channelCode
     */
    public java.lang.String getChannelCode() {
        return channelCode;
    }


    /**
     * Sets the channelCode value for this RequestHeader.
     * 
     * @param channelCode
     */
    public void setChannelCode(java.lang.String channelCode) {
        this.channelCode = channelCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHeader)) return false;
        RequestHeader other = (RequestHeader) obj;
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
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.originalName==null && other.getOriginalName()==null) || 
             (this.originalName!=null &&
              this.originalName.equals(other.getOriginalName()))) &&
            ((this.originalId==null && other.getOriginalId()==null) || 
             (this.originalId!=null &&
              this.originalId.equals(other.getOriginalId()))) &&
            ((this.originalTimestamp==null && other.getOriginalTimestamp()==null) || 
             (this.originalTimestamp!=null &&
              this.originalTimestamp.equals(other.getOriginalTimestamp()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.userCode==null && other.getUserCode()==null) || 
             (this.userCode!=null &&
              this.userCode.equals(other.getUserCode()))) &&
            ((this.channelCode==null && other.getChannelCode()==null) || 
             (this.channelCode!=null &&
              this.channelCode.equals(other.getChannelCode())));
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
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getOriginalName() != null) {
            _hashCode += getOriginalName().hashCode();
        }
        if (getOriginalId() != null) {
            _hashCode += getOriginalId().hashCode();
        }
        if (getOriginalTimestamp() != null) {
            _hashCode += getOriginalTimestamp().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        if (getChannelCode() != null) {
            _hashCode += getChannelCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "requestHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "serviceName"));
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
        elemField.setFieldName("originalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "originalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "originalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "originalTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "languageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "userCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "channelCode"));
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
