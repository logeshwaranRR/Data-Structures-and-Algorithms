package src.main.com.logesh.recursion.easy;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = findNthFibo(5);
        System.out.println(ans);
    }

    private static int findNthFibo(int n) {
        if(n==1 || n==2){
            return n-1;
        }
        return findNthFibo(n-1)+ findNthFibo(n-2);
    }
}
