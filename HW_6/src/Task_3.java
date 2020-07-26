public class Task_3 {
    public static void main(String[] args) {

        int n = 800294859;
        int res = sum(n);

        System.out.println(res);


    }

    static int sum(int n) {

        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);

    }
}
