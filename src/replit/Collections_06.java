package replit;

import java.util.LinkedList;

public class Collections_06 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("sari");
        ll.add("mavi");
        ll.add("mor");
        ll.add("yesil");
        ll.add("beyaz");
        for (String each : ll) {
            System.out.println("''''''");
            System.out.println(each);
            System.out.println("''''''");
        }
    }
}
