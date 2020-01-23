package com.capdev.services;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import com.soprabanking.amplitude.CreateCustomerBindingStub;
import com.soprabanking.amplitude.CreateCustomerLocator;
import com.soprabanking.amplitude.CreateCustomerRequest;
import com.soprabanking.amplitude.CreateCustomerRequestFlow;
import com.soprabanking.amplitude.CreateCustomerResponseFlow;
import com.soprabanking.amplitude.CustomerType;
import com.soprabanking.amplitude.RequestHeader;

public class CreateCustomer {
	
	
	
	public Object  call(CreateCustomerRequest createCustomerRequest) {
		CreateCustomerResponseFlow responseFlow = null;
		
		CreateCustomerRequestFlow requestFolow = new CreateCustomerRequestFlow();
		RequestHeader header = new RequestHeader();
		header.setRequestId("requestId");
		header.setServiceName("serviceName");
		header.setTimestamp(Calendar.getInstance(Locale.getDefault()));
		header.setUserCode("userCode");
		
		createCustomerRequest.setCustomerType(CustomerType.value1);
		createCustomerRequest.setTitleCode("titleCode");
	
		requestFolow.setRequestHeader(header);
		requestFolow.setCreateCustomerRequest(createCustomerRequest);
		
		
		try {
			CreateCustomerLocator service = new CreateCustomerLocator();
			responseFlow = service.getcreateCustomerPortType().createCustomer(requestFolow);
			return responseFlow.getCreateCustomerResponse();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return responseFlow.getCreateCustomerResponse();
			
		
	}
	
	

}
