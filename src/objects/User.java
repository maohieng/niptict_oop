package objects;

/**
 * User class is an mutable class.
 */
public class User {
    // Non-static fields
    private String name;
    private String userName;
    private String password;
    private String gender;

    // Static field
    static int numUsersLogin;
    // Initialize fields value with block
    static {
        numUsersLogin = 3;
    }

    // Constants
    static final String MALE = "male";
    static final String FEMALE = "female";

    // Non-static method or instance methods

    public void updateUser(User newUser) {
        if (newUser != null) {
            if (newUser.name != null) {
                this.name = newUser.name;
            }

            if (newUser.password != null) {
                this.password = newUser.password;
            }
        }
    }

    // Static method
    public static void increaseNumberUserLogin() {
        numUsersLogin++;
    }

    // Getters methods

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    // Setter methods

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Nested classes (static and non-static nested classes)
    ///////////////////////////////////////////////////////////////////////////

    // Non-static or inner class
    class Image {
        String ref;
        String url;
        String thumbnail;
    }

    // static classes
    static class Contact {
        String phone1;
        String phone2;
        String email;
        String facebook;
    }
}
