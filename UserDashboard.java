import java.util.Scanner;

public class UserDashboard {

    Scanner sc = new Scanner(System.in);

    BusManager busManager = new BusManager();
    BookingManager bookingManager = new BookingManager();

    public void userMenu() {

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println("        USER DASHBOARD");
            System.out.println("==================================");
            System.out.println("1. Search Bus");
            System.out.println("2. View All Buses");
            System.out.println("3. Book Ticket");
            System.out.println("4. View Bookings");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    busManager.searchBus();
                    break;

                case 2:
                    busManager.viewBuses();
                    break;

                case 3:
                    bookingManager.bookTicket();
                    break;

                case 4:
                    bookingManager.viewBookings();
                    break;

                case 5:
                    System.out.println("\nLogged out successfully.");
                    break;

                default:
                    System.out.println("\nInvalid Choice!");

            }

        } while (choice != 5);
    }
}