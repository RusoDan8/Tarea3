package org.example;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args)
    {
        ChilaquilesShop shop = new ChilaquilesShop();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("1. Take Order");
            System.out.println("2. Print Total Sales");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    // Prompt the user for the number of orders
                    System.out.print("Enter the number of chilaquiles orders: ");
                    int quantity = scanner.nextInt();
                    // Call the refactored takeOrder method with the quantity
                    shop.takeOrder(quantity);
                    break;
                case 2:
                    // Print the total sales
                    System.out.printf("Total sales: %.2f%n", shop.getTotalSales());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

    }
}
