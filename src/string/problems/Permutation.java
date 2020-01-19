package string.problems;

public class Permutation {
    /*
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     */

    static void printPermutations(String str, String rest) {

        if (str.length() == 0) {

            System.out.print(rest + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String t = str.substring(0, i) + str.substring(i + 1);
            printPermutations(t, rest + ch);
        }
    }

    public static void main(String[] args) {

        String s = "ABC";
        printPermutations(s, "");
    }
}