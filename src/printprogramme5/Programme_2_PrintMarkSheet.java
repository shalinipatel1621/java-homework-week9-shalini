package printprogramme5;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme using if else and while loop
 */


public class Programme_2_PrintMarkSheet {


    //declaring main method


    //declaring variables as static, to use in other methods
    static String name;
    static String rollNo;
    static int maths;
    static int science;
    static int english;
    static int total;
    static double percentage;
    static String result;
    static String grade;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char anotherOperation = 'Y';

        while (anotherOperation == 'Y' || anotherOperation == 'y') {
            System.out.println("Please enter Student Name and Roll no:");
            name = scanner.nextLine();
            rollNo = scanner.nextLine();
            System.out.println("Please enter marks in following subjects: ");
            System.out.println("Maths: ");
            maths = scanner.nextInt();
            System.out.println("Science: ");
            science = scanner.nextInt();
            System.out.println("English: ");
            english = scanner.nextInt();
            validEntry();
            passOrFail();
            gradecalculator();
            System.out.println("Would you like to perform another operation? Y or N :");
            anotherOperation = scanner.next().charAt(0);
            scanner.close();

        }


    }


    //method to check valid entry
    public static void validEntry() {
        if ((maths < 0 || maths > 100) || (science < 0 || science > 100) || (english < 0 || english > 100)) {
            System.out.println("Invalid input, Marks should be between 0 and 100");
        } else {
            System.out.println("Calculating final result..");
        }
    }

    //method to check pass or fail
    public static void passOrFail() {
        if (maths < 35 || science < 35 || english < 35) {
            result = "Fail";
        } else {
            result = "Pass";
        }
    }

    //method to calculate grade and result
    public static void gradecalculator() {
        total = maths + science + english;
        percentage = (total) / 3;
        if (percentage >= 80) {
            // = "Pass";
            grade = "A+";
        } else if (percentage < 80 && percentage >= 60) {
            //result = "Pass";
            grade = "A";
        } else if (percentage < 60 && percentage >= 50) {
            // result = "Pass";
            grade = "B";
        } else if (percentage < 50 && percentage >= 35) {
            //result = "Pass";
            grade = "C";
        } else {
            // result = "Fail";
            grade = "Nil";
        }
        System.out.println(result + " " + grade);
        printResult();
    }


    public static void printResult() {

        System.out.println("-------------------------------------");
        System.out.println("|                                    |");
        System.out.println("|   Mark Sheet                       |");
        System.out.println("|------------------------------------|");
        System.out.println("| Name   :    " + name + "                        |");
        System.out.println("|Roll no :    " + rollNo + "            |");
        System.out.println("|------------------------------------|");
        System.out.println("| Subjects    :    Marks             |");
        System.out.println("|------------------------------------|");
        System.out.println("| Maths   :   " + maths + "                        |");
        System.out.println("| Science   :   " + science + "                       |");
        System.out.println("| English   :   " + english + "                       |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Total    : " + total + "|");
        System.out.println("|----------------------------------------|");
        System.out.println("| Percentage : " + percentage + "%" + "|");

        System.out.println("| Result:      " + result + "                      |");
        System.out.println("| Grade:       " + grade + "                         |");
        System.out.println("|----------------------------------------|");
    }
}
