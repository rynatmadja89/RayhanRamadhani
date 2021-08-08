/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Soal7 {
    public static void main(String[] args) {
        
        int maA[][] = {{6,3},{4,8}};
        int maB[][] = {{1},{2}};
        
        int maC[][] = new int[maA.length] [maB[0].length];
        
        for(int i = 0; i<maA.length; i++){
            for(int j = 0; j < maB[0].length; j++){
                for(int l = 0; l < maB.length; l++){
                    maC[i][j] = maA[i][l] * maB[l][j];
                    
                }
                System.out.println(maC[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
