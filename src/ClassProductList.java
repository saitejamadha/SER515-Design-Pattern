import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ClassProductList extends ArrayList<Product> {

	private final ProductIterator productIterator;
	private ReminderVisitor reminderVisitor;

	public ClassProductList() {
		this.productIterator = new ProductIterator(this);
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

	public void loadFromFile() {
		File file = new File("./database/ProductInfo.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] split = line.split(":");
				this.add(new Product(split[0], split[1], this));
			}
		} catch (IOException e) {
			System.out.println("Failed to read ProductInfo.txt");
			e.printStackTrace();
		}
	}

}
