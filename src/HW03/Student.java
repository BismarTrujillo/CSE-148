package HW03;

public class Student {
    private String name;
    private int studentID;
    private String major;
    private double gpa;
    private static int base = 1;

    public Student(String name) {
        this.name = name;
        major = "undeclared";
        gpa = 0.0;
        studentID = base++;

    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        gpa = 0.0;
        studentID = base++;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean sameStudent(Student student){
        return student.studentID == this.studentID;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
