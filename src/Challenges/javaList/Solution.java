package Challenges.javaList;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String query = scanner.next();
            if (query.equals("Insert")){
                L.add(scanner.nextInt(), scanner.nextInt());
            }else if (query.equals("Delete")){
                L.remove(scanner.nextInt());
            }
        }

        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i)+ " ");
        }

    }
}
