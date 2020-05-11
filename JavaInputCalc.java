import java.util.Scanner;

public class JavaInputCalc {

    public static void main(String[] args) {
        Scanner scFirst = new Scanner(System.in);
        System.out.println("Please input your first number: ");
        double firstNumber = scFirst.nextDouble();

        Scanner scSecond = new Scanner(System.in);
        System.out.println("Please input your second number: ");
        double secondNumber = scSecond.nextDouble();

        System.out.println("Your first number is: " + firstNumber);
        System.out.println("Your second number is: " + secondNumber);

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;

        Scanner scOperator = new Scanner(System.in);
        System.out.println("Please select the operation you wish to perform (+,-,*,/): ");
        String operatorSelect = scOperator.nextLine();

        if (operatorSelect.equals("+")) {
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
        } else if (operatorSelect.equals("-")) {
            System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is " + difference);
        } else if (operatorSelect.equals("*")) {
            System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + product);
        } else if (operatorSelect.equals("/")) {
            System.out.println("The quotient of " + firstNumber + " and " + secondNumber + " is " + quotient);
        } else {
            System.out.println("You did not select a valid operator (+,-,*,/)");
        }
    }
}
