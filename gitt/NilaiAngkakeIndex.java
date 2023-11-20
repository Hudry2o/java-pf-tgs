import java.util.Scanner;
public class NilaiAngkakeIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double angka = input.nextDouble();

        double nilaiIndeks;

        if (angka >= 0 && angka <= 100) {
            switch ((int) angka / 10) {

                case 8:
                    nilaiIndeks = 3.0;
                    break;
                case 7:
                    nilaiIndeks = 2.0;
                    break;
                case 6:
                    nilaiIndeks = 1.0;
                    break;
                default:
                    nilaiIndeks = 0.0;
                    break;
            }
        } else {
            nilaiIndeks = -1.0;
        }

        if (nilaiIndeks >= 0) {
            System.out.println("Nilai indeks: " + nilaiIndeks);
        } else {
            System.out.println("Inputan salah");
        }
    }
}
