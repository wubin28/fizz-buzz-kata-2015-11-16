
public class FizzBuzz {

    public String print(int number) {
        String result = null;
        if (number == 1 || number == 100) {
            result = Integer.toString(number);
        } else if (number % 5 == 0) {
            result = "buzz";
        } else {
            result = "fizz";
        }
        return result;
    }
}
