package PraticQuestion;

import java.util.Scanner;

import static java.lang.Math.max;

public class GreaterNum {

    public static int checkGreaterNum(int a, int b){
        int max = max(a, b);
        return max;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("----------Check Greater Number!----------");
        
        System.out.print("Enter First Number:");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        System.out.println("This is the Greater Number between: " + checkGreaterNum(a,b));
    }
}
