package homework;

public class Triangle {

    /**
     *    *
     *    **
     *    ***
     *    ****
     */
    public static void a(int n) {

    }

    /**
     *       *
     *      **
     *     ***
     *    ****
     */
    public static void b(int n) {

    }

    /**
     *    ****
     *    ***
     *    **
     *    *
     */
    public static void c(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *     ****
     *      ***
     *       **
     *        *
     */
    public static void d(int n) {

    }
}
