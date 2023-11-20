import java.util.Scanner;

public class forr {
    public static void main(String[] args) {

        int i, n;
        double jum;

        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        n = input.nextInt();
        input.close();

        jum = 1;



        for (i= 2; i <= n ; i++)
            if (i%2==0)
                jum = jum - 1.0/i;
            else
                jum = jum+ 1.0/i;



        System.out.println("jUMLAH ="+ jum);
    }
}
