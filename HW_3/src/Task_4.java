public class Task_4 {
    public static void main(String[] args) {

        int[] numbers = {1, 23, 456, 7890, 12345, 678901, 2345678, 90123456, 789012345, 1234567890};

        int maximum_number = numbers[0];
        int minimum_number = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (maximum_number <= numbers[i]) {
                maximum_number = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {

            if (minimum_number > numbers[i]) {
                minimum_number = numbers[i];
            }
        }
        System.out.println(maximum_number);
        System.out.println(minimum_number);
    }
}
