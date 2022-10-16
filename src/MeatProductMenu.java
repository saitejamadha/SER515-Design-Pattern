public class MeatProductMenu implements ProductMenu {

    @Override
    public void showMenu() {
        System.out.println("MeatProductMenu > showMenu");
    }

    @Override
    public void showAddButton() {
        System.out.println("MeatProductMenu > showAddButton");
    }

    @Override
    public void showViewButton() {
        System.out.println("MeatProductMenu > showViewButton");
    }

    @Override
    public void showRadioButton() {
        System.out.println("MeatProductMenu > showRadioButton");
    }

    @Override
    public void showLabels() {
        System.out.println("MeatProductMenu > showLabels");
    }
}
