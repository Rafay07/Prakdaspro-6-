import java.util.Scanner;

public class Pemilihan2Percobaan2NoAbsen2 {
    public static void main(String[] args) {
        Scanner inputabsen2 = new Scanner(System.in);
        
        System.out.println("-------------------");
        System.out.println("========MENU CAFE JTI========");
        System.out.println("-------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea ");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------");
        
        System.out.print("Masukkan nomor pesanan : ");
        int pilihanMenu = inputabsen2.nextInt();
        inputabsen2.nextLine();
        
        System.out.print("Apakah punya Member?(y/n) : ");
        String member = inputabsen2.nextLine();
        
        System.out.print("Masukkan jenis pembayaran (QRIS/Lainnya) : ");
        String jenisPembayaran = inputabsen2.nextLine();
        
        System.out.println("-------------------");
        int harga = 0; 
        int potonganQris = 0;

        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            potonganQris = 1000;
        }

        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10;
            System.out.println("Selamat Anda mendapatkan diskon 10%");
            
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl :" + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea :" + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling :" + harga);
            } else {
                System.out.println("Masukkan nomor pilihan dengan benar!");
                return;
            }
            
            if (potonganQris > 0) {
                System.out.println("Dapat potongan harga QRIS sebesar Rp 1.000");
            }
            
            int totalBayar = (int) (harga - (harga * diskon)) - potonganQris;
            System.out.println("Total bayar : " + totalBayar);

        } else if (member.equalsIgnoreCase("n")) {
            System.out.println("Anda tidak mendapatkan diskon member");

            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl :" + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea :" + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling :" + harga);
            } else {
                System.out.println("Masukkan nomor pilihan dengan benar!");
                return;
            }
            
            if (potonganQris > 0) {
                System.out.println("Dapat potongan harga QRIS sebesar Rp 1.000");
            }
            
            int totalBayar = harga - potonganQris;
            System.out.println("Total bayar : " + totalBayar);
        } else {
            System.out.println("Status member tidak valid (pilih y/n)!");
        }
        
        inputabsen2.close(); 
    }
}