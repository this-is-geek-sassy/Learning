package exception;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("Elements of the array are: ");
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nPlease take care of the array indices");
            e.printStackTrace();
        } finally {
            System.out.println("The code after try catch");
        }
        System.out.println("The code after finally block");  // mysteriously this line prints after all the lines
    }
}
