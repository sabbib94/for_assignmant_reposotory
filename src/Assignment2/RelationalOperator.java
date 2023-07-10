package Assignment2;

public class RelationalOperator {
    public static void main(String[] args) {
        int var1 = 5, var2 = 10;

        // Comparing var1 and var2 and
        // printing corresponding boolean value
        System.out.println("Relational operators: ");
        //Greater than operator
        System.out.println("var1 < var2: " + (var1 < var2));//true
        //Less than operator
        System.out.println("var1 > var2: " + (var1 > var2));//false
        //Greater than or equal to operator
        System.out.println("var1 <= var2: " + (var1 <= var2));//true
        //Less than or equal to operator
        System.out.println("var1 >= var2: " + (var1 >= var2));//false
        //Equal to operator
        System.out.println("var1 == var2: " + (var1 == var2));//false
        //Not equal to Operator
        System.out.println("var1 != var2: " + (var1 != var2));//true
    }
}
