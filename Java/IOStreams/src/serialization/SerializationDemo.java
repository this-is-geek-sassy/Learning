package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos;
        ObjectOutputStream oos;

        fos = new FileOutputStream("./Emp.ser");
        oos = new ObjectOutputStream(fos);

        Employee e = new Employee(100,"John", 100000, 12345);
        oos.writeObject(e);
        System.out.println("Employee object serialized");
    }
}
