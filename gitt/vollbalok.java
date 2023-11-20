
import java.util.Scanner;

public class vollbalok {

    public static void main(String[] hhh)  {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;


        System.out.print("Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Tinggi Balok: ");
        tinggi = input.nextInt();


        hasil = panjang * lebar * tinggi;

        System.out.println("Volume balok: " + hasil);


    }
}
