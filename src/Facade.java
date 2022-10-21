import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Facade {

    private int userType;
    private String username;
    private Product theSelectedProduct;
    private int nProductCategory;
    public ClassProductList theProductList;
    private Person thePerson;

    public Facade() {
        System.out.println("=========== Facade Pattern ===========");
    }

    boolean login() {
        Login obj = new Login();
        boolean isSuccessful = obj.login();
        if (isSuccessful) {
            this.userType = obj.getUserType();
            this.username = obj.getUsername();
            this.thePerson = this.userType == 0 ? new Buyer() : new Seller();
        }
        System.out.println("=========== Logged in with Bridge Pattern ===========");
        return isSuccessful;
    }

    void addTrading() {
    }

    void viewTrading() throws IOException {
        File file = new File("./database/UserProduct.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        StringBuilder productsBidding = new StringBuilder();
        while ((st = br.readLine()) != null) {
            String[] split = st.split(":");
            if (split[0].equals(this.username)) {
                productsBidding.append(split[1]).append(", ");
            }
        }

        System.out.println("Products you are bidding for: " + productsBidding);
    }

    void viewOffering() {
        ProductMenu productMenu = thePerson.createProductMenu();
        productMenu.showMenu(this);
    }

    void markOffering() {

    }

    void submitOffering() {

    }

    /**
     * Display all trading reminders
     */
    void remind() {
        Reminder theReminder = Reminder.getInstance();
        theReminder.showReminders(theProductList);
    }

    void createUser(UserInfoItem userinfoItem) {

    }

    /**
     * Load the product list from the file
     */
    void createProductList() {
        this.theProductList = new ClassProductList();
        this.theProductList.loadFromFile();
    }

    void addProductToUser() {

    }

    Product selectProduct() {
        return null;
    }


}
