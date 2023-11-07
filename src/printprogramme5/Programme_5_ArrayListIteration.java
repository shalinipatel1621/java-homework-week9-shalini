package printprogramme5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * WAP to iterate through all elements in an array list using Iterater
 */

public class Programme_5_ArrayListIteration {

    //main method declared
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Chemistry");
        list.add("Biology");
        list.add("Microbiology");
        list.add("Haematology");
        iterateElements(list);
    }

//static method created
    public static void iterateElements(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }
}
