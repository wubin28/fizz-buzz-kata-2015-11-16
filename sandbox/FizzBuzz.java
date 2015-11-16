
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

        return result;
    }
}
