

public class UserInfo {
    private String name;
    private int age;
    private String email;
    private Boolean isActive;

    public UserInfo(String _name, int _age, 
                    String _email, boolean _isActive) {
        name = _name;
        age = _age;
        email = _email;
        isActive = _isActive;
    }

    // Setters:
    public void setName(String _name) {
        name = _name;
    }

    public void setAge(int _age) {
        age = _age;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public void setActive(boolean _isActive) {
        isActive = _isActive;
    }

    // Getters:
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean getActive() {
        return isActive;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\n" +
                           "Age: " + age + "\n" +
                           "Email: " + email + "\n" +
                           "Active: " + isActive + "\n");
    }

    public static void main(String[] args) {
        UserInfo u1 = new UserInfo("Ali", 20, "ali@gmail.com", false);
        UserInfo u2 = new UserInfo("Mozard", 90, "mozart@hotmail.com", true);
        UserInfo u3 = new UserInfo("Gamma", 55, "gamma@gmail.com", true);

        // Display info test:
        u1.displayInfo();
        u2.displayInfo();
        u3.displayInfo();

        // Setter & Getter test:
        System.out.println("Testing Setters and Getters:");

        u1.setAge(1000);
        System.out.println("New age: " + u1.getAge());

        u2.setEmail("new@example.com");
        System.out.println(u2.getEmail());

        u3.setActive(false);
        System.out.println("New active status: " + u3.getActive());
    }
}