package replit;

import java.util.LinkedList;
import java.util.ListIterator;

public class Collections_07 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("sari");
        llist.add("beyaz");
        llist.add("mavi");
        llist.add("yesil");
        llist.add("turuncu");

        ListIterator li1 = llist.listIterator();
        li1.next();
        System.out.println("Beklenen Cikti :");
        for (int i =0; i < llist.size()-1; i++) {
            System.out.println("''''''");
            System.out.println(li1.next());
            System.out.println("''''''");


        }
    }
}
