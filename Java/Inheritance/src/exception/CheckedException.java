package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("");   // checked exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } finally {
            System.out.println("This code is inside finally block");
        }
        System.out.println("More code can go here");
    }
}
