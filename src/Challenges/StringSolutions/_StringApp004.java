package StringChallenge.StringSolutions;

import java.util.Scanner;

public class _StringApp004 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = new StringBuilder(A).reverse().toString();
        if(A.compareTo(B) == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
