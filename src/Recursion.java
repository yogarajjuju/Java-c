import java.util.Scanner;

public class Recursion {
    static int fact(int n){
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int n = in.nextInt();
        int res = fact(n);
        System.out.println("The factorial of the number is :" + res);
    }
}
