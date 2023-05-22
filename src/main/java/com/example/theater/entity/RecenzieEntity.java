package com.example.theater.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;

@Entity(name = "recenzie")
public class RecenzieEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -1761105490380508123L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String id_recenzie;

    @Column(nullable = false)
    private Float nota;

    @Column(nullable = true)
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

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getComentariu() {
        return comentariu;
    }

    public void setComentariu(String comentariu) {
        this.comentariu = comentariu;
    }
}
