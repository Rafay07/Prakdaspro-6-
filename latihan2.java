import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jenis dan jumlah buku
        System.out.print("Masukkan jenis buku (Kamus/Novel/Lainnya): ");
        String jenis = sc.nextLine();
        
        System.out.print("Masukkan jumlah buku: ");
        int jumlah = sc.nextInt();

        double diskon = 0;

        if (jenis.equalsIgnoreCase("Kamus")) {
            diskon = 0.10; // Diskon awal 10%
            if (jumlah > 2) {
                diskon = 0.12; // Diskon 12% jika jumlah > 2
            } else {
                diskon = 0.10; // Diskon tetap 10%
            }
        } else if (jenis.equalsIgnoreCase("Novel")) {
            diskon = 0.07; // Diskon awal 7%
            if (jumlah > 3) {
                diskon = 0.09; // Diskon 9% jika jumlah > 3
            } else {
                diskon = 0.08; // Diskon 8% jika jumlah <= 3
            }
        } else {
            // Jenis buku selain Kamus dan Novel
            if (jumlah > 3) {
                diskon = 0.05; // Diskon 5% jika jumlah > 3
            } else {
                diskon = 0.0;  // Diskon 0% jika jumlah <= 3
            }
        }

        // Tampilan output diskon
        System.out.println("Diskon yang didapat: " + (int)(diskon * 100) + "%");

        sc.close();
    }
}