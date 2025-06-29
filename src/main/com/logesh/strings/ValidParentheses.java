package src.main.com.logesh.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses{
    public static void main(String[] args) {
        String s = "[";
        System.out.println(isValid(s));

    }

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        ArrayList<Character> opn  = new ArrayList<>(Arrays.asList('{', '(', '['));
        ArrayList<Character> cls= new ArrayList<>(Arrays.asList('}', ')', ']'));
        for(Character c :s.toCharArray()){
            if(opn.contains(c)){
                st.push(c);
            }
            if(cls.contains(c)){
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(c=='}' && top != '{'){
                    return false;
                }
                if(c==')' && top != '('){
                    return false;
                }
                if(c==']' && top != '['){
                    return false;
                }

            }


        }
        return st.isEmpty();

    }
}
