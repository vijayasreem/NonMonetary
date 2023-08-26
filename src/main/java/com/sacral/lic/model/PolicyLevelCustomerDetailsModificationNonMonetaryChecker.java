package com.sacral.lic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyLevelCustomerDetailsModificationNonMonetaryChecker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean endorsementProcessing;
    private boolean rejectionReason;
    private String notesForMaker;

    public PolicyLevelCustomerDetailsModificationNonMonetaryChecker() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEndorsementProcessing() {
        return endorsementProcessing;
    }

    public void setEndorsementProcessing(boolean endorsementProcessing) {
        this.endorsementProcessing = endorsementProcessing;
    }

    public boolean isRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(boolean rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public String getNotesForMaker() {
        return notesForMaker;
    }

    public void setNotesForMaker(String notesForMaker) {
        this.notesForMaker = notesForMaker;
    }
}