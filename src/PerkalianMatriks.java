/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class PerkalianMatriks {
    public static void main(String[] args) {
        
        int ma[][] = {{6,3,2},{4,2,3}};
        int mb[][] = {{1,2},{2,3},{3,1}};
        
        int mc[][] = new int [ma.length] [mb[0].length];
        
        for(int i=0; i < ma.length; i++){
            for(int j=0; j < mb[0].length; j++){
                for(int k=0; k < mb.length; k++){
                    
                    mc[i][j] = ma[i][k] * mb[k][j]; 
                }
                System.out.print(mc[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
