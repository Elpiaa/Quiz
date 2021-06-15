package com;

public class Kelas {
    String jurusan;
    String kodekelas;


    public Kelas() {
    }

    public Kelas(String jurusan, String kodekelas) {
        this.jurusan = jurusan;
        this.kodekelas = kodekelas;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getKodekelas() {
        return this.kodekelas;
    }

    public void setKodekelas(String kodekelas) {
        this.kodekelas = kodekelas;
    }

    @Override
    public String toString() {
        return "\n" + "\n" +
            "Jurusan     = " + getJurusan() + "\n" +
            "Kode kelas  = " + getKodekelas() + "\n" 
            ;
    }

}
