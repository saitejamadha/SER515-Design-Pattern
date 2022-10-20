import java.util.ArrayList;

public class ClassProductList extends ArrayList<Product> {

	private final ProductIterator productIterator;
	private ReminderVisitor reminderVisitor;

	public ClassProductList() {
		this.productIterator = new ProductIterator(this);

		// Construct a new arraylist with 7 products in it.
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();

		this.addAll( new ArrayList<>() {{
			add(product1);
			add(product2);
			add(product3);
			add(product4);
			add(product5);
		}});
	}

	void accept(NodeVisitor visitor) {
	}

	/**
	 * Return an iterator for the ClassProductList.
	 * @return 	An instance of the iterator.
	 */
	public ListIterator getIterator() {
		return this.productIterator;
	}

}
