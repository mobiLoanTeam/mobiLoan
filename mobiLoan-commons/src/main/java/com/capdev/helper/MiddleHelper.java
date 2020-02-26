package com.capdev.helper;

import java.util.Date;
import java.util.Map;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.capdev.service.payload.ApiRequest;
import com.capdev.service.payload.ApiResponse;

@Component
@Service
public class MiddleHelper {

//	 final String uri = "http://localhost:8060/api/post";
	@Value("${middleware.uri}")
	private String uri;
	@Value("${middleware.username}")
	private String username;
	@Value("${middleware.password}")
	private String password;
	

	private RestTemplate restTemplate;

	private ApiRequest request;

	public ApiResponse callMiddle(String serviceName, String protocol, Map obj) {

		restTemplate = new RestTemplate();
		request = new ApiRequest();
		request.setTimeStamp(new Date());
		request.setUserName(username);
		request.setTargetApp("MiddleWare");
		request.setPassword(password);
		request.setServiceName(serviceName);
		request.setProtocol(protocol);

		request.setBody(obj);

		return restTemplate.postForObject(uri, request, ApiResponse.class);

	}

}
