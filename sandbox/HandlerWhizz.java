public class HandlerWhizz extends Handler {
    public HandlerWhizz(Handler successor) {
        super(successor);
    }
    
    @Override
    public String handle(int number) {
        if (number % 7 == 0) {
            return "whizz";
        }

        return successor.handle(number);
    }
}