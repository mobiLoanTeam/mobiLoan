package com.capdev.service;


import com.capdev.service.payload.ApiRequest;
import com.capdev.service.payload.ApiResponse;



public interface IService {
	
	public ApiResponse callRest(ApiRequest req);
	public ApiResponse callSoap(ApiRequest obj);

}
