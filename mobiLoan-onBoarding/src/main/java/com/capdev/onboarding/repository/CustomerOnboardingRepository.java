package com.capdev.onboarding.repository;

import com.capdev.onboarding.domain.CustomerOnboarding;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the CustomerOnboarding entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CustomerOnboardingRepository extends JpaRepository<CustomerOnboarding, Long> {

}
