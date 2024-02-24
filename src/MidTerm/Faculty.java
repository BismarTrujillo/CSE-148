package MidTerm;

public class Faculty extends Employee{
    private String department;
    private String title;

    public Faculty(String department, String title) {
        this.department = department;
        this.title = title;
    }

    public Faculty(String name, double salary, String department, String title) {
        super(name, salary);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Faculty))
            return false;

        Faculty faculty = (Faculty) obj;

        if (super.equals(obj) && this.title.equals(faculty.title) && this.department.equals(faculty.department))
            return true;

        return false;
    }
    public String toString() {
        return super.toString() + "Faculty: department = " + department + ", title='" + title;
    }
}
