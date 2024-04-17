import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblems extends Thread {

    public static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();
//    public static ArrayList<String> courses = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        ArrayListProblems arrayListProblems = new ArrayListProblems();
        arrayListProblems.start();
//        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("AWS");
        courses .add("Docker");

        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()){

            Thread.sleep(2000);

            String course = iterator.next();
            System.out.println(course);
            // courses.add("Node");    // will throw java.util.ConcurrentModificationException

        }
        System.out.println(courses);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        courses.add("kubernetes");
    }
}
