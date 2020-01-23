package com.capdev.onboarding.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.capdev.onboarding.web.rest.TestUtil;

public class CustomerOnboardingTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(CustomerOnboarding.class);
        CustomerOnboarding customerOnboarding1 = new CustomerOnboarding();
        customerOnboarding1.setId(1L);
        CustomerOnboarding customerOnboarding2 = new CustomerOnboarding();
        customerOnboarding2.setId(customerOnboarding1.getId());
        assertThat(customerOnboarding1).isEqualTo(customerOnboarding2);
        customerOnboarding2.setId(2L);
        assertThat(customerOnboarding1).isNotEqualTo(customerOnboarding2);
        customerOnboarding1.setId(null);
        assertThat(customerOnboarding1).isNotEqualTo(customerOnboarding2);
    }
}
