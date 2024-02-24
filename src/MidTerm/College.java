package MidTerm;

public class College {
    private String collegeName;
    private Employee[] employees;

    public College(String collegeName, int size) {
        this.collegeName = collegeName;
        this.employees = new Employee[size];
    }

    public College() {
        this.collegeName = "SCCC";
        this.employees = new Employee[100];
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public boolean addEmployee(Employee newEmployee){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null){
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }
    public boolean removeEmployee(Employee deleteEmployee){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && deleteEmployee.equals(employees[i])){
                employees[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean findEmployee(Employee findEmployee){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && findEmployee.equals(employees[i]))
                return true;
        }
        return false;
    }
    public Employee[] getFaculties(String deptName){
        int count = 0;
        Faculty employeeToFaculty;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Faculty) {
                employeeToFaculty = (Faculty) employees[i];
                if (deptName.equals("all") || employeeToFaculty.getDepartment().equals(deptName)){
                    count++;
                }
            }
        }
        Faculty[] facultyArr = new Faculty[count];

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Faculty) {
                employeeToFaculty = (Faculty) employees[i];
                if (deptName.equals("all") || employeeToFaculty.getDepartment().equals(deptName)){
                    facultyArr[i] = employeeToFaculty;
                }
            }
        }
        for (int i = 0; i < facultyArr.length-1; i++) {
            for (int j = i+1; j < facultyArr.length; j++) {
                if (facultyArr[i].getName().length() > (facultyArr[j].getName().length())){
                    Faculty temp = facultyArr[i];
                    facultyArr[i] = facultyArr[j];
                    facultyArr[j] = temp;
                }
            }
        }
        return facultyArr;
    }
    public double getAverageSalary(int role){
        double avgFaculties = 0.0;
        int numberOFaculties = 0;
        double avgStaffs = 0.0;
        int numberOfStaffs = 0;
        double avgAll = 0.0;
        int numberOfEmployees = 0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){

                if(employees[i] instanceof Faculty){
                    avgFaculties += employees[i].getSalary();
                    avgAll += employees[i].getSalary();
                    numberOfEmployees++;
                    numberOFaculties++;
                } else if (employees[i] instanceof Staff) {
                    avgStaffs += employees[i].getSalary();
                    avgAll += employees[i].getSalary();
                    numberOfEmployees++;
                    numberOfStaffs++;
                }
            }
        }
        if (role == 1){
            return avgFaculties / numberOFaculties;
        } else if (role == 2) {
            return avgStaffs / numberOfStaffs;
        }else{
            return avgAll / numberOfEmployees;
        }


    }




}
