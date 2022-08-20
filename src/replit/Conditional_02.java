package replit;

import java.util.Scanner;

public class Conditional_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );
    }
}

                /*
                 Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
           System.out.println("'''");
         if  (number1 != number2){
            System.out.println(number1 + " != " + number2);
        }   if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
         } if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
         }  if (number1 >= number2) {
            System.out.println(number1 + " => " + number2);
        } if (number1 <= number2) {
            System.out.println(number1 + " <= " + number2);
        }  if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        }System.out.println("'''");
                 */
