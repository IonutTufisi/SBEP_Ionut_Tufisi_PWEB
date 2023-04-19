package com.sbep.SBEP.DTOs;

import com.sbep.SBEP.Entity.Cladiri;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CamereDTO{
        private Long id_camera;
       /* private String descriere;
        private byte[] img1;
        private byte[] img2;
        private byte[] img3;
        private Long id_birou;

    public CamereDTO(Long id_camera, String descriere, byte[] img1, byte[] img2, byte[] img3, Long id_birou, Long id_cladire, int lungime, int latime, int inaltime, int etaj, String statusBalcon) {
        this.id_camera = id_camera;
        this.descriere = descriere;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.id_birou = id_birou;
        this.id_cladire = id_cladire;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.etaj = etaj;
        this.statusBalcon = statusBalcon;
    }*/

   /* public CamereDTO() {
    }*/



    public void setId_camera(Long id_camera) {
        this.id_camera = id_camera;
    }

    /*public void setDescriere(String descriere) {
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

    public void setId_birou(Long id_birou) {
        this.id_birou = id_birou;
    }

    public void setId_cladire(Long id_cladire) {
        this.id_cladire = id_cladire;
    }*/

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    /*public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public void setStatusBalcon(String statusBalcon) {
        this.statusBalcon = statusBalcon;
    }

    private Long id_cladire;*/
        private int lungime;
        private int latime;
        private int inaltime;

    public CamereDTO(Long id_camera, int inaltime, int latime, int lungime) {
        this.id_camera = id_camera;
        this.inaltime = inaltime;
        this.latime = latime;
        this.lungime = lungime;
    }

    public Long getId_camera() {
        return id_camera;
    }

    /*public String getDescriere() {
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

    public Long getId_birou() {
        return id_birou;
    }

    public Long getId_cladire() {
        return id_cladire;
    }*/

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public int getInaltime() {
        return inaltime;
    }

   /* public int getEtaj() {
        return etaj;
    }

    public String getStatusBalcon() {
        return statusBalcon;
    }

    private int etaj;
        private String statusBalcon; // da sau nu)*/


}
