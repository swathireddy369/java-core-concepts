public class RunnableInterfaceThread {
    public static void main(String[] args) {
        MyClass1 clsObj1 = new MyClass1(); // instance of our class
        Thread th1 = new Thread(clsObj1);// thread created underthe wood it runns the our class run method
        Thread th2 = new Thread(clsObj1);
        // th1.start();// we need to start the thread
        // th2.start();

        Thread th3 = new Thread(() -> {
            try {
                Thread.sleep(1000);

            } catch (Exception e) {

            }
            clsObj1.produce();
        });
        Thread th4 = new Thread(() -> {

            clsObj1.consumer();

        });
        th4.start();
        th3.start();

    }
}

class MyClass1 implements Runnable {
    boolean isAvaialble = false;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("i am implemeing runnable");
    }

    public synchronized void produce() {
        isAvaialble = true;
        System.out.println("i am notifying all");
        notifyAll();

    }

    public synchronized void consumer() {
        System.out.println("in cosume in sync");
        try {
            if (!isAvaialble) {
                wait();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("i am acquired lock and done");
        isAvaialble = true;
    }

}