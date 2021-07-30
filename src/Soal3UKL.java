/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Soal3UKL {
    public static void main(String[] args) {
        System.out.println("===Latihan soal 3=====");
        
        System.out.println("\n");
        
        int beda, awal, sukuSaatIni, jumlahDeret;
        
        beda = 5;
        awal = 10;
        sukuSaatIni = awal;
        jumlahDeret = 0;
        
        for(int i = 1; i<=3; i++){
            
            for(int k = 1; k<=5; k++){
                
                
                System.out.print(sukuSaatIni + "    ");
                
                jumlahDeret+= sukuSaatIni;
                
                sukuSaatIni+= beda;
            }
            
            System.out.println("");
        }
        System.out.println("Jumlah Deret Aritmatika : " + jumlahDeret);
    }
}
