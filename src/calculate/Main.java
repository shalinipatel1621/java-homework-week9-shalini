package calculate;

import java.util.Scanner;

/**
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 *
 */

public class Main {
    //main method declared
    public static void main(String[] args) {
        //scanner method used to input data
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char moreCalculation = 'Y';
        while (moreCalculation == 'Y' || moreCalculation == 'y') {
            System.out.println("Enter first number: ");
            int number = scanner.nextInt();
            System.out.println("Enter second number: ");
            int number2 = scanner.nextInt();
            System.out.println("Please enter one of symbol +, -, *, /");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(number, number2, symbol);
            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            moreCalculation = scanner.next().charAt(0);
        }
        System.out.println("Program Terminated");
        //scanner closed
        scanner.close();
    }
}


