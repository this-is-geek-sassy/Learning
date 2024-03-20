import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        fis = new FileInputStream(new File("C:\\Users\\saswata_mishra\\OneDrive - Persistent Systems Limited\\Documents\\Learning\\Java\\IOStreams\\src\\sample.txt"));
        System.out.println("file opened");
        int i;

        while((i = fis.read()) != -1) {
            System.out.print((char)i);
        }
        fis.close();
        System.out.println("\nfile closed");
    }
}
