import java.util.Scanner;

public class bioskop2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga_tiket = 50000;
        double harga_jual = 0;
        boolean mulai = true;
        int jumlah_tiket = 0;
        int total_pendapatan = 0;
        int jumlah_terjual = 0;
        double diskon = 0;

        while (mulai=true) {
            System.out.println("masukan penjualan tiket anda (inputkan per pelanggan)");
            jumlah_tiket = input.nextInt();
            if (jumlah_tiket == 0) {
                System.out.println("tidak ada penjualan tiket, program selesai.");
                } else if (jumlah_tiket>4&&jumlah_tiket<=10) {
                    diskon = jumlah_tiket * harga_tiket * 0.1;
                    harga_jual = (jumlah_tiket * harga_tiket) - diskon;
                    System.out.println("total harga tiket dengan diskon 10% adalah: " + harga_jual);
                    System.out.println("pendapatan anda adalah : " + harga_jual);
                } else if (jumlah_tiket>10) {
                    diskon = jumlah_tiket * harga_tiket * 0.2;
                    harga_jual = (jumlah_tiket * harga_tiket) - diskon;
                    System.out.println("total harga tiket dengan diskon 20% adalah: " + harga_jual);
                    System.out.println("pendapatan anda adalah : " + harga_jual);
                } else if (jumlah_tiket>0&&jumlah_tiket<=4) {
                    harga_jual = jumlah_tiket * harga_tiket;
                    System.out.println("total harga tiket adalah: " + harga_jual);
                    System.out.println("pendapatan anda adalah : " + harga_jual);
                    
                } else if (jumlah_tiket<0) {
                    System.out.println("inputan tidak valid, silahkan coba lagi.");
                }
                total_pendapatan += harga_jual;
                jumlah_terjual += jumlah_tiket;
            
            System.out.println("apakah anda ingin melanjutkan pencatatan penjualan tiket? (ya/tidak)");
            String lanjut = input.next();
           if (lanjut.equalsIgnoreCase("tidak")) {
               
                System.out.println("pencatatan selesai, terima kasih.");

                break;
            }else {
                mulai = true;
                
            }

        
    }
    System.out.println("jumlah tiket terjual hari ini adalah: " + jumlah_terjual);
    System.out.println("total pendapatan dari penjualan tiket hari ini adalah: " + total_pendapatan);
    
    }}

