package com.sacral.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sacral.lic.entity.PolicyEndorsement;
import com.sacral.lic.service.PolicyEndorsementService;

@Controller
@RequestMapping("/policyEndorsement")
public class PolicyEndorsementController {

    @Autowired
    private PolicyEndorsementService policyEndorsementService;
    
    // Method to search the existing policies with policy no
    @GetMapping("/findByPolicyNo")
    @ResponseBody
    public PolicyEndorsement findByPolicyNo(@RequestParam(value="policyNo") String policyNo) {
        return policyEndorsementService.findByPolicyNo(policyNo);
    }
    
    // Method to search the existing policies with other filter criteria
    @GetMapping("/findByPolicyStatusAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate")
    @ResponseBody
    public List<PolicyEndorsement> findByPolicyStatusAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(
            @RequestParam(value="policyStatus") String policyStatus,
            @RequestParam(value="productName") String productName,
            @RequestParam(value="productVariant") String productVariant,
            @RequestParam(value="unitOffice") String unitOffice,
            @RequestParam(value="policyStartDate") String policyStartDate,
            @RequestParam(value="policyEndDate") String policyEndDate) {
        return policyEndorsementService.findByPolicyStatusAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(policyStatus, productName, productVariant, unitOffice, policyStartDate, policyEndDate);
    }
    
    // Method to save the customer/trust/policy level details
    @PostMapping("/savePolicyEndorsementDetails")
    @ResponseBody
    public void savePolicyEndorsementDetails(@RequestBody PolicyEndorsement policyEndorsement) {
        policyEndorsementService.savePolicyEndorsementDetails(policyEndorsement);
    }
    
    // Method to initiate the policy endorsement
    @PostMapping("/initiatePolicyEndorsement")
    @ResponseBody
    public void initiatePolicyEndorsement(
            @RequestParam(value="policyNumber") String policyNumber,
            @RequestParam(value="endorsementType") String endorsementType,
            @RequestParam(value="serviceType") String serviceType,
            @RequestParam(value="endorsementSubType") String endorsementSubType) {
        policyEndorsementService.initiatePolicyEndorsement(policyNumber, endorsementType, serviceType, endorsementSubType);
    }
    
    // Method to generate the endorsement summary letter
    @GetMapping("/generateEndorsementSummaryLetter")
    @ResponseBody
    public void generateEndorsementSummaryLetter(@RequestParam(value="policyNumber") String policyNumber) {
        policyEndorsementService.generateEndorsementSummaryLetter(policyNumber);
    }

}