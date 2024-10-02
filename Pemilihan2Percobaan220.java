import java.util.Scanner;

/**
 * Pemilihan2Percobaan220
 */
public class Pemilihan2Percobaan220 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int menu;
        String member;
        double diskon;
        double harga;

        System.out.println("----------------------");
        System.out.println("====MENU KAFE JTI=====");
        System.out.println("----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl = Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        menu = input20.nextInt();
        input20.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input20.nextLine();
        System.out.println("---------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("----------------------------------");
    }
}