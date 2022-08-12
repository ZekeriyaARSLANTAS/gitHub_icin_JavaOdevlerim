package replit;

import java.util.ArrayList;

public class Collections_04 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("sari");
        list.add("yesil");
        list.add("mavi");
        list.add("pembe");
        System.out.println(list);
        list.set(2, "turuncu");
        System.out.println(list);
    }

}
