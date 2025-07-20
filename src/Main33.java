import java.util.*;
public class Main33 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int[c][r];
        int [][]b=new int[c][r];
        int [][]arr=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                arr[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
