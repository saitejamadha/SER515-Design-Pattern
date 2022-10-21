public class ProduceProductMenu implements ProductMenu {


    @Override
    public void showMenu(Facade facade) {
        // TODO: Iterator pattern
        System.out.println("#### PRODUCE PRODUCT MENU ####");
        int num = 1;
        ListIterator iterator = facade.theProductList.getIterator();
        while (iterator.hasNext()) {
            Product p = (Product) iterator.next();
            if (p.getType().equals("Produce")) {
                System.out.println(num + ". " + p.getName());
                num++;
            }
        }
        iterator.moveToHead();
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
