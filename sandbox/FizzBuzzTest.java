import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = FizzBuzz.answer();
        assertEquals(expected, actual);
    }
}
