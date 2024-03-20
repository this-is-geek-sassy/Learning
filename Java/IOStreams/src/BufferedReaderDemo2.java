import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo2 {

    // try with resources syntax

    public static void main(String[] args) {
        int count=0;

        try(FileReader fr = new FileReader("./src/myfile.txt");
            BufferedReader br = new BufferedReader(fr);) {
            // try with resources
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(line, " ");
                while (stk.hasMoreTokens()) {
                    System.out.print(stk.nextToken() + "--");
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("number of words in the file " + count);

//        br.close();
//        fr.close();
    }
}
