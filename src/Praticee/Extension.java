package Praticee;
import java.util.*;

public class Extension {
    public static void main(String[] args) {
        String  str ="report.pdf";
        int last = str.lastIndexOf('.');
        String ans = str.substring(last+1);
        System.out.println(ans);
    }
}
