package com.learnsync.sync.mysql.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "fahmy_try")
@Data
public class FahmyTry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;
}
