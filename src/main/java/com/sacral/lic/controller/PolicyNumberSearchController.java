package com.sacral.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.model.PolicyMasters;
import com.sacral.lic.service.PolicyNumberSearchService;

@RestController
public class PolicyNumberSearchController {

    @Autowired
    private PolicyNumberSearchService policyNumberSearchService;

    @GetMapping("/api/policies/search")
    public List<PolicyMasters> searchByCriteria(@RequestParam(name="criteria") String criteria) {
        return policyNumberSearchService.searchByCriteria(criteria);
    }

}