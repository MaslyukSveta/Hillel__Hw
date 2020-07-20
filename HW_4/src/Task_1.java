public class Task_1 {
    public static void main(String[] args) {

        int[] str1 = {0, 2, 4, 6, 3, -1, 1};
        int[] str2 = {4, 6, 3};
        int k = 0;

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    k++;
                }
            }
        }
        if (k > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
