public class HandlerBuzz extends Handler {
    public HandlerBuzz(Handler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        if (number % 5 == 0) {
            return "buzz";
        }
        return successor.handle(number);
    }
}