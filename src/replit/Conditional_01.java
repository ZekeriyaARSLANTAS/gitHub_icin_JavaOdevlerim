package replit;

import java.util.Scanner;

public class Conditional_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");

        double sayi=scan.nextDouble();
        if (sayi < 0.0) {
            System.out.println(sayi + " Negatiftir.");
        }else if ( sayi > 0.0) {
            System.out.println(sayi + " Pozitiftir.");
        }  else
            System.out.println(sayi + "  Sıfırdır.");
    }

}

