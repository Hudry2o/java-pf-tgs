import java.util.Scanner;

public class AgkakeHurufCASE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai angka: ");
        double angka = input.nextDouble();

        char nilaiHuruf;


        if (angka >= 0 && angka <= 100) {
            switch ((int) angka / 10) {
                case 10:
                case 9:
                    nilaiHuruf = 'A';
                    break;

                case 8:
                    nilaiHuruf = 'B';
                    break;

                case 7:
                    nilaiHuruf = 'C';
                    break;

                case 6:
                    nilaiHuruf = 'D';
                    break;

                default:
                    nilaiHuruf = 'E';
                    break;
            }
        } else {
            nilaiHuruf = '!';
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}
