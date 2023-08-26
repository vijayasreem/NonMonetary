package com.sacral.lic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.lic.entity.PolicyEndorsementManagement;
import com.sacral.lic.repository.PolicyEndorsementManagementNonMonetaryChangesRepository;

@Service
public class PolicyEndorsementManagementNonMonetaryChangesService {

    @Autowired
    private PolicyEndorsementManagementNonMonetaryChangesRepository policyEndorsementManagementNonMonetaryChangesRepository;

    // Method to search the existing policies with Policy number
    public PolicyEndorsementManagement findByPolicyNumber(String policyNumber) {
        return policyEndorsementManagementNonMonetaryChangesRepository.findByPolicyNumber(policyNumber);
    }

    // Method to search the existing policies with other filter criteria
    public PolicyEndorsementManagement findByPolicyStatusAndLineOfBusinessAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(String policyStatus, String lineOfBusiness, String productName, String productVariant, String unitOffice, String policyStartDate, String policyEndDate) {
        return policyEndorsementManagementNonMonetaryChangesRepository.findByPolicyStatusAndLineOfBusinessAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(policyStatus, lineOfBusiness, productName, productVariant, unitOffice, policyStartDate, policyEndDate);
    }

    // Method to save the modified policy details
    public PolicyEndorsementManagement save(PolicyEndorsementManagement policyEndorsementManagement) {
        return policyEndorsementManagementNonMonetaryChangesRepository.save(policyEndorsementManagement);
    }

    // Method to generate the Endorsement Summary letter
    public PolicyEndorsementManagement generateEndorsementSummaryLetter(PolicyEndorsementManagement policyEndorsementManagement) {
        // Code to generate Endorsement Summary letter
        return policyEndorsementManagement;
    }

    // Method to generate the Endorsement Number
    public PolicyEndorsementManagement generateEndorsementNumber(PolicyEndorsementManagement policyEndorsementManagement) {
        // Code to generate Endorsement Number
        return policyEndorsementManagement;
    }

    // Method to initiate Endorsement process
    public PolicyEndorsementManagement initiateEndorsement(String policyNumber, String policyStatus, String lineOfBusiness, String productName, String productVariant, String unitOffice, String policyStartDate, String policyEndDate) {
        PolicyEndorsementManagement policyEndorsementManagement = null;
        if (policyNumber != null && !policyNumber.isEmpty()) {
            policyEndorsementManagement = findByPolicyNumber(policyNumber);
        } else {
            policyEndorsementManagement = findByPolicyStatusAndLineOfBusinessAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(policyStatus, lineOfBusiness, productName, productVariant, unitOffice, policyStartDate, policyEndDate);
        }
        if (policyEndorsementManagement != null) {
            // Initiate Endorsement process
            generateEndorsementNumber(policyEndorsementManagement);
            generateEndorsementSummaryLetter(policyEndorsementManagement);
            save(policyEndorsementManagement);
        }
        return policyEndorsementManagement;
    }

}