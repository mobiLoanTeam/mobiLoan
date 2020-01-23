package com.capdev.onboarding.web.rest;

import com.capdev.onboarding.OnBoardingApp;
import com.capdev.onboarding.domain.CustomerOnboarding;
import com.capdev.onboarding.repository.CustomerOnboardingRepository;
import com.capdev.onboarding.service.CustomerOnboardingService;
import com.capdev.onboarding.web.rest.errors.ExceptionTranslator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import static com.capdev.onboarding.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link CustomerOnboardingResource} REST controller.
 */
@SpringBootTest(classes = OnBoardingApp.class)
public class CustomerOnboardingResourceIT {

    private static final String DEFAULT_CLIENT_USER_NAME = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_USER_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_PASSWORD = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_PASSWORD = "BBBBBBBBBB";

    private static final String DEFAULT_MM_SUBSCRIBER_ID = "AAAAAAAAAA";
    private static final String UPDATED_MM_SUBSCRIBER_ID = "BBBBBBBBBB";

    private static final String DEFAULT_SERVICE_NAME = "AAAAAAAAAA";
    private static final String UPDATED_SERVICE_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_RECEIPT_NO = "AAAAAAAAAA";
    private static final String UPDATED_RECEIPT_NO = "BBBBBBBBBB";

    private static final String DEFAULT_FIRST_NAME = "AAAAAAAAAA";
    private static final String UPDATED_FIRST_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_MIDDLE_NAME = "AAAAAAAAAA";
    private static final String UPDATED_MIDDLE_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_LAST_NAME = "AAAAAAAAAA";
    private static final String UPDATED_LAST_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_REQUEST_REF_ID = "AAAAAAAAAA";
    private static final String UPDATED_REQUEST_REF_ID = "BBBBBBBBBB";

    private static final String DEFAULT_MOBILE_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_MOBILE_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_TIME_STAMP = "AAAAAAAAAA";
    private static final String UPDATED_TIME_STAMP = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_OF_BIRTH = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_OF_BIRTH = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_ID_TYPE = "AAAAAAAAAA";
    private static final String UPDATED_ID_TYPE = "BBBBBBBBBB";

    private static final Integer DEFAULT_ID_NUMBER = 1;
    private static final Integer UPDATED_ID_NUMBER = 2;

    private static final LocalDate DEFAULT_EFFECITVE_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_EFFECITVE_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_EXPIRY_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_EXPIRY_DATE = LocalDate.now(ZoneId.systemDefault());

    @Autowired
    private CustomerOnboardingRepository customerOnboardingRepository;

    @Autowired
    private CustomerOnboardingService customerOnboardingService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    @Autowired
    private Validator validator;

    private MockMvc restCustomerOnboardingMockMvc;

