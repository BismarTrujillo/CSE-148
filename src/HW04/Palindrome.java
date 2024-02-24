package HW04;

import java.util.Objects;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeInWords("abc 135 xyz 135 abc"));



    }

    public static boolean isPalindromeInWords(String string){
        string = string.toLowerCase();
        String[] arrOfString = string.split(" ");

        int s = 0;
        int e = arrOfString.length - 1;

        while(s < e) {

            if(!Objects.equals(arrOfString[s], arrOfString[e]))
                return false;

            s++;
            e--;

        }
        return true;
    }
}
