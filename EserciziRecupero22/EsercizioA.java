package EserciziRecupero22;

import java.util.Scanner;

/**
 * EsercizioA
 */
public class EsercizioA {

    public static void main(String[] args) {
        int a,r=0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Inserisci un numero compreso tra 2 e 10 (inclusi 2 e 10): ");
                a=sc.nextInt();
            } catch (Exception e) {a=0;}
        } while (a< -1000||a>100000);
        while (a%2==0) {r++;a/=2;}
        System.out.printf("il numero inserito e' divisibile per %d volte\n",r);
        sc.close();
    }
}