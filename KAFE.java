import java.util.Scanner;
public class KAFE {
    public static void main(String[] args) {
        int kopi, teh , roti;
        int harga_kopi=12000, harga_teh=8000, harga_roti=20000;
        Scanner input = new Scanner(System.in);
        System.out.println("=======Selamat datang di kafe kami!========");
        do {
            System.out.println("masukan nama pelanggan: ");
            String nama_pelanggan = input.nextLine();
            if (nama_pelanggan.equals("selesai")) {
                System.out.println("Transaksi Selesai, Silahkan bayar di kasir.");
                break;}
            System.out.println("masukan jumlah kopi: ");
            kopi = input.nextInt();
            System.out.println("masukan jumlah teh: ");
            teh = input.nextInt();
            System.out.println("masukan jumlah roti: ");
            roti = input.nextInt();

            int total_harga = (kopi * harga_kopi) + (teh * harga_teh) + (roti * harga_roti);
            System.out.println("Total harga untuk " + nama_pelanggan + " adalah: Rp " + total_harga);
            input.nextLine(); // consume newline
            
        } while (true);
        System.out.println("====Terima kasih telah berkunjung ke kafe kami!====");

    }
}
