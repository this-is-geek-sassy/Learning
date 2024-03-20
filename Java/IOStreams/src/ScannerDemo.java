import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int id;  String name;  double score;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id, name and test score respectively");
        id = scanner.nextInt();
        name = scanner.next();
        score = scanner.nextDouble();

        while (scanner.hasNext()) {
            name = scanner.next().toString();
        }

        System.out.println("Student details: ");
        System.out.println(id + " " + name + " " + score);
    }
}
