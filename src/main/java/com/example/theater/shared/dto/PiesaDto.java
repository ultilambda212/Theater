package com.example.theater.shared.dto;

public class PiesaDto {
    private long id;
    private String id_piesa;
    private String nume;
    private String descriere;
    private String data_publicare;
    private String gen;
    private RegizorDto regizorDetails;

    public void setId(long id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setData_publicare(String data_publicare) {
        this.data_publicare = data_publicare;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getData_publicare() {
        return data_publicare;
    }

    public String getGen() {
        return gen;
    }

    public String getId_piesa() {
        return id_piesa;
    }

    public void setId_piesa(String id_piesa) {
        this.id_piesa = id_piesa;
    }

    public RegizorDto getRegizorDetails() {
        return regizorDetails;
    }

    public void setRegizorDetails(RegizorDto regizorDetails) {
        this.regizorDetails = regizorDetails;
    }
}
