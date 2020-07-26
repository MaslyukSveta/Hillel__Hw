public class Task_4 {

    public static void main(String[] args) {

        int element = 0;
        int amountOfElements = 15;

        for (int i = 0; i < matrixSize(amountOfElements); i++) {
            for (int j = 0; j < matrixSize(amountOfElements); j++) {
                if (element == amountOfElements) {
                    break;
                }
                element++;
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static int matrixSize(int amountOfElements) {
        int N = 0;
        while (N * N < amountOfElements) {
            N++;
        }
        return N;
    }

}
