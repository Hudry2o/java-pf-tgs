
import java.util.Scanner;
public class GenapdanGanjil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("genap.");
        } else {
            System.out.println("ganjil.");
        }

        input.close();
    }
}
