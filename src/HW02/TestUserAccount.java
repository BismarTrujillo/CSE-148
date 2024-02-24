package HW02;

import java.util.Objects;

public class TestUserAccount {
    public static void main(String[] args) {
        UserAccount[] users = new UserAccount[8];
        users[0] = new UserAccount("bismar123", "password1", "staff");
        users[1] = new UserAccount("edu123", "password2", "staff");
        users[2] = new UserAccount("bernie321", "password3", "faculty");
        users[3] = new UserAccount("matt456", "password4", "administrator");
        users[4] = new UserAccount("ale765", "password5", "unassigned");
        users[5] = new UserAccount("kim111", "password6", "faculty");
        users[6] = new UserAccount("andrew222", "password7", "unassigned");
        users[7] = new UserAccount("ivan555", "password8", "faculty");

        int administrators = countUsers(users, "administrator");
        int faculty = countUsers(users, "faculty");

        System.out.println("administrators: " + administrators +
                " faculty: " + faculty);
        System.out.println("User found: " + findUser(users, new UserAccount("edu123", "password2", "staff")));
    }

    public static boolean findUser(UserAccount[] users, UserAccount user) {
        for (UserAccount userValue : users) {
            if (userValue.sameUser(user)) {
                return true;
            }
        }
        return false;
    }
    public static int countUsers(UserAccount[] users, String role) {
        int countUser = 0;
        for (UserAccount user : users) {
            if (Objects.equals(user.getRole(), role)) {
                countUser++;
            }
        }
        return countUser;
    }
}
