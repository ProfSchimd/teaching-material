import java.util.concurrent.Callable;

/**
 * AsyncCallable
 */
public class AsyncCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        System.out.println("call() terminato");
        return "Risultato: 42";
    }

    
}