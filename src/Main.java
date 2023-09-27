import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverse(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = array[length - 1 - i];
        }

        return reversed;
    }
}