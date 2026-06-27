public class Ticket {

    // Private Variables
    private Booking booking;
    private Payment payment;

    // Default Constructor
    public Ticket() {

    }

    // Parameterized Constructor
    public Ticket(Booking booking, Payment payment) {
        this.booking = booking;
        this.payment = payment;
    }

    // Getters
    public Booking getBooking() {
        return booking;
    }

    public Payment getPayment() {
        return payment;
    }

    // Setters
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // Display Ticket
    public void printTicket() {

        System.out.println("\n");
        System.out.println("==============================================");
        System.out.println("          BUS RESERVATION TICKET");
        System.out.println("==============================================");

        System.out.println("Booking ID      : " + booking.getBookingId());
        System.out.println("Passenger Name  : "
                + booking.getPassenger().getPassengerName());

        System.out.println("Bus Name        : "
                + booking.getBus().getBusName());

        System.out.println("Bus Number      : "
                + booking.getBus().getBusNumber());

        System.out.println("Source          : "
                + booking.getBus().getSource());

        System.out.println("Destination     : "
                + booking.getBus().getDestination());

        System.out.println("Journey Date    : "
                + booking.getJourneyDate());

        System.out.println("Seat Number     : "
                + booking.getSeatNumber());

        System.out.println("Fare            : ₹"
                + booking.getTotalFare());

        System.out.println("Payment Method  : "
                + payment.getPaymentMethod());

        System.out.println("Payment Status  : "
                + payment.getPaymentStatus());

        System.out.println("==============================================");
        System.out.println("      THANK YOU! HAVE A SAFE JOURNEY");
        System.out.println("==============================================");
    }

}