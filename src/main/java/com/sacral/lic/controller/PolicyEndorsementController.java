.

package com.sacral.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.entity.PolicyEntity;
import com.sacral.lic.entity.EndorsementEntity;
import com.sacral.lic.service.PolicyEndorsementService;

@RestController
public class PolicyEndorsementController {

    @Autowired
    private PolicyEndorsementService policyEndorsementService;

    @GetMapping("/api/policies/search")
    public List<PolicyEntity> searchForPolicyNumber(@RequestParam String criteria) {
        return policyEndorsementService.searchForPolicyNumber(criteria);
    }

    @GetMapping("/api/endorsements/checker/pending")
    public List<EndorsementEntity> fetchPendingEndorsementRecordsForChecker() {
        return policyEndorsementService.fetchPendingEndorsementRecordsForChecker();
    }

    @PostMapping("/api/endorsements/maker")
    public void initiateEndorsementByMaker(EndorsementEntity entity) {
        policyEndorsementService.initiateEndorsementByMaker(entity);
    }

    @PutMapping("/api/endorsements/checker/approve/{endorsementId}")
    public void approveEndorsementByChecker(@RequestParam Long endorsementId) {
        policyEndorsementService.approveEndorsementByChecker(endorsementId);
    }

    @PutMapping("/api/endorsements/checker/reject/{endorsementId}")
    public void rejectEndorsementByChecker(@RequestParam Long endorsementId) {
        policyEndorsementService.rejectEndorsementByChecker(endorsementId);
    }

    @PutMapping("/api/endorsements/checker/sendback/{endorsementId}")
    public void sendBackEndorsementToMaker(@RequestParam Long endorsementId) {
        policyEndorsementService.sendBackEndorsementToMaker(endorsementId);
    }

}