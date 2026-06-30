package PraticQuestion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println("----------Find the Power----------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        System.out.println("Power = " + result);

    }
}
