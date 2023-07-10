package Assignment2;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;


        // using logical AND.
        System.out.println("Using logical AND.");
        if(a<b && b>c)
            System.out.println("True");
        else{
            System.out.println("False");
        }

        // using logical OR.
        System.out.println("Using logical OR.");
        if(a<b || b<c)
            System.out.println("True");
        else{
            System.out.println("False");
        }

        // using logical AND.
        System.out.println("Using logical AND.");
        if(a<b && b<c)
            System.out.println("True");
        else{
            System.out.println("False");
        }

        // using logical OR.
        System.out.println("Using logical OR.");
        if(a>b || b<c)
            System.out.println("True");
        else{
            System.out.println("False");
        }
    }
}
