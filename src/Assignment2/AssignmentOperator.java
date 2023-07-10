package Assignment2;

public class AssignmentOperator {
    public static void main(String[] args) {
        // initializing variable
        int valueOne=100;

        // Declaring variables
        int valueThree;
        int valueTwo;

        // Assigning value
        valueTwo=50;

        valueThree=valueOne;
        // Displaying the assigned values
        System.out.println("Assign value: "+valueThree);//100

        // Adding & Assigning values
        valueThree+=valueOne;
        // Displaying the assigned values
        System.out.println("Adding value: "+valueThree);//200

        // Subtracting  & Assigning values
        valueThree-=valueOne;
        // Displaying the assigned values
        System.out.println("Subtracting Value: "+valueThree);//100

        // Multiplying  & Assigning values
        valueThree*=valueOne;
        // Displaying the assigned values
        System.out.println("Multiplying value: "+valueThree);//10000

        // Multiplying  & Assigning values
        valueThree/=valueOne;
        // Displaying the assigned values
        System.out.println("Dividing value: "+valueThree);//10

        // Moduling   & Assigning values
        valueThree%=valueOne;
        // Displaying the assigned values
        System.out.println("Moduling value: "+valueThree);//0

    }
}
