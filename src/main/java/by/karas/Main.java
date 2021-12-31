package by.karas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String inputValue;
        Double[] enteredValues = new Double[4];

        //File for prices
        // Change calc function
        // Change user dialogs

        do {
            if (i == 0) {
                System.out.println("Please, enter distance: ");
            } else if (i == 1) {
                System.out.println("Please, enter price per km: ");
            } else if (i == 2) {
                System.out.println("Please, enter weight: ");
            } else if (i == 3) {
                System.out.println("Please, enter price per kg: ");
            }
            inputValue = scanner.next();

            if (inputValue.equalsIgnoreCase("q")) {
                break;
            } else if(isCorrectDoubleValue(inputValue)){
                enteredValues[i] = Double.parseDouble(inputValue);
                i++;
            } else {
                System.out.println("Incorrect value: " + inputValue);
            }

            if (i == 4) {
                Double result = enteredValues[0] * enteredValues[1] + enteredValues[2] * enteredValues[3];
                System.out.println("Result = " + result);
            }

        } while (i < 4);

    }

    private static boolean isCorrectDoubleValue(String value) {
        boolean checkResult;

        try {
            Double enteredValue = Double.parseDouble(value);
            checkResult = enteredValue >= 0;
        } catch (NumberFormatException ex){
            checkResult = false;
        }
        return checkResult;
    }
}
