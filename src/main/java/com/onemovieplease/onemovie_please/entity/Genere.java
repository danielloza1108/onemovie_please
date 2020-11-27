package com.onemovieplease.onemovie_please.entity;

import javax.persistence.*;

@Entity
@Table(name = "genere")
public class Genere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String nameGen;
}
