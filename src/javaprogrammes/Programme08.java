package javaprogrammes;

/**
 * Display right angle triangle of @ using nested for loops.
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme08 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
