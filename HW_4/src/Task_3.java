public class Task_3 {
    public static void main(String[] args) {
        int[] numbers = {1, 245, 3345, 322, 534, 3123};
        print(numbers);
    }

    public static void print(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (cheak(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static boolean cheak(int number) {
        while (number > 0) {
            int digit = number % 10;
            for (int i = number / 10; i > 0; i /= 10)
                if (i % 10 == digit)
                    return false;
            number /= 10;
        }
        return true;
    }
}
