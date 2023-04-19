package com.sbep.SBEP.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Evenimente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="ID")
    private Long id_eveniment;

    //@Column(name="IdSala")
    //private Long idSala;

    @Column(name="Denumire")
    private String denumire;

    @Column(name="Nr. mese")
    private String nr_mese;

    @Column(name="Pret")
    private int pret;

    @Column(name="Status")
    private String status; //Programat/anulat

    public Evenimente() {
    }

    public Set<Sali> getSali() {
        return sali;
    }

    public Evenimente(Long id_eveniment, String denumire, String nr_mese, int pret, String status, List<Sali> sali) {
        this.id_eveniment = id_eveniment;
        this.denumire = denumire;
        this.nr_mese = nr_mese;
        this.pret = pret;
        this.status = status;
       // this.sali = sali;
    }

    public void setSali(Set<Sali> sali) {
        this.sali = sali;
    }

    public void setId_eveniment(Long id_eveniment) {
        this.id_eveniment = id_eveniment;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNr_mese(String nr_mese) {
        this.nr_mese = nr_mese;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /*public void setSali(List<Sali> sali) {
        this.sali = sali;
    }*/

    public Long getId_eveniment() {
        return id_eveniment;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getNr_mese() {
        return nr_mese;
    }

    public int getPret() {
        return pret;
    }

    public String getStatus() {
        return status;
    }

    /*public List<Sali> getSali() {
        return sali;
    }*/

    @ManyToMany
   // private List<Sali> sali = new ArrayList<>();
    private Set<Sali> sali = new HashSet<>();
}

