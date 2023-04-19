package com.sbep.SBEP.Entity;

import javax.persistence.*;

@Entity
public class Camere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id_camera;

    @Column(name="Descriere")
    private String descriere;

    @Column(name="Imagine1")
    private byte[] img1;

    @Column(name="Imagine2")
    private byte[] img2;

    @Column(name="Imagine3")
    private byte[] img3;

    @ManyToOne
    @JoinColumn(name = "idCladire")
    private Cladiri cladire;

    public Camere(Long id_camera, Long id_birou, Long id_cladire, int lungime, int latime, int inaltime, int etaj, String statusBalcon) {
        this.id_camera = id_camera;
        this.id_birou = id_birou;
        this.id_cladire = id_cladire;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.etaj = etaj;
        this.statusBalcon = statusBalcon;
    }

    @Column(name="IDBirou")
    private Long id_birou;

    public void setId(Long id_birou) {
        this.id_birou = id_birou;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public void setStatusBalcon(String statusBalcon) {
        this.statusBalcon = statusBalcon;
    }

    public Long getId() {
        return id_birou;
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public int getEtaj() {
        return etaj;
    }

    public String getStatusBalcon() {
        return statusBalcon;
    }

    @Column(name="IDCladire")
    private Long id_cladire;

    @Column(name="Lungime")
    private int lungime;

    @Column(name="Latime")
    private int latime;

    public Camere() {
    }

    @Column(name="Inaltime")
    private int inaltime;

    public void setId_cladire(Long id_cladire) {
        id_cladire = id_cladire;
    }

    public Long getId_cladire() {
        return id_cladire;
    }

    public Long getId_camera() {
        return id_camera;
    }

    public void setId_camera(Long id_camera) {
        this.id_camera = id_camera;
    }

    public void setId_birou(Long id_birou) {
        this.id_birou = id_birou;
    }

    public Long getId_birou() {
        return id_birou;
    }

    @Column(name="Etaj")
    private int etaj;

    @Column(name="Balcon")
    private String statusBalcon; // da sau nu

}
