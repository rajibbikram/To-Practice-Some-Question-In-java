package Calculater;

import java.util.Scanner;

public class Calculater {

    public static int calculateNum(int a, int b, char c) {
               int result;

               if (c == '+') {
                   result = a + b;
               } else if (c == '-') {
                   result = a - b;
               } else if (c == '*') {
                   result = a * b;
               } else if (c == '/') {
                   result = a / b;
               } else {
                   System.out.println("Invalid Symbol");
                   return 0;
               }
               System.out.println(result);
               return result;
    }
    public static void main() {
        System.out.println("----------------------Calculate Here----------------------");
        System.out.println("Enter any symbol(-,/,+,*) What you want to do!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First value:");
        int a = sc.nextInt();
        System.out.print("Enter Second value:");
        int b = sc.nextInt();
        System.out.print("Enter any symbol(-,/,+,*) What you want to do:");
        char c = sc.next().charAt(0);
        double sum = Calculater.calculateNum(a,b,c);
        System.out.println("This is sum value of a and b: " + sum );
    }
}
