import java.util.Scanner;

public class Pemilihan2Percobaan3NoAbsen2 {
    public static void main(String[] args) {
        Scanner inputAbsen2 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = inputAbsen2.nextLine();
        System.out.print("Masukkan besar Penghasilan Anda : ");
        penghasilan = inputAbsen2.nextInt();

        boolean kategoriValid = true;

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        } else if (kategori.equalsIgnoreCase("pebisnis")) { // Perbaikan typo 'pebisnis'
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
        } else {
            System.out.println("Masukkan kategori salah.");
            kategoriValid = false;
        }


        if (kategoriValid) {
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        }
        
        inputAbsen2.close(); 
    }
}
