
import java.util.Scanner;

public class KonversiNilaiHurufswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai huruf (A/B/C/D/E): ");
        char nilaiHuruf = input.next().charAt(0);

        double angka;

        switch (nilaiHuruf) {
            case 'A':
                angka = 4.0;
                break;
            case 'B':
                angka = 3.0;
                break;
            case 'C':
                angka = 2.0;
                break;
            case 'D':
                angka = 1.0;
                break;
            case 'E':
                angka = 0.0;
                break;
            default:
                angka = -1.0;
                break;
        }

        if (angka >= 0) {
            System.out.println("Nilai index: " + angka);
        } else {
            System.out.println("Inputan salah");
        }
    }
}
