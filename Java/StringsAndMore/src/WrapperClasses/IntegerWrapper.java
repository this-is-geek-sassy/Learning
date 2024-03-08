package WrapperClasses;

public class IntegerWrapper {
    public static void main(String[] args) {
        int x = 100;
        Integer _x = Integer.valueOf(x);
        Integer x_ = new Integer(x);    //  deprecated
        Integer _x_ = new Integer("3");   // deprecated
        Integer __x__ = Integer.valueOf("34");

        System.out.printf("%d %d %d %d\n", _x, x_, _x_, __x__);

        String number = Integer.toString(_x);
        Integer numberInteger = Integer.parseInt(number);
        System.out.println(number + " " + numberInteger);
    }
}
