/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab5;

/**
 *
 * @author user
 */
public class Bab5 {

    /**
     * @param args the command line arguments
     */public static void main(String[] args) {
//        TODO code application logic here
Integer sebelum = 20;
        Integer sesudah = 0;
        System.out.println("Sebelum Increment : " + sebelum);
        sesudah = ++sebelum;
        System.out.println("Sesudah Increment : " + sesudah); 
        
        // Decrement
        sebelum = 9;
        sesudah = 0;
        System.out.println("Sebelum Decrement : " + sebelum);
        sesudah = --sebelum;
        System.out.println("Sesudah Decrement : " + sesudah);

        // Negasi
        int a = 2;
        int b = 0; 
        System.out.println("Sebelum negasi : " + a);
        b = -a;
        System.out.println("Setelah negasi : " + b);

        // Penambahan
        int a1 = 10; 
        int a2 = 2;
        System.out.println("Penambahan 10 + 2 : " + (a1 + a2));
        
        // Pengurangan
        int b1 = 10; 
        int b2 = 2;
        System.out.println("Pengurangan 10 - 2 : " + (b1 - b2));

        // Perkalian
        int c1 = 16;
        int c2 = 2;
        System.out.println("Perkalian 16 * 2 : " + (c1 * c2));

        // Pembagian
        int d1 = 16;
        int d2 = 2;
        System.out.println("Pembagian 16 / 2 : " + (d1 / d2));

        // Sisa Bagi
        int e1 = 16;
        int e2 = 2;  
        System.out.println("Sisa bagi 16 dan 2 : " + (e1 % e2));

        // Perbandingan: kurang dari
        a = 10;
        b = 15;
        System.out.println("Variabel a : " + a);
        System.out.println("Variabel b : " + b);
        System.out.println("Apakah 10 kurang dari 15: " + (a < b));
        System.out.println("Apakah 15 kurang dari 10: " + (b < a));
        System.out.println("Apakah 15 kurang dari 15: " + (b < b));

        // Perbandingan: lebih besar
        a = 2;
        b = 3;
        System.out.println("Variabel a : " + a);
        System.out.println("Variabel b : " + b);
        System.out.println("Apakah 2 lebih besar dari 3: " + (a > b));
        System.out.println("Apakah 3 lebih besar dari 2: " + (b < a));
        System.out.println("Apakah 3 lebih besar dari 3: " + (b < b));

        // Kurang dari atau sama dengan
        a = 3;
        b = 3;
        System.out.println("Variabel a : " + a);
        System.out.println("Variabel b : " + b);
        System.out.println("Apakah 3 <= 3: " + (a <= b));
        a = 9;
        System.out.println("Variabel a diubah : " + a);
        System.out.println("Apakah 9 <= 3: " + (a <= b));

        // Lebih besar atau sama dengan
        a = 3;
        b = 3;
        System.out.println("Variabel a : " + a);
        System.out.println("Variabel b : " + b);
        System.out.println("Apakah 3 >= 3: " + (a >= b));
        a = 2;
        System.out.println("Variabel a diubah : " + a);
        System.out.println("Apakah 2 >= 3: " + (a >= b));

        // Operator logika AND
        System.out.println("true and true : " + (true && true));
        System.out.println("true and false : " + (true && false));
        System.out.println("false and false : " + (false && false));
        System.out.println("false and true : " + (false && true));

        // Operator logika OR
        System.out.println("true or true : " + (true || true));
        System.out.println("true or false : " + (true || false));
        System.out.println("false or false : " + (false || false));
        System.out.println("false or true : " + (false || true));
    }
}