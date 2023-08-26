package com.sacral.lic.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyNumberSearchRepository extends JpaRepository<PolicyMasters, Long> {

    List<PolicyMasters> findByCriteria(String criteria);
}