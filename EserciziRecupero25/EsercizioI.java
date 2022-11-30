package EserciziRecupero25;

/**
 * EsercizioI
 */
public class EsercizioI {
    public static void main(String[] args) {
        System.out.println("| hex | oct |  binary  | int | char|");
        for (int i = 64; i < 96; i++) {
            System.out.printf(
                "|%5s|%5s|%10s|%5d|%5s|\n",
                Integer.toHexString(i),
                Integer.toOctalString(i),
                Integer.toBinaryString(i),
                i,
                (char)i
            );
        }
    }
}