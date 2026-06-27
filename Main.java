import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LoginManager loginManager = new LoginManager();
        AdminDashboard adminDashboard = new AdminDashboard();
        UserDashboard userDashboard = new UserDashboard();

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("     BUS RESERVATION SYSTEM");
            System.out.println("========================================");
            System.out.println("1. User Registration");
            System.out.println("2. User Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    loginManager.registerUser();
                    break;

                case 2:

                    if (loginManager.userLogin()) {

                        userDashboard.userMenu();

                    }

                    break;

                case 3:

                    if (loginManager.adminLogin()) {

                        adminDashboard.adminMenu();

                    }

                    break;

                case 4:

                    System.out.println("\nThank You for Using Bus Reservation System!");
                    break;

                default:

                    System.out.println("\nInvalid Choice!");

            }

        } while (choice != 4);

        sc.close();

    }
}