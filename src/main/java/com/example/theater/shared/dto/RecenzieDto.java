package com.example.theater.shared.dto;

import java.io.Serializable;

public class RecenzieDto implements Serializable {
    private static final long serialVersionUID = -4075350278514674941L;
    private long id;
    private String id_recenzie;
    private Float nota;
    private String comentariu;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId_recenzie() {
        return id_recenzie;
    }

    public void setId_recenzie(String id_recenzie) {
        this.id_recenzie = id_recenzie;
    }

    public String getComentariu() {
        return comentariu;
    }

    public void setComentariu(String comentariu) {
        this.comentariu = comentariu;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }
}
