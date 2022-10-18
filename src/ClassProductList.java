import java.util.ArrayList;

public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;
	private ReminderVisitor reminderVisitor;
	private Product[] product;

	void accept(NodeVisitor visitor) {
	}

}
