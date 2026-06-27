import java.util.ArrayList;
import java.util.Scanner;

public class LoginManager {

    private Scanner sc = new Scanner(System.in);

    // -----------------------------
    // USER REGISTRATION
    // -----------------------------
    public void registerUser() {

        System.out.println("\n========== USER REGISTRATION ==========");

        System.out.print("Enter User ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Email : ");
        String email = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        User user = new User(id, name, email, password);

        String data = user.getUserId() + ","
                + user.getName() + ","
                + user.getEmail() + ","
                + user.getPassword();

        FileManager.writeFile("users.txt", data);

        System.out.println("\nRegistration Successful!");
    }

    // -----------------------------
    // USER LOGIN
    // -----------------------------
    public boolean userLogin() {

        System.out.println("\n========== USER LOGIN ==========");

        System.out.print("Enter Email : ");
        String email = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        ArrayList<String> users =
                FileManager.readFile("users.txt");

        for (String record : users) {

            String[] data = record.split(",");

            if (data.length == 4) {

                if (data[2].equals(email)
                        && data[3].equals(password)) {

                    System.out.println("\nLogin Successful!");
                    return true;

                }

            }

        }

        System.out.println("\nInvalid Email or Password!");

        return false;
    }

    // -----------------------------
    // ADMIN LOGIN
    // -----------------------------
    public boolean adminLogin() {

        System.out.println("\n========== ADMIN LOGIN ==========");

        System.out.print("Username : ");
        String username = sc.nextLine();

        System.out.print("Password : ");
        String password = sc.nextLine();

        if (username.equals("admin")
                && password.equals("admin123")) {

            System.out.println("\nWelcome Admin!");

            return true;

        }

        System.out.println("\nInvalid Admin Credentials!");

        return false;
    }

}