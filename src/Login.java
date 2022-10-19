import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    private final int userType;

    public Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the UserType: (0 = Buyer or 1 = Seller)");
        userType = sc.nextInt();
        sc.nextLine();

        File file = userType == 0 ? new File("./database/Buyer.txt") : new File("./database/Seller.txt");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        }

        Map<String, String> users = new HashMap<>();

        String st;
        try {
            while ((st = br.readLine()) != null) {
                String[] split = st.split(":");
                users.put(split[0], split[1]);
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
            System.exit(1);
        }

        System.out.println("Enter Username:");
        String username = sc.nextLine();

        if (!users.containsKey(username)) {
            System.out.println("Username does not exist");
            System.exit(1);
        }

        System.out.println("Enter Password:");
        String password = sc.nextLine();

        if (!users.get(username).equals(password)) {
            System.out.println("Invalid password");
            System.exit(1);
        }

        System.out.println("Login successful");
    }

    public int getUserType() {
        return userType;
    }

}
