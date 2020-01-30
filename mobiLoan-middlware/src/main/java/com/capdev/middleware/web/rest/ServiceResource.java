package com.capdev.middleware.web.rest;

import com.capdev.middleware.service.ServiceDispatcher;
import com.capdev.middleware.web.rest.errors.BadRequestAlertException;
import com.capdev.service.payload.ServiceRequest;
import com.capdev.service.payload.ServiceRequestHeader;
import com.capdev.service.payload.ServiceResponse;
import com.capdev.service.payload.ServiceResponseHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.net.URISyntaxException;
import java.util.Date;


/**
 * REST controller for managing {@link com.capdev.middleware.domain.Service}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class ServiceResource {

	private final Logger log = LoggerFactory.getLogger(ServiceResource.class);

	private static final String ENTITY_NAME = "middlewareService";

	@Value("${jhipster.clientApp.name}")
	private String applicationName;

	@Autowired
	ServiceDispatcher serviceDispatcher;
	/**
	 * {@code POST  /services} : Create a new service.
	 *
	 * @param service the service to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new service, or with status {@code 400 (Bad Request)} if the
	 *         service has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/post")
	public ServiceResponse post(@RequestBody ServiceRequest request) {
		
		return serviceDispatcher.call(request);
		
		
//		ServiceResponseHeader responseHeader = new ServiceResponseHeader();
//		if (request.getHeader() == null) {
//			throw new BadRequestAlertException("Request Header mandatory", ENTITY_NAME, "");
//		}
//		
//		try {
//			
//			log.debug("REST request to call Service : {}", request);
//			ServiceRequestHeader header = request.getHeader();
//			responseHeader.setCode(new Long(200));
//			responseHeader.setMessage("oK");
//			responseHeader.setTimeStamp(new Date());
//			
//		} catch (Exception ex) {			
//			responseHeader.setCode(new Long("204"));
//			responseHeader.setMessage(ex.getMessage());
//		}
//		response.setHeader(responseHeader);
//		return response;

	}
}
