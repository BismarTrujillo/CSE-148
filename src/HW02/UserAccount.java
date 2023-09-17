package HW02;

import java.util.Objects;

public class UserAccount {
    private String username;

    private String password;
    private String role;

    public UserAccount() {
        username = "anonymous";
        password = "sccc1234";
        role = "unknown";
    }

    public UserAccount(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean sameUser(UserAccount user) {
        return Objects.equals(user.username, this.username) &&
                Objects.equals(user.password, this.password);
    }




}