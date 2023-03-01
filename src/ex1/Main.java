package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dati lungimea: ");
        double lungime = scanner.nextDouble();
        System.out.println("Dati latimea: ");
        double latime = scanner.nextDouble();
        scanner.close();

        Dreptunghi d1 = new Dreptunghi(lungime, latime);

        System.out.println("Aria: " + d1.Aria());
        System.out.println("Perimetrul: " + d1.Perimetrul());

    }
}


