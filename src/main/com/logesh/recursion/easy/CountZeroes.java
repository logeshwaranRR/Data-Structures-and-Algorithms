package src.main.com.logesh.recursion.easy;

public class CountZeroes {
    public static void main(String[] args) {
        int num=10020;
        System.out.println(num+": "+countZeroes(num,0));
    }

    private static int countZeroes(int num,int count) {
        if(num==0){
            return count;
        }
        int rem=num%10;
        if(rem==0){
            return  countZeroes(num/10,count+1);
        }
        else {
          return countZeroes(num/10,count);
        }
    }
}
