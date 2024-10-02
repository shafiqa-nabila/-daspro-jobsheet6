import java.util.Scanner;

/**
 * Pemilihan2Percobaan120
 */
public class Pemilihan2Percobaan120 {

    public static void main(String[] args) {
         Scanner input20 = new Scanner(System.in);
         int tahun = input20.nextInt();

         if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0){
                System.out.println("Tahun Kabisat");
            } else if((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else {
                System.out.printf("Tahun %s Bukan Tahun Kabisat", tahun);
            }
         } else {
            System.out.println("Bukan Tahun Kabisat");
         }
    }
}