/**
 * ModifyCustomerAssetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soprabanking.amplitude;

public class ModifyCustomerAssetRequest  implements java.io.Serializable {
    private com.soprabanking.amplitude.ModifyCustomerAssetHeader assetHeader;

    private com.soprabanking.amplitude.ModifyCustomerAsset[] assetsDetail;

    public ModifyCustomerAssetRequest() {
    }

    public ModifyCustomerAssetRequest(
           com.soprabanking.amplitude.ModifyCustomerAssetHeader assetHeader,
           com.soprabanking.amplitude.ModifyCustomerAsset[] assetsDetail) {
           this.assetHeader = assetHeader;
           this.assetsDetail = assetsDetail;
    }


    /**
     * Gets the assetHeader value for this ModifyCustomerAssetRequest.
     * 
     * @return assetHeader
     */
    public com.soprabanking.amplitude.ModifyCustomerAssetHeader getAssetHeader() {
        return assetHeader;
    }


    /**
     * Sets the assetHeader value for this ModifyCustomerAssetRequest.
     * 
     * @param assetHeader
     */
    public void setAssetHeader(com.soprabanking.amplitude.ModifyCustomerAssetHeader assetHeader) {
        this.assetHeader = assetHeader;
    }


    /**
     * Gets the assetsDetail value for this ModifyCustomerAssetRequest.
     * 
     * @return assetsDetail
     */
    public com.soprabanking.amplitude.ModifyCustomerAsset[] getAssetsDetail() {
        return assetsDetail;
    }


    /**
     * Sets the assetsDetail value for this ModifyCustomerAssetRequest.
     * 
     * @param assetsDetail
     */
    public void setAssetsDetail(com.soprabanking.amplitude.ModifyCustomerAsset[] assetsDetail) {
        this.assetsDetail = assetsDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyCustomerAssetRequest)) return false;
        ModifyCustomerAssetRequest other = (ModifyCustomerAssetRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetHeader==null && other.getAssetHeader()==null) || 
             (this.assetHeader!=null &&
              this.assetHeader.equals(other.getAssetHeader()))) &&
            ((this.assetsDetail==null && other.getAssetsDetail()==null) || 
             (this.assetsDetail!=null &&
              java.util.Arrays.equals(this.assetsDetail, other.getAssetsDetail())));
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
        if (getAssetHeader() != null) {
            _hashCode += getAssetHeader().hashCode();
        }
        if (getAssetsDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssetsDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssetsDetail(), i);
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
        new org.apache.axis.description.TypeDesc(ModifyCustomerAssetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerAssetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "assetHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerAssetHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "assetsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "modifyCustomerAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soprabanking.com/amplitude", "assetDetail"));
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
