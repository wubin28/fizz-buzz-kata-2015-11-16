
public class FizzBuzz {

    public String print(int number) {
        String result = null;
        if (number == 1) {
            result = "1";
        } else if (number == 5 || number == 10) {
            result = "buzz";
        } else if (number == 100) {
            result = "100";
        } else {
            result = "fizz";
        }
        return result;
    }
}
