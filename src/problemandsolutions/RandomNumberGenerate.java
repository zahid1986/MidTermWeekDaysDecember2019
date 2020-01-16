package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {
        Random rd = new Random();
        int lastNo =8;
        int randomNumber = rd.nextInt(lastNo);
        System.out.println("Random number is: " + (randomNumber+1));

    }



}
