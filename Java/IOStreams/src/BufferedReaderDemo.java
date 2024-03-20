import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr;
        BufferedReader br;
        int count=0;

        fr = new FileReader("./src/myfile.txt");
        br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer stk = new StringTokenizer(line, " ");
            while (stk.hasMoreTokens()) {
                System.out.print(stk.nextToken() + "--");
                count++;
            }
        }
        System.out.println();
        System.out.println("number of words in the file " + count);

        br.close();
        fr.close();
    }
}
