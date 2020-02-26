package com.capdev.service.payload;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class ApiRequest {

	private String requestID;
	private String userName;
	private String password;
	private String serviceName;
	private String originalApp;
	private String targetApp;
	private String protocol;
	private Date timeStamp;
	private Map<String, Object> body;
	
	
	public String getRequestID() {
		return requestID;
	}



	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getServiceName() {
		return serviceName;
	}



	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}



	public String getOriginalApp() {
		return originalApp;
	}



	public void setOriginalApp(String originalApp) {
		this.originalApp = originalApp;
	}



	public String getTargetApp() {
		return targetApp;
	}



	public void setTargetApp(String targetApp) {
		this.targetApp = targetApp;
	}



	public String getProtocol() {
		return protocol;
	}



	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}



	public Date getTimeStamp() {
		return timeStamp;
	}



	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}



	public  ApiRequest() {
		this.requestID = UUID.randomUUID().toString();
		this.timeStamp = new Date();
	}
	
 

	public Map<String, Object> getBody() {
		return body;
	}
	
	public void setBody(Map<String, Object> body) {
		this.body = body;
	}
	
}
