public class HandlerNormalNumber extends Handler {
    public HandlerNormalNumber(Handler successor){
        super(successor);
    }

    @Override
    public String handle(int number) {
        return Integer.toString(number);
    }
}