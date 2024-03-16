public class SingleThreaded {
    public SingleThreaded() {
        // blank constructor
    }

    public static void main(String[] args) {

        SingleThreaded singleThreaded = new SingleThreaded();
        singleThreaded.printNumbers();

        for (int j = 1; j <= 200; j++) {

            System.out.print("\t j = " + j);
        }
        System.out.println();
    }
    void printNumbers() {
        for (int i = 1; i <= 200; i++) {

            System.out.print("\t i = " + i);
        }
        System.out.println();
    }
}