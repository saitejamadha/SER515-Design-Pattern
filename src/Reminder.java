import java.util.Date;

public class Reminder {

    private static final Reminder instance;
    static {
        instance = new Reminder();
    }

    private Reminder(){}

    public static Reminder getInstance() {
        return instance;
    }

    public void showReminder() {
        System.out.println("Reminder: please finish the Trading");
    }

    public void showReminders(ClassProductList theProductList) {
        ReminderVisitor reminderVisitor = new ReminderVisitor(this);
        for (Product product : theProductList) {
            product.getTrading().accept(reminderVisitor);
        }
    }

    public void addReminder(Date dueDate) {
    }
}
