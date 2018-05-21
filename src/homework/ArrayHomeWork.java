package homework;

public class ArrayHomeWork {

    public static void main(String[] args) {
        int[] evenNumbers = getOddNumbers(10);
        System.out.println(evenNumbers);
    }

    /*
    create int array which will contains even numbers and return that array
     */
    public static int[] getEvenNumbers(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength * 2; i = i + 2) {
            array[i] = i;
        }
        return array;
    }


    /*
    create int array which will contains even numbers and return that array
     */
    public static int[] getOddNumbers(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 1; i < arrayLength * 2 - 1; i = i + 2) {
            array[i] = i;
        }
        return array;
    }
}

