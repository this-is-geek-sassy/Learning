package serialization;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("./Emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object object = ois.readObject();
        Employee emp = (Employee) object;

        System.out.println("Employee id: " + emp.id);
        System.out.println("Employee name: " + emp.name);
        System.out.println("Employee salary: " + emp.Salary);
        System.out.println("Employee ssn: " + emp.ssn);
    }
}
