import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CheckShutNowAwaitTermination {
    public static void main(String args[]) {
        ExecutorService ExService = Executors.newFixedThreadPool(1);

        Future<?> task = ExService.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

            System.out.println("i am going to work after shutdown   " + Thread.currentThread().getName());
        });
        ExService.shutdown();
        System.out.println(" done" + Thread.currentThread().getName());
        try {
            boolean isterminate = ExService.awaitTermination(500, TimeUnit.MILLISECONDS);
            System.out.println(" isterminate " + Thread.currentThread().getName() + "" + isterminate);
        } catch (Exception e) {

        }

        try {
            System.out.println(task.isDone() + Thread.currentThread().getName());// isDone gives false because task does
                                                                                 // not completed successfully its
                                                                                 // terminbated
        } catch (Exception e) {

        }

    }

}