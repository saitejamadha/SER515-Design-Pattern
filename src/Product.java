public class Product {

    private final String name;
    private final String type;
    private final ClassProductList classProductList;
    private final Trading trading;

    public Product(String type, String name, ClassProductList products) {
        this.type = type;
        this.name = name;
        this.classProductList = products;
        this.trading = new Trading();
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    /**
     * Get trading on this product
     * @return trading for the product
     */
    public Trading getTrading() {
        return this.trading;
    }
}
