package com.capdev.service.payload;

import java.util.Map;

public class ServiceRequest {

	private ServiceRequestHeader header;
	private Map<String, Object> body;
	
	public ServiceRequestHeader getHeader() {
		return header;
	}
	public void setHeader(ServiceRequestHeader header) {
		this.header = header;
	}
	public Map<String, Object> getBody() {
		return body;
	}
	public void setBody(Map<String, Object> body) {
		this.body = body;
	}
	
	
	
}
