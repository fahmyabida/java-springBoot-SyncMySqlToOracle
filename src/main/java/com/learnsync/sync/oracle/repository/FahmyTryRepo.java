package com.learnsync.sync.oracle.repository;

import com.learnsync.sync.oracle.model.FahmyTry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FahmyTryRepo extends JpaRepository<FahmyTry, Integer> {
}
