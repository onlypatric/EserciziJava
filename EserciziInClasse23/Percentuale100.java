/**
 * Percentuale100
 * leggere in input 100 numeri int
 * stampa percentuale di numeri pari e dispari
 */
public class Percentuale100 {

    /**
     * @param start int
     * @param stop int
     * @return random integer between start and stop (start, stop included)
     */
    public final static int randInt(int start,int stop) {
        return (int)(randDouble(start, stop+1));
    }
    /**
     * @param start float
     * @param stop float
     * @return random float between start and stop (start, stop not included)
     */
    public final static float randFloat(float start,float stop) {
        return (float)(randDouble(start, stop));
    }
    /**
     * @param start double
     * @param stop double
     * @return random double between start and stop (start, stop not included)
     */
    public final static double randDouble(double start, double stop) {
        return (start+(Math.random()*(stop-start)));
    }
    public static void main(String[] args) {
        int sPar=0,sDis=0;
        for (int i = 0; i < 100; i++) {
            if(randInt(1, 100)%2==0)sPar++;
            else sDis++;
        }
        System.out.printf("Percentuale pari: %10f\nPercentuale dispari: %10f",(double)sPar/(double)100*100,(double)sDis/(double)100*100);
    }
}