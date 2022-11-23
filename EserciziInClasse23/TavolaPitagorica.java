package EserciziInClasse23;

/**
 * TavolaPitagorica
 */
public class TavolaPitagorica {
    public static void tavolaPitagorica() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n%s\n","-".repeat(60));
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%5d|",i*j);
            }
        }
    }
    public static void main(String[] args) {
        tavolaPitagorica();
    }
}