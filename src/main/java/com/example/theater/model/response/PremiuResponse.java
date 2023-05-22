package com.example.theater.model.response;

public class PremiuResponse {
    private String id_premiu;
    private String numePremiu;
    private String dataPremiu;
    private String descriere;
    private PiesaResponse piesa;

    public String getId_premiu() {
        return id_premiu;
    }

    public void setId_premiu(String id_premiu) {
        this.id_premiu = id_premiu;
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

    public PiesaResponse getPiesa() {
        return piesa;
    }

    public void setPiesa(PiesaResponse piesa) {
        this.piesa = piesa;
    }
}
