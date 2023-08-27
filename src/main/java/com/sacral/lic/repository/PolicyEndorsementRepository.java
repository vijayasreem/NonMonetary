package com.sacral.lic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.lic.entity.PolicyEndorsement;

@Repository
public interface PolicyEndorsementRepository extends JpaRepository<PolicyEndorsement, Long> {
    
    // Method to search the existing policies with policy no
    PolicyEndorsement findByPolicyNo(String policyNo);
    
    // Method to search the existing policies with other filter criteria
    PolicyEndorsement findByPolicyStatusAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(String policyStatus, String productName, String productVariant, String unitOffice, String policyStartDate, String policyEndDate);
    
    // Method to save the customer/trust/policy level details
    PolicyEndorsement save(PolicyEndorsement policyEndorsement);
}