package ex5;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class MainApp {

    public static void main(String []args) {
        Random random = new Random();
        int numar = random.nextInt(20);
        System.out.println("Numarul generat este: " + numar);

        //dupa primul pseudocode de pe net
        //cautam numarul in sirul lui Fibonacci

        int a = 0, b = 1, i = 2;
        int temp;
        boolean found = false;

        while (b <= numar) {
            if (numar == b) {
                found = true;
                break;
            }
            temp = a + b;
            a = b;
            b = temp;
        }

        //afisam rez
        if(found){
            System.out.println("Numarul " + numar + " face parte din sirul lui Fibonacci");
        } else { System.out.println("Numarul nu face parte din sirul lui Fibonacci"); }
    }
}

