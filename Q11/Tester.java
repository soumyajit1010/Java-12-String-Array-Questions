package Q11;

class Tester {
    public static int findTotalCount(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count++;
                i++; // skip the next element to avoid counting overlapping pairs
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
        System.out.println("Count of adjacent occurrence: " + findTotalCount(numbers));
    }
}
