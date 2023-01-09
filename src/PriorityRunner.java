public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread p1 = new PriorityThread(1);
        PriorityThread p2 = new PriorityThread(2);
        PriorityThread p3 = new PriorityThread(3);

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);
        p3.setPriority(Thread.NORM_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
    }
}
