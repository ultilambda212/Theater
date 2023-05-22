package com.example.theater.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;

@Entity(name = "cont")
public class ContEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -3377602104966133676L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String id_cont;

    @Column(nullable = false, length = 50, unique = true)
    private String username;

    @Column(nullable = false)
    private String encParola;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId_cont() {
        return id_cont;
    }

    public void setId_cont(String id_cont) {
        this.id_cont = id_cont;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncParola() {
        return encParola;
    }

    public void setEncParola(String encParola) {
        this.encParola = encParola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
