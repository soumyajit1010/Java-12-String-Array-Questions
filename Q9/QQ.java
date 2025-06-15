package Q9;

public class QQ {

    public static int[] findNumbers(int num1, int num2) {
        int[] numbers = new int[6];
        int index = 0;

        if (num1 >= num2) {
            return numbers; // validation failed, return array with all 0s
        }

        for (int i = num1; i <= num2; i++) {
            if (i >= 10 && i <= 99) { // two-digit positive number
                int digitSum = (i / 10) + (i % 10);
                if (digitSum % 3 == 0 && i % 5 == 0) {
                    if (index < numbers.length) {
                        numbers[index] = i;
                        index++;
                    } else {
                        break; // max 6 elements
                    }
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int[] numbers = findNumbers(num1, num2);

        boolean found = false;
        for (int n : numbers) {
            if (n != 0) {
                System.out.println(n);
                found = true;
            }
        }

        if (!found) {
            System.out.println("There is no such number!");
        }
    }
}
