import java.util.Scanner;
public class percobaan {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double nilai_tertingi=0;
        double nilai_terendah=100;
        

        for(int i=1;i<=10;i++){
            System.out.print("Masukkan nilai ke-"+i+": ");
            double  nilai=input.nextDouble();
            if(nilai>nilai_tertingi){
                nilai_tertingi=nilai;
            }
            if(nilai<nilai_terendah){
                nilai_terendah=nilai;
            }
            System.out.println("Nilai tertinggi: "+nilai_tertingi);
            System.out.println("Nilai terendah: "+nilai_terendah);
          
        }

    }
}
    