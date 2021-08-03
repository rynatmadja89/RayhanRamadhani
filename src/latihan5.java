
import java.util.Scanner;

public class latihan5 {
    public static void main(String[] args) {
        
        int k,l = 0,m,n;
        
        int matriks1[][] = new int[0][0];
        int matriks2[][] = new int[0][0];
        int hasil[][] = new int[0][0];
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Input jumlah baris matriks");
        m = scan.nextInt();
        System.out.print("Input jumlah kolom matriks");
        n = scan.nextInt();
        System.out.println("Input elemen matriks pertama");
        for (k = 0; k < l; k++){
            for (l = 0; l < n; l++){
                matriks1[k][l] = scan.nextInt();
            }
        }
        System.out.println("Input elemen matriks kedua");
        for (k = 0; k < l; k++){
            for (l = 0; l < n; l++){
                matriks2[k][l] = scan.nextInt();
            }
        }
        System.out.println("Hasil pengurangan matriks");
        for (k = 0; k < l; k++){
            for (l = 0; l < n; l++){
                hasil[k][l] = matriks[k][l] - matriks2[k][l];
                System.out.print(hasil[k][l] + "\t");
            }
            System.out.println();
        }
    }
}
