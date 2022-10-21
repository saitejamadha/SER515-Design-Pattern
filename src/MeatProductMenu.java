public class MeatProductMenu implements ProductMenu {

    /**
     * Show Meat Product Menu using Iterator Pattern
     * @param facade Facade
     */
    @Override
    public void showMenu(Facade facade) {
        System.out.println("=========== Iterator Pattern Over ProductList ===========");
        System.out.println("\n#### MEAT PRODUCT MENU ####");
        int num = 1;
        ListIterator iterator = facade.theProductList.getIterator();
        while (iterator.hasNext()) {
            Product p = (Product) iterator.next();
            if (p.getType().equals("Meat")) {
                System.out.println(num + ". " + p.getName());
                num++;
            }
        }
        iterator.moveToHead();
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
