package com.example.theater.model.response;

public class PiesaResponse {
    private String id_piesa;
    private String nume;
    private String descriere;
    private String data_publicare;
    private String gen;

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
}
