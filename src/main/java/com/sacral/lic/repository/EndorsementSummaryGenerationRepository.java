import org.springframework.data.jpa.repository.JpaRepository;

public interface EndorsementSummaryGenerationRepository extends JpaRepository<EndorsementSummaryGeneration, Long> {
	
	// Method to generate the endorsement summary
	public List<EndorsementSummaryGeneration> generateEndorsementSummary(String policyNo, String schemeType, String mphName, String mphCode, String policyStatus);
	
	// Method to trigger the generation of the endorsement summary
	public void triggerEndorsementSummaryGeneration();
	
	// Method to send the endorsement summary to the Master Policy Holder
	public void sendEndorsementSummaryToMasterPolicyHolder(String email);
	
	// Method to generate a downloadable PDF
	public void generateDownloadablePDF();
}