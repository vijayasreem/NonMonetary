package com.sacral.lic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.lic.entity.PolicyEndorsementManagement;

/**
* Policy Endorsement Management - Non-Monetary Changes Repository
*/

@Repository
public interface PolicyEndorsementManagementNonMonetaryChangesRepository extends JpaRepository<PolicyEndorsementManagement, Long> {

    // Method to search the existing policies with Policy number
    PolicyEndorsementManagement findByPolicyNumber(String policyNumber);

    // Method to search the existing policies with other filter criteria
    PolicyEndorsementManagement findByPolicyStatusAndLineOfBusinessAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(String policyStatus, String lineOfBusiness, String productName, String productVariant, String unitOffice, String policyStartDate, String policyEndDate);

    // Method to save the modified policy details
    PolicyEndorsementManagement save(PolicyEndorsementManagement policyEndorsementManagement);

    // Method to generate the Endorsement Summary letter
    PolicyEndorsementManagement generateEndorsementSummaryLetter(PolicyEndorsementManagement policyEndorsementManagement);

    // Method to generate the Endorsement Number
    PolicyEndorsementManagement generateEndorsementNumber(PolicyEndorsementManagement policyEndorsementManagement);

}