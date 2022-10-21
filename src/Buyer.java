import java.util.Scanner;

public class Buyer extends Person {

    @Override
    void showMenu() {

    }

    @Override
    ProductMenu createProductMenu() {
        while (true) {
            System.out.println("\n#### PRODUCT MENU #####");
            System.out.println("1. Meat");
            System.out.println("2. Produce");
            System.out.print("Enter product type: ");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.next());
            if (choice == 1) {
                return new MeatProductMenu();
            } else if (choice == 2) {
                return new ProduceProductMenu();
            } else {
                System.out.println("Invalid product type");
            }
        }
    }

}
