@Repository
public interface MakerEndorsementRepository {

    // API endpoint to create an endorsement transaction
    ResponseEntity<Object> createEndorsement(Endorsement endorsement);

    // Validate the payload and store the endorsement transaction in Temp Tables
    void validatePayloadAndStore(Endorsement endorsement);

    // Generate an endorsement number
    int generateEndorsementNumber();

    // Log the maker's details and timestamp for history tracking
    void logMakerDetailsAndTimestamp(Endorsement endorsement);

}