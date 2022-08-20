package replit;

import java.util.ArrayList;

public class Collections_05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("sari");
        list.add("sari");
        list.add("sari");
        list.add("sari");
        list.add("yesil");
        list.add("mavi");
        list.add("pembe");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("''''''");
            System.out.println(list.get(i));
            System.out.println("''''''");
        }
    }
}

