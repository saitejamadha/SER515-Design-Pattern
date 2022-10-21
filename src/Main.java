import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Facade facade = new Facade();
        boolean isSuccessful = facade.login();
        if (!isSuccessful) {
            return;
        }

        do {
            // Load the product list from the file
            facade.createProductList();

            // Run all product trading reminders
            facade.remind();

            System.out.println("\n");
            System.out.println("#### MAIN MENU #####");
            System.out.println("1. View Product Menu");
            System.out.println("2. View Trading");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.next());

            if (choice == 1) {
                facade.viewOffering();
            } else if (choice == 2) {
                facade.viewTrading();
            } else {
                break;
            }

        } while (true);

    }
}
