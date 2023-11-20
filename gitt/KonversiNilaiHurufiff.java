import java.util.Scanner;

public class KonversiNilaiHurufiff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan angka antara 0 hingga 100: ");
        double nilai = input.nextDouble();


        if (nilai >= 0 && nilai <= 100) {

            double angka = (nilai / 100) * 4.0;


            String nilaiHuruf;
            if (angka >= 4.0) {
                nilaiHuruf = "A";
            } else if (angka >= 3.0) {
                nilaiHuruf = "B";
            } else if (angka >= 2.0) {
                nilaiHuruf = "C";
            } else if (angka >= 1.0) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }


            System.out.println("Nilai Indeks: " + angka);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }
    }
}
