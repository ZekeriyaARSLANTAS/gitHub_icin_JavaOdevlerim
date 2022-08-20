package replit;

import java.util.Iterator;
import java.util.TreeSet;

public class Collections_17 {
    public static void main(String[] args) {
        TreeSet<String> tr1 = new TreeSet<>();
        tr1.add("mavi");
        tr1.add("yesil");
        tr1.add("kirmizi");
        tr1.add("sari");
        TreeSet<String> tr2 = new TreeSet<>();
        tr2.add("yesil");
        tr2.add("mavi");
        tr2.add("pembe");
        tr2.add("turuncu");
        System.out.println("'''");
        System.out.println("Beklenen Cikti:");
        System.out.println("'''");
        System.out.println("'''");
        System.out.println("1. TreeSet:"+tr1);
        System.out.println("'''");
        System.out.println("'''");
        System.out.println("'''");
        System.out.println("2. TreeSet:"+tr2);
        System.out.println("'''");
        System.out.println("'''");

        Iterator Itr1 = tr1.iterator();
        Iterator Itr2 = tr2.iterator();
        String str1;
        String str2;
        while(Itr1.hasNext()){
            Itr1.next();



        }
        /*
        while(li1.hasPrevious()){
            System.out.println("''''''''");
            System.out.println(li1.previous());
            System.out.println("''''''''");

        }



         */


    }
}
        /*  ıterotorsz
         TreeSet<String> treeSet1=new TreeSet<>();
  TreeSet<String> treeSet2=new TreeSet<>();

  treeSet1.add("kirmizi");
  treeSet1.add("mavi");
  treeSet1.add("sari");
  treeSet1.add("yesil");

  treeSet2.add("mavi");
  treeSet2.add("pembe");
  treeSet2.add("turuncu");
  treeSet2.add("yesil");

  String control="no";

for (String oute:treeSet1 ){
    for (String ine:treeSet2) {

        if (oute==ine){
            control="yes";
            System.out.println(control);
        }
    }
    if (control=="no"){

        System.out.println(control);
    }
    control="no";
}
         */