//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 4};
        int a = 10;
        String name = "Saswata Mishra";
        System.out.println(name);

        String b = "Saswata Mishra";
        System.out.println(name == b);
        b += "   hgf";
        System.out.println(b);
        System.out.println(name == b);

        String c = new String("Saswata Mishra");
        System.out.println(name == c);
        System.out.println(name.equals(c));     // with .equals() method
    }
}