package Praticee;
import java.util.*;
public class Subset {
    public static void main(String[] args) {
        int arr[] ={4,5,6};
        for(int start=0;start<arr.length;start++){
            for(int end =start; end<arr.length;end++){
                for(int i =start; i<=end;i++){
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }
        }
    }
}
