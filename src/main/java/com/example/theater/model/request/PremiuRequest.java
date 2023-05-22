package com.example.theater.model.request;

public class PremiuRequest {
    private String numePremiu;
    private String dataPremiu;
    private String descriere;
    private PiesaRequest piesa;

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

    public PiesaRequest getPiesa() {
        return piesa;
    }

    public void setPiesa(PiesaRequest piesa) {
        this.piesa = piesa;
    }
}
