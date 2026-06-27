public class Passenger {

    // Encapsulation - Private Variables
    private int passengerId;
    private String passengerName;
    private int age;
    private String gender;
    private String phoneNumber;

    // Default Constructor
    public Passenger() {

    }

    // Parameterized Constructor
    public Passenger(int passengerId, String passengerName,
                     int age, String gender, String phoneNumber) {

        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getPassengerId() {
        return passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Display Passenger Details
    public void displayPassenger() {

        System.out.println("\n========== PASSENGER DETAILS ==========");
        System.out.println("Passenger ID   : " + passengerId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Age            : " + age);
        System.out.println("Gender         : " + gender);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("=======================================");
    }
}