package com.example.theater.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity(name="regizor")
public class RegizorEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 4859093235035624158L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    private String id_regizor;

    @Column(nullable=false, length=50)
    private String nume;

    @Column(nullable=false, length=50)
    private String prenume;

    @Column(nullable=false)
    private String data_nastere;

    @OneToMany(mappedBy = "regizorDetails", cascade = CascadeType.ALL)
    private List<PiesaEntity> piese;

    public void setId(long id) {
        this.id = id;
    }

    public void setId_regizor(String id_regizor) {
        this.id_regizor = id_regizor;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setData_nastere(String data_nastere) {
        this.data_nastere = data_nastere;
    }

    public long getId() {
        return id;
    }

    public String getId_regizor() {
        return id_regizor;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getData_nastere() {
        return data_nastere;
    }

    public List<PiesaEntity> getPiese() {
        return piese;
    }

    public void setPiese(List<PiesaEntity> piese) {
        this.piese = piese;
    }
}
