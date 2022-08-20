package replit;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections_11 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("sari");
        hs.add("mavi");
        hs.add("kirmizi");
        hs.add("yesil");
        hs.add("mor");
        System.out.println("");
        System.out.println(hs);
        System.out.println("''''");
        System.out.println("TreeSet elements: ");
        System.out.println("''''");
        TreeSet<String>tr=new TreeSet<>(hs);

        for (String i : tr) {
            System.out.println("''''");
            System.out.println(i);
            System.out.println("''''");
        }
    }
}
