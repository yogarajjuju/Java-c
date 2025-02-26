import java.util.Scanner;

public class Miss {
    static int find(int[] arr , int n){
        int exp = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]-i!=exp){
                return exp +i;
            }


        }
       return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr [] = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        int ans = find(arr, n);
        System.out.println(ans);

    }
}
