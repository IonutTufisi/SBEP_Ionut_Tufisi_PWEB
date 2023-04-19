package com.sbep.SBEP.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name="Birouri")
public class Birouri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id_birou;

    @Column(name="Denumire")
    private String denumire;

    @Column(name="Pret")
    private int pret;

    public Birouri() {
    }
    public Long getId_birou() {
        return id_birou;
    }
    public void setId_birou(Long id) {
        this.id_birou = id;
    }
    public String getDenumire() {
        return denumire;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }
    public void setPret(int pret) {
        this.pret = pret;
    }

    public Birouri(Long id_birou, String denumire, int pret) {
        super();
        this.id_birou = id_birou;
        this.denumire = denumire;
        this.pret = pret;
    }

}

