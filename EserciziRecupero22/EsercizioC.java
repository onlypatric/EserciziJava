package EserciziRecupero22;

import java.util.Scanner;

/**
 * EsercizioC
 */
public class EsercizioC {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Inserisci un numero compreso tra 2 e 10 (inclusi 2 e 10): ");
                a=sc.nextInt();
            } catch (Exception e) {a=0;}
        } while (a<2||a>10);
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d x %d = %d\n", a, i, a*i);
        }
        sc.close();
    }
}