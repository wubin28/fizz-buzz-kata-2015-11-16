public class HandlerBuzz extends Handler {
    public HandlerBuzz(Handler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        return null;
    }
}