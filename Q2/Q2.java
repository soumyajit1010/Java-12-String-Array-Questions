package Q2;

public class Q2 {

    public static boolean checkPalindrome(String str){
        /*StringBuilder a = new StringBuilder(str);
        a.reverse();
        String b = a.toString();
        return str.equals(b);*/
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String args[]){
        String str = "radar";
        if(checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}


/*
Without Using StringBuilder

public static boolean checkPalindrome(String str){
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

*/