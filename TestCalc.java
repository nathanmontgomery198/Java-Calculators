package Practical02;

public class TestCalc {

    public static void main(String[] args) {
        double number1 = 10;
        double number2 = 5;
        double sum, difference, product, quotient, power;

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        power = Math.pow(number1, number2); //powers using a math function

        //powers using a while loop
        int base = 10, exponent = 5;

        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Mathematical Operators");
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
        System.out.println("The difference of " + number1 + " and " + number2 + " is " + difference);
        System.out.println("The product of " + number1 + " and " + number2 + " is " + product);
        System.out.println("The quotient of " + number1 + " and " + number2 + " is " + quotient);
        System.out.println("The power of (using Math function) " + number1 + " and " + number2 + " is " + power);
        System.out.println("The power of " + number1 + " and " + number2 + " is " + result);
    }
}
