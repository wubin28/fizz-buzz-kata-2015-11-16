public class FizzBuzzHandler implements Handler {
    public FizzBuzzHandler(Handler successor) {
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