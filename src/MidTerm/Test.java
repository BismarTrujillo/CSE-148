package MidTerm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        College myCollege = new College();

        Employee emp1 = new Faculty("bismar", 123321, "math","proffesor");
        Employee emp2 = new Faculty("cit", 34325, "math","proffesor");
        Employee emp3 = new Faculty("sar", 53453, "computer science","associate");
        Employee emp4 = new Faculty("zae", 654554, "computer science","associate");
        Employee emp5 = new Staff("qwe", 322333,"secretary");
        Employee emp6 = new Staff("ded", 545445,"secretary");

        myCollege.addEmployee(emp1);
        myCollege.addEmployee(emp2);
        myCollege.addEmployee(emp3);
        myCollege.addEmployee(emp4);
        myCollege.addEmployee(emp5);
        myCollege.addEmployee(emp6);

        System.out.println( "Average salary " + myCollege.getAverageSalary(2));
        System.out.println("Faculty in math = " + Arrays.toString(myCollege.getFaculties("math")));
    }

    public static int countOccurrenceOfWordInFile(String filename, String word){
        int count = 0;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                word = scanner.next();
                if (word.equals(word)) {
                    count++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return count;
    }
    }




}
