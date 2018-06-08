public class SmartWorker implements IWorker {
    private final IWorkQueue queue;

    public SmartWorker(IWorkQueue queue) {
        this.queue = queue;
    }

    @Override
    public void DoWork() {
        System.out.println(String.format("Working smarter %d", this.queue.ReadWorkItem()));
    }
}
