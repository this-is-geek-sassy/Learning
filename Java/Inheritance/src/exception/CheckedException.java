package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public void readFile() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("");   // checked exception
        System.out.println("More code can go here");
    }
    public static void main(String[] args) throws FileNotFoundException {
        CheckedException ce = new CheckedException();
        try {
            ce.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Method is throwing a file not found exception");
        }
    }
}
