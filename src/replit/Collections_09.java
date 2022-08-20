package replit;

import java.util.LinkedList;
import java.util.ListIterator;

public class Collections_09 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("sari");
        llist.add("mavi");
        llist.add("yesil");
        llist.add("kirmizi");
        llist.add("beyaz");
        llist.add("mor");
        System.out.println("''''''''");
        System.out.println("Orijinal linked list:"+ llist);
        System.out.println("''''''''");
        System.out.println("LinkedList Tersi:");
        System.out.println("''''''''");
        ListIterator li1 = llist.listIterator();
        while(li1.hasNext()){
            li1.next();
        }
        while(li1.hasPrevious()){
            System.out.println("''''''''");
            System.out.println(li1.previous());
            System.out.println("''''''''");

        }
    }
}
