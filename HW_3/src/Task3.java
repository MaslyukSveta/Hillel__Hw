
public class Task3 {

    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++) {
            System.out.println(fibonachi(n));
        }
    }

    static int fibonachi(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}

