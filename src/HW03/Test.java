package HW03;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        StudentClub club = new StudentClub();
        Random rand = new Random();


        club.addStudent(new Student("Bismark", "CS"));
        club.addStudent(new Student("Ed", "MAT"));
        club.addStudent(new Student("Cit", "ENS"));
        club.addStudent(new Student("Bernie", "ENS"));
        club.addStudent(new Student("Bernie", "BIO"));
        club.addStudent(new Student("Sarah", "PSI"));
        club.addStudent(new Student("Zhaira", "PHY"));
        club.addStudent(new Student("Xavi"));
        club.addStudent(new Student("Mitoma"));
        club.addStudent(new Student("Gross", "PHI"));

        club.getStudent(0).setGpa(2.4);
        club.getStudent(1).setGpa(3.4);
        club.getStudent(2).setGpa(1.4);
        club.getStudent(3).setGpa(2.9);
        club.getStudent(4).setGpa(4.0);

        System.out.println(club.getStudentClub().length);

        System.out.println("Number of Students in club: " + club.numberOfStudents());
        System.out.println("Number of Students in MAT: " + club.numberOfStudents(club.findByMajor("MAT")));
        System.out.println("Student with highest GPA: " + club.findByHighestGpa());

        int randomStudent = rand.nextInt(club.numberOfStudents());
        club.dropStudent(club.getStudent(randomStudent));

        int randomStudent2 = rand.nextInt(club.numberOfStudents());
        club.dropStudent(club.getStudent(randomStudent2));

        System.out.println(club);

        System.out.println("Student found: " + club.findStudent(new Student("Mitoma")));
        System.out.println("Student found: " + club.findStudent(club.getStudent(3)));
    }


}
