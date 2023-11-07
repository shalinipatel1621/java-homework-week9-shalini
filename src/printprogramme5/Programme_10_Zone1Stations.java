package printprogramme5;

import java.util.HashMap;
import java.util.Scanner;

/**
 * WAP that tells you which line passes through particular stations. Just use Zone 1 stations name
 */

public class Programme_10_Zone1Stations {
    //main method created

    public static void main(String[] args) {
        HashMap<String, String> stationLines = new HashMap<>();
        initialStationLines(stationLines);

//scanner used to input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Zone 1 station name: ");
        String stationName = scanner.nextLine();
        String lines = findTubeLines(stationLines, stationName);
        if (lines != null) {
            System.out.println("The following lines pass through " + stationName + " : " + lines);
        } else {
            System.out.println("The station " + stationName + " is not in Zone 1");
            scanner.close();
        }
    }

    private static void initialStationLines(HashMap<String, String> stationLines) {
        stationLines.put("Embankment", "Bakerloo, Circle, District, Northern");
        stationLines.put("London Bridge", "Jubilee, Northern");
        stationLines.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo % City");
    }

    private static String findTubeLines(HashMap<String, String> stationLines, String stationName) {
        if (stationLines.containsKey(stationName)) {
            return stationLines.get(stationName);
        }
        return null;
    }


}

