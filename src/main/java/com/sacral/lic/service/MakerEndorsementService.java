package com.sacral.lic.service;

import org.springframework.http.ResponseEntity;
import com.sacral.lic.repository.MakerEndorsementRepository;
import com.sacral.lic.model.Endorsement;
import java.util.Date;

public class MakerEndorsementService {
    private MakerEndorsementRepository repository;

    public MakerEndorsementService(MakerEndorsementRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Object> createEndorsement(Endorsement endorsement) {
        // Validate payload and store it in temp tables
        repository.validatePayloadAndStore(endorsement);

        // Generate endorsement number
        int endorsementNumber = repository.generateEndorsementNumber();

        // Log the maker's details and timestamp
        endorsement.setMadeBy(endorsement.getMakingBy());
        endorsement.setMadeOn(new Date());
        repository.logMakerDetailsAndTimestamp(endorsement);

        return ResponseEntity.ok().body(endorsementNumber);
    }
}