package printprogramme5;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4,7 and 8 to Sets. Show which numbers between 1 and 10 are
 * are in the set.
 */

public class Programme_8_HashSetIntegerObject {

    //main method declared
    public static void addNumbers(HashSet<Integer> set) {
        System.out.println("Number between 1 and 10 that are in the set: ");
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is in the set ");
            } else {
                System.out.println(i + " is not in the set");
            }

        }

    }
//static method created
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        addNumbers(numberSet);
        scanner.close();
    }
}

