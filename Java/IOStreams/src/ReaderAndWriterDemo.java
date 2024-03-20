import java.io.*;

public class ReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr;
        FileWriter fw;

        fr = new FileReader(new File("./src/sample.txt"));
        fw = new FileWriter(new File("./src/new_sample"));

        int ch;
        while((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();
    }
}
