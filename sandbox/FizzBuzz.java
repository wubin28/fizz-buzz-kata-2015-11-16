
public class FizzBuzz {
    private Handler fizzBuzzHandler;

    public FizzBuzz() {
        this.fizzBuzzHandler = new FizzBuzzHandler(fizzHandler);
    }

    public String print(int number) {
        String result = null;
        
        result = this.fizzBuzzHandler.handle(number);

        if (number % 15 == 0) {
            result = "fizzbuzz";
        } else if (number % 3 == 0) {
            result = "fizz";
        } else if (number % 5 == 0) {
            result = "buzz";
        } else {
            result = Integer.toString(number);
        }
        return result;
    }
}
