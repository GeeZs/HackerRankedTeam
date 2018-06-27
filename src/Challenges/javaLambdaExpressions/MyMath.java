package Challenges.javaLambdaExpressions;

import java.math.BigInteger;

class MyMath {
    static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd(){
        return n -> n%2!=0;
    }
    PerformOperation isPrime(){
        return n -> new BigInteger(String.valueOf(n)).isProbablePrime(n);
    }
    PerformOperation isPalindrome(){
        return n -> String.valueOf(n).equals(new StringBuilder(String.valueOf(n)).reverse().toString());
    }
}
