import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input merk, kategori, dan ukuran
        System.out.print("Masukkan merk sepatu: ");
        String merk = sc.nextLine();

        System.out.print("Masukkan kategori: ");
        String kategori = sc.nextLine();

        System.out.print("Masukkan ukuran: ");
        int ukuran = sc.nextInt();

        int harga = 0;

        // Pengecekan kondisi berdasarkan flowchart
        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                harga = 800000;
            } else {
                harga = 1200000;
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                harga = 1000000;
            } else {
                harga = 1800000;
            }
        } else {
            // Merk selain Converse dan Sketcher
            if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;
            } else {
                harga = 1500000;
            }
        }

        // Output Harga
        System.out.println("Harga Sepatu = Rp " + harga);

        sc.close();
    }
}