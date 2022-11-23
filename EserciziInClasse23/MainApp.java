
import java.util.Scanner;

/**
 * EsercizioA
 */
public class MainApp {

    public static void main(String[] args) {
        // inserimento tipo int
        int a;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Inserisci un numero compreso tra 1 e 10 (inclusi 1 e 10): ");
                a=sc.nextInt();
            } catch (Exception e) {a=0;}
        } while (a<1||a>10);
        for (int i = 1; i <=10; i++) {
            System.out.format("%d x %d = %d\n", a, i, a*i);
        }
        sc.close();
    }
}
