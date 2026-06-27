public class Payment {

    // Private Variables (Encapsulation)
    private String paymentId;
    private String bookingId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;

    // Default Constructor
    public Payment() {

    }

    // Parameterized Constructor
    public Payment(String paymentId, String bookingId,
                   double amount, String paymentMethod,
                   String paymentStatus) {

        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    // Getters
    public String getPaymentId() {
        return paymentId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    // Setters
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // Simulate Payment
    public void makePayment() {

        System.out.println("\nProcessing Payment...");
        System.out.println("Amount : ₹" + amount);
        System.out.println("Payment Method : " + paymentMethod);

        paymentStatus = "SUCCESS";

        System.out.println("Payment Successful!");
    }

    // Display Payment Details
    public void displayPayment() {

        System.out.println("\n========== PAYMENT DETAILS ==========");
        System.out.println("Payment ID     : " + paymentId);
        System.out.println("Booking ID     : " + bookingId);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Payment Method : " + paymentMethod);
        System.out.println("Status         : " + paymentStatus);
        System.out.println("=====================================");
    }
}