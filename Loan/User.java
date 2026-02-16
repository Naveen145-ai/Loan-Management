public class User {
    protected int userId;
    protected String name;
    private String email;

    public User(int userId, String name,String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public User(int userId, String name) {
        this(userId, name, "");
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
