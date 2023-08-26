//Generated Spring Boot Entity/Model class
package com.sacral.lic.model;

import org.springframework.http.ResponseEntity;

public class Endorsement {

    private int endorsementNumber;
    private String makerDetails;
    private String timestamp;

    public int getEndorsementNumber() {
        return endorsementNumber;
    }

    public void setEndorsementNumber(int endorsementNumber) {
        this.endorsementNumber = endorsementNumber;
    }

    public String getMakerDetails() {
        return makerDetails;
    }

    public void setMakerDetails(String makerDetails) {
        this.makerDetails = makerDetails;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}