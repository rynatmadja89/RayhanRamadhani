/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Soal1UKL {
    public static void main(String[] args) {
        
        int a, b, n, Un = 0;
        a = 3;
        System.out.println("Nilai suku pertama = " + a);
        b = 5;
        System.out.println("Nilai beda setiap suku = " + b);
        n = 10;
        
        
        //Looping
        for (int x = 1; x <= n; x++){
            
            Un = a + (x - 1) * b;
            System.out.println("Nilai suku ke - " + x + "adalah " + Un);
            
        }
        
        int Sn = (a +Un) * n / 2;
        System.out.println("Jumlah deret aritmatika dengan suku ke- " + n + "adalah = " + Sn);
    }
}
