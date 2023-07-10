package Assignment2;

public class UnaryOperator {
    public static void main(String[] args) {
        int num = 10;
        int result;

        //Pre-increment operator
        result = ++num;
        System.out.println("Pre-increment operator: "+ result);//11

        //Post-increment operator
        result = num++;
        System.out.println(" Post-increment operator: "+ result);//11

        //Pre-decrement operator
        result = --num;
        System.out.println("Pre-decrement operator: "+ result);//11

        //Post-decrement operator
        result = num--;
        System.out.println("Post-decrement operator: "+ result);//11

    }
}
