package Challenges.javaMap;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String []argh){
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++){
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.nextLine();
            String result = "Not found";
            for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
                if (stringIntegerEntry.getKey().equals(s)){
                    result = stringIntegerEntry.getKey() + "=" + stringIntegerEntry.getValue();
                }
            }
            System.out.println(result);
        }

    }
}
