package src.main.com.logesh.recursion.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=123;
        System.out.println(reverse(num));
        System.out.println(reverString("abc"));
    }

    private static String reverString(String abc) {
        char[] arr=abc.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr);
    }

    static int sum=0;
    private static int reverse(int num) {
        if(num/10==0){
            return (sum*10)+(num%10);
        }
        sum=(sum*10)+(num%10);
        return reverse(num/10);
    }

}
