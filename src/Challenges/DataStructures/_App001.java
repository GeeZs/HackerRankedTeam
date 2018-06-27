package Challenges.DataStructures;

import java.util.Scanner;

public class _App001 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Declare array a here
        int[] a = new int[n];


        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            // Fill array a here
            a[i] = val;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int anA : a) {
            System.out.println(anA);
        }
    }
}

