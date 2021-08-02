
public class Soal4UKL {
    public static void main(String[] args) {
        
        System.out.println("===Soal Latihan 4===");
        
        int sukuPertama = 5;
        int selisih = 5;
        int sukuTerakhir = 50;
        int updateNilai;
        
        
        for (int a = 0;  a<5; a++){
            
            for (int i=0; i < a; i++){
                
                updateNilai = sukuPertama;
                sukuPertama += selisih;
                
                System.out.print(" "+updateNilai);
                
                
            }
            System.out.println(" ");
        }
        
        System.out.println("=============");
        
        int pertama = 5;
        int kurang = 5;
        int terakhir = 50;
        int upNilai;
        
        for(int a = 0; a < 5; a++){
        
            for(int i=a; i < 5; i++){
                
                upNilai = pertama;
                pertama += kurang;
                
                System.out.print(" "+upNilai);
                
            }
            System.out.println(" ");
    }
    }
   
}
