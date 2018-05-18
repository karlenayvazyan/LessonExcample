public class BoolTest {

    public static void main(String[] args) {
        boolean b;

        b = false;

        System.out.println("b equals " + b);

        b = true;

        System.out.println("b equals " + b);

        if (b)
            System.out.println("This will printed");

        b = false;

        if (b)
            System.out.println("This will not printed");

        System.out.println("10 > 9 is " + (10 > 9));
    }
}
