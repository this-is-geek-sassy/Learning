import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        FileOutputStream fos;

        fis = new FileInputStream("C:\\Users\\saswata_mishra\\OneDrive - Persistent Systems Limited\\Documents\\Learning\\Java\\IOStreams\\src\\screenshot.png");
        fos = new FileOutputStream("./src/new_image.png");

        int data;
        while((data = fis.read()) != -1) {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
