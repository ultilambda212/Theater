package com.example.theater.model.request;

import java.util.Date;
import java.util.List;

public class RegizorRequest {
    private String nume;
    private String prenume;
    private String data_nastere;
    private List<PiesaRequest> piese;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getData_nastere() {
        return data_nastere;
    }

    public void setData_nastere(String data_nastere) {
        this.data_nastere = data_nastere;
    }

    public List<PiesaRequest> getPiese() {
        return piese;
    }

    public void setPiese(List<PiesaRequest> piese) {
        this.piese = piese;
    }
}
