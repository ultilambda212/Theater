package com.example.theater.shared.dto;

import java.io.Serializable;

public class PremiuDto implements Serializable {
    private static final long serialVersionUID = 3049274503125804376L;
    private long id;
    private String id_premiu;
    private String numePremiu;
    private String dataPremiu;
    private String descriere;
    private PiesaDto piesa;

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

    public PiesaDto getPiesa() {
        return piesa;
    }

    public void setPiesa(PiesaDto piesa) {
        this.piesa = piesa;
    }
}
