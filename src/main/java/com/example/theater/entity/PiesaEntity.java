package com.example.theater.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity(name="piesa")
public class PiesaEntity implements Serializable {

    @Serial
    public static final long serialVersionUID = -2768867214188219475L;

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 50, nullable = false)
    private String id_piesa;

    @Column(length = 100, nullable = false)
    private String nume;

    @Column(length = 250, nullable = true)
    private String descriere;

    @Column(length = 20, nullable = false)
    private String data_publicare;

    @Column(length = 50, nullable = false)
    private String gen;

    @ManyToOne
    @JoinColumn(name="id_regizor")
    private RegizorEntity regizorDetails;

    @OneToOne
    @JoinColumn(name = "id_premiu")
    private PremiuEntity premiuDetails;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId_piesa() {
        return id_piesa;
    }

    public void setId_piesa(String id_piesa) {
        this.id_piesa = id_piesa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getData_publicare() {
        return data_publicare;
    }

    public void setData_publicare(String data_publicare) {
        this.data_publicare = data_publicare;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public RegizorEntity getRegizorDetails() {
        return regizorDetails;
    }

    public void setRegizorDetails(RegizorEntity regizorDetails) {
        this.regizorDetails = regizorDetails;
    }

    public PremiuEntity getPremiuDetails() {
        return premiuDetails;
    }

    public void setPremiuDetails(PremiuEntity premiuDetails) {
        this.premiuDetails = premiuDetails;
    }
}
