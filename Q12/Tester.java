package Q12;

class Tester {
    public static String[] findPermutations(String str) {
        String[] permutations = new String[6];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < str.length(); k++) {
                    if (i != j && j != k && i != k) {
                        permutations[index++] = "" + str.charAt(i) + str.charAt(j) + str.charAt(k);
                    }
                }
            }
        }

        return permutations;
    }

    public static void main(String args[]) {
        String str = "abc";
        String permutations[] = findPermutations(str);
        for (String permutation : permutations) {
            if (permutation != null)
                System.out.println(permutation);
        }
    }
}
