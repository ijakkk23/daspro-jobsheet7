import java.util.Scanner;

public class bioskop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualanHariIni = 0;

        System.out.println("=== Program Penghitungan Penjualan Tiket Bioskop ===");
        System.out.println("Masukkan jumlah tiket per transaksi (ketik 0 untuk selesai):");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid (negatif). Silakan masukkan ulang!");
                continue;
            }

            double hargaNormal = jumlahTiket * hargaPerTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = hargaNormal - (hargaNormal * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPenjualanHariIni += totalBayar;

            System.out.println("Diskon yang didapat: " + (diskon * 100) + "%");
            System.out.println("Total bayar untuk transaksi ini: Rp " + totalBayar);
            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n================================================");
        System.out.println("REKAP TOTAL PENJUALAN TIKET HARI INI");
        System.out.println("Total tiket yang terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan penonton : Rp " + totalPenjualanHariIni);
        System.out.println("================================================");

        sc.close();
    }
}