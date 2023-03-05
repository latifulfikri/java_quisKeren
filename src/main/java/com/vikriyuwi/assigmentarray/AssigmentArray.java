/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vikriyuwi.assigmentarray;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author fikriyuwi
 */
public class AssigmentArray {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // bank soal
        String [] questions = {
            "Serangga yang memiliki solidaritas tinggi adalah...",
            "Binatang yang suka memakan biji kopi dan kotorannya bisa dijadikan kopi adalah...",
            "Kota malang berasal dari provinsi...",
            "Zona waktu di papua disebut...",
            "Mahasiswa BINUS juga disebut sebagai..."
        };
        
        // bank jawaban
        String [][] answers = {
            {
                "Dinosaurus","Cicak","Semut","Gajah"
            },
            {
                "Keledai","Kucing","Luwak","Ular"
            },
            {
                "Jawa Timur","Jawa Tengah","Kalimantan Timur","Sumatera Barat"
            },
            {
                "WIT","WITA","WIB","WIBA"
            },
            {
                "Binuser","Sunib","Mboisian","Binusian"
            }
        };
        
        // kunci jawaban
        char [] keys = {
            'c','c','a','a','d'
        };
        
        // jawaban user
        char [] userChoice = new char[5];
        
        // greating game 
        System.out.println("\n\nHalo, selamat datang di Kuis Keren\n");
        System.out.println("Kamu harus menjawab semua soal dengan benar\n");
        
        // input nama
        System.out.print("Silahkan masukkan namamu : ");
        String name = input.next();
        
        // greating 2
        System.out.println("\nKeren "+ name +"! Semangat!\n");
        System.out.println("Ketik enter untuk melanjutkan");
        try{System.in.read();}
            catch(IOException e){}
        
        // mulai soal
        for (int i = 0; i < 5; i++) {
            System.out.println("Soal ke-"+(i+1));
            System.out.println(questions[i]);
            
            System.out.println("a. "+ answers[i][0] );
            System.out.println("b. "+ answers[i][1] );
            System.out.println("c. "+ answers[i][2] );
            System.out.println("d. "+ answers[i][3] + "\n");
            
            System.out.println("Jawabanmu : ");
            userChoice[i] = input.next().charAt(0);
            System.out.println("\n");
        }
        
        // selesai menjawab
        System.out.println("Selamat! Kamu telah menyelesaikan kuis\n");
        System.out.println("======================================\n");
        // skor
        int score = 0;
        for (int i = 0; i < 5; i++) {
            if (keys[i]==userChoice[i]) {
                score += 20;
            }
        }
        
        // lihat skor
        System.out.println("Ketik enter untuk melihat skormu");
        try{System.in.read();}
            catch(IOException e){}
        System.out.println("Skor-mu adalah " + String.valueOf(score));
        System.out.println("======================================\n");
        
        // detail jawaban
        System.out.println("Ketik enter untuk melihat detail jawabanmu");
        try{System.in.read();}
            catch(IOException e){}
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". " + userChoice[i] );
            if (keys[i]==userChoice[i]) {
                System.out.println(" (Benar)");
            } else {
                System.out.println(" (Salah)");
            }
        }
    }
}
