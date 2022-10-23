import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * AsyncMain: esempio di programmazione asincrona utilizzando FutureTask
 * e Callable
 */
public class AsyncMain {

    public static void main(String[] args) {
        String result = null;
        System.out.println("Esempio di FutureTask con interfaccia Runnable");
        AsyncRunnable runnable = new AsyncRunnable();
        FutureTask<String> taskRun = new FutureTask<String>(runnable, result);
        ExecutorService executor = Executors.newFixedThreadPool(2); // 2 thread
        executor.execute(taskRun);
        System.out.println("run() avviato");
        try {
            // attende la fine e recupera il risultato (null in questo caso)
            result = taskRun.get();
            System.out.print("get() -> ");
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Esempio di FutureTask con interfaccia Runnable");
        AsyncCallable callable = new AsyncCallable();
        FutureTask<String> taskCall = new FutureTask<String>(callable);
        executor.execute(taskCall);
        System.out.println("call() avviato");
        try {
            result = taskCall.get();
            System.out.print("get() -> ");
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        // ATTENZIONE: senza questa istruzione il programma NON TERMINA
        executor.shutdown();
    }
}