public class Task_2 {

    public static void main(String[] args) {

        int n = 29;

        System.out.println(recursion(n));


    }

    static String recursion(int n) {

        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;

    }

}
