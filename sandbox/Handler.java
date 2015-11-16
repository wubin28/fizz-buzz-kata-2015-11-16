public class Handler {
    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract String handle(int number);
}