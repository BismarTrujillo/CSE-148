package HW03;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
       StudentClub club = new StudentClub();

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

        System.out.println("Number of Students in club: " + club.numberOfStudents());
        System.out.println("Number of Students in MAT: " +  (Arrays.toString(club.findByMajor("MAT")))  );

    }


}
