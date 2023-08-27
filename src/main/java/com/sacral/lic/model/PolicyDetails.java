@Entity
@Table(name = "policy_details")
public class PolicyDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "scheme_type")
  private String schemeType;

  @Column(name = "mph_name")
  private String mphName;

  @Column(name = "mph_code")
  private String mphCode;

  @Column(name = "policy_status")
  private String policyStatus;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSchemeType() {
    return schemeType;
  }

  public void setSchemeType(String schemeType) {
    this.schemeType = schemeType;
  }

  public String getMphName() {
    return mphName;
  }

  public void setMphName(String mphName) {
    this.mphName = mphName;
  }

  public String getMphCode() {
    return mphCode;
  }

  public void setMphCode(String mphCode) {
    this.mphCode = mphCode;
  }

  public String getPolicyStatus() {
    return policyStatus;
  }

  public void setPolicyStatus(String policyStatus) {
    this.policyStatus = policyStatus;
  }

}