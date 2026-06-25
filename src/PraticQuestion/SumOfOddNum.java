package PraticQuestion;

import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args){
        System.out.println("-----------Print Sum Of Odd Number-----------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers = " + sum);

    }
}
