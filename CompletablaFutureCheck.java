
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CompletablaFutureCheck {
    public static void main(String[] args) {
        // pool executor
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2), new CustomThreadFactory(),
                new CustomRejectedExecutorHandler());

        // supply chain withput providing executor default ForkJoinpool
        // it makes the thread asyncronous
        CompletableFuture<String> obj = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("i am supply aync so i will be executed asyncronously");
            return "I can do whatever i want to be  ";
        });
        System.out.println("i am main");
        try {
            System.out.println(obj.get());
        } catch (Exception e) {
            System.out.println(e);
        }
        // supply chain with executor
        CompletableFuture<String> obj1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return "I can train my brain that way i want it to be but i have some super help";
        }, executor);
        System.out.println("i am main");
        try {
            System.out.println(obj1.get());
        } catch (Exception e) {
            System.out.println(e);
        }

        // then apply
        CompletableFuture<String> obj12 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return "I can train my brain that way i want it to be but i have some super help";
        }, executor);

        // thenApply
        CompletableFuture<String> obj3 = obj12.thenApply((result) -> {
            return result + "time is precious we can not bring even single second of time back  so be careful";
        });

        System.out.println("i am main");
        try {
            System.out.println(obj12.get() + " " + Thread.currentThread().getName());
            System.out.println(obj3.get() + " " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e);
        }

        // thenApplyAsync
        CompletableFuture<String> obj134 = CompletableFuture.supplyAsync(() -> {
            System.out.println("=====================" + Thread.currentThread().getName());
            return "I can train my brain that way i want it to be but i have some super help";
        }, executor);
        // thenApply
        CompletableFuture<String> obj4 = obj134.thenApplyAsync((result) -> {
            System.out.println("=====================" + Thread.currentThread().getName());

            return result + "time is precious we can not bring even single second of time back  so be careful";
        });

        System.out.println("i am main then Apply Async");
        try {
            System.out.println(obj134.get() + "       " + Thread.currentThread().getName());
            System.out.println(obj4.get() + "          " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
