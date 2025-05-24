import java.util.concurrent.locks.StampedLock;

public class StampedLockEx {
    public static void main(String[] args) {
        // ReadWriteLockEx obj = new ReadWriteLockEx();
        TryOptimizedLockEx obj = new TryOptimizedLockEx();
        Thread th1 = new Thread(() -> {
            obj.producer();
        });
        Thread th2 = new Thread(() -> {
            obj.consumer();
        });
        th1.start();
        th2.start();

    }
}

class TryOptimizedLockEx {
    boolean isAvaialble = false;
    StampedLock stLock = new StampedLock();

    public void producer() {
        long stamp = stLock.tryOptimisticRead();
        try {
            System.out.println("acquired lock" + Thread.currentThread().getName());
            isAvaialble = true;
            Thread.sleep(3000);
            if (stLock.validate(stamp)) {
                isAvaialble = true;
                System.out.println("continue");
            } else {
                System.out.println("rool back");
            }
        } catch (Exception e) {

            // System.out.println(e);
        } finally {
            // stLock.unlock(stamp);
            System.out.println(" lock released" + Thread.currentThread().getName());

        }
    }

    public void consumer() {
        long stamp = stLock.writeLock();
        try {
            System.out.println("acquired lock" + Thread.currentThread().getName());

            isAvaialble = false;
            // Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            stLock.unlock(stamp);
            System.out.println(" lock released" + Thread.currentThread().getName());

        }
    }
}

class ReadWriteLockEx {
    boolean isAvaialble = false;
    StampedLock stLock = new StampedLock();

    public void producer() {
        long stamp = stLock.readLock();
        try {
            System.out.println("acquired lock" + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (Exception e) {

            System.out.println(e);
        } finally {
            stLock.unlock(stamp);
            System.out.println(" lock released" + Thread.currentThread().getName());

        }
    }

    public void consumer() {
        long stamp = stLock.writeLock();
        try {
            System.out.println("acquired lock" + Thread.currentThread().getName());

            isAvaialble = true;
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(" lock released" + Thread.currentThread().getName());

            stLock.unlock(stamp);
            System.out.println(e);
        } finally {
            stLock.unlock(stamp);
            System.out.println(" lock released" + Thread.currentThread().getName());

        }
    }
}
