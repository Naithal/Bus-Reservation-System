public class Admin extends User {

    // Private variables
    private String username;
    private String adminPassword;

    // Default Constructor
    public Admin() {

    }

    // Parameterized Constructor
    public Admin(int userId, String name, String email, String password,
                 String username, String adminPassword) {

        // Call User class constructor
        super(userId, name, email, password);

        this.username = username;
        this.adminPassword = adminPassword;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    // Admin Login
    public boolean login(String username, String password) {

        if (this.username.equals(username)
                && this.adminPassword.equals(password)) {

            return true;
        }

        return false;
    }

    // Display Admin Details
    public void displayAdmin() {

        System.out.println("========== ADMIN DETAILS ==========");
        System.out.println("Admin Name : " + getName());
        System.out.println("Username   : " + username);
        System.out.println("Email      : " + getEmail());
    }

}