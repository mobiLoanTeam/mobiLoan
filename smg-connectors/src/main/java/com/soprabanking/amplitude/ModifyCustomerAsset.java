/**
 * ModifyCustomerAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerAsset  implements java.io.Serializable {
    private java.lang.String assetCode;

    private java.math.BigDecimal estimation;

    private java.math.BigDecimal remainingCapital;

    private java.lang.String currency;

    private java.lang.Boolean competition;

    private java.util.Date maturityDate;

    public ModifyCustomerAsset() {
    }

    public ModifyCustomerAsset(
           java.lang.String assetCode,
           java.math.BigDecimal estimation,
           java.math.BigDecimal remainingCapital,
           java.lang.String currency,
           java.lang.Boolean competition,
           java.util.Date maturityDate) {
           this.assetCode = assetCode;
           this.estimation = estimation;
           this.remainingCapital = remainingCapital;
           this.currency = currency;
           this.competition = competition;
           this.maturityDate = maturityDate;
    }


    /**
     * Gets the assetCode value for this ModifyCustomerAsset.
     * 
     * @return assetCode
     */
    public java.lang.String getAssetCode() {
        return assetCode;
    }


    /**
     * Sets the assetCode value for this ModifyCustomerAsset.
     * 
     * @param assetCode
     */
    public void setAssetCode(java.lang.String assetCode) {
        this.assetCode = assetCode;
    }


    /**
     * Gets the estimation value for this ModifyCustomerAsset.
     * 
     * @return estimation
     */
    public java.math.BigDecimal getEstimation() {
        return estimation;
    }


    /**
     * Sets the estimation value for this ModifyCustomerAsset.
     * 
     * @param estimation
     */
    public void setEstimation(java.math.BigDecimal estimation) {
        this.estimation = estimation;
    }


    /**
     * Gets the remainingCapital value for this ModifyCustomerAsset.
     * 
     * @return remainingCapital
     */
    public java.math.BigDecimal getRemainingCapital() {
        return remainingCapital;
    }


    /**
     * Sets the remainingCapital value for this ModifyCustomerAsset.
     * 
     * @param remainingCapital
     */
    public void setRemainingCapital(java.math.BigDecimal remainingCapital) {
        this.remainingCapital = remainingCapital;
    }


    /**
     * Gets the currency value for this ModifyCustomerAsset.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ModifyCustomerAsset.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the competition value for this ModifyCustomerAsset.
     * 
     * @return competition
     */
    public java.lang.Boolean getCompetition() {
        return competition;
    }


    /**
     * Sets the competition value for this ModifyCustomerAsset.
     * 
     * @param competition
     */
    public void setCompetition(java.lang.Boolean competition) {
        this.competition = competition;
    }


    /**
     * Gets the maturityDate value for this ModifyCustomerAsset.
     * 
     * @return maturityDate
     */
    public java.util.Date getMaturityDate() {
        return maturityDate;
    }


    /**
     * Sets the maturityDate value for this ModifyCustomerAsset.
     * 
     * @param maturityDate
     */
    public void setMaturityDate(java.util.Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerAsset)) return false;
        ModifyCustomerAsset other = (ModifyCustomerAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetCode==null && other.getAssetCode()==null) || 
             (this.assetCode!=null &&
              this.assetCode.equals(other.getAssetCode()))) &&
            ((this.estimation==null && other.getEstimation()==null) || 
             (this.estimation!=null &&
              this.estimation.equals(other.getEstimation()))) &&
            ((this.remainingCapital==null && other.getRemainingCapital()==null) || 
             (this.remainingCapital!=null &&
              this.remainingCapital.equals(other.getRemainingCapital()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.competition==null && other.getCompetition()==null) || 
             (this.competition!=null &&
              this.competition.equals(other.getCompetition()))) &&
            ((this.maturityDate==null && other.getMaturityDate()==null) || 
             (this.maturityDate!=null &&
              this.maturityDate.equals(other.getMaturityDate())));
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
        if (getAssetCode() != null) {
            _hashCode += getAssetCode().hashCode();
        }
        if (getEstimation() != null) {
            _hashCode += getEstimation().hashCode();
        }
        if (getRemainingCapital() != null) {
            _hashCode += getRemainingCapital().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCompetition() != null) {
            _hashCode += getCompetition().hashCode();
        }
        if (getMaturityDate() != null) {
            _hashCode += getMaturityDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyCustomerAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "assetCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "estimation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "remainingCapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "competition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maturityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "maturityDate"));
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
