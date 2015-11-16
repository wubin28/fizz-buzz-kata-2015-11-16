public class HandlerFizzBuzz extends Handler {
    public HandlerFizzBuzz(Handler successor) {
        super(successor);
    }
    
    @Override
    public String handle(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        }

        return successor.handle(number);
    }
}