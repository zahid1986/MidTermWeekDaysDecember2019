package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {

        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        a= sc.nextDouble();
        System.out.println("Enter the second no: ");
        b =sc.nextDouble();
        System.out.println("Sum of two no is: " +(a+b));
        System.out.println("subtracting of two no is: " + (a-b));
        System.out.println("multiplying of two no is: "+ (a*b));
        System.out.println("Divison is: " + (a/b));




    }



}
