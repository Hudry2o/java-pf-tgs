import java.util.Scanner;

public class TGS14NOV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("jumlah data: ");
        int jmblhDta = scanner.nextInt();
        System.out.println("Inputkan data berikut :");


        int[] arrAngk = new int[jmblhDta];


        for (int i = 0; i < jmblhDta; i++) {
            System.out.print("data ke-" + (i) + ": ");
            arrAngk[i] = scanner.nextInt();
        }
        System.out.println("Menampilkan data:");
        for (int i = 0; i < jmblhDta; i++) {
            if (arrAngk[i] % 2 == 0) {
                System.out.println(arrAngk[i] + " -> Genap");
            } else {
                System.out.println(arrAngk[i] + " -> Ganjil");
            }
        }
        int total = 0;
        for (int i = 0; i < jmblhDta; i++) {
            total += arrAngk[i];
        }
        double rataRata = (double) total / jmblhDta;


        System.out.println("TOTAL PENJUMLAHAN: " + total);
        System.out.println("RATA-RATA: " + rataRata);
        scanner.close();
    }
}
