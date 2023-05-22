package com.example.theater.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serial;

@Entity(name = "actor")
public class ActorEntity {
    @Serial
    private static final long serialVersionUID = 2972288405685956898L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String id_actor;

    @Column(nullable = false, length = 50)
    private String nume;

    @Column(nullable = false, length = 100)
    private String prenume;

    @Column(nullable = false, length = 15)
    private String dataNastere;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId_actor() {
        return id_actor;
    }

    public void setId_actor(String id_actor) {
        this.id_actor = id_actor;
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

    public String getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }
}
