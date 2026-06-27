import java.util.ArrayList;
import java.util.Scanner;

public class BookingManager {

    Scanner sc = new Scanner(System.in);

    // Book Ticket
    public void bookTicket() {

        ArrayList<String> buses = FileManager.readFile("buses.txt");

        if (buses.isEmpty()) {
            System.out.println("\nNo buses available!");
            return;
        }

        System.out.println("\n========== AVAILABLE BUSES ==========");

        for (String bus : buses) {

            String[] data = bus.split(",");

            System.out.println("--------------------------------");
            System.out.println("Bus ID : " + data[0]);
            System.out.println("Bus Name : " + data[2]);
            System.out.println("From : " + data[3]);
            System.out.println("To : " + data[4]);
            System.out.println("Fare : ₹" + data[9]);
        }

        System.out.print("\nEnter Bus ID : ");
        int busId = sc.nextInt();
        sc.nextLine();

        Bus selectedBus = null;

        for (String bus : buses) {

            String[] d = bus.split(",");

            if (Integer.parseInt(d[0]) == busId) {

                selectedBus = new Bus(
                        Integer.parseInt(d[0]),
                        d[1],
                        d[2],
                        d[3],
                        d[4],
                        d[5],
                        d[6],
                        Integer.parseInt(d[7]),
                        Integer.parseInt(d[8]),
                        Double.parseDouble(d[9])
                );

                break;
            }
        }

        if (selectedBus == null) {
            System.out.println("Invalid Bus ID!");
            return;
        }

        // Passenger Details
        System.out.print("Passenger ID : ");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.print("Passenger Name : ");
        String name = sc.nextLine();

        System.out.print("Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Gender : ");
        String gender = sc.nextLine();

        System.out.print("Phone : ");
        String phone = sc.nextLine();

        Passenger passenger = new Passenger(pid, name, age, gender, phone);

        System.out.print("Journey Date : ");
        String date = sc.nextLine();

        System.out.print("Seat Number : ");
        String seat = sc.nextLine();

        String bookingId = "B" + System.currentTimeMillis();

        Booking booking = new Booking(
                bookingId,
                passenger,
                selectedBus,
                date,
                seat,
                selectedBus.getFare(),
                "CONFIRMED"
        );

        // Payment
        System.out.println("\nSelect Payment Method");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash");

        int choice = sc.nextInt();
        sc.nextLine();

        String method = "";

        switch (choice) {
            case 1:
                method = "UPI";
                break;
            case 2:
                method = "Card";
                break;
            case 3:
                method = "Cash";
                break;
            default:
                method = "UPI";
        }

        Payment payment = new Payment(
                "PAY" + System.currentTimeMillis(),
                bookingId,
                selectedBus.getFare(),
                method,
                "SUCCESS"
        );

        // Save Booking
        String record =
                bookingId + "," +
                passenger.getPassengerName() + "," +
                selectedBus.getBusName() + "," +
                seat + "," +
                date + "," +
                payment.getPaymentStatus();

        FileManager.writeFile("bookings.txt", record);

        // Print Ticket
        Ticket ticket = new Ticket(booking, payment);

        System.out.println("\nBooking Successful!");
        ticket.printTicket();
    }

    // View Bookings
    public void viewBookings() {

        ArrayList<String> bookings =
                FileManager.readFile("bookings.txt");

        System.out.println("\n========== BOOKINGS ==========");

        if (bookings.isEmpty()) {

            System.out.println("No Bookings Found.");
            return;

        }

        for (String booking : bookings) {

            System.out.println(booking);

        }

    }

}