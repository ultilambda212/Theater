package com.example.theater.shared.dto;

import java.io.Serializable;

public class ActorDto implements Serializable {
    private static final long serialVersionUID = 2688165629537759461L;
    private long id;
    private String id_actor;
    private String nume;
    private String prenume;
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
