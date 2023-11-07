package printprogramme5;

import java.util.ArrayList;

/**
 * WAP to retrieve an elements from a given array list
 */

public class Programme_6_RetrieveAnElement {
    //main method declared
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Budapest");
        cityList.add("Paris");
        cityList.add("Hoi An");
        cityList.add("New York");

        int elementToRetrieve = 3;
        retrieveAndPrintCityList(cityList, elementToRetrieve);
    }
//static method created
    public static void retrieveAndPrintCityList(ArrayList<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            String city = list.get(index);
            System.out.println("City at index " + index + " : " + city);
        } else {
            System.out.println(("Invalid index. Should be between 0 and " + (list.size() - 1)));
        }
    }
}
