package SecondActivity;
import java.util.Scanner;

public class Calculator {


    public int getSum(int a, int b) {

        return a + b;
    }

    public int getDifference(int a, int b){
        return a - b;
    }

    public double getProduct(double a, double b){
        return a * b;
    }

    public double getQuotient(double a, double b){
        return a / b;
    }


    public static void main(String[] args) {
        int x, y, sum, diff, prod, quot;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input

        sum = x + y;
        System.out.println("Sum is: " + sum); // Output user input



        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj1.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj1.nextInt(); // Read user input

        diff = x - y;
        System.out.println("Difference is: " + diff); // Output user input



        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj2.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj2.nextInt(); // Read user input

        prod = x * y;
        System.out.println("Product is: " + prod); // Output user input



        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj3.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj3.nextInt(); // Read user input

        quot = x / y;
        System.out.println("Quotient is: " + quot); // Output user input
    }

}
