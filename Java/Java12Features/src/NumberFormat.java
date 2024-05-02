//import java.text.NumberFormat;

//private java.text.NumberFormat Numberformat;

import java.util.Locale;

public class NumberFormat {

    public static void main(String[] args) {
        java.text.NumberFormat format = java.text.NumberFormat.getCompactNumberInstance();
        System.out.println(format.format(1000));
        System.out.println(format.format(1000) + format.format(2000));

        format = java.text.NumberFormat.getCompactNumberInstance(Locale.US, java.text.NumberFormat.Style.LONG);
        System.out.println(format.format(1000));
        System.out.println(format.format(1000000));
        format = java.text.NumberFormat.getCompactNumberInstance(Locale.US, java.text.NumberFormat.Style.SHORT);
        System.out.println(format.format(1000000));
    }
}
