import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class CustomLock {
    public static void main(String[] args) {
        // CustomReadWriteLock resourceObj=new CustomReentrantLock();
        // CustomReadWriteLock resourceObj = new CustomReadWriteLock();
        // CustomStampedLock resourceObj = new CustomStampedLock();
        // CustomStampedOptimisticLock resourceObj = new CustomStampedOptimisticLock();
        // CustomSemaphoreLock resourceObj = new CustomSemaphoreLock();
        CustomConditionLock resourceObj = new CustomConditionLock();
        Thread th1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                resourceObj.producer();
            } catch (Exception e) {
            }

        }, "Thread-1");
        Thread th2 = new Thread(() -> {
            try {
                // Thread.sleep(1000);
                resourceObj.consumer();
            } catch (Exception e) {
            }

        }, "Thread-2");
        // Thread th3 = new Thread(() -> {
        // resourceObj.producer();
        // }, "Thread-3");
        th2.start();
        th1.start();

        // th3.start();
    }

}

class CustomReentrantLock {
    boolean isStockAvaiable = false;
    ReentrantLock rLock = new ReentrantLock();// only one thread can allow intoi the criticl section at any point oif
                                              // time once lock relsed then pother thread can allow to take

    public void producer() {

        rLock.lock();
        System.out.println("locked" + Thread.currentThread().getName());
        try {
            if (isStockAvaiable) {
                Thread.sleep(5000);
            }
            isStockAvaiable = true;
        } catch (Exception e) {

        } finally {
            rLock.unlock();
            System.out.println("unlocked" + Thread.currentThread().getName());

        }

    }

    public void consumer() {
        rLock.lock();
        System.out.println("consumer locked" + Thread.currentThread().getName());
        try {
            if (!isStockAvaiable) {
                System.out.println("sleep locked" + Thread.currentThread().getName());

                Thread.sleep(3000);
            }
            isStockAvaiable = false;
        } catch (Exception e) {

        } finally {
            rLock.unlock();
            System.out.println(" consumer unlocked" + Thread.currentThread().getName());
        }

    }
}

class CustomReadWriteLock {
    boolean isStockAvaiable = false;
    ReadWriteLock rLock = new ReentrantReadWriteLock();// only one thread can allow intoi the criticl section at any
                                                       // point oif
    // time once lock relsed then pother thread can allow to take

    public void producer() {

        rLock.readLock().lock();
        System.out.println("read locked" + Thread.currentThread().getName());
        try {
            if (isStockAvaiable) {
                Thread.sleep(5000);
            }
            isStockAvaiable = true;
        } catch (Exception e) {

        } finally {
            rLock.readLock().lock();
            System.out.println("read unlocked" + Thread.currentThread().getName());
        }

    }

    public void consumer() {
        rLock.writeLock().lock();
        System.out.println("write locked" + Thread.currentThread().getName());
        try {
            if (!isStockAvaiable) {
                System.out.println("write sleep locked" + Thread.currentThread().getName());

                Thread.sleep(3000);
            }
            isStockAvaiable = false;
        } catch (Exception e) {

        } finally {
            rLock.writeLock().unlock();
            System.out.println(" write unlocked" + Thread.currentThread().getName());
        }

    }
}

class CustomStampedLock {
    boolean isStockAvaiable = false;
    StampedLock rLock = new StampedLock();// only one thread can allow intoi the criticl section at any
                                          // point oif
    // time once lock relsed then pother thread can allow to take

    public void producer() {
        long stamp = rLock.readLock();
        System.out.println("read locked" + Thread.currentThread().getName());
        try {
            isStockAvaiable = true;
            Thread.sleep(3000);
            if (rLock.validate(stamp)) {
                isStockAvaiable = true;
            } else {
                System.out.println("rool back");
            }

        } catch (Exception e) {

        } finally {
            rLock.unlock(stamp);
            System.out.println("read unlocked" + Thread.currentThread().getName());
        }

    }

