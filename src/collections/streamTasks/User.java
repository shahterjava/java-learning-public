package collections.streamTasks;

public class User {
    private String name;
    private int age;
    private String email;
    private boolean isVerified;
    private String role;

    public User(String name, int age, String email, boolean isVerified, String role) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isVerified = isVerified;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Пользователь:" +
                " имя: " + name + ", возраст: " +
                 age +
                ", email: " + email +
                ", isVerified: " + isVerified +
                ", role: " + role + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public String getRole() {
        return role;
    }
}
