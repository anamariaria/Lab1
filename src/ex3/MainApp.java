package ex3;
import java.util.Scanner;
public class MainApp {

    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati nr natural: ");
        int a = scanner.nextInt();
        int count = 0;
        scanner.close();

        System.out.println("Divizorii lui " + a + " sunt: ");

        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                System.out.println(i + " este divizorul lui " + a);
            count++;
        }

        System.out.println();

        if (count == 2) {
            System.out.println(a + " este numar prim.");
        } else
            System.out.println(a + " nu este numar prim.");
    }
}