    public void consumer() {
        long stamp = rLock.writeLock();
        System.out.println("write locked" + Thread.currentThread().getName());
        try {
            System.out.println("write sleep locked" + Thread.currentThread().getName());

            // Thread.sleep(1000);

            isStockAvaiable = false;
        } catch (Exception e) {

        } finally {
            rLock.unlock(stamp);
            System.out.println(" write unlocked" + Thread.currentThread().getName());
        }

    }
}

class CustomStampedOptimisticLock {
    boolean isStockAvaiable = false;
    StampedLock rLock = new StampedLock();// only one thread can allow intoi the criticl section at any
                                          // point oif
    // time once lock relsed then pother thread can allow to take

    public void producer() {
        long stamp = rLock.tryOptimisticRead();
        System.out.println("read locked" + Thread.currentThread().getName());
        try {
            isStockAvaiable = true;
            Thread.sleep(3000);
            if (rLock.validate(stamp)) {
                isStockAvaiable = true;
            } else {
                System.out.println("rool back");
            }

        } catch (Exception e) {

        } finally {
            rLock.unlock(stamp);
            System.out.println("read unlocked" + Thread.currentThread().getName());
        }

    }

    public void consumer() {
        long stamp = rLock.writeLock();
        System.out.println("write locked" + Thread.currentThread().getName());
        try {
            System.out.println("write sleep locked" + Thread.currentThread().getName());

            // Thread.sleep(1000);

            isStockAvaiable = false;
        } catch (Exception e) {

        } finally {
            rLock.unlock(stamp);
            System.out.println(" write unlocked" + Thread.currentThread().getName());
        }

    }
}

class CustomSemaphoreLock {
    boolean isStockAvaiable = false;
    Semaphore rLock = new Semaphore(2);// only one thread can allow intoi the criticl section at any
                                       // point oif
    // time once lock relsed then pother thread can allow to take

    public void producer() {

        try {
            rLock.acquire();
            System.out.println("locked" + Thread.currentThread().getName());

            isStockAvaiable = true;
            Thread.sleep(3000);

        } catch (Exception e) {

        } finally {
            rLock.release();
            System.out.println("read unlocked" + Thread.currentThread().getName());
        }

    }

    public void consumer() {
        try {
            rLock.acquire();
            System.out.println("locked" + Thread.currentThread().getName());

            // Thread.sleep(1000);

            isStockAvaiable = false;
        } catch (Exception e) {

        } finally {
            rLock.release();
            System.out.println("  unlocked" + Thread.currentThread().getName());
        }

    }
}

class CustomConditionLock {
    boolean isStockAvaiable = false;
    ReentrantLock rLock = new ReentrantLock();// only one thread can allow intoi the criticl section at any
    // point oif
    // time once lock relsed then pother thread can allow to take

    Condition con = rLock.newCondition();

    public void producer() {
        System.out.println("p" + isStockAvaiable);
        rLock.lock();
        try {

            System.out.println("locked" + Thread.currentThread().getName());
            if (isStockAvaiable) {
                con.await();
                System.out.println("producer waiting" + Thread.currentThread().getName());
            }
            isStockAvaiable = true;
            con.signalAll();
            System.out.println("producer produced" + Thread.currentThread().getName());
            // Thread.sleep(3000);

        } catch (Exception e) {

        } finally {
            rLock.unlock();
            System.out.println(" unlocked" + Thread.currentThread().getName());
        }

    }

    public void consumer() {
        System.out.println("c" + isStockAvaiable);
        rLock.lock();
        try {

            System.out.println("locked" + Thread.currentThread().getName());

            // Thread.sleep(1000);
            if (!isStockAvaiable) {
                con.await();
                System.out.println("consumer waiting" + Thread.currentThread().getName());

            }
            System.out.println("consumed" + Thread.currentThread().getName());

            isStockAvaiable = false;
            con.signalAll();
        } catch (Exception e) {

        } finally {
            rLock.unlock();
            System.out.println("  unlocked" + Thread.currentThread().getName());
        }

    }
}
