package replit;

import java.util.Iterator;
import java.util.TreeSet;

public class Collections_14 {
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>();
        tr.add("yesil");
        tr.add("sari");
        tr.add("mavi");
        tr.add("turuncu");
        tr.add("kirmizi");
        System.out.println("'''");
        System.out.println("Beklenen Cikti:");
        System.out.println("'''");
        System.out.println("'''");
        System.out.println("Orjinal Tree sonucu:"+tr);
        System.out.println("'''");
        System.out.println("'''");
        System.out.println("Tersten Siralanisi:");
        System.out.println("'''");

         Iterator a=tr.descendingIterator();
        while (a.hasNext()) {
            System.out.println("'''");
            System.out.println(""+ a.next());
            System.out.println("'''");
        }
    }
}
