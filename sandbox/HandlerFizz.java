public class HandlerFizz extends Handler {
    public HandlerFizz(Handler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        return null;
    }
}