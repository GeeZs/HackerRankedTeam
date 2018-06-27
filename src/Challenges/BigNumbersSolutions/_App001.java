package StringChallenge.BigNumbersSolutions;

import java.math.BigInteger;
import java.util.Scanner;

public class _App001 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger A = new BigInteger(scanner.next());
        BigInteger B = new BigInteger(scanner.next());

        BigInteger sum = A.add(B);
        BigInteger prod = A.multiply(B);

        System.out.println(sum);
        System.out.println(prod);
    }
}
