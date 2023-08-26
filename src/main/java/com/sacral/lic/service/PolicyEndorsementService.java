.

package com.sacral.lic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.lic.entity.PolicyEntity;
import com.sacral.lic.entity.EndorsementEntity;
import com.sacral.lic.repository.PolicyRepository;
import com.sacral.lic.repository.EndorsementRepository;

@Service
public class PolicyEndorsementService {

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private EndorsementRepository endorsementRepository;

    public List<PolicyEntity> searchForPolicyNumber(String criteria) {
        return policyRepository.findByCriteria(criteria);
    }

    public List<EndorsementEntity> fetchPendingEndorsementRecordsForChecker() {
        return endorsementRepository.findByCheckerPending();
    }

    public void initiateEndorsementByMaker(EndorsementEntity entity) {
        endorsementRepository.save(entity);
    }

    public void approveEndorsementByChecker(Long endorsementId) {
        endorsementRepository.approve(endorsementId);
    }

    public void rejectEndorsementByChecker(Long endorsementId) {
        endorsementRepository.reject(endorsementId);
    }

    public void sendBackEndorsementToMaker(Long endorsementId) {
        endorsementRepository.sendBack(endorsementId);
    }
    
}