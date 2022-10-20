import java.util.ArrayList;

public class OfferingList extends ArrayList {

	private final OfferingIterator offeringIterator;
	private Trading trading;
	private Offering[] offering;

	public OfferingList() {
		this.offeringIterator = new OfferingIterator(this);
	}

	/**
	 * Return an iterator for the OfferingList.
	 * @return 	An instance of the iterator.
	 */
	public ListIterator getIterator() {
		return this.offeringIterator;
	}

}
