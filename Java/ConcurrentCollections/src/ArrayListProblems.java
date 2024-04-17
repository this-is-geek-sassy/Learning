import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblems {
    public static void main(String[] args) {

//        ArrayList<String> courses = new ArrayList<>();
        CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("AWS");
        courses .add("Docker");

        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = iterator.next();
            System.out.println(course);
            // courses.add("Node");    // will throw java.util.ConcurrentModificationException
            if (course.equalsIgnoreCase("docker")) {
                courses.remove(course);   // again throws java.util.ConcurrentModificationException
            }
        }
        System.out.println(courses);
    }
}
