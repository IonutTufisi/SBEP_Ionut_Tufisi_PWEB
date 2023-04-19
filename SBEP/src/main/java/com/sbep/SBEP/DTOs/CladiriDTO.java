package com.sbep.SBEP.DTOs;

import javax.persistence.Column;
import javax.persistence.Lob;

public class CladiriDTO {


    private Long id_cladire;
    private String descriere;
    private byte[] img1;
    private byte[] img2;
    private byte[] img3;
    private String denumire;
    private String adresa; //Strada + nr
    private String judet;

    public CladiriDTO(Long id_cladire, String descriere, byte[] img1, byte[] img2, byte[] img3, String denumire, String adresa, String judet, String localitate, int nr_camere, int nr_etaje) {
        this.id_cladire = id_cladire;
        this.descriere = descriere;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.denumire = denumire;
        this.adresa = adresa;
        this.judet = judet;
        this.localitate = localitate;
        this.nr_camere = nr_camere;
        this.nr_etaje = nr_etaje;
    }

    public CladiriDTO() {
    }

    public CladiriDTO(Long idCladire, String denumire, String adresa, String judet, String localitate, int nrCamere, int nrEtaje) {
        this.id_cladire = idCladire;
        this.denumire = denumire;
        this.adresa = adresa;
        this.judet = judet;
        this.localitate = localitate;
        this.nr_camere = nrCamere;
        this.nr_etaje = nrEtaje;
    }

    public Long getId_cladire() {
        return id_cladire;
    }

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

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public void setNr_camere(int nr_camere) {
        this.nr_camere = nr_camere;
    }

    public void setNr_etaje(int nr_etaje) {
        this.nr_etaje = nr_etaje;
    }

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

    public String getAdresa() {
        return adresa;
    }

    public String getJudet() {
        return judet;
    }

    public String getLocalitate() {
        return localitate;
    }

    public int getNr_camere() {
        return nr_camere;
    }

    public int getNr_etaje() {
        return nr_etaje;
    }

    private String localitate;
    private int nr_camere;
    private int nr_etaje;

}
