/**
 * CustomerGroupAndJobCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class CustomerGroupAndJobCreate  implements java.io.Serializable {
    private java.lang.String customersGroup;

    private java.lang.String subgroup;

    private java.lang.String job;

    private java.lang.String subjob;

    public CustomerGroupAndJobCreate() {
    }

    public CustomerGroupAndJobCreate(
           java.lang.String customersGroup,
           java.lang.String subgroup,
           java.lang.String job,
           java.lang.String subjob) {
           this.customersGroup = customersGroup;
           this.subgroup = subgroup;
           this.job = job;
           this.subjob = subjob;
    }


    /**
     * Gets the customersGroup value for this CustomerGroupAndJobCreate.
     * 
     * @return customersGroup
     */
    public java.lang.String getCustomersGroup() {
        return customersGroup;
    }


    /**
     * Sets the customersGroup value for this CustomerGroupAndJobCreate.
     * 
     * @param customersGroup
     */
    public void setCustomersGroup(java.lang.String customersGroup) {
        this.customersGroup = customersGroup;
    }


    /**
     * Gets the subgroup value for this CustomerGroupAndJobCreate.
     * 
     * @return subgroup
     */
    public java.lang.String getSubgroup() {
        return subgroup;
    }


    /**
     * Sets the subgroup value for this CustomerGroupAndJobCreate.
     * 
     * @param subgroup
     */
    public void setSubgroup(java.lang.String subgroup) {
        this.subgroup = subgroup;
    }


    /**
     * Gets the job value for this CustomerGroupAndJobCreate.
     * 
     * @return job
     */
    public java.lang.String getJob() {
        return job;
    }


    /**
     * Sets the job value for this CustomerGroupAndJobCreate.
     * 
     * @param job
     */
    public void setJob(java.lang.String job) {
        this.job = job;
    }


    /**
     * Gets the subjob value for this CustomerGroupAndJobCreate.
     * 
     * @return subjob
     */
    public java.lang.String getSubjob() {
        return subjob;
    }


    /**
     * Sets the subjob value for this CustomerGroupAndJobCreate.
     * 
     * @param subjob
     */
    public void setSubjob(java.lang.String subjob) {
        this.subjob = subjob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerGroupAndJobCreate)) return false;
        CustomerGroupAndJobCreate other = (CustomerGroupAndJobCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customersGroup==null && other.getCustomersGroup()==null) || 
             (this.customersGroup!=null &&
              this.customersGroup.equals(other.getCustomersGroup()))) &&
            ((this.subgroup==null && other.getSubgroup()==null) || 
             (this.subgroup!=null &&
              this.subgroup.equals(other.getSubgroup()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.subjob==null && other.getSubjob()==null) || 
             (this.subjob!=null &&
              this.subjob.equals(other.getSubjob())));
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
        if (getCustomersGroup() != null) {
            _hashCode += getCustomersGroup().hashCode();
        }
        if (getSubgroup() != null) {
            _hashCode += getSubgroup().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getSubjob() != null) {
            _hashCode += getSubjob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerGroupAndJobCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customerGroupAndJobCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customersGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "customersGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "subgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "subjob"));
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
