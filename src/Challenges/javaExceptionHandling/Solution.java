package Challenges.javaExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(x/y);
        }catch (InputMismatchException ex){
            System.out.println(ex.getClass().toString().substring(6));
        }catch (ArithmeticException exception){
            System.out.println(exception);
        }
    }
}
