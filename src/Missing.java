import java.util.Scanner;

public class Missing {
    static int  findMissing(int[] arr ,int n){
        for(int i = 0; i <n -1; i++) {
            if(arr[i] != i + 1){
                return i+1;
            }}
        return -1;


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        System.out.println("Enter the elements in the array");
        int [] arr= new  int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        int ans = findMissing(arr,n);
        System.out.println(ans);




    }
}
//import java.util.Scanner;

//public class Missing {
//    static int findMissing(int[] arr, int n) {
//        // Compute the expected sum of numbers from 1 to (n+1)
//        int total = (n + 1) * (n + 2) / 2;
//
//        // Compute the actual sum of elements in the array
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//        }
//
//        // The missing number is the difference
//        return total - sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of array (n-1 elements):");
//        int n = in.nextInt();
//        System.out.println("Enter the elements in the array:");
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        int ans = findMissing(arr, n);
//        System.out.println("The missing number is: " + ans);
//    }
//}
