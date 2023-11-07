package printprogramme5;

import java.util.ArrayList;

/**
 * Declare following two arraylist and compare it
 */

public class Programme_11_DeclareArrayListAndCompare {

    //main method declared
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        boolean areEqual = c1.equals(c2);
        if (areEqual) {
            System.out.println("ArrayList c1 and c2 are equal ");
        } else {
            System.out.println("ArrayList c1 and c2 are not equal ");
        }
    }
}
