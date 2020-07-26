class Recursions {
    String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }
}

public class Task_2 {

    public static void main(String[] args) {

        Recursions r = new Recursions();

        int n = 29;

        System.out.println(r.recursion(n));

    }

}
