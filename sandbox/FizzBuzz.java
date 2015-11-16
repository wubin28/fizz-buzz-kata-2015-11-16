
public class FizzBuzz {

    public String print(int number) {
        String result = null;
        if (number == 1) {
            result = "1";
        } else if (number == 5 || number == 10) {
            result = "buzz";
            return result;
        } else {
            result = "fizz";
        }
        return result;
    }
}
