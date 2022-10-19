public class ProduceProductMenu implements ProductMenu {

    @Override
    public void showMenu() {
        System.out.println("Showing Produce Product Menu");
    }

    @Override
    public void showAddButton() {
        System.out.println("ProduceProductMenu > showAddButton");
    }

    @Override
    public void showViewButton() {
        System.out.println("ProduceProductMenu > showViewButton");
    }

    @Override
    public void showRadioButton() {
        System.out.println("ProduceProductMenu > showRadioButton");
    }

    @Override
    public void showLabels() {
        System.out.println("ProduceProductMenu > showLabels");
    }
}
