public class Product {

    private final String name;
    private final String type;
    private final ClassProductList classProductList;
    private final Trading trading;

    public Product(String type, String name, ClassProductList products) {
        this.type = type;
        this.name = name;
        this.classProductList = products;
        this.trading = new Trading(this);
    }

    /**
     * Get the name of the product.
     * @return The name of the product.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the type of the product.
     * @return The type of the product.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Getters for the product list.
     * @return The product list.
     */
    public ClassProductList getClassProductList() {
        return this.classProductList;
    }

    /**
     * Get trading on this product
     * @return trading for the product
     */
    public Trading getTrading() {
        return this.trading;
    }
}
