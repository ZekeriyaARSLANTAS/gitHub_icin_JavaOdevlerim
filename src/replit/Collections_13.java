package replit;

import java.util.TreeSet;

public class Collections_13 {
    public static void main(String[] args) {


        TreeSet<String> tr = new TreeSet<>();
        tr.add("yesil");
        tr.add("mavi");
        tr.add("kirmizi");
        tr.add("sari");
        tr.add("beyaz");
        tr.add("siyah");
        System.out.println("TreeSet elemanlari:");
        System.out.println(tr);
        System.out.println("''''");
        System.out.println("Beklenen Cikti:");
        System.out.println("''''");
        for (String i : tr) {
            System.out.println("''''");
            System.out.println(i);
            System.out.println("''''");
        }
    }
}
