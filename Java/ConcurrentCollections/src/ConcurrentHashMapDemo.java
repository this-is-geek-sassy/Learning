import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

//    public static HashSet<String> courses = new HashSet<>();
//    public static HashMap<String, String> courseRatings = new HashMap<>();  // gives java.util.ConcurrentModificationException
//    public static ArrayList<String> courses = new ArrayList<>();
    public static ConcurrentHashMap<String, String> courseRatings = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMapDemo arraySetProblems = new ConcurrentHashMapDemo();
        arraySetProblems.start();
//        ArrayList<String> courses = new ArrayList<>();

        courseRatings.put("Java", "5.0");
        courseRatings.put("Python", "4.8");
        courseRatings.put("AWS", "4.7");
        courseRatings.put("Docker", "4.7");

        Iterator<String> iterator = courseRatings.keySet().iterator();
        while (iterator.hasNext()){

            Thread.sleep(2000);

            String courseName = iterator.next();
            System.out.println(courseRatings.get(courseName));
            // courses.add("Node");    // will throw java.util.ConcurrentModificationException

        }
        System.out.println(courseRatings);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        courseRatings.put("kubernetes", "4.8");
    }
}
