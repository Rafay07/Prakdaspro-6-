import java.util.Scanner;

public class Pemilihan2Percobaan1NoAbsen2 {
    public static void main(String[] args) {
       System.out.print("Input your year :");
        Scanner sc=new Scanner(System.in);
        int tahun=sc.nextInt();
     if (tahun % 4 == 0) {
    if (tahun % 100 != 0) {
        System.out.println("Tahun Kabisat");
    } else {
        if (tahun % 400 == 0) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
} else {
    System.out.println("Bukan Tahun Kabisat");
}
            sc.close();
        }
    }

