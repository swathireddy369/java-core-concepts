import java.util.concurrent.atomic.AtomicInteger;

public class AutomicIntegerCheck {
    public static void main(String[] args) {
        CheckAutomic obj1 = new CheckAutomic();
        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 50006; i++) {
                obj1.incrementCount();
            }
        });
        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 50003; i++) {
                obj1.incrementCount();
            }
        });
        // got error:
        // C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>java
        // AutomicIntegerCheck
        // 1891

        // C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>java
        // AutomicIntegerCheck
        // 2000

        // C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>java
        // AutomicIntegerCheck
        // 2000

        // C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>

        // for (int i = 0; i < 200; i++) {
        // obj1.incrementCount();
        // }
        th1.start();
        th2.start();
        try {
            th1.join();// now mainthread is wating to complete th1
            th2.join();
        } catch (Exception e) {

        }
        System.out.println(obj1.getCount());// 200

    }

}

class CheckAutomic {
    AtomicInteger count = new AtomicInteger();
    // int count = 0;

    public void incrementCount() {
        // count++;
        count.getAndIncrement();
        // try {
        // Thread.sleep(1);

        // } catch (Exception e) {
        // }
    }

    public int getCount() {
        // return count;
        return count.get();
    }
}

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>java
// AutomicIntegerCheck
// 399

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>java
// AutomicIntegerCheck
// 400

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>java
// AutomicIntegerCheck
// // 400

// h\Desktop\Java-Fundamentals\java-core-concepts>javac AutomicIntegerCheck.java

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>

// java AutomicIntegerCheck 20000

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>javac
// AutomicIntegerCheck.
// java

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>
// java AutomicIntegerCheck 16263

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>
// java AutomicIntegerCheck 15100

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts>
// java AutomicIntegerCheck 20000

// C:\Users\swath\Desktop\Java-Fundamentals\java-core-concepts
// >