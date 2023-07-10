package Assignment2;

public class ArithmeticOperator {
    public static void main(String[] args) {

    int num1 = 20, num2 = 10;
    int sum,sub,mul,div,mod;

    System.out.println("Arithmetic Operator:");
    // Addition  num1 and num2
    sum = num1 + num2;
    System.out.println("Addition  = " + sum);

    // Subtraction  num1 and num2
    sub = num1 - num2;
    System.out.println("Subtraction = " + sub);

    // multiplication num1 and num2
    mul = num1 * num2;
    System.out.println("Multiplication = " + mul);

    // Division num1 and num2
    div = num1 / num2;
    System.out.println("Division = " + div);

    // Modulus num1 and num2
    mod = num1 % num2;
    System.out.println("Modulus = " + mod);
    }
}
