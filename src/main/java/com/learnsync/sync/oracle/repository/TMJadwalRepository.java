package com.learnsync.sync.oracle.repository;

import com.learnsync.sync.oracle.model.TMJadwal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMJadwalRepository extends JpaRepository<TMJadwal, String> {
    List<TMJadwal> findByNoMK(String noMK);
}
