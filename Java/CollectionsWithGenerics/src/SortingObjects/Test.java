package SortingObjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>(new EmployeeComparator());
        set.add(new Employee(100, "Obama"));
        set.add(new Employee(400, "Trump"));
        set.add(new Employee(300, "Bharat"));
        set.add(new Employee(200, "Rambo"));

        System.out.println(set);
        for (Employee e: set) {
            System.out.println(e.id);
            System.out.println(e.name);
        }
    }
}
