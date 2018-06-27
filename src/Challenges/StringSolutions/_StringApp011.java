package StringChallenge.StringSolutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _StringApp011 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            boolean flag = false;
            Pattern ptr = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher mtch = ptr.matcher(line);
            while (mtch.find()){
                System.out.println(mtch.group(2));
                flag = true;
            }
            if (!flag){
                System.out.println("None");
            }


            testCases--;
        }
    }
}
