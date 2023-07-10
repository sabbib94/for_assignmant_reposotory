package Assignment2;

import java.util.Arrays;

public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10, max,min;
        boolean condition = true;

        System.out.println("Ternary Operator:");
        // Largest among n1 and n2
        max = (num1 > num2) ? num1 : num2;
        // Print the largest number
        System.out.println("Maximum number is = " + max);

        // Smallest among n1 and n2
        min = (num1 < num2) ? num1 : num2;
        // Print the largest number
        System.out.println("Minimize number is = " + min);

//        boolean condition
        String result = (condition) ? "True" : "False";
        System.out.println("Boolean result is: "+result);
    }
}
