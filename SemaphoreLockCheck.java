import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;

public class SemaphoreLockCheck {
    public static void main(String[] args) {

        SemaphoreLockEx st = new SemaphoreLockEx();
        Thread th1 = new Thread(() -> {
            st.produce();
        });
        Thread th2 = new Thread(() -> {
            st.produce();
        });
        Thread th3 = new Thread(() -> {
            st.produce();
        });
        Thread th4 = new Thread(() -> {
            st.produce();
        });
        Thread th5 = new Thread(() -> {
            st.produce();
        });
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}

class SemaphoreLockEx {

    Semaphore lock = new Semaphore(1);

    public void produce() {
        try {
            System.out.println("waitinggggggggggggggggg" + Thread.currentThread().getName());
            lock.acquire();
            System.out.println("i am me acquired lock" + Thread.currentThread().getName());
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("waiting" + Thread.currentThread().getName());
        } finally {
            System.out.println("released" + Thread.currentThread().getName());
            lock.release();
        }

    }
}
