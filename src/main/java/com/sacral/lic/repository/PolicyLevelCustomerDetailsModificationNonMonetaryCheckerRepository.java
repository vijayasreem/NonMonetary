@Repository
public interface PolicyLevelCustomerDetailsModificationNonMonetaryCheckerRepository extends JpaRepository<PolicyLevelCustomerDetailsModificationNonMonetaryChecker, Long>{

    @Query("SELECT p FROM PolicyLevelCustomerDetailsModificationNonMonetaryChecker p WHERE p.endorsementProcessing = :endorsementProcessing")
    List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByEndorsementProcessing(@Param("endorsementProcessing") boolean endorsementProcessing);

    @Query("SELECT p FROM PolicyLevelCustomerDetailsModificationNonMonetaryChecker p WHERE p.rejectionReason = :rejectionReason")
    List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByRejectionReason(@Param("rejectionReason") boolean rejectionReason);

    @Query("SELECT p FROM PolicyLevelCustomerDetailsModificationNonMonetaryChecker p WHERE p.notesForMaker = :notesForMaker")
    List<PolicyLevelCustomerDetailsModificationNonMonetaryChecker> findByNotesForMaker(@Param("notesForMaker") String notesForMaker);

}