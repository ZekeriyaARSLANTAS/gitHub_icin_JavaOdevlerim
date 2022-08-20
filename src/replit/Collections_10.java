package replit;

import java.util.Collections;
import java.util.LinkedList;

public class Collections_10 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("mavi");
        llist.add("kirmizi");
        llist.add("beyaz");
        llist.add("siyah");
        llist.add("yesil");
        llist.add("turuncu");
        System.out.println("'''''''");
        System.out.println("Orjinal LinkedList :"+ llist);
        System.out.println("'''''''");
        Collections.swap(llist,0,3);
        System.out.println("'''''''");
        System.out.println("Swap sonrasi durum :"+ llist);
        System.out.println("'''''''");

    }
}
