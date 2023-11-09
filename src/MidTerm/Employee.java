package MidTerm;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
        name = "anonymous";
        salary = 50000.0;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Employee))
            return false;

        Employee employee = (Employee) obj;

        if (this.name.equals(employee.name) && this.salary == employee.salary)
            return true;

        return false;
    }
    public String toString() {
        return "Employee: name = " + name + ", salary = " + salary;
    }
}
