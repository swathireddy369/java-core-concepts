public class SharedResource {
    public static void main(String[] args) {
        CheckLock chObj = new CheckLock();
        Thread th1 = new Thread(() -> {
            System.out.println("i am in th1");
            chObj.produce();
        });

        Thread th2 = new Thread(() -> {
            System.out.println("i am th2 ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            chObj.produce();
        });
        th1.start();
        th2.start();
        try {
            System.out.println("th1 suspended");
            th1.suspend();

        } catch (Exception e) {

        }
    }
}

class CheckLock {
    boolean isAvaialble = false;

    public synchronized void produce() {
        isAvaialble = true;
        try {
            System.out.println("th1 sleeping");
            Thread.sleep(7000);

        } catch (Exception e) {

        }
        System.out.println("th1 released");
    }
}
