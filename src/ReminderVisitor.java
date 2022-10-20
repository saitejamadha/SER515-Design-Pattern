import java.util.Date;

public class ReminderVisitor extends NodeVisitor {

    private final Reminder m_Reminder;

    public ReminderVisitor(Reminder reminder) {
        m_Reminder = reminder;
    }

    /**
     * Visit Facade, and each product in the productList
     * @param facade facade instance
     */
    @Override
    void visitFacade(Facade facade) {
        System.out.println("Visiting Facade ....");
        for (Product product : facade.theProductList) {
            visitProduct(product);
        }
    }

    /**
     * Visit the trading on product, and set the reminder
     * @param trading trading instance
     */
    @Override
    void visitTrading(Trading trading) {
        System.out.println("Visiting Trading ....");

        Date currentTime = new Date();
        Date tradingDueDate = trading.getDueDate();
        if (currentTime.compareTo(tradingDueDate) > 0) {
            m_Reminder.showReminder();
        }

    }

    /**
     * Visit product, and trading on this product
     * @param product the product to be visited
     */
    @Override
    void visitProduct(Product product) {
        System.out.println("Visiting Product ....");
        visitTrading(product.getTrading());
    }
}
