package com.sbep.SBEP.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cladiri")
public class Cladiri {

    public String getDescriere() {
        return descriere;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="ID")
    private Long id_cladire;

    @Column(name="Descriere")
    private String descriere;

    public void setId_cladire(Long id_cladire) {
        this.id_cladire = id_cladire;
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

    public void setCamera(List<Camere> camera) {
        this.camera = camera;
    }

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

    @Column(name="Adresa")
    private String adresa; //Strada + nr

    @Column(name="Judet")
    private String judet;

    @OneToMany(mappedBy = "cladire")
    private List<Camere> camera = new ArrayList<>();

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public String getJudet() {
        return judet;
    }

    public String getLocalitate() {
        return localitate;
    }

    public Cladiri(Long id_cladire, String denumire, String adresa, String judet, String localitate, int nr_camere, int nr_etaje) {
        this.id_cladire = id_cladire;
        this.denumire = denumire;
        this.adresa = adresa;
        this.judet = judet;
        this.localitate = localitate;
        this.nr_camere = nr_camere;
        this.nr_etaje = nr_etaje;
    }

    public Cladiri() {
    }

    @Column(name="Localitate")
    private String localitate;

    @Column(name="Nr. Camere")
    private int nr_camere;

    @Column(name="Nr. Etaje")
    private int nr_etaje;

    public void setId(Long id_cladire) {
        this.id_cladire = id_cladire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setNr_camere(int nr_camere) {
        this.nr_camere = nr_camere;
    }

    public void setNr_etaje(int nr_etaje) {
        this.nr_etaje = nr_etaje;
    }

    public Long getId_cladire() {
        return id_cladire;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getNr_camere() {
        return nr_camere;
    }

    public int getNr_etaje() {
        return nr_etaje;
    }

}
