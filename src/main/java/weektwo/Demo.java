package weektwo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //Welcome and capture products

        System.out.println("Welcome to my store! What do you want to buy?");
        String item = userInput.nextLine();
        //Capturing qty

        System.out.println("How many would you like to purchase?");
        int qty = userInput.nextInt();
        //Capturing price

        System.out.println("How much would you like to pay for :" + item);
        int price = userInput.nextInt();

        //Total Calculations
        double total = qty * price;

        //Recepit format
        String title = String.format("%-10s %5s %10s  %10s", "Product", "Qty", "Price", "Total");
        String underlines = String.format("%-10s %5s %10s %10s", "----", "---", "-----", "-----");
        String result = String.format("%-10s %5s %10s %10s", item, qty, price, total);
        System.out.println(title);
        System.out.println(underlines);
        System.out.println(result);
        System.out.println("\n");

        //Capturing Distance and fee conditions
        System.out.println("What is your distance from the store? What is your adress");
        double distance = userInput.nextInt();

        if (distance <= 5) {
            System.out.println("Your total comes to " + total + "Plus a 2 dollar shipping fee");
        } else if (distance > 5 && distance <= 15) {
            System.out.println("Your total comes out to " + total + "Plus a 5 dollar shipping fee");
        } else if (distance > 15 && distance <= 25) {
            System.out.println("Your total comes out to " + total + "Plus a 10 dollar shipping fee");
        } else if (distance > 25 && distance <= 50) {
            System.out.println("Your total comes out to " + total + "Plus a 15 dollar shipping fee");
        } else if (distance > 50) {
            System.out.println("Your total comes out to " + total + "Plus a 20 dollar shipping fee");
        } else {

        }
        System.out.printf("%30s","Thank you. Come Again!!!");
    }
}
