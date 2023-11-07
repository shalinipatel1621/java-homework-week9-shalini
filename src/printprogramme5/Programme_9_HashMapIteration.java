package printprogramme5;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer values: And use for each loop
 * to iterate the value from Map
 */

public class Programme_9_HashMapIteration {

    //main method declared
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("John", 10);
        people.put("Jane", 20);
        people.put("Jack", 30);
        people.put("Jay", 40);
        iterateAndPrintValues(people);
    }

    //static method created
    public static void iterateAndPrintValues(Map<String, Integer> map) {
        System.out.println("Values in the map: ");
        for (Integer age : map.values()) {

            System.out.println(age);
        }
    }
}

