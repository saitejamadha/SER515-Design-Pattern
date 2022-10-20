import java.util.ArrayList;

public class ClassProductList extends ArrayList {

	private final ProductIterator productIterator;
	private ReminderVisitor reminderVisitor;
	private Product[] product;

	public ClassProductList() {
		this.productIterator = new ProductIterator(this);
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
