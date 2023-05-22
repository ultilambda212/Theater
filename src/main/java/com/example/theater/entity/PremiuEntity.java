package com.example.theater.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity(name = "premiu")
public class PremiuEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 5720431703510359529L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String id_premiu;

    @Column(nullable = false, length = 100)
    private String numePremiu;

    @Column(nullable = false, length = 15)
    private String dataPremiu;

    @Column(nullable = false)
    private String descriere;

    @OneToOne(mappedBy = "premiuDetails", cascade = CascadeType.ALL)
    private PiesaEntity piesa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumePremiu() {
        return numePremiu;
    }

    public void setNumePremiu(String numePremiu) {
        this.numePremiu = numePremiu;
    }

    public String getDataPremiu() {
        return dataPremiu;
    }

    public void setDataPremiu(String dataPremiu) {
        this.dataPremiu = dataPremiu;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getId_premiu() {
        return id_premiu;
    }

    public void setId_premiu(String id_premiu) {
        this.id_premiu = id_premiu;
    }

    public PiesaEntity getPiesa() {
        return piesa;
    }

    public void setPiesa(PiesaEntity piesa) {
        this.piesa = piesa;
    }
}
