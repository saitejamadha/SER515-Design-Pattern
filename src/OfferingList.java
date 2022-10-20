import java.util.ArrayList;

public class OfferingList extends ArrayList<Offering> {

	private final OfferingIterator offeringIterator;
	private Trading trading;

	public OfferingList() {
		this.offeringIterator = new OfferingIterator(this);

		// Add 5 offerings to this OfferingList.
		Offering offering1 = new Offering();
		Offering offering2 = new Offering();
		Offering offering3 = new Offering();
		Offering offering4 = new Offering();
		Offering offering5 = new Offering();

		this.addAll( new ArrayList<>(){{
			add(offering1);
			add(offering2);
			add(offering3);
			add(offering4);
			add(offering5);
		}});
	}

	/**
	 * Return an iterator for the OfferingList.
	 * @return 	An instance of the iterator.
	 */
	public ListIterator getIterator() {
		return this.offeringIterator;
	}

}
