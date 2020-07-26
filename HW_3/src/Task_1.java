public class Task_1 {

    public static void main(String[] args) {

        int[] numbers = {1, 23, 456, 7890, 12345, 678901, 2345678, 90123456, 789012345, 1234567890};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(" Even number: " + numbers[i]);
            } else if (numbers[i] % 2 != 0) {
                System.out.println(" Odd number: " + numbers[i]);
            }
        }

    }

}
