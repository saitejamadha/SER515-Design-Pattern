public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        boolean isSuccessful = facade.login();
        if (isSuccessful) {
            facade.viewOffering();
        }

    }
}
