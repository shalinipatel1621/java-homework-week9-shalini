package printprogramme5;

import java.util.ArrayList;

/**
 * WAP to create a new array list, add some colours(string) and printout the collection using for each loop
 */

public class Programme_4_ArrayListAddColour {
    //declare a main method
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        //add the colours to the list
        colourList.add("Red");
        colourList.add("Black");
        colourList.add("Blue");
        colourList.add("Grey");

        printColours(colourList);


    }
//static method created
    public static void printColours(ArrayList<String> list) {
        System.out.println("Colours in the ArrayList: ");
        for (String colour : list) {
            System.out.println(colour);
        }
    }
}
