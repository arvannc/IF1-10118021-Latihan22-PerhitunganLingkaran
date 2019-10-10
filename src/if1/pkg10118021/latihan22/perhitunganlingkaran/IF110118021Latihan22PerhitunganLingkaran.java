/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Perhitungan Lingkaran
 */
public class IF110118021Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Perhitungan Lingkaran");
        System.out.print("Masukkan diameter lingkaran : ");
        Scanner input = new Scanner(System.in);
        double diameter = 0;
        while (!input.hasNextDouble()){
            System.out.println("Nilai diameter tidak sesuai");
            System.out.println("Masukkan nilai diameter lingkaran : ");
            input.next();
        }
        diameter = input.nextDouble();
        System.out.println("Hasil Perhitungan Lingkaran");
        System.out.println("Jari-jari Lingkaran\t= " + (diameter/2) + " cm");
        System.out.println("Luas Lingkaran\t\t= " + (3.14 * (diameter/2) * (diameter/2) + "cm"));
        System.out.println("Keliling Lingkaran\t= " + (3.14 * diameter) + " cm");
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
    
}
