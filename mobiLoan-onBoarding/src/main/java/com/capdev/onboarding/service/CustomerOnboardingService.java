package com.capdev.onboarding.service;

import com.capdev.onboarding.domain.CustomerOnboarding;
import com.capdev.onboarding.repository.CustomerOnboardingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link CustomerOnboarding}.
 */
@Service
@Transactional
public class CustomerOnboardingService {

    private final Logger log = LoggerFactory.getLogger(CustomerOnboardingService.class);

    private final CustomerOnboardingRepository customerOnboardingRepository;

    public CustomerOnboardingService(CustomerOnboardingRepository customerOnboardingRepository) {
        this.customerOnboardingRepository = customerOnboardingRepository;
    }

    /**
     * Save a customerOnboarding.
     *
     * @param customerOnboarding the entity to save.
     * @return the persisted entity.
     */
    public CustomerOnboarding save(CustomerOnboarding customerOnboarding) {
        log.debug("Request to save CustomerOnboarding : {}", customerOnboarding);
        return customerOnboardingRepository.save(customerOnboarding);
    }

    /**
     * Get all the customerOnboardings.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<CustomerOnboarding> findAll() {
        log.debug("Request to get all CustomerOnboardings");
        return customerOnboardingRepository.findAll();
    }


    /**
     * Get one customerOnboarding by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<CustomerOnboarding> findOne(Long id) {
        log.debug("Request to get CustomerOnboarding : {}", id);
        return customerOnboardingRepository.findById(id);
    }

    /**
     * Delete the customerOnboarding by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete CustomerOnboarding : {}", id);
        customerOnboardingRepository.deleteById(id);
    }
}
