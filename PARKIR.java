import java.util.Scanner;

public class PARKIR {
    public static void main(String[] args) {
        int jeni_kendaraan, lama_parkir, total_biaya=0;
        Scanner input = new Scanner(System.in);
        boolean mulai = true;
        while (mulai ==true){
            System.out.println("masukan jenis kendaraan (1. mobil/2. motor): ");
            jeni_kendaraan = input.nextInt();
            System.out.println("masukan lama parkir (dalam jam): ");
            lama_parkir = input.nextInt();

            if (jeni_kendaraan!=0){
            if (jeni_kendaraan == 1) {
               if (lama_parkir > 5) {
                   total_biaya = lama_parkir * 3000;
                   total_biaya+=12500;
                   System.out.println("total biaya parkir adalah: " + total_biaya);
               } else {
                   total_biaya = lama_parkir * 3000;
                     System.out.println("total biaya parkir adalah: " + total_biaya);
               }
            } else if (jeni_kendaraan == 2) {
               if (lama_parkir > 5) {
                   total_biaya = lama_parkir * 2000;
                   total_biaya+=12500;
                     System.out.println("total biaya parkir adalah: " + total_biaya);
               } else {
                   total_biaya = lama_parkir * 2000;
                        System.out.println("total biaya parkir adalah: " + total_biaya);
               }
            } else {
                System.out.println("jenis kendaraan tidak valid, silahkan coba lagi.");
            }} else {
                System.out.println("program selesai, terima kasih.  ");
                break;
            }
            

           
        }
    }
}