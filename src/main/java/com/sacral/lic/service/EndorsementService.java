package com.sacral.lic.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sacral.lic.model.Endorsement;
import com.sacral.lic.repository.EndorsementRepository;

@Service
@Transactional
public class EndorsementService {

    private final EndorsementRepository endorsementRepository;

    public EndorsementService(EndorsementRepository endorsementRepository) {
        this.endorsementRepository = endorsementRepository;
    }

    public List<Endorsement> getPendingEndorsementsForChecker() {
        return endorsementRepository.findByStatus("PENDING");
    }

    public void approveEndorsement(int endorsementId) {
        endorsementRepository.updateStatus(endorsementId, "APPROVED");
    }

    public void rejectEndorsement(int endorsementId) {
        endorsementRepository.updateStatus(endorsementId, "REJECTED");
    }

    public void sendBackEndorsementToMaker(int endorsementId, String comments) {
        endorsementRepository.updateStatus(endorsementId, "SEND_BACK_TO_MAKER");
        endorsementRepository.updateComments(endorsementId, comments);
    }

    public Endorsement getEndorsementById(int endorsementId) {
        return endorsementRepository.findById(endorsementId);
    }

}