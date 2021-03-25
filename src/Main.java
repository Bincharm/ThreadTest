public class Main {
    public volatile static int place = 1;

    public static void main(String[] args){

        Thread racer1 = new Thread(new Racer(), "Racer1");
        Thread racer2 = new Thread(new Racer(), "Racer2");
        Thread racer3 = new Thread(new Racer(), "Racer3");
        Thread racer4 = new Thread(new Racer(), "Racer4");
        Thread racer5 = new Thread(new Racer(), "Racer5");

        racer1.start();
        try {
            racer1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        racer2.start();
        racer3.start();
        racer4.start();
        racer5.start();

    }

}
