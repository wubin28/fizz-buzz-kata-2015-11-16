import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = FizzBuzz.answer();
        assertEquals(expected, actual);
    }

    // TODO: should_print_1_if_the_number_is_1
    // TODO: should_print_fizz_if_the_number_is_multiple_of_3
    // TODO: should_print_buzz_if_the_number_is_multiple_of_5
    // TODO: should_print_fizzbuzz_if_the_number_is_multiple_of_both_3_and_5
    // TODO: should_print_100_if_the_number_is_100
}
