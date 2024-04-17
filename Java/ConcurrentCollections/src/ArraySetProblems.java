import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblems extends Thread {

//    public static HashSet<String> courses = new HashSet<>();
    public static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<>();
//    public static ArrayList<String> courses = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        ArraySetProblems arraySetProblems = new ArraySetProblems();
        arraySetProblems.start();
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
