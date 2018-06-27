package Challenges.javaMiniMaxSum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println((sum - arr[arr.length-1]) + " " + (sum - arr[0]));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
