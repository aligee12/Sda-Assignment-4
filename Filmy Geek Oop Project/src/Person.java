public class Person {
    protected int ID;
    protected String name;
    protected String email;
    protected String password;

    public Person(int ID, String name, String email, String password) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void login() {
        // Basic login implementation
        System.out.println(name + " logged in.");
    }
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address");
        }
    }

    public String getName() {
        return name;
    }
    public int getID() {
        return this.ID;
    }
}
