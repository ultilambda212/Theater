package com.example.theater.shared.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegizorDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 2081300998815777139L;
    private long id;
    private String id_regizor;
    private String nume;
    private String prenume;
    private String data_nastere;
    private List<PiesaDto> piese;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId_regizor() {
        return id_regizor;
    }

    public void setId_regizor(String id_regizor) {
        this.id_regizor = id_regizor;
    }

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

    public List<PiesaDto> getPiese() {
        return piese;
    }

    public void setPiese(List<PiesaDto> piese) {
        this.piese = piese;
    }
}
