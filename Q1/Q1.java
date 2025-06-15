package Q1;

public class Q1 {
    public static String moveSpecialCharacters(String str) {
        StringBuilder alphanum = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                alphanum.append(ch);
            } else {
                special.append(ch);
            }
        }

        return alphanum.toString() + special.toString();
    }

    public static void main(String args[]){
        String str = "He@#$llo!*&";
        System.out.println(moveSpecialCharacters(str));
    }

}
