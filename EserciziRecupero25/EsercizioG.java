package EserciziRecupero25;

import java.util.Scanner;

/**
 * COSTRUIRE UN PROGRAMMA CHE DATA LA TEMPERATURA IN GRADI CELSIUS LA CONVERTA IN GRADI KELVIN E Fahrenheit.
 * LA T DEVE ESSERE COMPRESA TRA - 273 E 10000 GRADI C. UTILIZZARE IL TRY AND CATCH
 */
public class EsercizioG {

    public static void main(String[] args) {
        double ins=-274,risultato_kelvin,risultato_farenheit;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Inserisci temperatura in Celsius: ");
                ins=Double.parseDouble(sc.nextLine());
            } catch (Exception e) {}
        } while (ins<-273.15||ins>10000);
        risultato_kelvin=ins+273.15;
        risultato_farenheit=ins*9/5+32;
        System.out.printf("Kelvin: %20f\nFarenheit: %20f",risultato_kelvin,risultato_farenheit);
    }
}