public class Product {

    private final ClassProductList classProductList;
    private final Trading trading;

    public Product(ClassProductList products) {
        this.classProductList = products;
        this.trading = new Trading();
    }

    /**
     * Get trading on this product
     * @return trading for the product
     */
    public Trading getTrading() {
        return this.trading;
    }
}
