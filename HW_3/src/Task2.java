

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2 || numbers[i] == 3 || numbers[i] == 5 || numbers[i] == 7) {
                System.out.println(numbers[i]);
            }
            if (numbers[i] != 1 && numbers[i] % 2 != 0 && numbers[i] % 3 != 0 && numbers[i] % 5 != 0 && numbers[i] % 7 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}

