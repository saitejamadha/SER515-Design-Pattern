import java.util.Scanner;

public class Seller extends Person {

    @Override
    void showMenu() {
        this.theProductMenu.showMenu();
    }

    @Override
    ProductMenu createProductMenu() {
        while (true) {
            System.out.println("Enter product type (meat or produce):");
            Scanner scanner = new Scanner(System.in);
            String productType = scanner.nextLine();
            if (productType.equals("meat")) {
                return new MeatProductMenu();
            } else if (productType.equals("produce")) {
                return new ProduceProductMenu();
            } else {
                System.out.println("Invalid product type");
            }
        }
    }

}
