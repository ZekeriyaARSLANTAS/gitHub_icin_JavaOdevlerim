package replit;

import java.util.LinkedList;
import java.util.ListIterator;

public class Collections_08 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("sari");
        llist.add("mavi");
        llist.add("turuncu");
        llist.add("siyah");
        llist.add("yesil");
        llist.add("beyaz");

        ListIterator li1 = llist.listIterator();
        System.out.println("Orjinal list elemanlari : " + llist);
        System.out.println("''''");
        System.out.println("Listeni ilk elemani : " + llist.getFirst());
        System.out.println("''''");
        System.out.println("''''");
        System.out.println("Listenin son elemani : " + llist.getLast());
        System.out.println("''''");
    }
}
