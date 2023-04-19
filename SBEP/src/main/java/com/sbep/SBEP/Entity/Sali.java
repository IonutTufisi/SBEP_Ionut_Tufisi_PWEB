package com.sbep.SBEP.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Sali {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long id_sala;

    //@Column(name="IdEveniment")
    //private Long idEveniment;

    @Column(name="Descriere")
    private String descriere;

    @Lob
    @Column(name="Imagine1")
    private byte[] img1;

    @Lob
    @Column(name="Imagine2")
    private byte[] img2;

    @Lob
    @Column(name="Imagine3")
    private byte[] img3;

    @Column(name="Denumire")
    private String denumire;

    @Column(name="Lungime")
    private String lungime;

    @Column(name="Latime")
    private String latime;

    @Column(name="inaltime")
    private String inaltime;

    @Column(name="Nr. mese")
    private String nr_mese;

    @Column(name="ID Cladire")
    private Long id_cladire;

    public Long getId_sala() {
        return id_sala;
    }

    public Sali(Long id_sala, String descriere, byte[] img1, byte[] img2, byte[] img3, String denumire, String lungime, String latime, String inaltime, String nr_mese, Long id_cladire, List<Evenimente> evenimente) {
        this.id_sala = id_sala;
        this.descriere = descriere;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.denumire = denumire;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.nr_mese = nr_mese;
        this.id_cladire = id_cladire;
        //this.evenimente = evenimente;
    }

    public Sali() {
    }

    public void setId_sala(Long id_sala) {
        this.id_sala = id_sala;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setImg1(byte[] img1) {
        this.img1 = img1;
    }

    public void setImg2(byte[] img2) {
        this.img2 = img2;
    }

    public void setImg3(byte[] img3) {
        this.img3 = img3;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setLungime(String lungime) {
        this.lungime = lungime;
    }

    public void setLatime(String latime) {
        this.latime = latime;
    }

    public void setInaltime(String inaltime) {
        this.inaltime = inaltime;
    }

    public void setNr_mese(String nr_mese) {
        this.nr_mese = nr_mese;
    }

    public void setId_cladire(Long id_cladire) {
        this.id_cladire = id_cladire;
    }

    /*public void setEvenimente(List<Evenimente> evenimente) {
        this.evenimente = evenimente;
    }*/

    public String getDescriere() {
        return descriere;
    }

    public byte[] getImg1() {
        return img1;
    }

    public byte[] getImg2() {
        return img2;
    }

    public byte[] getImg3() {
        return img3;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getLungime() {
        return lungime;
    }

    public String getLatime() {
        return latime;
    }

    public String getInaltime() {
        return inaltime;
    }

    public String getNr_mese() {
        return nr_mese;
    }

    public Long getId_cladire() {
        return id_cladire;
    }

    /*public List<Evenimente> getEvenimente() {
        return evenimente;
    }*/

    public void setEvenimente(Set<Evenimente> evenimente) {
        this.evenimente = evenimente;
    }

    public Set<Evenimente> getEvenimente() {
        return evenimente;
    }

    @ManyToMany
    @JoinTable(
            name = "SaliEvenimente",
            joinColumns = @JoinColumn(name = "id_sala"),
            inverseJoinColumns = @JoinColumn(name = "id_eveniment")
    )
   // private List<Evenimente> evenimente = new ArrayList<>();
    private Set<Evenimente> evenimente = new HashSet<>();



}
