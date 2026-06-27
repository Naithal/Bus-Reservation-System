import java.util.ArrayList;
import java.util.Scanner;

public class BusManager {

    Scanner sc = new Scanner(System.in);

    // ---------------- ADD BUS ----------------
    public void addBus() {

        System.out.println("\n========== ADD BUS ==========");

        System.out.print("Bus ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Bus Number : ");
        String number = sc.nextLine();

        System.out.print("Bus Name : ");
        String name = sc.nextLine();

        System.out.print("Source : ");
        String source = sc.nextLine();

        System.out.print("Destination : ");
        String destination = sc.nextLine();

        System.out.print("Departure Time : ");
        String departure = sc.nextLine();

        System.out.print("Arrival Time : ");
        String arrival = sc.nextLine();

        System.out.print("Total Seats : ");
        int seats = sc.nextInt();

        System.out.print("Fare : ");
        double fare = sc.nextDouble();

        Bus bus = new Bus(id, number, name, source,
                destination, departure, arrival,
                seats, seats, fare);

        String record =
                bus.getBusId() + "," +
                bus.getBusNumber() + "," +
                bus.getBusName() + "," +
                bus.getSource() + "," +
                bus.getDestination() + "," +
                bus.getDepartureTime() + "," +
                bus.getArrivalTime() + "," +
                bus.getTotalSeats() + "," +
                bus.getAvailableSeats() + "," +
                bus.getFare();

        FileManager.writeFile("buses.txt", record);

        System.out.println("\nBus Added Successfully!");
    }

    // ---------------- VIEW ALL BUSES ----------------
    public void viewBuses() {

        ArrayList<String> buses = FileManager.readFile("buses.txt");

        if (buses.isEmpty()) {
            System.out.println("\nNo buses available.");
            return;
        }

        System.out.println("\n========== BUS LIST ==========");

        for (String bus : buses) {

            String[] data = bus.split(",");

            System.out.println("--------------------------------------");
            System.out.println("Bus ID          : " + data[0]);
            System.out.println("Bus Number      : " + data[1]);
            System.out.println("Bus Name        : " + data[2]);
            System.out.println("Source          : " + data[3]);
            System.out.println("Destination     : " + data[4]);
            System.out.println("Departure Time  : " + data[5]);
            System.out.println("Arrival Time    : " + data[6]);
            System.out.println("Total Seats     : " + data[7]);
            System.out.println("Available Seats : " + data[8]);
            System.out.println("Fare            : ₹" + data[9]);
        }
    }

    // ---------------- SEARCH BUS ----------------
    public void searchBus() {

        sc.nextLine();

        System.out.print("Enter Source : ");
        String source = sc.nextLine();

        System.out.print("Enter Destination : ");
        String destination = sc.nextLine();

        ArrayList<String> buses = FileManager.readFile("buses.txt");

        boolean found = false;

        for (String bus : buses) {

            String[] data = bus.split(",");

            if (data[3].equalsIgnoreCase(source)
                    && data[4].equalsIgnoreCase(destination)) {

                found = true;

                System.out.println("--------------------------------------");
                System.out.println("Bus ID          : " + data[0]);
                System.out.println("Bus Number      : " + data[1]);
                System.out.println("Bus Name        : " + data[2]);
                System.out.println("Departure Time  : " + data[5]);
                System.out.println("Arrival Time    : " + data[6]);
                System.out.println("Available Seats : " + data[8]);
                System.out.println("Fare            : ₹" + data[9]);
            }
        }

        if (!found) {
            System.out.println("\nNo Bus Found.");
        }
    }

    // ---------------- UPDATE BUS ----------------
    public void updateBus() {

        System.out.print("\nEnter Bus ID to Update : ");
        int busId = sc.nextInt();
        sc.nextLine();

        ArrayList<String> buses = FileManager.readFile("buses.txt");
        ArrayList<String> updatedList = new ArrayList<>();

        boolean found = false;

        for (String bus : buses) {

            String[] data = bus.split(",");

            if (Integer.parseInt(data[0]) == busId) {

                found = true;

                System.out.println("\nEnter New Bus Details");

                System.out.print("Bus Number : ");
                String number = sc.nextLine();

                System.out.print("Bus Name : ");
                String name = sc.nextLine();

                System.out.print("Source : ");
                String source = sc.nextLine();

                System.out.print("Destination : ");
                String destination = sc.nextLine();

                System.out.print("Departure Time : ");
                String departure = sc.nextLine();

                System.out.print("Arrival Time : ");
                String arrival = sc.nextLine();

                System.out.print("Total Seats : ");
                int seats = sc.nextInt();

                System.out.print("Fare : ");
                double fare = sc.nextDouble();
                sc.nextLine();

                String record =
                        busId + "," +
                        number + "," +
                        name + "," +
                        source + "," +
                        destination + "," +
                        departure + "," +
                        arrival + "," +
                        seats + "," +
                        seats + "," +
                        fare;

                updatedList.add(record);

            } else {

                updatedList.add(bus);

            }
        }

        if (found) {

            FileManager.rewriteFile("buses.txt", updatedList);
            System.out.println("\nBus Updated Successfully.");

        } else {

            System.out.println("\nBus Not Found.");

        }
    }

    // ---------------- DELETE BUS ----------------
    public void deleteBus() {

        System.out.print("\nEnter Bus ID to Delete : ");
        int busId = sc.nextInt();

        ArrayList<String> buses = FileManager.readFile("buses.txt");
        ArrayList<String> updatedList = new ArrayList<>();

        boolean found = false;

        for (String bus : buses) {

            String[] data = bus.split(",");

            if (Integer.parseInt(data[0]) == busId) {

                found = true;

            } else {

                updatedList.add(bus);

            }
        }

        if (found) {

            FileManager.rewriteFile("buses.txt", updatedList);
            System.out.println("\nBus Deleted Successfully.");

        } else {

            System.out.println("\nBus Not Found.");

        }
    }
}