/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kriteria;
import Pelamar.Pelamar;
import Seleksi.Seleksi;
/**
 *
 * @author Ardya
 */
public class ProgrammerCriteria extends Pelamar implements Seleksi {

    public ProgrammerCriteria (String nama,  int nilai1, int nilai2, int nilai3) {
        super(nama,nilai1, nilai2, nilai3);
    }
    
    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }
  @Override
    public String keterangan() {
        if(this.hitungNilaiAkhir() >= 85) return "DITERIMA\nSelamat!" + this.nama + " mendapatkan pekerjaan sebagai Programmer";
        else return "COBA LAGI\nMohon Maaf," + this.nama + " tidak mendapatkan pekerjaan sebagai Desiger";
    }

    @Override
    public double hitungNilaiAkhir() {
        return (this.nilai1 * 0.6) + (this.nilai2 * 0.15) + (this.nilai3* 0.25);
    }
}
    

