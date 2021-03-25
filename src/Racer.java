public class Racer implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "; place: " + Main.place++);
    }
}
