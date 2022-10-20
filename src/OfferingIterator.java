public class OfferingIterator implements ListIterator {

    private final OfferingList offeringList;
    private int index;

    OfferingIterator(OfferingList offList) {
        System.out.println("Initializing offering iterator");
        offeringList = offList;
        index = 0;
    }

    /**
     * Check if there is a next item in the list.
     * @return true if there is a next item in the list, false otherwise.
     */
    public boolean hasNext() {
        boolean result = false;
        ;
        if (this.index < offeringList.size()) {
            result = true;
        }
        return result;
    }

    /**
     * Get the next item from the list
     * @return the next offer
     */
    public Offering next() {
        Offering offering = null;
        if (this.hasNext()) {
            offering = (Offering) offeringList.get(index);
        }
        index++;
        return offering;
    }

    /**
     * Remove current item from the list
     */
    public void remove() {
        offeringList.remove(index);
        index = index - 1;
    }

    /**
     * Set the current item to the location before the first item
     */
    public void moveToHead() {
        Offering current = (Offering) this.offeringList.get(this.index);
        this.index = this.offeringList.indexOf(current) - 1;
    }

}
