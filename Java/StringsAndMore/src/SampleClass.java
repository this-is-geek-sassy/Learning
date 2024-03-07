public class SampleClass {
    public static void main(String[] args) {
        int n = 80; // let's say
        int[] array = {1, 5, 4, 5, 9, 43, 43, 7};
        int flag = 0, iteration = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else if (array[j] == array[j+1]) {
                    System.out.println("Found duplicate: " + array[j] + " " + array[j+1]);
                    flag = 1;
                    break;
                }
            } iteration++;
            if (flag == 1)
                break;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %d", array[i]);
        }
        System.out.println("\n" +
                "iteration = " + iteration);
    }
}
