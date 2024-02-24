package HW03;

import java.util.Arrays;

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
    public Student findStudentById(Student student){

        for (int i = 0; i < studentList.length; i++) {
            if(studentList[i] != null && studentList[i].getStudentID() == student.getStudentID())
                return studentList[i];
        }
        return null;
    }
    public Student[] findStudentByName(String studentName){
        Student[] temp = new Student[studentList.length];
        int newSize = 0;
        for (int i = 0, j = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentList[i].getName().equals(studentName)) {
                newSize++;
                temp[j] = studentList[i];

            }
        }
        return Arrays.copyOf(temp,newSize);

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

    public int numberOfStudents(){
        int numOfStudents = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null)
                numOfStudents++;
        }
        return numOfStudents;
    }
    public int numberOfStudents(Student[] student){
        int numOfStudents = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null)
                numOfStudents++;
        }
        return numOfStudents;
    }

    public Student findByHighestGpa() {
        Student studentHighestGpa = studentList[0];

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentList[i].getGpa() > studentHighestGpa.getGpa())
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
    public Student getStudent(int i){
        return studentList[i];
    }

    @Override
    public String toString() {
        return "StudentClub{" +
                "studentList=" + Arrays.toString(studentList) +
                '}';
    }
}
