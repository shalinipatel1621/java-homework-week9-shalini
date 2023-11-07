package printprogramme5;

/**
 * WAP to reverse an array of integer values
 */

public class Programme_3_ReverseArrayInteger {

    //main method declared

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array");
        printArray(originalArray);

        int[] reversedArray = reverseArray(originalArray);
        System.out.println("Reversed Array: ");
        printArray(reversedArray);
    }

    //static method created to add the logic
    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }
        return reversedArray;
    }
//static method using for loop
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
