public class Task_3 {
    public static void main(String[] args) {

        int[] fibonacciNumbers = new int[20];

        for (int i = 1; i <= fibonacciNumbers.length; i++) {
            System.out.println(fibonachi(i));
        }
    }

    static int fibonachi(int number) {

        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        } else {
            return fibonachi(number - 1) + fibonachi(number - 2);
        }
    }
}
