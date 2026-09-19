package basic_order_system;

import java.util.Scanner;

public class ordering_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char proc,set;
        char[] orders = new char[3];
        double price = 0;
        int orderCount = 0;
        String dine;
        double total = 0;
        
            System.out.println("\tWelcome to Jollibee");

            System.out.println("\nDine in or Take out?");
            dine = sc.nextLine();

        do {
            System.out.println("Set A   Set B   Set C");
            set = sc.nextLine().charAt(0);
            
            
            switch (set) {
                
                case 'a': 
                    System.out.println("Burger, Fries, Ice Cream");
                    System.out.println("P300.00");
                    price = 300.00;
                    break;
                case 'b':
                    System.out.println("Chicken, Burger, Iced Coffee");
                    System.out.println("P230.00");
                    price = 230.00;
                    break;
                case 'c':
                    System.out.println("Burger Steak,Coke float, Fries");
                    System.out.println("P320.00");
                    price = 320.00;                    
                    break;
                default:
                    System.out.println("Error Try again!");
                    price=0;
            }
            if (price > 0) {
            orders[orderCount] = set;
            orderCount++;

    total += price;
}
            total += price;

            System.out.println("\nAdd to Cart? (Y/N)");
            proc = sc.nextLine().charAt(0);
            

        } while (proc == 'Y' || proc == 'y');

        System.out.println("\n===========================");
        System.out.println("Thank you for ordering!");
        System.out.println("order type: " + dine);
        for (int i = 0; i < orderCount; i++) {
             System.out.print("Set " + orders[i]);

            if (i < orderCount - 1) {
            System.out.print(", ");
    }
}

        System.out.println("Total is: " + total);

        sc.close();
    }
}