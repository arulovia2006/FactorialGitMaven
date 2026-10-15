import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testFactorial() {
        assertEquals(100L, Factorial.fact(5));
    }

    @Test
    void testZeroFactorial() {
        assertEquals(1L, Factorial.fact(0));
    }

    @Test
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class,
            () -> Factorial.fact(-1));
    }
}

