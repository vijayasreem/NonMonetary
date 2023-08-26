package com.sacral.lic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.model.Endorsement;
import com.sacral.lic.service.MakerEndorsementService;

@RestController
public class MakerEndorsementController {

    private MakerEndorsementService makerEndorsementService;

    public MakerEndorsementController(MakerEndorsementService makerEndorsementService) {
        this.makerEndorsementService = makerEndorsementService;
    }

    @PostMapping("/api/endorsements/maker")
    public ResponseEntity<Object> createEndorsement(@RequestBody Endorsement endorsement) {
        // Invoke service layer to create endorsement
        return makerEndorsementService.createEndorsement(endorsement);
    }

}