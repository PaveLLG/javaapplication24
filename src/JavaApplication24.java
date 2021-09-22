import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaApplication24 {


    public static void main(String[] args) {

        ExecutorService exec = Executors.newFixedThreadPool(5);
        exec.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " - done");
                return null;
            }
        });

    }
}
