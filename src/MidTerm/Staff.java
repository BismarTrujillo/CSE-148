package MidTerm;

public class Staff extends Employee {
    private String role;

    public Staff(String role) {
        this.role = role;
    }
    public Staff(String name, double salary, String role) {
        super(name, salary);
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Staff))
            return false;

        Staff staff = (Staff) obj;

        if (super.equals(obj) && this.role.equals(staff.role))
            return true;

        return false;
    }
    public String toString() {
        return super.toString() + "Staff: role = " + role;
    }
}
