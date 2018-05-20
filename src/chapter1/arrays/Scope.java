package chapter1.arrays;

public class Scope {

    public static void main(String[] args) {
        int x;

        x = 10;

        if (x == 10) {
            int y = 20;

            System.out.println("x and y: " + x + " " + y);

            x = y * 2;
        }

//        y = 10; // Error

        System.out.println("X is " + x);

//        count = 100;
//
//        int count;
    }
}