    private CustomerOnboarding customerOnboarding;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final CustomerOnboardingResource customerOnboardingResource = new CustomerOnboardingResource(customerOnboardingService);
        this.restCustomerOnboardingMockMvc = MockMvcBuilders.standaloneSetup(customerOnboardingResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static CustomerOnboarding createEntity(EntityManager em) {
        CustomerOnboarding customerOnboarding = new CustomerOnboarding()
            .clientUserName(DEFAULT_CLIENT_USER_NAME)
            .clientPassword(DEFAULT_CLIENT_PASSWORD)
            .mmSubscriberID(DEFAULT_MM_SUBSCRIBER_ID)
            .serviceName(DEFAULT_SERVICE_NAME)
            .receiptNo(DEFAULT_RECEIPT_NO)
            .firstName(DEFAULT_FIRST_NAME)
            .middleName(DEFAULT_MIDDLE_NAME)
            .lastName(DEFAULT_LAST_NAME)
            .requestRefID(DEFAULT_REQUEST_REF_ID)
            .mobileNumber(DEFAULT_MOBILE_NUMBER)
            .timeStamp(DEFAULT_TIME_STAMP)
            .dateOfBirth(DEFAULT_DATE_OF_BIRTH)
            .idType(DEFAULT_ID_TYPE)
            .idNumber(DEFAULT_ID_NUMBER)
            .effecitveDate(DEFAULT_EFFECITVE_DATE)
            .expiryDate(DEFAULT_EXPIRY_DATE);
        return customerOnboarding;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static CustomerOnboarding createUpdatedEntity(EntityManager em) {
        CustomerOnboarding customerOnboarding = new CustomerOnboarding()
            .clientUserName(UPDATED_CLIENT_USER_NAME)
            .clientPassword(UPDATED_CLIENT_PASSWORD)
            .mmSubscriberID(UPDATED_MM_SUBSCRIBER_ID)
            .serviceName(UPDATED_SERVICE_NAME)
            .receiptNo(UPDATED_RECEIPT_NO)
            .firstName(UPDATED_FIRST_NAME)
            .middleName(UPDATED_MIDDLE_NAME)
            .lastName(UPDATED_LAST_NAME)
            .requestRefID(UPDATED_REQUEST_REF_ID)
            .mobileNumber(UPDATED_MOBILE_NUMBER)
            .timeStamp(UPDATED_TIME_STAMP)
            .dateOfBirth(UPDATED_DATE_OF_BIRTH)
            .idType(UPDATED_ID_TYPE)
            .idNumber(UPDATED_ID_NUMBER)
            .effecitveDate(UPDATED_EFFECITVE_DATE)
            .expiryDate(UPDATED_EXPIRY_DATE);
        return customerOnboarding;
    }

    @BeforeEach
    public void initTest() {
        customerOnboarding = createEntity(em);
    }

    @Test
    @Transactional
    public void createCustomerOnboarding() throws Exception {
        int databaseSizeBeforeCreate = customerOnboardingRepository.findAll().size();

        // Create the CustomerOnboarding
        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isCreated());

        // Validate the CustomerOnboarding in the database
        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeCreate + 1);
        CustomerOnboarding testCustomerOnboarding = customerOnboardingList.get(customerOnboardingList.size() - 1);
        assertThat(testCustomerOnboarding.getClientUserName()).isEqualTo(DEFAULT_CLIENT_USER_NAME);
        assertThat(testCustomerOnboarding.getClientPassword()).isEqualTo(DEFAULT_CLIENT_PASSWORD);
        assertThat(testCustomerOnboarding.getMmSubscriberID()).isEqualTo(DEFAULT_MM_SUBSCRIBER_ID);
        assertThat(testCustomerOnboarding.getServiceName()).isEqualTo(DEFAULT_SERVICE_NAME);
        assertThat(testCustomerOnboarding.getReceiptNo()).isEqualTo(DEFAULT_RECEIPT_NO);
        assertThat(testCustomerOnboarding.getFirstName()).isEqualTo(DEFAULT_FIRST_NAME);
        assertThat(testCustomerOnboarding.getMiddleName()).isEqualTo(DEFAULT_MIDDLE_NAME);
        assertThat(testCustomerOnboarding.getLastName()).isEqualTo(DEFAULT_LAST_NAME);
        assertThat(testCustomerOnboarding.getRequestRefID()).isEqualTo(DEFAULT_REQUEST_REF_ID);
        assertThat(testCustomerOnboarding.getMobileNumber()).isEqualTo(DEFAULT_MOBILE_NUMBER);
        assertThat(testCustomerOnboarding.getTimeStamp()).isEqualTo(DEFAULT_TIME_STAMP);
        assertThat(testCustomerOnboarding.getDateOfBirth()).isEqualTo(DEFAULT_DATE_OF_BIRTH);
        assertThat(testCustomerOnboarding.getIdType()).isEqualTo(DEFAULT_ID_TYPE);
        assertThat(testCustomerOnboarding.getIdNumber()).isEqualTo(DEFAULT_ID_NUMBER);
        assertThat(testCustomerOnboarding.getEffecitveDate()).isEqualTo(DEFAULT_EFFECITVE_DATE);
        assertThat(testCustomerOnboarding.getExpiryDate()).isEqualTo(DEFAULT_EXPIRY_DATE);
    }

    @Test
    @Transactional
    public void createCustomerOnboardingWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = customerOnboardingRepository.findAll().size();

