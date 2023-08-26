package com.sacral.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.model.PolicyLevelCustomerDetailsModificationNonMonetaryChecker;
import com.sacral.lic.service.PolicyLevelCustomerDetailsModificationNonMonetaryCheckerService;

@RestController
@RequestMapping("/api/policyLevelCustomerDetailsModificationNonMonetaryChecker")
public class PolicyLevelCustomerDetailsModificationNonMonetaryCheckerController {

    @Autowired
    PolicyLevelCustomerDetailsModificationNonMonetaryCheckerService policyLevelCustomerDetailsModificationNonMonetaryCheckerService;

    @GetMapping("/endorsementProcessing/{endorsementProcessing}")
    public List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByEndorsementProcessing(@PathVariable boolean endorsementProcessing){
        return policyLevelCustomerDetailsModificationNonMonetaryCheckerService.findByEndorsementProcessing(endorsementProcessing);
    }

    @GetMapping("/rejectionReason/{rejectionReason}")
    public List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByRejectionReason(@PathVariable boolean rejectionReason){
        return policyLevelCustomerDetailsModificationNonMonetaryCheckerService.findByRejectionReason(rejectionReason);
    }

    @GetMapping("/notesForMaker/{notesForMaker}")
    public List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByNotesForMaker(@PathVariable String notesForMaker){
        return policyLevelCustomerDetailsModificationNonMonetaryCheckerService.findByNotesForMaker(notesForMaker);
    }

    @PostMapping("/approveEndorsementProcessing/{id}")
    public void approveEndorsementProcessing(@PathVariable long id){
        policyLevelCustomerDetailsModificationNonMonetaryCheckerService.approveEndorsementProcessing(id);
    }

    @PutMapping("/rejectEndorsementProcessing/{id}")
    public void rejectEndorsementProcessing(@PathVariable long id, @RequestBody String rejectionReason){
        policyLevelCustomerDetailsModificationNonMonetaryCheckerService.rejectEndorsementProcessing(id, rejectionReason);
    }

    @PutMapping("/sendToMaker/{id}")
    public void sendToMaker(@PathVariable long id, @RequestBody String notesForMaker){
        policyLevelCustomerDetailsModificationNonMonetaryCheckerService.sendToMaker(id, notesForMaker);
    }

}