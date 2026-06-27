public class Bus {

    // Private Variables (Encapsulation)
    private int busId;
    private String busNumber;
    private String busName;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int totalSeats;
    private int availableSeats;
    private double fare;

    // Default Constructor
    public Bus() {

    }

    // Parameterized Constructor
    public Bus(int busId, String busNumber, String busName,
               String source, String destination,
               String departureTime, String arrivalTime,
               int totalSeats, int availableSeats, double fare) {

        this.busId = busId;
        this.busNumber = busNumber;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.fare = fare;
    }

    // Getters
    public int getBusId() {
        return busId;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getFare() {
        return fare;
    }

    // Setters
    public void setBusId(int busId) {
        this.busId = busId;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    // Book One Seat
    public boolean bookSeat() {

        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }

        return false;
    }

    // Cancel One Seat
    public void cancelSeat() {

        if (availableSeats < totalSeats) {
            availableSeats++;
        }

    }

    // Display Bus Details
    public void displayBus() {

        System.out.println("------------------------------------------");
        System.out.println("Bus ID          : " + busId);
        System.out.println("Bus Number      : " + busNumber);
        System.out.println("Bus Name        : " + busName);
        System.out.println("Source          : " + source);
        System.out.println("Destination     : " + destination);
        System.out.println("Departure Time  : " + departureTime);
        System.out.println("Arrival Time    : " + arrivalTime);
        System.out.println("Total Seats     : " + totalSeats);
        System.out.println("Available Seats : " + availableSeats);
        System.out.println("Fare            : ₹" + fare);
        System.out.println("------------------------------------------");
    }

}