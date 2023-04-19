package com.sbep.SBEP.DTOs;

import javax.persistence.Column;

public class BirouriDTO {
    public BirouriDTO() {
    }

    private Long id_birou;
    private String denumire;

    public void setId_birou(Long id_birou) {
        this.id_birou = id_birou;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public Long getId_birou() {
        return id_birou;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }

    public BirouriDTO(Long id_birou, String denumire, int pret) {
        this.id_birou = id_birou;
        this.denumire = denumire;
        this.pret = pret;
    }

    private int pret;
}
