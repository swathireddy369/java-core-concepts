import java.util.concurrent.*;
import java.util.*;

class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }

}

class CustomRejectedExecutorHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("task rejected" + r.toString());
    }

}

public class FutureRunnableCallable {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2), new CustomThreadFactory(),
                new CustomRejectedExecutorHandler());

        // Future Methods
        Future<?> futureObj = executor.submit(() -> {
            System.out.println("i am running");
        });

        futureObj.cancel(true);
        try {
            futureObj.get();
            futureObj.get(1, TimeUnit.MINUTES);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Donr or Not" + futureObj.isDone());
        System.out.println("Cancelled or Not" + futureObj.isCancelled());

        // Future Void type

        try {
            Object obj = futureObj.get();
            System.out.println("void type " + obj);
        } catch (Exception e) {

        }

        // Runnable with submit overload return type:
        List<Integer> li = new ArrayList<Integer>();
        Future<List<Integer>> futureObjR = executor.submit(() -> {
            li.add(369);
            li.add(689);
            li.add(864);
            System.out.println("i am running and i changed the li values" + li);
        }, li);// here we are able to return the value not by runnable its completely submit
               // method overload and we are telling to threadpoolexecutor to give back our li
               // once done tiwth runnable
        try {
            List<Integer> result = futureObjR.get();
            System.out.println("i am runnable with return type" + result);

        } catch (Exception e) {

        }

        // Callable with return type
        CallableCheck cObjmain = new CallableCheck();
        Future<List<String>> cObj = executor.submit(
                cObjmain
        // callable can return value by using its call method if we put
        // return internally it triggers callable if not runnable
        );
        try {
            List<String> result = cObj.get();
            System.out.println("am callable" + result);
        } catch (Exception e) {

        }

    }

}

class CallableCheck implements Callable<List<String>> {

    @Override
    public List<String> call() throws Exception {
        List<String> list = new ArrayList<>();
        list.add("Welcome");
        list.add("Swathi Amaravadi as");
        list.add("Amazon SDE");
        return list;
    }

}

// abstract class RunnableTaskVoid implements Runnable {
// List<Integer> li;

// @Override
// public void run(List<Integer> li) {
// this.li = li;
// li.add(5);
// }

// }
