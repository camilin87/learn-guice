import com.google.inject.AbstractModule;

public class IocModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IWorkQueue.class).to(RandomWorkQueue.class);
        bind(IWorker.class).to(SmartWorker.class);
    }
}
