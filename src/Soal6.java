/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Soal6 {
    public static void main(String[] args) {
        
        int matriksA[][] = {{1,3},{2,4}};
        int matriksB[][] = {{4,2},{3,1}};
        int matriksC[][] = new int[2][2];
        
        for(int i = 0; i < 2; i++){
            for(int l = 0; l < 2; l++){
                matriksC[i][l] = matriksA[i][l] + matriksB[i][l];
                System.out.print(matriksC[i][l] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("============");
          for(int i = 0; i < 2; i++){
            for(int l = 0; l < 2; l++){
                matriksC[i][l] = matriksA[i][l] - matriksB[i][l];
                System.out.print(matriksC[i][l] + " ");
    }
              System.out.println(" ");
}
