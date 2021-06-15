package com;

public class MataKuliah {
    String namamatakuliah;
    String kode ;

    public MataKuliah() {
    }

    public MataKuliah(String namamatakuliah, String kode) {
        this.namamatakuliah = namamatakuliah;
        this.kode = kode;
    }


    public String getNamamatakuliah() {
        return this.namamatakuliah;
    }

    public void setNamamatakuliah(String namamatakuliah) {
        this.namamatakuliah = namamatakuliah;
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void tampilkanmatakuliah() {
        System.out.println("Nama Mata Kuliah    : " + namamatakuliah);
        System.out.println("Kode Mata Kuliah    : " + kode); 
    }

    @Override
    public String toString() {
        return "\n" + "\n" +
            "Nama Mata Kuliah : " + getNamamatakuliah() + "\n" +
            "Kode Mata Kuliah : " + getKode() + "\n" 
           ;
    }


}
