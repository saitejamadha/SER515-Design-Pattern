import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

    private int userType;
    private String username;

    public int getUserType() {
        return this.userType;
    }

    public boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the User Type");
        System.out.println("0: Buyer");
        System.out.println("1: Seller");
        userType = sc.nextInt();
        sc.nextLine();

        File file;
        if (userType == 0) {
            file = new File("./database/Buyer.txt");
        } else if (userType == 1) {
            file = new File("./database/Seller.txt");
        } else {
            System.out.println("Invalid User Type");
            return false;
        }

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return false;
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
            return false;
        }

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        if (!users.containsKey(username)) {
            System.out.println("Username does not exist");
            return false;
        }

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (!users.get(username).equals(password)) {
            System.out.println("Invalid password");
            return false;
        }

        System.out.println("Login successful");
        System.out.println("Welcome " + username + "! You are logged in as a " + (userType == 0 ? "Buyer" : "Seller"));

        this.username = username;
        return true;
    }

    public String getUsername() {
        return this.username;
    }
}
