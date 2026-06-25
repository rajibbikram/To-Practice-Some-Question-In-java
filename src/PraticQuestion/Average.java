package PraticQuestion;

import java.util.Scanner;

public class Average {
    public static int calAverage(int a, int b, int c){
        int avg = (a + b + c )/ 3;
        return avg;
    }

    public static void main(String[] args){
        System.out.println("Print Average of Three number!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number:");
        int a = sc.nextInt();

        System.out.print("Enter Second number:");
        int b = sc.nextInt();

        System.out.print("Enter Third number:");
        int c = sc.nextInt();

        System.out.println("Average of Three Number is:" + calAverage(a,b,c) );
    }
}
