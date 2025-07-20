package Praticee;
import java.util.*;
public class MID3 {
    public static void main(String[] args) {
        String str = "abcdefg   ";
        int mid = str.length()/2;
        int start = mid-1, end = mid+2;
        String ans = str.substring(start, end);
        System.out.println(ans);



    }
}
