package com.learnsync.sync.oracle.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TM_JADWAL")
@IdClass(TMJadwalCompositKey.class)
@Data
public class TMJadwal {
    @Id
    @Column(name = "NO_MK")
    private String noMk;

    @Column(name = "TH_AKADEMIK")   
    private String thnAkademik;

    @Column(name = "SMT")
    private String semester;

    @Column(name = "KD_KURIKULUM")
    private String kdKurikulum;
}
