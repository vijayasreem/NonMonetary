package com.sacral.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.model.Endorsement;
import com.sacral.lic.service.EndorsementService;

@RestController
@RequestMapping("/api/endorsements/checker")
public class EndorsementController {

    @Autowired
    EndorsementService endorsementService;

    @GetMapping("/pending")
    public ResponseEntity<List<Endorsement>> getPendingEndorsementsForChecker() {
        List<Endorsement> list = endorsementService.getPendingEndorsementsForChecker();
        return new ResponseEntity<List<Endorsement>>(list, HttpStatus.OK);
    }

    @PostMapping("/approve/{endorsementId}")
    public HttpStatus approveEndorsement(@PathVariable int endorsementId) {
        endorsementService.approveEndorsement(endorsementId);
        return HttpStatus.OK;
    }

    @PostMapping("/reject/{endorsementId}")
    public HttpStatus rejectEndorsement(@PathVariable int endorsementId) {
        endorsementService.rejectEndorsement(endorsementId);
        return HttpStatus.OK;
    }

    @PutMapping("/sendback/{endorsementId}")
    public HttpStatus sendBackEndorsementToMaker(@PathVariable int endorsementId, @RequestBody String comments) {
        endorsementService.sendBackEndorsementToMaker(endorsementId, comments);
        return HttpStatus.OK;
    }

}