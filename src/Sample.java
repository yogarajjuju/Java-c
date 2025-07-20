import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n= in.nextInt();
        System.out.println("enter the elements in array:");
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();

        }
    }
}


