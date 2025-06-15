package Q4;

public class Q4 {
    public static int findHighestOccurrence(String str){
        int max=0;
        int secMax=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    secMax++;
                }
            }
            if (secMax>max){
                max=secMax;
            }
            secMax=0;
        }
        return max;
    }
    public static void main(String args[]){
        String str = "success";
        System.out.println(findHighestOccurrence(str));
    }

}

// ❌ Right now, your code has nested loops (O(n²) time), which is inefficient for large strings.

/*
 public static int findHighestOccurrence(String str) {
        int[] freq = new int[256]; // For all ASCII characters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        return max;
    }

*/
