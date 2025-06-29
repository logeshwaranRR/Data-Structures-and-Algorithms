package src.main.com.logesh.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StackPrac {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.addAll(Arrays.asList(3,4));
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.firstElement());
    }
}
