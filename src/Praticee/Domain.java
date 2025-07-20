package Praticee;
import java.util.*;
public class Domain {
    public static void main(String[] args) {
String domain= "https://www.google.com/search";
//String res = domain.substring(12,19);
        int start = domain.indexOf("www.")+4;
        int end = domain.indexOf(".com");
        String res = domain.substring(start, end);
        System.out.println(res);

    }
}
