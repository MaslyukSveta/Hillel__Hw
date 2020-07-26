public class Task_2 {

    public static void main(String[] args) {

        int[] array = {484099, 3481415, -12323, 3851, 428, 23, 7};

        selectionSort(array);

        int maxNumber = array[array.length - 1];
        System.out.println(maxNumber);
        System.out.println(lengthCount(maxNumber));

        int minNumber = array[0];
        System.out.println(minNumber);
        System.out.println(lengthCount(minNumber));


    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

    public static int lengthCount(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

}