import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEX {
    public static void main(String args[]) {
        ReentrantLock rLock = new ReentrantLock();
        SharedLock sh = new SharedLock();
        Thread th1 = new Thread(() -> {

            sh.producer(rLock);
        });
        Thread th2 = new Thread(() -> {
            sh.consumer(rLock);
        });

        th1.start();
        th2.start();
    }
}

class SharedLock {// it does even care about whether it calling with same or diff instance it
                  // always locks

    boolean isAvaialble = false;

    public void producer(Lock lock) {
        Condition condition = lock.newCondition();
        try {
            lock.lock();
            System.out.println("acquired lock" + Thread.currentThread().getName());
            if (isAvaialble) {
                System.out.println("waiting" + Thread.currentThread().getName());
                condition.await();
            }
            isAvaialble = true;
            condition.signal();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("released lock" + Thread.currentThread().getName());
            lock.unlock();
        }
    }

    public void consumer(Lock lock) {
        Condition condition = lock.newCondition();
        try {
            System.out.println("acquired lock" + Thread.currentThread().getName());
            lock.lock();
            if (!isAvaialble) {
                System.out.println("waiting" + Thread.currentThread().getName());
                condition.await();
            }
            isAvaialble = false;
            condition.signal();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("released lock" + Thread.currentThread().getName());

            lock.unlock();
        }
    }
}