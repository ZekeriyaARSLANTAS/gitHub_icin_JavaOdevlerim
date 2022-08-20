package replit;

import java.util.TreeSet;

public class Collections_15 {
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>();
        tr.add("sari");
        tr.add("mavi");
        tr.add("yesil");
        tr.add("kirmizi");
        tr.add("turuncu");
        tr.add("pembe");
        System.out.println("'''");
        System.out.println("Beklenen Cikti:");
        System.out.println("'''");
        System.out.println("'''");
        System.out.println("Orjinal Tree sonucu:"+tr);
        System.out.println("'''");
        System.out.println("'''");
        System.out.println("ilk elemen:"+tr.first());
        System.out.println("'''");
        System.out.println("'''");
        System.out.println("son eleman:"+tr.last());
        System.out.println("'''");


    }
}
