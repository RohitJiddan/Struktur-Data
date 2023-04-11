package StrukData.Modul4;

import java.util.HashMap;
import java.util.Scanner;

    public class Latihan1_M4{
        String nama, kelas, matkulPraktikum;
        int nim;
        public Latihan1_M4(String nm, String kl, String mat, int ni){
            nama = nm;
            kelas = kl;
            matkulPraktikum = mat;
            nim = ni;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            HashMap<String, Latihan1_M4> mhs = new HashMap<>();
            String inputString;
            Latihan1_M4 data;

            mhs.put("1", new Latihan1_M4 ("Putri", "3H", "Struktur Data", 2020000));
            mhs.put("2", new Latihan1_M4 ("Agus", "3A", "Matematika", 2020012));
            mhs.put("3", new Latihan1_M4 ("Arro", "3D", "Pemrograman", 2020017));

            System.out.println("Masukkan ID:    ");
            inputString = input.nextLine();
            data = mhs.get(inputString);

            if (data != null){
                System.out.println();
                System.out.println("Data Mahasiswa : " + data.nama + ", Kelas : " + data.kelas + ", Mata Kuliah Praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
            }
        }
    }


