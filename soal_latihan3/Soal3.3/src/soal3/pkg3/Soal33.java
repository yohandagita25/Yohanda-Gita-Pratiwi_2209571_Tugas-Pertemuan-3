/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3.pkg3;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Soal33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jam mulai : ");
        int jamMulai = input.nextInt();
        
        System.out.print("Masukkan menit mulai : ");
        int menitMulai = input.nextInt();
        
        System.out.print("Masukkan jam selesai : ");
        int jamSelesai = input.nextInt();
        
        System.out.print("Masukkan menit selesai : ");
        int menitSelesai = input.nextInt();
        
        if(jamSelesai < jamMulai){
            switch(jamSelesai){
                case 1:
                    jamSelesai = 13;
                    break;
                case 2:
                    jamSelesai = 14;
                    break;
                case 3:
                    jamSelesai = 15;
                    break;
                case 4:
                    jamSelesai = 16;
                    break;
                case 5:
                    jamSelesai = 17;
                    break;
                case 6:
                    jamSelesai = 18;
                    break;
                case 7:
                    jamSelesai = 19;
                    break;
                case 8:
                    jamSelesai = 20;
                    break;    
                case 9:
                    jamSelesai = 21;
                    break;
                case 10:
                    jamSelesai = 22;
                    break;
                case 11:
                    jamSelesai = 23;
                    break;
                case 12:
                    jamSelesai = 0;
                    break;
            }
        }
        
        int lamaWaktu = (jamSelesai * 60 + menitSelesai) - (jamMulai * 60 + menitMulai);
        
        int lamaJam = lamaWaktu / 60;
        int lamaMenit = lamaWaktu % 60;
        
        System.out.println("Lama menit : " + lamaWaktu);
        System.out.println("Lama jam dan menit : " + lamaJam + " jam " + lamaMenit + " menit ");
        
        
    }
    
}
