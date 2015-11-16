public abstract class Handler {
    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public String handle(int number) {
    }
}