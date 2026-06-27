public class Booking {

    // Private Variables (Encapsulation)
    private String bookingId;
    private Passenger passenger;
    private Bus bus;
    private String journeyDate;
    private String seatNumber;
    private double totalFare;
    private String bookingStatus;

    // Default Constructor
    public Booking() {

    }

    // Parameterized Constructor
    public Booking(String bookingId,
                   Passenger passenger,
                   Bus bus,
                   String journeyDate,
                   String seatNumber,
                   double totalFare,
                   String bookingStatus) {

        this.bookingId = bookingId;
        this.passenger = passenger;
        this.bus = bus;
        this.journeyDate = journeyDate;
        this.seatNumber = seatNumber;
        this.totalFare = totalFare;
        this.bookingStatus = bookingStatus;
    }

    // Getters
    public String getBookingId() {
        return bookingId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Bus getBus() {
        return bus;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    // Setters
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setJourneyDate(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    // Display Booking Details
    public void displayBooking() {

        System.out.println("\n========================================");
        System.out.println("          BOOKING DETAILS");
        System.out.println("========================================");

        System.out.println("Booking ID     : " + bookingId);

        System.out.println("Passenger Name : "
                + passenger.getPassengerName());

        System.out.println("Bus Name       : "
                + bus.getBusName());

        System.out.println("Bus Number     : "
                + bus.getBusNumber());

        System.out.println("From           : "
                + bus.getSource());

        System.out.println("To             : "
                + bus.getDestination());

        System.out.println("Journey Date   : "
                + journeyDate);

        System.out.println("Seat Number    : "
                + seatNumber);

        System.out.println("Fare           : ₹"
                + totalFare);

        System.out.println("Status         : "
                + bookingStatus);

        System.out.println("========================================");
    }

}