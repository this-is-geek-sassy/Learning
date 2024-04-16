package generics;

import java.io.Serializable;
import java.util.ArrayList;

public class WildCardParams {
    public void myMethod(ArrayList<? extends Runnable> l) {
        l.add(null);
        l.add("Saswata");
        l.add(new Thread());
    }

    public static void main(String[] args) {
        WildCardParams wcp = new WildCardParams();
        wcp.myMethod(new ArrayList<Thread>());
    }
}
