package com.capdev.service;

import java.text.ParseException;

import javax.xml.datatype.DatatypeConfigurationException;

import com.capdev.service.payload.ServiceRequest;
import com.capdev.service.payload.ServiceResponse;


public interface IService {
	
	public ServiceResponse callRest(ServiceRequest req);
	public ServiceResponse callSoap(ServiceRequest obj);

}
