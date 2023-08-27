@Repository
public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails, Long> {

  List<PolicyDetails> findBySchemeTypeIgnoreCaseOrMphNameIgnoreCaseOrMphCodeIgnoreCaseOrPolicyStatusIgnoreCase(String schemeType, String mphName, String mphCode, String policyStatus, Pageable pageable);

}