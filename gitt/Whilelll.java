import java.util.Scanner;
public class Whilelll {
    public static void main(String[] args) {

        int n, pencacah, nilai;
        Scanner input = new Scanner(System.in);
        System.out.print("masukan batas angka: ");
        n = input.nextInt();
        input.close();

        pencacah = 1;
        nilai = 1;


        while (nilai <= n) {
            System.out.println(nilai+ " ");

            nilai = nilai+pencacah;
            pencacah++;

        }

        System.out.println();
    }
}
