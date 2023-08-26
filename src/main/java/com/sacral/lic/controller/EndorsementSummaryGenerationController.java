package com.sacral.lic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.model.EndorsementSummaryGeneration;
import com.sacral.lic.service.EndorsementSummaryGenerationService;

@RestController
public class EndorsementSummaryGenerationController {

	@Autowired
	EndorsementSummaryGenerationService endorsementSummaryGenerationService;

	@PostMapping("/generateEndorsementSummary")
	public List<EndorsementSummaryGeneration> generateEndorsementSummary(@RequestBody EndorsementSummaryGeneration endorsementSummaryGeneration) {
		String policyNo = endorsementSummaryGeneration.getPolicyNo();
		String schemeType = endorsementSummaryGeneration.getSchemeType();
		String mphName = endorsementSummaryGeneration.getMphName();
		String mphCode = endorsementSummaryGeneration.getMphCode();
		String policyStatus = endorsementSummaryGeneration.getPolicyStatus();

		return endorsementSummaryGenerationService.generateEndorsementSummary(policyNo, schemeType, mphName, mphCode, policyStatus);
	}
	
	@PostMapping("/triggerEndorsementSummaryGeneration")
	public void triggerEndorsementSummaryGeneration() {
		endorsementSummaryGenerationService.triggerEndorsementSummaryGeneration();
	}
	
	@PostMapping("/sendEndorsementSummaryToMasterPolicyHolder")
	public void sendEndorsementSummaryToMasterPolicyHolder(String email) {
		endorsementSummaryGenerationService.sendEndorsementSummaryToMasterPolicyHolder(email);
	}
	
	@PostMapping("/generateDownloadablePDF")
	public void generateDownloadablePDF() {
		endorsementSummaryGenerationService.generateDownloadablePDF();
	}

}