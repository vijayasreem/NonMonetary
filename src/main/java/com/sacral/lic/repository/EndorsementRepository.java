package com.sacral.lic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EndorsementRepository extends JpaRepository<Endorsement, Integer> {

    @Query("SELECT e FROM Endorsement e WHERE e.status = :status")
    List<Endorsement> findByStatus(@Param("status") String status);
    
    @Query("UPDATE Endorsement e SET e.status = :status WHERE e.id = :endorsementId")
    void updateStatus(@Param("endorsementId") int endorsementId, @Param("status") String status);
    
    @Query("UPDATE Endorsement e SET e.comments = :comments WHERE e.id = :endorsementId")
    void updateComments(@Param("endorsementId") int endorsementId, @Param("comments") String comments);
    
    @Query("SELECT e FROM Endorsement e WHERE e.id = :endorsementId")
    Endorsement findById(@Param("endorsementId") int endorsementId);
}