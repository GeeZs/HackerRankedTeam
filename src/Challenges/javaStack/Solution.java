package Challenges.javaStack;

import java.util.Scanner;
import java.util.Stack;

class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }

    }
    static boolean isBalanced(String in)
    {
        Stack<Character> st = new Stack<Character>();

        for(char chr : in.toCharArray())
        {
            switch(chr) {

                case '{':
                case '(':
                case '[':
                    st.push(chr);
                    break;

                case ']':
                    if(st.isEmpty() || st.pop() != '[')
                        return false;
                    break;
                case ')':
                    if(st.isEmpty() || st.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop() != '{')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
}