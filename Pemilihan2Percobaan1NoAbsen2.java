import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
       System.out.print("Input your year :");
        Scanner sc=new Scanner(System.in);
        int tahun=sc.nextInt();
        if (tahun%4 == 0) {
           if ((tahun%100)!=0) {
            System.out.println("Tahun Kabisat");
           } else {
            System.out.println("Bukan tahun Kabisat ");
           }
        } else {
            System.out.println("Bukan tahun Kabisat ");
            sc.close();
        }
    }
}
