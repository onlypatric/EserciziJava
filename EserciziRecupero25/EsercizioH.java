package EserciziRecupero25;


import java.util.Scanner;

/**
 * DATO IL TEMPO IN SECONDI !( t>0 && t <= 1000000) 
 * CONVERTIRE IL TEMPO NELLA FORMA : hh:mm:ss (ora, minuti, secondi). 
 * STAMPARE IL RISULTATO NELLA FORMA hh:mm:ss
 */
public class EsercizioH {
    public static void main(String[] args) {
        int t=0;
        int h=0,m=0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Inserire tempo in secondi: ");
                t=sc.nextInt();
            } catch (Exception e) {}
        } while (t<=0 || t > 1000000);

        System.out.printf("%2dh:%2dm:%2ds",t/3600,t%3600/60,t%60);
    }
}