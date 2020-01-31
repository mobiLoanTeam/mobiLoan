package com.capdev.onboarding.domain;

public class CustomerOnboardingResponse {

	private String receiptNo;
	private String requestRefID;
	private String status;
	private String statusCode;
	private String statusDesc;

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getRequestRefID() {
		return requestRefID;
	}

	public void setRequestRefID(String requestRefID) {
		this.requestRefID = requestRefID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
