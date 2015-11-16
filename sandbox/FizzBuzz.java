
public class FizzBuzz {

    public String print(int number) {
        String result = null;
        
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
