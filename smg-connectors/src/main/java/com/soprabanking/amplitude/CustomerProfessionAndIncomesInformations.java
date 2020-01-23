/**
 * CustomerProfessionAndIncomesInformations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerProfessionAndIncomesInformations  implements java.io.Serializable {
    private java.util.Date hireDate;

    private java.lang.String professionCode;

    private java.lang.String employerCode;

    private java.lang.String incomesBracketCode;

    private java.lang.String employerDepartment;

    public CustomerProfessionAndIncomesInformations() {
    }

    public CustomerProfessionAndIncomesInformations(
           java.util.Date hireDate,
           java.lang.String professionCode,
           java.lang.String employerCode,
           java.lang.String incomesBracketCode,
           java.lang.String employerDepartment) {
           this.hireDate = hireDate;
           this.professionCode = professionCode;
           this.employerCode = employerCode;
           this.incomesBracketCode = incomesBracketCode;
           this.employerDepartment = employerDepartment;
    }


    /**
     * Gets the hireDate value for this CustomerProfessionAndIncomesInformations.
     * 
     * @return hireDate
     */
    public java.util.Date getHireDate() {
        return hireDate;
    }


    /**
     * Sets the hireDate value for this CustomerProfessionAndIncomesInformations.
     * 
     * @param hireDate
     */
    public void setHireDate(java.util.Date hireDate) {
        this.hireDate = hireDate;
    }


    /**
     * Gets the professionCode value for this CustomerProfessionAndIncomesInformations.
     * 
     * @return professionCode
     */
    public java.lang.String getProfessionCode() {
        return professionCode;
    }


    /**
     * Sets the professionCode value for this CustomerProfessionAndIncomesInformations.
     * 
     * @param professionCode
     */
    public void setProfessionCode(java.lang.String professionCode) {
        this.professionCode = professionCode;
    }


    /**
     * Gets the employerCode value for this CustomerProfessionAndIncomesInformations.
     * 
     * @return employerCode
     */
    public java.lang.String getEmployerCode() {
        return employerCode;
    }


    /**
     * Sets the employerCode value for this CustomerProfessionAndIncomesInformations.
     * 
     * @param employerCode
     */
    public void setEmployerCode(java.lang.String employerCode) {
        this.employerCode = employerCode;
    }


    /**
     * Gets the incomesBracketCode value for this CustomerProfessionAndIncomesInformations.
     * 
     * @return incomesBracketCode
     */
    public java.lang.String getIncomesBracketCode() {
        return incomesBracketCode;
    }


    /**
     * Sets the incomesBracketCode value for this CustomerProfessionAndIncomesInformations.
     * 
     * @param incomesBracketCode
     */
    public void setIncomesBracketCode(java.lang.String incomesBracketCode) {
        this.incomesBracketCode = incomesBracketCode;
    }


    /**
     * Gets the employerDepartment value for this CustomerProfessionAndIncomesInformations.
     * 
     * @return employerDepartment
     */
    public java.lang.String getEmployerDepartment() {
        return employerDepartment;
    }


    /**
     * Sets the employerDepartment value for this CustomerProfessionAndIncomesInformations.
     * 
     * @param employerDepartment
     */
    public void setEmployerDepartment(java.lang.String employerDepartment) {
        this.employerDepartment = employerDepartment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerProfessionAndIncomesInformations)) return false;
        CustomerProfessionAndIncomesInformations other = (CustomerProfessionAndIncomesInformations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hireDate==null && other.getHireDate()==null) || 
             (this.hireDate!=null &&
              this.hireDate.equals(other.getHireDate()))) &&
            ((this.professionCode==null && other.getProfessionCode()==null) || 
             (this.professionCode!=null &&
              this.professionCode.equals(other.getProfessionCode()))) &&
            ((this.employerCode==null && other.getEmployerCode()==null) || 
             (this.employerCode!=null &&
              this.employerCode.equals(other.getEmployerCode()))) &&
            ((this.incomesBracketCode==null && other.getIncomesBracketCode()==null) || 
             (this.incomesBracketCode!=null &&
              this.incomesBracketCode.equals(other.getIncomesBracketCode()))) &&
            ((this.employerDepartment==null && other.getEmployerDepartment()==null) || 
             (this.employerDepartment!=null &&
              this.employerDepartment.equals(other.getEmployerDepartment())));
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
        if (getHireDate() != null) {
            _hashCode += getHireDate().hashCode();
        }
        if (getProfessionCode() != null) {
            _hashCode += getProfessionCode().hashCode();
        }
        if (getEmployerCode() != null) {
            _hashCode += getEmployerCode().hashCode();
        }
        if (getIncomesBracketCode() != null) {
            _hashCode += getIncomesBracketCode().hashCode();
        }
        if (getEmployerDepartment() != null) {
            _hashCode += getEmployerDepartment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerProfessionAndIncomesInformations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerProfessionAndIncomesInformations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "hireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "professionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "employerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomesBracketCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "incomesBracketCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerDepartment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "employerDepartment"));
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
