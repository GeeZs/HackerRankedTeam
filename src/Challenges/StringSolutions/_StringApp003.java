package StringChallenge.StringSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _StringApp003 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length
        for (int i = 0; i <= s.length() - k; i++) {
            String sbstr = s.substring(i, i + k);
            if(smallest.isEmpty() || sbstr.compareTo(smallest) < 0){
                smallest = sbstr;
            }
            if(largest.isEmpty() || sbstr.compareTo(largest) > 0){
                largest = sbstr;
            }

        }
        


        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
