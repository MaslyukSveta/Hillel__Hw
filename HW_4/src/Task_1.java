public class Task_1 {

    public static void main(String[] args) {

        int[] numbers1 = {0, 2, 4, 6, 3, -1, 1};
        int[] numbers2 = {4, 6, 3};
        int k = 0;

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length ; j++) {
                if (numbers1[i] == numbers2[j]) {
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
