package HW06;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class HW06 {
    public static void main(String[] args) {
        System.out.println(countFiles("C:\\Users\\bisma\\OneDrive\\Escritorio\\BISMAR\\Bismar\\Bolsos"));

        String originalWord = "old";
        String newWord = "new";
        int count = findAndReplace("oldFile.txt", "dolor", "newWord");
        System.out.println("Number of replacements: " + count);
    }

    public static int findAndReplace(String file, String originalWord, String newWord) {
        int count = 0;
        try {
            File oldFile = new File(file);
            Scanner scanner = new Scanner(oldFile);
            PrintWriter writer = new PrintWriter("newFile.txt");

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equals(originalWord)) {
                    writer.print(newWord + " ");
                    count++;
                } else {
                    writer.print(word + " ");
                }
            }
            writer.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return count;
    }

    public static int countFiles(String path) {
        int count = 0;
        File file = new File(path);

        Stack<File> stack = new Stack<>();
        stack.push(file);

        while (!stack.empty()) {
            File tempFile = stack.pop(); // throws exception if empty &&

            if (tempFile.isFile()) {
                count++;
            } else if (tempFile.isDirectory()) {

                File[] f = tempFile.listFiles();

                for (int i = 0; i < f.length; i++) {
                    stack.push(f[i]);
                }
            }
        }
        return count;
    }

}
