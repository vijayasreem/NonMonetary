package com.sacral.lic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sacral.lic.model.PolicyDetails;
import com.sacral.lic.repository.PolicyDetailsRepository;

@Service
public class PolicyDetailsService {

    @Autowired
    PolicyDetailsRepository policyDetailsRepository;

    public List<PolicyDetails> findBySchemeTypeIgnoreCaseOrMphNameIgnoreCaseOrMphCodeIgnoreCaseOrPolicyStatusIgnoreCase(String schemeType, String mphName, String mphCode, String policyStatus, Pageable pageable) {
        return policyDetailsRepository.findBySchemeTypeIgnoreCaseOrMphNameIgnoreCaseOrMphCodeIgnoreCaseOrPolicyStatusIgnoreCase(schemeType, mphName, mphCode, policyStatus, pageable);
    }

    public void navigateToEndorsementDetailsScreen(Long policyNo) {
        //navigate to endorsement details screen
    }

}