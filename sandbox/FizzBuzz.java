
public class FizzBuzz {
    private Handler handlerFizzBuzz;

    public FizzBuzz() {
        Handler handlerNormalNumber = new HandlerNormalNumber(null);
        Handler handlerBuzz = new HandlerBuzz(handlerNormalNumber);
        Handler handlerFizz = new HandlerFizz(handlerBuzz);
        this.handlerFizzBuzz = new HandlerFizzBuzz(handlerFizz);
    }

    public String print(int number) {
        String result = null;
        
        result = this.handlerFizzBuzz.handle(number);

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
