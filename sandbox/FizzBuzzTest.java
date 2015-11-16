import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_print_1_if_the_number_is_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.print(1));
    }

    @Test
    public void should_print_fizz_if_the_number_is_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizz", fizzBuzz.print(3));
    }

    @Test
    public void should_print_fizz_if_the_number_is_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizz", fizzBuzz.print(6));
    }

    @Test
    public void should_print_buzz_if_the_number_is_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("buzz", fizzBuzz.print(5));
    }

    // TODO: should_print_buzz_if_the_number_is_10
    // TODO: should_print_fizzbuzz_if_the_number_is_15
    // TODO: should_print_fizzbuzz_if_the_number_is_30
    // TODO: should_print_100_if_the_number_is_100
}
