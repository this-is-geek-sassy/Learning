package threadGroups;

public class threadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//        System.out.println(Thread.currentThread().getThreadGroup().getParent().getParent().getName());
        ThreadGroup parent = new ThreadGroup("parent");
//        System.out.println(parent);
        System.out.println(parent.getName());
        ThreadGroup child = new ThreadGroup(parent, "child");
        System.out.println(child.getName());
        System.out.println(child.getParent().getName());

//        child.setMaxPriority(4);

        Thread thread1 = new Thread(child, "thread_1");
        ThreadGroup thread2 = new ThreadGroup(child, "thread_2");
        System.out.println(thread1.getThreadGroup().getName());
        System.out.println(thread1.getPriority());
        child.setMaxPriority(4);
        System.out.println(thread1.getPriority());
    }
}
