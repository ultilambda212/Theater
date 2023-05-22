package com.example.theater.shared.dto;

import java.io.Serializable;

public class ContDto implements Serializable {
    private static final long serialVersionUID = 130054255840160823L;
    private long id;
    private String id_cont;
    private String username;
    private String parola;
    private String encParola;
    private String email;

    public void setId(long id) {
        this.id = id;
    }

    public void setId_cont(String id_cont) {
        this.id_cont = id_cont;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setEncParola(String encParola) {
        this.encParola = encParola;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getId_cont() {
        return id_cont;
    }

    public String getUsername() {
        return username;
    }

    public String getParola() {
        return parola;
    }

    public String getEncParola() {
        return encParola;
    }

    public String getEmail() {
        return email;
    }

}
