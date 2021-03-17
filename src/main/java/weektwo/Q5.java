package weektwo;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = userInput.nextLine();

        if(userInput.equals("Bob")){

        }else if (userInput.equals("Alice")){

        }else {
            System.out.println("Try again");
        }

        System.out.println("What is your phone number?");
         String number = userInput.nextLine();

        System.out.println("Welcome" + name);
        System.out.println();
    }
}
