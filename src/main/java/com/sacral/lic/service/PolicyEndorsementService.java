package com.sacral.lic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.lic.entity.PolicyEndorsement;
import com.sacral.lic.repository.PolicyEndorsementRepository;

@Service
public class PolicyEndorsementService {

    @Autowired
    private PolicyEndorsementRepository policyEndorsementRepository;

    // Method to search the existing policies with policy no
    public PolicyEndorsement findByPolicyNo(String policyNo) {
        return policyEndorsementRepository.findByPolicyNo(policyNo);
    }
    
    // Method to search the existing policies with other filter criteria
    public List<PolicyEndorsement> findByPolicyStatusAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(String policyStatus, String productName, String productVariant, String unitOffice, String policyStartDate, String policyEndDate) {
        return policyEndorsementRepository.findByPolicyStatusAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(policyStatus, productName, productVariant, unitOffice, policyStartDate, policyEndDate);
    }
    
    // Method to save the customer/trust/policy level details
    public void savePolicyEndorsementDetails(PolicyEndorsement policyEndorsement) {
        policyEndorsementRepository.save(policyEndorsement);
    }
    
    // Method to initiate the policy endorsement
    public void initiatePolicyEndorsement(String policyNumber, String endorsementType, String serviceType, String endorsementSubType) {
        PolicyEndorsement policyEndorsement = policyEndorsementRepository.findByPolicyNo(policyNumber);
        if(policyEndorsement != null) {
            policyEndorsement.setEndorsementType(endorsementType);
            policyEndorsement.setServiceType(serviceType);
            policyEndorsement.setEndorsementSubType(endorsementSubType);
            policyEndorsementRepository.save(policyEndorsement);
        }
    }
    
    // Method to generate the endorsement summary letter
    public void generateEndorsementSummaryLetter(String policyNumber) {
        PolicyEndorsement policyEndorsement = policyEndorsementRepository.findByPolicyNo(policyNumber);
        if(policyEndorsement != null) {
            // Generate Endorsement Summary Letter
        }
    }
}