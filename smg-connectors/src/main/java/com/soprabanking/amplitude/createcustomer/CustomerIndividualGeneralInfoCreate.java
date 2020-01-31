
package com.soprabanking.amplitude.createcustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour customerIndividualGeneralInfoCreate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerIndividualGeneralInfoCreate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstname" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/>
 *         &lt;element name="middlename" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/>
 *         &lt;element name="thirdname" type="{http://soprabanking.com/amplitude}charMax30" minOccurs="0"/>
 *         &lt;element name="familyStatusCode" type="{http://soprabanking.com/amplitude}familyStatusCode" minOccurs="0"/>
 *         &lt;element name="marriageSettlementCode" type="{http://soprabanking.com/amplitude}marriageSettlementCode" minOccurs="0"/>
 *         &lt;element name="holderLegalCapacity" type="{http://soprabanking.com/amplitude}legalCapacityCode" minOccurs="0"/>
 *         &lt;element name="applicationDateOfLegalCapacity" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="realEstateSituationCode" type="{http://soprabanking.com/amplitude}customerRealEstateSituationCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerIndividualGeneralInfoCreate", propOrder = {
    "firstname",
    "middlename",
    "thirdname",
    "familyStatusCode",
    "marriageSettlementCode",
    "holderLegalCapacity",
    "applicationDateOfLegalCapacity",
    "realEstateSituationCode"
})
public class CustomerIndividualGeneralInfoCreate {

    protected String firstname;
    protected String middlename;
    protected String thirdname;
    protected String familyStatusCode;
    protected String marriageSettlementCode;
    protected String holderLegalCapacity;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDateOfLegalCapacity;
    protected String realEstateSituationCode;

    /**
     * Obtient la valeur de la propriété firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Définit la valeur de la propriété firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Obtient la valeur de la propriété middlename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Définit la valeur de la propriété middlename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Obtient la valeur de la propriété thirdname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdname() {
        return thirdname;
    }

    /**
     * Définit la valeur de la propriété thirdname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdname(String value) {
        this.thirdname = value;
    }

    /**
     * Obtient la valeur de la propriété familyStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyStatusCode() {
        return familyStatusCode;
    }

    /**
     * Définit la valeur de la propriété familyStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyStatusCode(String value) {
        this.familyStatusCode = value;
    }

    /**
     * Obtient la valeur de la propriété marriageSettlementCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageSettlementCode() {
        return marriageSettlementCode;
    }

    /**
     * Définit la valeur de la propriété marriageSettlementCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageSettlementCode(String value) {
        this.marriageSettlementCode = value;
    }

    /**
     * Obtient la valeur de la propriété holderLegalCapacity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderLegalCapacity() {
        return holderLegalCapacity;
    }

    /**
     * Définit la valeur de la propriété holderLegalCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderLegalCapacity(String value) {
        this.holderLegalCapacity = value;
    }

    /**
     * Obtient la valeur de la propriété applicationDateOfLegalCapacity.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDateOfLegalCapacity() {
        return applicationDateOfLegalCapacity;
    }

    /**
     * Définit la valeur de la propriété applicationDateOfLegalCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDateOfLegalCapacity(XMLGregorianCalendar value) {
        this.applicationDateOfLegalCapacity = value;
    }

    /**
     * Obtient la valeur de la propriété realEstateSituationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealEstateSituationCode() {
        return realEstateSituationCode;
    }

    /**
     * Définit la valeur de la propriété realEstateSituationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealEstateSituationCode(String value) {
        this.realEstateSituationCode = value;
    }

}
