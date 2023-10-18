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
//    public static int findAndReplace(String file, String originalWord, String newWord) throws IOException {
//        File path = new File(file);
//        String oldText = "";
//        FileWriter writer = null;
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(path));
//            String line = reader.readLine();
//
//            while (line != null) {
//                oldText = oldText + line + System.lineSeparator();
//                line = reader.readLine();
//            }
//            String newText = oldText.replaceAll(originalWord, newWord);
//
//            writer = new FileWriter(newText);
//            writer.write(newText);
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                reader.close();
//
//                writer.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//
//        return 0;
//    }

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
    public static int countFiles(String path){
        int count = 0;
        File file = new File(path);

        Stack<File> stack = new Stack<>();
        stack.push(file);

        while(!stack.empty()){
            File tempFile = stack.pop();

            if(tempFile.isFile()){
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
