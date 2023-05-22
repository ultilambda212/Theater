package com.example.theater.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Piesa")
public class PiesaController {

    @GetMapping
    public String getPiesa() {
        return null;
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public String createPiesa() {
        return null;
    }

    @PutMapping
    public String updatePiesa() {
        return null;
    }

    @DeleteMapping
    public String deletePiesa() {
        return null;
    }
}
