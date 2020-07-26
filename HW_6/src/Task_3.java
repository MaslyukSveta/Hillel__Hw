class Sum {
    int sum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}

public class Task_3 {

    public static void main(String[] args) {

        Sum s = new Sum();
        int n = 800294859;

        System.out.println(s.sum(n));

    }

}

