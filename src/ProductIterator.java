public class ProductIterator implements ListIterator {

	private final ClassProductList classProductList;
	private int index;

	public ProductIterator(ClassProductList prodList) {
		System.out.println("Initializing ProductIterator...");
		classProductList = prodList;
		index = 0;
	}

	/**
	 * Check if there is a next item in the list.
	 * @return true if there is a next item in the list, false otherwise.
	 */
	public boolean hasNext() {
		boolean result = false;
		if (this.index < classProductList.size()) {
			result = true;
		}
		return result;
	}

	/**
	 * Get the next item from the list
	 * @return the next product
	 */
	public Product next() {
		Product product = null;
		if (this.hasNext()) {
			product = classProductList.get(index);
		}
		index ++;
		return product;
	}

	/**
	 * Set the current item to the location before the first item
	 */
	public void moveToHead() {
		Product current = classProductList.get(index);
		this.index = classProductList.indexOf(current) - 1;
	}

	/**
	 * Remove current item from the list
	 */
	public void remove() {
		classProductList.remove(index);
		index = index - 1;
	}

}
