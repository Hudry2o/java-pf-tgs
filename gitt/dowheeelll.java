import java.util.Scanner;

public class dowheeelll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int total = 0;

        do {
            System.out.print("Masukkan angka positif (atau masukkan 0 untuk berhenti): ");
            angka = input.nextInt();

            if (angka < 0) {
                System.out.println("Angka negatif tidak diperbolehkan.");
            } else {
                total += angka;
            }

        } while (angka != 0);

        System.out.println("Jumlah semua angka positif yang dimasukkan adalah: " + total);
    }
}
