import java.util.Scanner;
import java.util.ArrayList;

public class AdminDashboard {

    Scanner sc = new Scanner(System.in);

    BusManager busManager = new BusManager();
    BookingManager bookingManager = new BookingManager();

    public void adminMenu() {

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println("       ADMIN DASHBOARD");
            System.out.println("==================================");
            System.out.println("1. Add Bus");
            System.out.println("2. Update Bus");
            System.out.println("3. Delete Bus");
            System.out.println("4. View All Buses");
            System.out.println("5. Search Bus");
            System.out.println("6. View Users");
            System.out.println("7. View Bookings");
            System.out.println("8. Logout");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    busManager.addBus();
                    break;

                case 2:
                    busManager.updateBus();
                    break;

                case 3:
                    busManager.deleteBus();
                    break;

                case 4:
                    busManager.viewBuses();
                    break;

                case 5:
                    busManager.searchBus();
                    break;

                case 6:
                    viewUsers();
                    break;

                case 7:
                    bookingManager.viewBookings();
                    break;

                case 8:
                    System.out.println("\nLogging out...");
                    break;

                default:
                    System.out.println("\nInvalid Choice!");

            }

        } while (choice != 8);
    }

    // View Registered Users
    public void viewUsers() {

        ArrayList<String> users = FileManager.readFile("users.txt");

        if (users.isEmpty()) {

            System.out.println("\nNo Registered Users.");
            return;

        }

        System.out.println("\n========== REGISTERED USERS ==========");

        for (String user : users) {

            String[] data = user.split(",");

            System.out.println("--------------------------------");
            System.out.println("User ID : " + data[0]);
            System.out.println("Name    : " + data[1]);
            System.out.println("Email   : " + data[2]);
        }
    }
}