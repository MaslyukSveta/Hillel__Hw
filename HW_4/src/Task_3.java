public class Task_3 {
    public static void main(String[] args) {

        int[] numbers = {462849, 3414135, 123234, 3851, 4282, 23891, 138290};

        for (int  array_number : numbers) {
            if (is_numbers(array_number)) {
                System.out.println(array_number);
            }
        }
    }

    private static boolean is_numbers(int x) {

        String s = String.valueOf(x);

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
