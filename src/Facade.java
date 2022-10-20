import java.util.Scanner;

public class Facade {

    private int userType;
    private Product theSelectedProduct;
    private int nProductCategory;
    public ClassProductList theProductList;
    private Person thePerson;

    boolean login() {
        Login obj = new Login();
        boolean isSuccessful = obj.login();
        if (isSuccessful) {
            this.userType = obj.getUserType();
            this.thePerson = this.userType == 0 ? new Buyer() : new Seller();
        }
        return isSuccessful;
    }

    void addTrading() {
    }

    void viewTrading() {

    }

    void viewOffering() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nSelect the product category:");
        System.out.println("0: Produce");
        System.out.println("1: Meat");
        nProductCategory = scan.nextInt();
        scan.nextLine();
        ProductMenu theProductMenu = nProductCategory == 0 ? new ProduceProductMenu() : new MeatProductMenu();
        theProductMenu.showMenu();
    }

    void markOffering() {

    }

    void submitOffering() {

    }

    void remind() {

    }

    void createUser(UserInfoItem userinfoItem) {

    }

    void createProductList() {

    }

    void addProductToUser() {

    }

    Product selectProduct() {
        return null;
    }

    void productOperation() {

    }

}
