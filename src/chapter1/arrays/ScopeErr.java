package chapter1.arrays;

public class ScopeErr {

    public static void main(String[] args) {
        int bar = 1;
        {
//            int bar = 2;
        }
    }
}
