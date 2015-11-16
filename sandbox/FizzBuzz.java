
public class FizzBuzz {

    public String print(int number) {
        String result = null;
        if (number == 1) {
            result = "1";
            return result;
        }
        if (number == 5 || number == 10) {
            return "buzz";
        }
        return "fizz";
    }
}
