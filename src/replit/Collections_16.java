package replit;

import java.util.Iterator;

import java.util.TreeSet;

public class Collections_16 {
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>();
        tr.add("yesil");
        tr.add("sari");
        tr.add("mavi");
        tr.add("kirmizi");
        tr.add("pembe");
        System.out.println("'''");
        System.out.println("Orjinal TreeSet:" + tr);
        System.out.println("'''");


        Iterator a = tr.iterator();
        int i = 0;
        while (a.hasNext()) {

            a.next();
            i++;

        }
        System.out.println("'''");
        System.out.println("Tree eleman sayisi:" + i);
        System.out.println("'''");
    }
}
