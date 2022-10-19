public class Facade {

    private int userType;
    private Product theSelectedProduct;
    private int nProductCategory;
    private ClassProductList theProductList;
    private Person thePerson;

    void login() {
        Login obj = new Login();
        this.userType = obj.getUserType();
    }

    void addTrading() {

    }

    void viewTrading() {

    }

    void viewOffering() {

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
