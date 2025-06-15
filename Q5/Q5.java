package Q5;

public class Q5 {
    public static String removeDuplicatesandSpaces(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // To track all ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                continue; // Skip spaces
            }

            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String args[]) {
        String str = "object oriented programming";
        System.out.println(removeDuplicatesandSpaces(str)); // Output: objectrindpgam
    }
}
