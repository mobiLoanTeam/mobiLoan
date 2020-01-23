package com.capdev.onboarding.domain;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A CustomerOnboarding.
 */
@Entity
@Table(name = "customer_onboarding")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CustomerOnboarding implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "client_user_name", nullable = false)
    private String clientUserName;

    @NotNull
    @Column(name = "client_password", nullable = false)
    private String clientPassword;

    @NotNull
    @Column(name = "mm_subscriber_id", nullable = false)
    private String mmSubscriberID;

    @NotNull
    @Column(name = "service_name", nullable = false)
    private String serviceName;

    @NotNull
    @Column(name = "receipt_no", nullable = false)
    private String receiptNo;

    @NotNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @NotNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "request_ref_id")
    private String requestRefID;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "time_stamp")
    private String timeStamp;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @NotNull
    @Column(name = "id_type", nullable = false)
    private String idType;

    @NotNull
    @Column(name = "id_number", nullable = false)
    private Integer idNumber;

    @Column(name = "effecitve_date")
    private LocalDate effecitveDate;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientUserName() {
        return clientUserName;
    }

    public CustomerOnboarding clientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
        return this;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public CustomerOnboarding clientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
        return this;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public String getMmSubscriberID() {
        return mmSubscriberID;
    }

    public CustomerOnboarding mmSubscriberID(String mmSubscriberID) {
        this.mmSubscriberID = mmSubscriberID;
        return this;
    }

    public void setMmSubscriberID(String mmSubscriberID) {
        this.mmSubscriberID = mmSubscriberID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public CustomerOnboarding serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public CustomerOnboarding receiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerOnboarding firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public CustomerOnboarding middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerOnboarding lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRequestRefID() {
        return requestRefID;
    }

    public CustomerOnboarding requestRefID(String requestRefID) {
        this.requestRefID = requestRefID;
        return this;
    }

    public void setRequestRefID(String requestRefID) {
        this.requestRefID = requestRefID;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public CustomerOnboarding mobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public CustomerOnboarding timeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public CustomerOnboarding dateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdType() {
        return idType;
    }

    public CustomerOnboarding idType(String idType) {
        this.idType = idType;
        return this;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public CustomerOnboarding idNumber(Integer idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDate getEffecitveDate() {
        return effecitveDate;
    }

    public CustomerOnboarding effecitveDate(LocalDate effecitveDate) {
        this.effecitveDate = effecitveDate;
        return this;
    }

    public void setEffecitveDate(LocalDate effecitveDate) {
        this.effecitveDate = effecitveDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public CustomerOnboarding expiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomerOnboarding)) {
            return false;
        }
        return id != null && id.equals(((CustomerOnboarding) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "CustomerOnboarding{" +
            "id=" + getId() +
            ", clientUserName='" + getClientUserName() + "'" +
            ", clientPassword='" + getClientPassword() + "'" +
            ", mmSubscriberID='" + getMmSubscriberID() + "'" +
            ", serviceName='" + getServiceName() + "'" +
            ", receiptNo='" + getReceiptNo() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", middleName='" + getMiddleName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", requestRefID='" + getRequestRefID() + "'" +
            ", mobileNumber='" + getMobileNumber() + "'" +
            ", timeStamp='" + getTimeStamp() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", idType='" + getIdType() + "'" +
            ", idNumber=" + getIdNumber() +
            ", effecitveDate='" + getEffecitveDate() + "'" +
            ", expiryDate='" + getExpiryDate() + "'" +
            "}";
    }
}
