package Function;

import java.util.Scanner;

public class main {
    public static void printName(String name){
        System.out.println("Hello " + name + " Where are you From?");
        return;
    }
    public static void printAdd(String address){
        System.out.println("Ok, and you From " + address + ", and What are you doing Now?");
        return;
    }
    public static void main(){
        System.out.print("Enter your name:");
        Scanner cs = new Scanner(System.in);
        String name = cs.nextLine();
        printName(name);
        System.out.println();

        System.out.print("Enter your Address: ");
        String address = cs.nextLine();
        printAdd(address);

    }
}
