package ex4;
import java.util.Scanner;
import java.util.Random;
//pentru v2
import java.util.*;
public class MainApp {

    public static void main(String[] args) {
        //varianta 1//

      int min = 1;
        int max = 30;
        System.out.println("Valoare random de la "+ min + " la " + max + ":");
        int random1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int random2 = (int)Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println("Numerele sunt: " + random1 + " | " + random2);

        //varianta cu nextInt//

        Random random = new Random();

        int next1 = random.nextInt(30); //alegem max 0-30
        int next2 = random.nextInt(30);
        System.out.println("Numerele sunt: " + next1 + " | " + next2);

        //euclid algoritm
        int cmmd = gasesteCMMD(next1, next2);
        System.out.println("Cel mai mare divizor comun al lui " + next1 + " și " + next2 + " este " + cmmd);
    }
    public static int gasesteCMMD(int a, int b){
        if(b == 0){
            return a;
        } return gasesteCMMD(b, a%b);
    }
}

