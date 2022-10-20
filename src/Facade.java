import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
        ProductMenu productMenu = thePerson.createProductMenu();
        productMenu.showMenu(this);
    }

    void markOffering() {

    }

    void submitOffering() {

    }

    void remind() {

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

    void productOperation() {

    }

}
