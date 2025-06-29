package src.main.com.logesh.strings;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x =-121;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome2(x));

    }
    public static boolean isPalindrome(int x) {
    String s=Integer.toString(x);
    int start=0;
    int end=s.length()-1;
    while(start<end){
        if(s.charAt(start)==s.charAt(end)){
    start++;
    end--;
        }  else{
    return false;
        }
    }
    return true;
    }

    public static boolean isPalindrome2(int x) {
      if (x<0){
          return false;
      }
      int original=x;
      int reversed=0;
      while(x>0){
          int digit=x%10;
          reversed=reversed*10+digit;
          x=x/10;
      }
      if(original != reversed){
          return false;
      }
      return true;
    }

}
