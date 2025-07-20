import java.util.Scanner;

public class Twoarr {
    static  void add(int[][] arr ,int r , int c ){

        for (int i = 0; i <r ; i++) {
            int sum =0;
            for (int j = 0; j < c; j++) {
                sum+=arr[i][j];

            }
            System.out.println("The sum of row  " + (i+1) + " is " + sum);

        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int r = in.nextInt();
        System.out.println("Enter the coloum size");
        int c = in.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enter the elements");
        for (int row = 0; row < c; row++) {
            for (int col = 0; col < c; col++) {
                arr[row][col] =in.nextInt();


            }

        }
        System.out.println("The matrx is :");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();

        }

       add(arr , r , c);
    }
}
