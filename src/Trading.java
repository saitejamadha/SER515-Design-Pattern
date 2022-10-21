import java.util.Date;

public class Trading {

    private final Product product;
    private final Date dueDate;

    public Trading(Product product){
        this.product = product;
        this.dueDate = new Date(new Date().getTime() + 1000*60*5); // set dueDate to 5 minutes later
    }

    /**
     * Accepts the visiting of the given visitor
     * @param visitor An instance of the node visitor.
     */
    void accept(NodeVisitor visitor) {
        visitor.visitTrading(this);
    }

    public Product getProduct() {
        return this.product;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

}
