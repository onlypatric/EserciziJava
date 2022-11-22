package EserciziRecupero21;

import java.util.Scanner;

/**
 * INSERIRE IN INPUT UNA SEQUENZA DI NUMERI CHE DEVE TERMINARE CON ZERO.
 * STAMPARE IL NUMERO DI NUMERI LETTI DA TASTIERA E LA LORO MEDIA ARITMETICA
 */
public class EsercizioA {

    public static void main(String[] args) {

        // crea variabile sc per soddisfare il requisito di "INPUT"
        Scanner sc = new Scanner(System.in);
        // crea n per assegnare quante volte ripetere il ciclo for
        // crea somma per conservare tutti gli input presi
        // crea quantità per capire quanti numeri sono stati presi
        // crea r per una variabile temporanea, che ci servirà nel for
        int n, somma = 0, r;
        // mostrare cosa deve fare l'utente
        System.out.print("Inserire valore n: ");
        // usa nextInt di Scanner per prendere l'input di tipo int
        n = sc.nextInt();
        // ripeti partendo da i = 0 fino a i < n
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    // fai capire all'utente cosa deve fare con print
                    System.out.print("Inserisci numero n"+i+" che finisca con 0: ");
                    r = sc.nextInt(); // questo dovrebbe dare come risultato multiplo di 10 (ovvero che termini con 0)
                    // verifica se l'input è corretto, solo in quel caso esegui il codice seguente a
                    // esso
                    if ((r % 10) == 0) {
                        somma = somma + r;
                        break;
                    }else{
                        System.out.println("Il numero inserito non finisce con 0, si prega di reinserirlo.");
                    }
                } catch (Exception e) {}
            }
        }
        System.out.println("Quantità di numeri inseriti: "+n);
        System.out.println(
            "Media aritmetica fra loro: "
             + 
            (
                (float)somma
                /
                (float)n
            )
        );
    }
}