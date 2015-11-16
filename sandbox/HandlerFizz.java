public class HandlerFizz extends Handler {
    public HandlerFizz(Handler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        if (number % 3 == 0) {
            return "fizz";
        }
        return successor.handle(number);
    }
}