import java.util.Scanner;
public class SIAKAD {
    public static void main(String[] args) {
        int i=0;
        Scanner input = new Scanner(System.in);
     
        
      System.out.println("masukan jumlah mahasiswa");
       int jml_mhs = input.nextInt();
       while (i<jml_mhs) { 
        i++;
       
        System.out.println("Masukan nilai mahasiswa ke-"+i);
        double nilai = input.nextDouble();
        if (nilai < 0 || nilai > 100) {
            System.out.println("nilai tidak valid");
            continue;
            
        }
        if (nilai > 80 && nilai < 100) {
            System.out.println("Nilai mahasiswa ke "+i+" adalah A");
            
        } else if (nilai > 73 && nilai <= 80) {
            System.out.println("Nilai mahasiswa ke "+i+" adalah B+");
            
        } else if (nilai >= 65 && nilai <= 73) {
            System.out.println("Nilai mahasiswa ke "+i+" adalah B");
            
        } else if (nilai >= 60 && nilai < 65) {
            System.out.println("Nilai mahasiswa ke "+i+" adalah C+");
            
        } else if (nilai >=50 && nilai < 60) {
            System.out.println("Nilai mahasiswa ke "+i+" adalah C");
            
        } else if (nilai >= 39 && nilai < 50) {
            System.out.println("Nilai mahasiswa ke "+i+" adalah D");
            
        }else{
            System.out.println("Nilai mahasiswa ke "+i+" adalah E");
        }
           
       }
    }
}

