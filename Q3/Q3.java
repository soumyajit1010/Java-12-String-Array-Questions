package Q3;

import java.util.ArrayList;

public class Q3 {

    public static String reverseEachWord(String str){
        String[] words = str.split(" ");  // Split by space
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversed = new StringBuilder(words[i]).reverse();
            result.append(reversed);

            if (i < words.length - 1) {
                result.append(" ");  // Add space between words
            }
        }

        return result.toString();
    }

    public static void main(String args[]){
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str));
    }
}
