package PraticQuestion;

import java.util.Scanner;

public class AgeForVote {
    public static void checkForVote(int age){
        if(age >= 18){
            System.out.println("Your age is " + age + " You can Vote..");
        }else {
            System.out.println("Your age is " + age + " You cannot Vote..");
        }
    }

    public static void main(String[] args){
        System.out.print("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        checkForVote(age);
    }
}
