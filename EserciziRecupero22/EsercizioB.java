package EserciziRecupero22;

/**
 * EsercizioB
 */
public class EsercizioB {

    public static void main(String[] args) {
        int a=1,b=0,s,t=0;
        for (int i = 0; i < 100; i++) {
            s=a+b;
            a=b;
            b=s;
            t+=s;
        }
        System.out.println(t);
    }
}