        // Create the CustomerOnboarding with an existing ID
        customerOnboarding.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        // Validate the CustomerOnboarding in the database
        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void checkClientUserNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setClientUserName(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkClientPasswordIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setClientPassword(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkMmSubscriberIDIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setMmSubscriberID(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkServiceNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setServiceName(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkReceiptNoIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setReceiptNo(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkFirstNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setFirstName(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkLastNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setLastName(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkIdTypeIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setIdType(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkIdNumberIsRequired() throws Exception {
        int databaseSizeBeforeTest = customerOnboardingRepository.findAll().size();
        // set the field null
        customerOnboarding.setIdNumber(null);

        // Create the CustomerOnboarding, which fails.

        restCustomerOnboardingMockMvc.perform(post("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllCustomerOnboardings() throws Exception {
        // Initialize the database
        customerOnboardingRepository.saveAndFlush(customerOnboarding);

        // Get all the customerOnboardingList
        restCustomerOnboardingMockMvc.perform(get("/api/customer-onboardings?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(customerOnboarding.getId().intValue())))
            .andExpect(jsonPath("$.[*].clientUserName").value(hasItem(DEFAULT_CLIENT_USER_NAME)))
            .andExpect(jsonPath("$.[*].clientPassword").value(hasItem(DEFAULT_CLIENT_PASSWORD)))
            .andExpect(jsonPath("$.[*].mmSubscriberID").value(hasItem(DEFAULT_MM_SUBSCRIBER_ID)))
            .andExpect(jsonPath("$.[*].serviceName").value(hasItem(DEFAULT_SERVICE_NAME)))
            .andExpect(jsonPath("$.[*].receiptNo").value(hasItem(DEFAULT_RECEIPT_NO)))
            .andExpect(jsonPath("$.[*].firstName").value(hasItem(DEFAULT_FIRST_NAME)))
            .andExpect(jsonPath("$.[*].middleName").value(hasItem(DEFAULT_MIDDLE_NAME)))
            .andExpect(jsonPath("$.[*].lastName").value(hasItem(DEFAULT_LAST_NAME)))
            .andExpect(jsonPath("$.[*].requestRefID").value(hasItem(DEFAULT_REQUEST_REF_ID)))
            .andExpect(jsonPath("$.[*].mobileNumber").value(hasItem(DEFAULT_MOBILE_NUMBER)))
            .andExpect(jsonPath("$.[*].timeStamp").value(hasItem(DEFAULT_TIME_STAMP)))
            .andExpect(jsonPath("$.[*].dateOfBirth").value(hasItem(DEFAULT_DATE_OF_BIRTH.toString())))
            .andExpect(jsonPath("$.[*].idType").value(hasItem(DEFAULT_ID_TYPE)))
            .andExpect(jsonPath("$.[*].idNumber").value(hasItem(DEFAULT_ID_NUMBER)))
            .andExpect(jsonPath("$.[*].effecitveDate").value(hasItem(DEFAULT_EFFECITVE_DATE.toString())))
            .andExpect(jsonPath("$.[*].expiryDate").value(hasItem(DEFAULT_EXPIRY_DATE.toString())));
    }
    
    @Test
    @Transactional
    public void getCustomerOnboarding() throws Exception {
        // Initialize the database
        customerOnboardingRepository.saveAndFlush(customerOnboarding);

        // Get the customerOnboarding
        restCustomerOnboardingMockMvc.perform(get("/api/customer-onboardings/{id}", customerOnboarding.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(customerOnboarding.getId().intValue()))
            .andExpect(jsonPath("$.clientUserName").value(DEFAULT_CLIENT_USER_NAME))
            .andExpect(jsonPath("$.clientPassword").value(DEFAULT_CLIENT_PASSWORD))
            .andExpect(jsonPath("$.mmSubscriberID").value(DEFAULT_MM_SUBSCRIBER_ID))
            .andExpect(jsonPath("$.serviceName").value(DEFAULT_SERVICE_NAME))
            .andExpect(jsonPath("$.receiptNo").value(DEFAULT_RECEIPT_NO))
            .andExpect(jsonPath("$.firstName").value(DEFAULT_FIRST_NAME))
            .andExpect(jsonPath("$.middleName").value(DEFAULT_MIDDLE_NAME))
            .andExpect(jsonPath("$.lastName").value(DEFAULT_LAST_NAME))
            .andExpect(jsonPath("$.requestRefID").value(DEFAULT_REQUEST_REF_ID))
            .andExpect(jsonPath("$.mobileNumber").value(DEFAULT_MOBILE_NUMBER))
            .andExpect(jsonPath("$.timeStamp").value(DEFAULT_TIME_STAMP))
            .andExpect(jsonPath("$.dateOfBirth").value(DEFAULT_DATE_OF_BIRTH.toString()))
            .andExpect(jsonPath("$.idType").value(DEFAULT_ID_TYPE))
            .andExpect(jsonPath("$.idNumber").value(DEFAULT_ID_NUMBER))
            .andExpect(jsonPath("$.effecitveDate").value(DEFAULT_EFFECITVE_DATE.toString()))
            .andExpect(jsonPath("$.expiryDate").value(DEFAULT_EXPIRY_DATE.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingCustomerOnboarding() throws Exception {
        // Get the customerOnboarding
        restCustomerOnboardingMockMvc.perform(get("/api/customer-onboardings/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateCustomerOnboarding() throws Exception {
        // Initialize the database
        customerOnboardingService.save(customerOnboarding);

        int databaseSizeBeforeUpdate = customerOnboardingRepository.findAll().size();

        // Update the customerOnboarding
        CustomerOnboarding updatedCustomerOnboarding = customerOnboardingRepository.findById(customerOnboarding.getId()).get();
        // Disconnect from session so that the updates on updatedCustomerOnboarding are not directly saved in db
        em.detach(updatedCustomerOnboarding);
        updatedCustomerOnboarding
            .clientUserName(UPDATED_CLIENT_USER_NAME)
            .clientPassword(UPDATED_CLIENT_PASSWORD)
            .mmSubscriberID(UPDATED_MM_SUBSCRIBER_ID)
            .serviceName(UPDATED_SERVICE_NAME)
            .receiptNo(UPDATED_RECEIPT_NO)
            .firstName(UPDATED_FIRST_NAME)
            .middleName(UPDATED_MIDDLE_NAME)
            .lastName(UPDATED_LAST_NAME)
            .requestRefID(UPDATED_REQUEST_REF_ID)
            .mobileNumber(UPDATED_MOBILE_NUMBER)
            .timeStamp(UPDATED_TIME_STAMP)
            .dateOfBirth(UPDATED_DATE_OF_BIRTH)
            .idType(UPDATED_ID_TYPE)
            .idNumber(UPDATED_ID_NUMBER)
            .effecitveDate(UPDATED_EFFECITVE_DATE)
            .expiryDate(UPDATED_EXPIRY_DATE);

        restCustomerOnboardingMockMvc.perform(put("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedCustomerOnboarding)))
            .andExpect(status().isOk());

        // Validate the CustomerOnboarding in the database
        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeUpdate);
        CustomerOnboarding testCustomerOnboarding = customerOnboardingList.get(customerOnboardingList.size() - 1);
        assertThat(testCustomerOnboarding.getClientUserName()).isEqualTo(UPDATED_CLIENT_USER_NAME);
        assertThat(testCustomerOnboarding.getClientPassword()).isEqualTo(UPDATED_CLIENT_PASSWORD);
        assertThat(testCustomerOnboarding.getMmSubscriberID()).isEqualTo(UPDATED_MM_SUBSCRIBER_ID);
        assertThat(testCustomerOnboarding.getServiceName()).isEqualTo(UPDATED_SERVICE_NAME);
        assertThat(testCustomerOnboarding.getReceiptNo()).isEqualTo(UPDATED_RECEIPT_NO);
        assertThat(testCustomerOnboarding.getFirstName()).isEqualTo(UPDATED_FIRST_NAME);
        assertThat(testCustomerOnboarding.getMiddleName()).isEqualTo(UPDATED_MIDDLE_NAME);
        assertThat(testCustomerOnboarding.getLastName()).isEqualTo(UPDATED_LAST_NAME);
        assertThat(testCustomerOnboarding.getRequestRefID()).isEqualTo(UPDATED_REQUEST_REF_ID);
        assertThat(testCustomerOnboarding.getMobileNumber()).isEqualTo(UPDATED_MOBILE_NUMBER);
        assertThat(testCustomerOnboarding.getTimeStamp()).isEqualTo(UPDATED_TIME_STAMP);
        assertThat(testCustomerOnboarding.getDateOfBirth()).isEqualTo(UPDATED_DATE_OF_BIRTH);
        assertThat(testCustomerOnboarding.getIdType()).isEqualTo(UPDATED_ID_TYPE);
        assertThat(testCustomerOnboarding.getIdNumber()).isEqualTo(UPDATED_ID_NUMBER);
        assertThat(testCustomerOnboarding.getEffecitveDate()).isEqualTo(UPDATED_EFFECITVE_DATE);
        assertThat(testCustomerOnboarding.getExpiryDate()).isEqualTo(UPDATED_EXPIRY_DATE);
    }

    @Test
    @Transactional
    public void updateNonExistingCustomerOnboarding() throws Exception {
        int databaseSizeBeforeUpdate = customerOnboardingRepository.findAll().size();

        // Create the CustomerOnboarding

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restCustomerOnboardingMockMvc.perform(put("/api/customer-onboardings")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(customerOnboarding)))
            .andExpect(status().isBadRequest());

        // Validate the CustomerOnboarding in the database
        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteCustomerOnboarding() throws Exception {
        // Initialize the database
        customerOnboardingService.save(customerOnboarding);

        int databaseSizeBeforeDelete = customerOnboardingRepository.findAll().size();

        // Delete the customerOnboarding
        restCustomerOnboardingMockMvc.perform(delete("/api/customer-onboardings/{id}", customerOnboarding.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<CustomerOnboarding> customerOnboardingList = customerOnboardingRepository.findAll();
        assertThat(customerOnboardingList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
