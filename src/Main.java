import com.google.inject.Guice;

public class Main {

    public static void main(String[] args) {
        var resolver = Guice.createInjector(new IocModule());
        
        var worker = resolver.getInstance(IWorker.class);

        worker.DoWork();
    }
}
