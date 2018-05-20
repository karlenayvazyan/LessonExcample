package chapter1.arrays;

public class TwoDArray {

    public static void main(String[] args) {
        int twoD[][] = new int[4][5];

        int k = 0;

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
