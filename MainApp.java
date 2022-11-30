import pkg.growp.RUtil;

/**
 * HELLO WORLD IN JAVA
 */
public class MainApp {

    public static void main(String[] args) {
        RUtil r = new RUtil();
        System.out.println("Hello world!");
    }
}
class R_Util {
    /**
     * @param null
     * constructor.
     */
    public R_Util() {
    }
    /**
     * @param start int
     * @param stop int
     * @return random integer between start and stop (start, stop included)
     */
    public final int randInt(int start,int stop) {
        return (int)(randDouble(start, stop+1));
    }
    /**
     * @param start float
     * @param stop float
     * @return random float between start and stop (start, stop not included)
     */
    public final float randFloat(float start,float stop) {
        return (float)(randDouble(start, stop));
    }
    /**
     * @param start double
     * @param stop double
     * @return random double between start and stop (start, stop not included)
     */
    public final double randDouble(double start, double stop) {
        return (start+(Math.random()*(stop-start)));
    }
    /**
     * @param array Object[] list of elements, any type of element
     * @return random object present in array
     */
    public final Object randChoice(Object[] array) {
        return array[randInt(0,array.length-1)];
    }
    /**
     * @param s String to transform
     * @return char[] //char array
     */
    public final char[] toCharArray(String s) {
        return s.toCharArray();
    }
    public final int factorial(int n){
        int l = 1;
        for (int i = 1; i <= n; i++) {
            l*=i;
        }
        return l;
    }
    public final double pow(double n,double o){
        return Math.pow(n,o);
    }
    public final int[] range(int a){
        int[] l = new int[a];
        for (int i = 0; i < a; i++) {
            l[i]=i+1;
        }
        return l;
    }
    public final int[] range(int start,int stop){
        int[] l = new int[stop-start];
        for (int i = 0; i < stop-start; i++) {
            l[i]=i+1;
        }
        return l;
    }
    public final void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {}
    }
    public final void print(Object o) {
        System.out.print(o.toString());
    }
    public final void println(Object o){
        System.out.println(o.toString());
    }
    public final void printDioCane(Object o){
        System.out.println(o.toString());
    }
}