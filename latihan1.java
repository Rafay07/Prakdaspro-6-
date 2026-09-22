public class latihan1 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;

        // Pengecekan kondisi berdasarkan flowchart
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Output = " + bil1 + " > " + bil3);
            } else {
                System.out.println("Output = " + bil2 + " > " + bil1);
            }
        } else {
            System.out.println("Output = " + bil2 + " > " + bil1);
            
            if (bil2 > bil3) {
                System.out.println("Output = " + bil2 + " > " + bil3);
            } else {
                System.out.println("Output = " + bil3 + " > " + bil2);
            }
        }
    }
}