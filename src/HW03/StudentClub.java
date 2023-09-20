package HW03;

public class StudentClub {

    private Student[] studentList;

    public StudentClub() {
        studentList = new Student[16];
    }
    public StudentClub(int size) {
        studentList = new Student[size];
    }

    public boolean addStudent(Student student){
        for (int i = 0; i < studentList.length; i++) {
            if(studentList[i] == null){
                studentList[i] = student;
                return true;
            }
        }
        return false;
    }

    public int findStudent(Student student){
        for (int i = 0; i < studentList.length; i++) {
            if(studentList[i] != null && studentList[i].equals(student)){
                return i;
            }
        }
        return -1;
    }

    public boolean dropStudent(Student student){
        int index = findStudent(student);
        if(index < 0)
            return false;
        else{
            studentList[index] = null;
            return true;
        }
    }

    private int numberOfStudents(){
        int numOfStudents = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null)
                numOfStudents++;
        }
        return numOfStudents;
    }

    public Student findByHighestGpa() {
        Student studentHighestGpa = studentList[0];

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getGpa() > studentHighestGpa.getGpa())
                studentHighestGpa = studentList[i];

        }
        return studentHighestGpa;
    }

    public Student[] findByMajor(String major){
        Student[] sameMajor = new Student[numberOfStudents()];

        for (int i = 0; i < studentList.length; i++) {
            if(studentList[i] != null && studentList[i].getMajor().equals(major))
                sameMajor[i] = studentList[i];
        }
        return sameMajor;
    }



    public Student[] getStudentClub(){

        return studentList;
}


}
