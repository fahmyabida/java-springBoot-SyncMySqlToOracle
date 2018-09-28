package com.learnsync.sync.oracle.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FAHMY_TRY")
@Data
public class FahmyTry {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;
}
