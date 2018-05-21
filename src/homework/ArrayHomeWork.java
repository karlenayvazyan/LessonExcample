package homework;

public class ArrayHomeWork {

    public static void main(String[] args) {
        int[] array = getEvenNumbers(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /*
    create int array which will contains even numbers and return that array

     */
    public static int[] getEvenNumbers(int arrayLength) {
        int[] evenNumbers = new int[arrayLength];
        for (int i = 1; i < arrayLength; i++) {
            if (i % 2 == 0) {
                evenNumbers[i]= i;
            }
        }
        return evenNumbers;
    }

    public static boolean isEven(int i) {
        // return true if i is even false otherwise
        return i % 2 == 0 ? true : false;
    }

    /*
    create int array which contains odd numbers and return that array
     */
    public static int[] getOddNumbers(int arrayLength) {
        return new int[arrayLength];
    }
}
