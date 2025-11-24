package src.main.com.logesh.recursion.easy;

public class SumOfDDigits {
    public static void main(String[] args) {
        int num=1235;
        System.out.println(sumRec(num));
        }

    private static int sum(int num) {
        int sum=0;
        while(num>0){
            int last=num%10;
            num=num/10;
            sum+=last;
        }
        return sum;
    }
    private static int sumRec(int num) {
        int sum=0;
        if(num<=0){
            return sum;
        }
        return num%10+sumRec(num/10);
    }
}
