/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Soal31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan Rill: ");
        float bill = input.nextFloat();
        
        System.out.println("Nilai dari Bilangan Rill " + bill);
        
        int nilaiDepan = (int) bill;
        if(nilaiDepan % 3 == 0){
           System.out.println("Nilai angka tersebut kelipatan 3 " ); 
        }else{
            System.out.println("Maaf Nilai Tersebut Bukan Kelipatan 3 ");
        }
        
        System.out.println("Hasil " + nilaiDepan);
        
        int nilaiBelakang = (int) ((bill - nilaiDepan) * 100 + 0.5);
        if(nilaiBelakang % 3 == 0){
           System.out.println("Nilai angka tersebut kelipatan 3 " ); 
        }else{
            System.out.println("Maaf Nilai Tersebut Bukan Kelipatan 3 ");
        }
        
        System.out.println("Hasil " + nilaiBelakang);
        
    
  
    }
}
