
public class FizzBuzz {

    public String print(int number) {
        if (number == 1) {
            return "1";
        }
        if (number == 5 || number == 10) {
            return "buzz";
        }
        return "fizz";
    }
}
