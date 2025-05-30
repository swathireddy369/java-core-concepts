import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.*;

public class ForkJoinPoolCheck {
    public static void main(String[] args) {

        ForkJoinPool pool = ForkJoinPool.commonPool();

        Future<Integer> obj = pool.submit(new ComputeSum(1, 10));
        try {
            System.out.println("main" + Thread.currentThread().getName() + " " +
                    obj.get());
        } catch (Exception e) {

        }
    }
}

class ComputeSum extends RecursiveTask<Integer> {// class
    int start;
    int end;

    public ComputeSum(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int result = 0;
        int sum = 0;
        if (end - start <= 4) {
            System.out.println("if" + Thread.currentThread().getName());
            for (int i = 1; i <= end; i++) {
                sum += i;
            }
            return sum;

        } else {
            System.out.println("else" + Thread.currentThread().getName());
            int mid = start + end / 2;
            ComputeSum left = new ComputeSum(start, mid);
            ComputeSum right = new ComputeSum(mid + 1, end);
            left.fork();// creating subtask and putting into workstealqueue
            right.fork();// creating subtask and putting into workstealqueue

            result = left.join() + right.join();

            return result;
        }

    }
}