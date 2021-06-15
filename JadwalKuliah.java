package com;
import java.util.ArrayList;

public class JadwalKuliah {
    ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    Dosen dosen;
    MataKuliah matakuliah; 
    Kelas kelas ;

    public JadwalKuliah() {
    }

    public JadwalKuliah(ArrayList<Mahasiswa> mahasiswa, Dosen dosen, MataKuliah matakuliah, Kelas kelas) {
        this.mahasiswa = mahasiswa;
        this.dosen = dosen;
        this.matakuliah = matakuliah;
        this.kelas = kelas;
    }

    public ArrayList<Mahasiswa> getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(ArrayList<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Dosen getDosen() {
        return this.dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public MataKuliah getMatakuliah() {
        return this.matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Kelas getKelas() {
        return this.kelas;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }


    public void tambahmahasiswa(Mahasiswa m) {
        mahasiswa.add(m);   
    }

    Kelas k1 = new Kelas("Teknik Informatika" , "20TI2");
    MataKuliah mt1 = new MataKuliah("PBO" , "PBO127") ;
    Dosen d1 = new Dosen("Yuna" , "02081985" , true);

    public void tampilkanjadwalkuliah() {
        System.out.println("        Jadwal Kuliah        ");
        System.out.println(" ");

        System.out.println("Nama Mata Kuliah    : " + mt1);
        System.out.println("Dosen               : " + d1);
        System.out.println("Kelas               : " + k1);
        System.out.println(" ");
        System.out.println("        Daftar Mahasiswa         ");
        System.out.println(" ");
        for(Mahasiswa m : mahasiswa){
            System.out.println(m.toString());
        }


    }
}
