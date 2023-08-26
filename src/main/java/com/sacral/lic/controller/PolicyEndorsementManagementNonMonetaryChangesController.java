package com.sacral.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.entity.PolicyEndorsementManagement;
import com.sacral.lic.service.PolicyEndorsementManagementNonMonetaryChangesService;

@RestController
public class PolicyEndorsementManagementNonMonetaryChangesController {

    @Autowired
    private PolicyEndorsementManagementNonMonetaryChangesService policyEndorsementManagementNonMonetaryChangesService;

    // Method to search the existing policies with Policy number
    @GetMapping("/policy/findByPolicyNumber")
    public PolicyEndorsementManagement findByPolicyNumber(@RequestParam(value = "policyNumber") String policyNumber) {
        return policyEndorsementManagementNonMonetaryChangesService.findByPolicyNumber(policyNumber);
    }

    // Method to search the existing policies with other filter criteria
    @GetMapping("/policy/findByPolicyStatusAndLineOfBusinessAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate")
    public PolicyEndorsementManagement findByPolicyStatusAndLineOfBusinessAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(@RequestParam(value = "policyStatus") String policyStatus, @RequestParam(value = "lineOfBusiness") String lineOfBusiness, @RequestParam(value = "productName") String productName, @RequestParam(value = "productVariant") String productVariant, @RequestParam(value = "unitOffice") String unitOffice, @RequestParam(value = "policyStartDate") String policyStartDate, @RequestParam(value = "policyEndDate") String policyEndDate) {
        return policyEndorsementManagementNonMonetaryChangesService.findByPolicyStatusAndLineOfBusinessAndProductNameAndProductVariantAndUnitOfficeAndPolicyStartDateAndPolicyEndDate(policyStatus, lineOfBusiness, productName, productVariant, unitOffice, policyStartDate, policyEndDate);
    }

    // Method to save the modified policy details
    @PutMapping("/policy/save")
    public PolicyEndorsementManagement save(@RequestBody PolicyEndorsementManagement policyEndorsementManagement) {
        return policyEndorsementManagementNonMonetaryChangesService.save(policyEndorsementManagement);
    }

    // Method to generate the Endorsement Summary letter
    @PostMapping("/policy/generateEndorsementSummaryLetter")
    public PolicyEndorsementManagement generateEndorsementSummaryLetter(@RequestBody PolicyEndorsementManagement policyEndorsementManagement) {
        return policyEndorsementManagementNonMonetaryChangesService.generateEndorsementSummaryLetter(policyEndorsementManagement);
    }

    // Method to generate the Endorsement Number
    @PostMapping("/policy/generateEndorsementNumber")
    public PolicyEndorsementManagement generateEndorsementNumber(@RequestBody PolicyEndorsementManagement policyEndorsementManagement) {
        return policyEndorsementManagementNonMonetaryChangesService.generateEndorsementNumber(policyEndorsementManagement);
    }

    // Method to initiate Endorsement process
    @PostMapping("/policy/initiateEndorsement")
    public PolicyEndorsementManagement initiateEndorsement(@RequestParam(value = "policyNumber") String policyNumber, @RequestParam(value = "policyStatus") String policyStatus, @RequestParam(value = "lineOfBusiness") String lineOfBusiness, @RequestParam(value = "productName") String productName, @RequestParam(value = "productVariant") String productVariant, @RequestParam(value = "unitOffice") String unitOffice, @RequestParam(value = "policyStartDate") String policyStartDate, @RequestParam(value = "policyEndDate") String policyEndDate) {
        return policyEndorsementManagementNonMonetaryChangesService.initiateEndorsement(policyNumber, policyStatus, lineOfBusiness, productName, productVariant