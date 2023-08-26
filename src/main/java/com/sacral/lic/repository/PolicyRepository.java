.

package com.sacral.lic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.lic.entity.PolicyEntity;
import com.sacral.lic.entity.EndorsementEntity;

@Repository
public interface PolicyRepository extends JpaRepository<PolicyEntity, Long> {
    List<PolicyEntity> findByCriteria(String criteria);
}

@Repository
public interface EndorsementRepository extends JpaRepository<EndorsementEntity, Long> {
    List<EndorsementEntity> findByMaker();
    List<EndorsementEntity> findByCheckerPending();
    void save(EndorsementEntity entity);
    void approve(Long endorsementId);
    void reject(Long endorsementId);
    void sendBack(Long endorsementId);
}