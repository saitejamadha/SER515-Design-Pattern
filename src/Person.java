public abstract class Person {

    private ProductMenu theProductMenu;

    void showAddButton() {
        this.theProductMenu.showAddButton();
    }

    void showViewButton() {
        this.theProductMenu.showViewButton();
    }

    void showRadioButton() {
        this.theProductMenu.showRadioButton();
    }

    void showLabels() {
        this.theProductMenu.showLabels();
    }

    abstract void showMenu();

    abstract void createProductMenu();

}
