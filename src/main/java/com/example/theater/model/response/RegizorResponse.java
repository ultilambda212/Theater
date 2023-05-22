package com.example.theater.model.response;

import com.example.theater.model.request.PiesaRequest;

import java.util.Date;
import java.util.List;

public class RegizorResponse {
    private String id_regizor;
    private String nume;
    private String prenume;
    private String data_nastere;
    private List<PiesaResponse> piese;

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

    public List<PiesaResponse> getPiese() {
        return piese;
    }

    public void setPiese(List<PiesaResponse> piese) {
        this.piese = piese;
    }
}
