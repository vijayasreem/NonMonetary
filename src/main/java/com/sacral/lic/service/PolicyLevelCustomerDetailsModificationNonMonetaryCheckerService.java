Step 7: Maker can open up the Policy Details Menu and search the Policy Details Search grid with the reference number and can view the modification / corrections details.

package com.sacral.lic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.sacral.lic.model.PolicyLevelCustomerDetailsModificationNonMonetaryChecker;
import com.sacral.lic.repository.PolicyLevelCustomerDetailsModificationNonMonetaryCheckerRepository;

@Service
public class PolicyLevelCustomerDetailsModificationNonMonetaryCheckerService {

    @Autowired
    PolicyLevelCustomerDetailsModificationNonMonetaryCheckerRepository policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository;

    public List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByEndorsementProcessing(boolean endorsementProcessing) {
        return policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.findByEndorsementProcessing(endorsementProcessing);
    }

    public List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByRejectionReason(boolean rejectionReason) {
        return policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.findByRejectionReason(rejectionReason);
    }

    public List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByNotesForMaker(String notesForMaker) {
        return policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.findByNotesForMaker(notesForMaker);
    }

    public void approveEndorsementProcessing(long id) {
        PolicyLevelCustomerDetailsModificationNonMonetaryChecker policyLevelCustomerDetailsModificationNonMonetaryChecker = policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.findById(id).orElse(null);
        if (policyLevelCustomerDetailsModificationNonMonetaryChecker != null) {
            policyLevelCustomerDetailsModificationNonMonetaryChecker.setEndorsementProcessing(true);
            policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.save(policyLevelCustomerDetailsModificationNonMonetaryChecker);
        }
    }

    public void rejectEndorsementProcessing(long id, String rejectionReason) {
        PolicyLevelCustomerDetailsModificationNonMonetaryChecker policyLevelCustomerDetailsModificationNonMonetaryChecker = policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.findById(id).orElse(null);
        if (policyLevelCustomerDetailsModificationNonMonetaryChecker != null) {
            policyLevelCustomerDetailsModificationNonMonetaryChecker.setRejectionReason(rejectionReason);
            policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.save(policyLevelCustomerDetailsModificationNonMonetaryChecker);
        }
    }

    public void sendToMaker(long id, String notesForMaker) {
        PolicyLevelCustomerDetailsModificationNonMonetaryChecker policyLevelCustomerDetailsModificationNonMonetaryChecker = policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.findById(id).orElse(null);
        if (policyLevelCustomerDetailsModificationNonMonetaryChecker != null) {
            policyLevelCustomerDetailsModificationNonMonetaryChecker.setNotesForMaker(notesForMaker);
            policyLevelCustomerDetailsModificationNonMonetaryCheckerRepository.save(policyLevelCustomerDetailsModificationNonMonetaryChecker);
        }
    }

}