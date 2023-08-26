package com.sacral.lic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.lic.repository.PolicyNumberSearchRepository;
import com.sacral.lic.model.PolicyMasters;

@Service
public class PolicyNumberSearchService {

    @Autowired
    private PolicyNumberSearchRepository policyNumberSearchRepository;

    public List<PolicyMasters> searchByCriteria(String criteria) {
        return policyNumberSearchRepository.findByCriteria(criteria);
    }

}