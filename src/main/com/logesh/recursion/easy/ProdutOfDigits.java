package src.main.com.logesh.recursion.easy;

public class ProdutOfDigits {
    public static void main(String[] args) {
        int num=123;
        System.out.println(product(num));
    }

    private static int product(int num) {
        if(num/10==0){
            return num;
        }
        return (num%10) * (product(num/10));
    }
}
