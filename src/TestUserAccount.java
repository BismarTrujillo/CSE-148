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

        int administrators = UserAccount.countUsers(users, "administrator");
        int faculty = UserAccount.countUsers(users, "faculty");

        System.out.println("administrators: " + administrators +
                " faculty: " + faculty);
        System.out.println("User found: " + UserAccount.findUser(users, new UserAccount("edu123", "password2", "staff")));
    }
}
