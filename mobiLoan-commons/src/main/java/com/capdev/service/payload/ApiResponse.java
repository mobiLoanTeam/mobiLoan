package com.capdev.service.payload;

import java.util.Date;
import java.util.Map;

import com.capdev.constants.ApiResponseStatus;
import com.capdev.helper.MapHelper;





public class ApiResponse {

	private String requestID;
	private String serviceName;
	private String protocol;
	private Date timeStamp;
	private String status;
	private String message;

	private Map<String, Object> body;

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static ApiResponse ok(ApiRequest request, Object obj) {

		ApiResponse response = new ApiResponse();
		response.status = ApiResponseStatus.SUCCESS;
		response.timeStamp = new Date();
		response.requestID = request.getRequestID();
		response.setBody(MapHelper.objectToMap(obj));
		return response;

	}

	public static ApiResponse ko(ApiRequest request,String error) {
		// TODO Auto-generated method stub
		ApiResponse response = new ApiResponse();
		response.status = ApiResponseStatus.FAILLUR;
		response.message = error;
		response.timeStamp = new Date();
		response.requestID = request.getRequestID();
		return response;
	}
}
