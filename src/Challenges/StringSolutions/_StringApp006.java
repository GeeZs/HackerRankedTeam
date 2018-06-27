package StringChallenge.StringSolutions;

import java.util.Scanner;

public class _StringApp006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();


        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String [] words = s.split("[^a-zA-Z]+");


        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
