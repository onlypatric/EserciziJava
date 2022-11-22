package EserciziRecupero21;

/**
 * SOMMARE I PRIMI 100 NUMERI NATURALI PARI. STAMPARE LA LORO SOMMA
 */
public class EsercizioB {

    public static void main(String[] args) {

        int r=0;
        int i = 0;
        for (int j = 0; j < 100; j++) {
            i=i+2;
            r+=i;
            
        }
        System.out.println(r);
    }
}