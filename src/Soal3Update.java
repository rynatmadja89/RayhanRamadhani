/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Soal3Update {
    public static void main(String[] args) {
        
        System.out.println("===Latihan 3===");
        
        int sukuPertama, selisih, sukuTerakhir, updateNilai, totalNilai = 0;
        
        sukuPertama = 10;
        selisih = 5;
        sukuTerakhir = 80;
        
        System.out.println("Deret Aritmatika");
        
        for (int i=0; i<3; i++){
            for (int a=0; a<5; a++ ){
              
                updateNilai = sukuPertama;
                sukuPertama += selisih;
                
                System.out.print(" "+updateNilai);
                
                totalNilai += updateNilai;
            }
            System.out.println(" ");
        }
        
        System.out.println("Jumlah Deret Aritmatika : " + totalNilai);
    }
}
