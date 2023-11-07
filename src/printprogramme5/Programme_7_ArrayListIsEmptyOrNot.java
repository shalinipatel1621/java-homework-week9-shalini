package printprogramme5;

import java.util.ArrayList;

/**
 * WAP to test if an array list is empty or not
 */

public class Programme_7_ArrayListIsEmptyOrNot {

    //main method declared
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        listOne.add(5);
        System.out.println("Is listOne empty?" + isEmpty(listOne));
        System.out.println("Is listTwo empty?" +isEmpty(listTwo));
    }
//static method created
    public static boolean isEmpty(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return true;
        } else {

            //return value
            return false;
        }
    }
}
