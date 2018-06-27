package Challenges.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class _App004 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int col = 0; col < d; col++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }
        int arrSize = scan.nextInt();
        for (int i = 0; i < arrSize; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            ArrayList<Integer> list = lists.get(a-1);
            if (b <= list.size()) {
                System.out.println(list.get(b-1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}
