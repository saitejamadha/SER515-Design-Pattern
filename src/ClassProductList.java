import java.util.ArrayList;

public class ClassProductList extends ArrayList<Product> {

	private final ProductIterator productIterator;
	private ReminderVisitor reminderVisitor;

	public ClassProductList() {
		this.productIterator = new ProductIterator(this);

		// Construct a new arraylist with 7 products in it.
		Product product1 = new Product(this);
		Product product2 = new Product(this);
		Product product3 = new Product(this);
		Product product4 = new Product(this);
		Product product5 = new Product(this);

		this.addAll( new ArrayList<>() {{
			add(product1);
			add(product2);
			add(product3);
			add(product4);
			add(product5);
		}});
	}

	/**
	 * Accepts the visiting of the given visitor
	 * @param visitor An instance of the node visitor.
	 */
	public void accept(NodeVisitor visitor) {
		for (Product product : this) {
			visitor.visitProduct(product);
		}
	}

	/**
	 * Return an iterator for the ClassProductList.
	 * @return 	An instance of the iterator.
	 */
	public ListIterator getIterator() {
		return this.productIterator;
	}

}
