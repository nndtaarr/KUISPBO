/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Kriteria.DesignerCriteria;
import Kriteria.ManagerCriteria;
import Kriteria.ProgrammerCriteria;
import java.util.Scanner;
/**
 *
 * @author Ardya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int pilih;
        String nama;
        Scanner input = new Scanner(System.in);
        Scanner inputPil = new Scanner(System.in);
        
        System.out.println("+---------------------------------+");
        System.out.println("|   Pelamaran Lowongan Pekerjaan  |");
        System.out.println("+---------------------------------+");
        System.out.println("Terdapat 3 posisi yang kososng:");
        System.out.println("    1. Programer");
        System.out.println("    2. Designer");
        System.out.println("    3. Manager");
        System.out.print("Pilih pekerjaan yang dilamar: ");
        pilih = inputPil.nextInt();
        
        System.out.println("=== FORMULIR PELAMAR ===");
        System.out.print("Nama Lengkap: ");
        nama = input.nextLine();
        
        System.out.println("\n---Penilaian---");
        System.out.println("Keterangan: Nilai yang valid berada do antara 0-100");
        if(pilih == 1){
            System.out.print("\nNilai Programming Knowledge : ");
            int nilai1= input.nextInt();
            System.out.print("\nNilai Clean Coding : ");
            int nilai2= input.nextInt();
            System.out.print("\nNilai Debugging : ");
            int nilai3 = input.nextInt();
           ProgrammerCriteria pegawai = new ProgrammerCriteria(nama,nilai1, nilai2, nilai3);
                do {
                 System.out.println("\n +++ MENU ++");
                 System.out.println("     1. Tampilkan Hasil");
                 System.out.println("     2. Ubah Nilai Pelamar");
                 System.out.println("     3. Exit");
                 System.out.print(" Pilih : ");
                 pilih = inputPil.nextInt();
               if (pilih == 1){
                    System.out.println("Nilai Akhir : " + pegawai.hitungNilaiAkhir());
                    System.out.println("KETERANGAN  : " + pegawai.keterangan());
                }
                else if (pilih == 2){
                    System.out.println("\n *** Edit Nilai ***");
                    System.out.print("Nilai Programming Knowledge : ");
                    pegawai.setNilai1(input.nextInt());
                    System.out.print("Nilai Clean Coding : ");
                    pegawai.setNilai2(input.nextInt());
                    System.out.print("Nilai Debugging : ");
                    pegawai.setNilai3(input.nextInt());
                }
              else {
                     System.out.println("Terima Kasih!");
                    break;
                }
            }while(true);   
        } else if(pilih == 2){
            System.out.print("\nNilai Design Portofolio: ");
            int nilai1= input.nextInt();
            System.out.print("\nNilai Prototyping : ");
            int nilai2= input.nextInt();
            System.out.print("\nNilai Creativity : ");
            int nilai3 = input.nextInt();
            DesignerCriteria pegawai = new DesignerCriteria(nama, nilai1, nilai2, nilai3);
                do {
                 System.out.println("\n +++ MENU ++");
                 System.out.println("     1. Tampilkan Hasil");
                 System.out.println("     2. Ubah Nilai Pelamar");
                 System.out.println("     3. Exit");
                 System.out.print(" Pilih : ");
                 pilih = inputPil.nextInt();
               if (pilih == 1){
                    System.out.println("Nilai Akhir : " + pegawai.hitungNilaiAkhir());
                    System.out.println("KETERANGAN  : " + pegawai.keterangan());
                }
                else if (pilih == 2){
                    System.out.println("\n *** Edit Nilai ***");
                    System.out.print("Nilai Design Portofolio : ");
                    pegawai.setNilai1(input.nextInt());
                    System.out.print("Nilai Prototyping : ");
                    pegawai.setNilai2(input.nextInt());
                    System.out.print("Nilai Creativity : ");
                    pegawai.setNilai3(input.nextInt());
                }
               else {
                     System.out.println("Terima Kasih!");
                    break;
                }
            }while(true); 
        }  else if(pilih == 3){
            System.out.print("\nNilai Innovation : ");
            int nilai1= input.nextInt();
            System.out.print("\nNilai Decision Making : ");
            int nilai2= input.nextInt();
            System.out.print("\nNilai Communication : ");
            int nilai3 = input.nextInt();
            ManagerCriteria pegawai = new ManagerCriteria(nama, nilai1, nilai2, nilai3);
                do {
                 System.out.println("\n +++ MENU ++");
                 System.out.println("     1. Tampilkan Hasil");
                 System.out.println("     2. Ubah Nilai Pelamar");
                 System.out.println("     3. Exit");
                 System.out.print(" Pilih : ");
                 pilih = inputPil.nextInt();
               if (pilih == 1){
                    System.out.println("Nilai Akhir : " + pegawai.hitungNilaiAkhir());
                    System.out.println("KETERANGAN  : " + pegawai.keterangan());
                }
                else if (pilih == 2){
                    System.out.println("\n *** Edit Nilai ***");
                    System.out.print("Nilai Innovation : ");
                    pegawai.setNilai1(input.nextInt());
                    System.out.print("Nilai Decision Making : ");
                    pegawai.setNilai2(input.nextInt());
                    System.out.print("Nilai Communication : ");
                    pegawai.setNilai3(input.nextInt());
                }
                else {
                     System.out.println("Terima Kasih!");
                    break;
                }
            } while(true);
        }    
    }
    
}



