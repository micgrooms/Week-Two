package weektwo;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Question 1
        System.out.println("What do you think of the weather?");
        String High = userInput.nextLine();
        {
            System.out.println("Sunblock may be required");
        }
        String Low = userInput.nextLine();
        {
            System.out.println("A coat may be needed");
        }
        String humid = userInput.nextLine();
        {
            System.out.println("It's muggy!");
        }
    }
}
