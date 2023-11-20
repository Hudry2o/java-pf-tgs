import java.util.Scanner;
public class AgkakeHurufELSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai angka: ");
        double angka = input.nextDouble();

        char nilaiHuruf;

        if (angka >= 80 && angka <= 100) {
            nilaiHuruf = 'A';
        } else if (angka >= 70 && angka < 80) {
            nilaiHuruf = 'B';
        } else if (angka >= 60 && angka < 70) {
            nilaiHuruf = 'C';
        } else if (angka >= 50 && angka < 60) {
            nilaiHuruf = 'D';
        } else if (angka >= 0 && angka < 50) {
            nilaiHuruf = 'E';
        } else {
            nilaiHuruf = 'F';
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}
