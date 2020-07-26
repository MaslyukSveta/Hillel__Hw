public class Task_2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 121};

        for (int  array_number : numbers) {
            if (prime(array_number)) {
                System.out.println(array_number);
            }
        }

    }

    public static boolean prime(int  number) {
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return  false;
            }
        }
        return true;
    }
}

