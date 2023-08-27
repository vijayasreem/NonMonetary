package com.sacral.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.model.PolicyDetails;
import com.sacral.lic.service.PolicyDetailsService;

@RestController
@RequestMapping("/policy-details")
public class PolicyDetailsController {

    @Autowired
    PolicyDetailsService policyDetailsService;

    @GetMapping
    public List<PolicyDetails> searchPolicyDetails(@RequestParam String schemeType, @RequestParam String mphName, @RequestParam String mphCode, @RequestParam String policyStatus, Pageable pageable) {
        return policyDetailsService.findBySchemeTypeIgnoreCaseOrMphNameIgnoreCaseOrMphCodeIgnoreCaseOrPolicyStatusIgnoreCase(schemeType, mphName, mphCode, policyStatus, pageable);
    }

    @GetMapping("/endorsement-details")
    public void navigateToEndorsementDetailsScreen(@RequestParam Long policyNo) {
        policyDetailsService.navigateToEndorsementDetailsScreen(policyNo);
    }

}