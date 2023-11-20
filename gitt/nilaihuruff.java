
import java.util.Scanner;
public class nilaihuruff {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan angka antara 0 hingga 100: ");
        double nilai = input.nextDouble();


        if (nilai >= 0 && nilai <= 100) {

            double nilaiIndeks = (nilai / 100) * 4.0;


            String nilaiHuruf;
            if (nilaiIndeks >= 3.5) {
                nilaiHuruf = "A";
            } else if (nilaiIndeks >= 2.5) {
                nilaiHuruf = "B";
            } else if (nilaiIndeks >= 1.5) {
                nilaiHuruf = "C";
            } else {
                nilaiHuruf = "D";
            }


            System.out.println("Nilai Indeks: " + nilaiIndeks);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
        }
    }


}
