package com.example.theater.model.response;

public class RecenzieResponse {
    private String id_recenzie;
    private Float nota;
    private String comentariu;

    public String getId_recenzie() {
        return id_recenzie;
    }

    public void setId_recenzie(String id_recenzie) {
        this.id_recenzie = id_recenzie;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public String getComentariu() {
        return comentariu;
    }

    public void setComentariu(String comentariu) {
        this.comentariu = comentariu;
    }
}
