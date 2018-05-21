package homework;

public class Triangle {
    public static void main(String args[]) {
//        a(3);
//        b(3);
//        c(3);
        d(3);
    }

    /**
     * *
     * **
     * ***
     * ****
     */
    public static void a(int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *    *
     *   **
     *  ***
     * ****
     */
    public static void b(int n) {
        for(int i = 0; i < n + 1; i++) {
            for(int j = n; j > i; j--)  {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * ****
     * ***
     * **
     * *
     */
    public static void c(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * ****
     * ***
     * **
     * *
     */
    public static void d(int n) {
        for(int i = 0; i < n + 1; i++ ){
            for(int j = n; j > i; j--)
                System.out.print("*");
            System.out.println("");
        }
    }
}
