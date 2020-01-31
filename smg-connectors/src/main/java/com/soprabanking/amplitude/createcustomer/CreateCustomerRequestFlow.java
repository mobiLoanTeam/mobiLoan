
package com.soprabanking.amplitude.createcustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createCustomerRequestFlow complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createCustomerRequestFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://soprabanking.com/amplitude}requestHeader"/>
 *         &lt;element name="createCustomerRequest" type="{http://soprabanking.com/amplitude}createCustomerRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCustomerRequestFlow", propOrder = {
    "requestHeader",
    "createCustomerRequest"
})
public class CreateCustomerRequestFlow {

    @XmlElement(required = true)
    protected RequestHeader requestHeader;
    @XmlElement(required = true)
    protected CreateCustomerRequest createCustomerRequest;

    /**
     * Obtient la valeur de la propriété requestHeader.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Définit la valeur de la propriété requestHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Obtient la valeur de la propriété createCustomerRequest.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomerRequest }
     *     
     */
    public CreateCustomerRequest getCreateCustomerRequest() {
        return createCustomerRequest;
    }

    /**
     * Définit la valeur de la propriété createCustomerRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomerRequest }
     *     
     */
    public void setCreateCustomerRequest(CreateCustomerRequest value) {
        this.createCustomerRequest = value;
    }

}
