package com.learnsync.sync.oracle.repository;

import com.learnsync.sync.oracle.model.TMJadwal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TMJadwalRepository extends JpaRepository<TMJadwal, String> {
}
