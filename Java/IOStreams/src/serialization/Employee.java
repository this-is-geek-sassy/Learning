package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    double Salary;
    transient Integer ssn;

    public Employee(int id, String name, double Salary, int ssn) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
        this.ssn = ssn;
    }
}
