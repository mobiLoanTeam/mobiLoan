package com.capdev.main;

import com.capdev.services.CreateCustomer;
import com.soprabanking.amplitude.CreateCustomerRequest;

public class Main {
	
	
	public static void main (String ... args) {
		
		
		CreateCustomer createCustomer = new CreateCustomer();
		CreateCustomerRequest request = new CreateCustomerRequest();
		
		createCustomer.call(request);
		
	}

}
