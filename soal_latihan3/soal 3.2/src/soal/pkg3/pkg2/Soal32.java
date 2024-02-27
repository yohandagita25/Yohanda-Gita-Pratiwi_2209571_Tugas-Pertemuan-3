/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Soal32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama = ");
        int bilangan1 = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua = ");
        int bilangan2 = input.nextInt();
        
        System.out.print("Masukkan operator aritmatika (+, -, *, /, %) = ");
        char operator = input.next().charAt(0);
        
        switch(operator){
            case '+':
                System.out.println("Hasil dari operasi penjumlahan = " + (bilangan1 + bilangan2));
                break;
            case '-':
                System.out.println("Hasil dari operasi pengurangan = " + (bilangan1 - bilangan2));
                break;
            case '*':
                System.out.println("Hasil dari operasi perkalian = " + (bilangan1 * bilangan2));
                break;
            case '/':
                System.out.println("Hasil dari operasi pembagian = " + (bilangan1 / bilangan2));
                break;
            case '%':
                System.out.println("Hasil dari operasi modulus = " + (bilangan1 % bilangan2));
                break;
            default:
                System.out.println("Operasi tidak valid");
                
        }
    }
    
}
