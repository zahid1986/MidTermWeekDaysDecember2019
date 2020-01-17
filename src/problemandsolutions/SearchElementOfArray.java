package problemandsolutions;

import java.util.Scanner;

public class SearchElementOfArray {
// By using the sequential search algorithm,
// write a Java program to search for an element of an integer array of 10 elements.

   public static String sequrntialSearch() {
        String a="Number Found in the Array";
        String b="Number not Found in the Array";
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number that you want to search");
        int num=s.nextInt();

        for(int ele:arr) {
            if (ele==num) {
                return a;
            }
        }

        return b;
    }
    public static void main(String[] args) {
        System.out.println(sequrntialSearch());
    }
}